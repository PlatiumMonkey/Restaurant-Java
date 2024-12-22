/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.cafsysv2.dao.impl;

import com.aldrin.cafsysv2.dao.StaffDAO;
import static com.aldrin.cafsysv2.dao.impl.DBConnection.closeConnection;
import static com.aldrin.cafsysv2.dao.impl.DBConnection.getCon;

import com.aldrin.cafsysv2.model.Staff;

import com.aldrin.cafsysv2.util.ComboBoxList;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ALDRIN B. C.
 */
@Setter
@Getter


public class StaffDAOImpl extends DBConnection implements StaffDAO{
    
    public Long getMaxId(){
         Long maxId = null;
        try {
            getDBConn();
            PreparedStatement statement = getCon().prepareStatement("SELECT \n"
                    + "    MAX(STAFF.ID) AS ID  \n"
                    + "FROM \n"
                    + "    STAFF ");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Long idl = rs.getLong("ID");
                if (idl == 0) {
                    maxId = 1L;
                } else {
                    maxId = idl + 1;
                }
            }
            rs.close();
            statement.close();
//            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Opss...", JOptionPane.ERROR_MESSAGE);
        }
        return maxId;
    }

//    add Staff
    public void addStaff(Staff staff){
         try {
            getDBConn();
            java.sql.PreparedStatement ps = getCon().prepareStatement("INSERT INTO Staff (ID,NAME,GENDER,DOB,PHONE_NUMBER,EMAIL,POSITION) VALUES  (?,?,?,?,?,?,?) ");
            ps.setLong(1, getMaxId());
            ps.setString(2, staff.getName());
            ps.setString(3, staff.getGender());
            ps.setString(4, staff.getDob().toString());
            ps.setString(5, staff.getPhoneNumber());
            ps.setString(6, staff.getEmail());
            ps.setString(7, staff.getPosition());
            ps.execute();
            ps.close();
            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    update Staff
    public void updateStaff(Staff staff){
       try {
            getDBConn();
            java.sql.PreparedStatement ps = getCon().prepareStatement("UPDATE STAFF SET NAME =?, GENDER =?, DOB=?, PHONE_NUMBER=?, EMAIL=?, POSITION=?  WHERE STAFF.ID = ?");
            ps.setString(1, staff.getName());
            ps.setString(2, staff.getGender());
            ps.setString(3, staff.getDob().toString());
            ps.setString(4, staff.getPhoneNumber());
            ps.setString(5, staff.getEmail());
            ps.setString(6, staff.getPosition());
            ps.setLong(7, staff.getId());
            ps.execute();
            ps.close();
            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    delete Staff
    public void deleteStaff(Staff staff){
        try {
            getDBConn();
            java.sql.PreparedStatement ps = getCon().prepareStatement("DELETE STAFF WHERE ID = "+ staff.getId());
            
            ps.close();
            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<ComboBoxList> list;

//    list of the Staff
    public ArrayList<Staff> selectStaff(){
        ArrayList<Staff> list = new ArrayList<>();
        try {
            String query = "SELECT \n"
                    + "    STAFF.ID, \n"
                    + "    STAFF.NAME, \n"
                    + "    STAFF.GENDER, \n"
                    + "    STAFF.DOB, \n"
                    + "    STAFF.PHONE_NUMBER, \n"
                    + "    STAFF.EMAIL, \n"
                    + "    STAFF.POSITION \n"
                 
                    + "FROM \n"
                    + "    STAFF \n";
                   
            getDBConn();
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Staff staff = new Staff();
                staff.setId(rs.getLong("ID"));
                staff.setName(rs.getString("NAME"));
                staff.setGender(rs.getString("GENDER"));
                staff.setDob(Date.valueOf(rs.getString("DOB")));
                staff.setPhoneNumber(rs.getString("PHONE_NUMBER"));
                staff.setEmail(rs.getString("EMAIL"));
                staff.setPosition(rs.getString("POSITION"));
                list.add(staff);
            }
            rs.close();
            st.close();
            closeConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }


//    public Staff findPhotoByStaffId(Staff staff);

    public void comboBoxStaff(){
        this.setList(new ArrayList<ComboBoxList>());
        try {
            getDBConn();
            PreparedStatement statement;
            ResultSet rs;
            statement = getCon().prepareStatement("SELECT  \n"
                    + "    STAFF.ID,\n"
                    + "    STAFF.NAME \n"
                    
                    + "FROM \n"
                    + "    STAFF");
            rs = statement.executeQuery();
            while (rs.next()) {
                Long idl = rs.getLong("ID");              
                String namel = rs.getString("NAME");

                this.getList().add(new ComboBoxList(idl, namel));
            }
            rs.close();
            statement.close();
            closeConnection();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
