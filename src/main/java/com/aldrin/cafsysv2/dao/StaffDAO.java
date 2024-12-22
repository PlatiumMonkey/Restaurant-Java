/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aldrin.cafsysv2.dao;

import com.aldrin.cafsysv2.model.Staff;
import java.util.List;

/**
 *
 * @author ALDRIN B. C.
 */
public interface StaffDAO {

    public Long getMaxId();

//    add Staff
    public void addStaff(Staff staff);

//    update Staff
    public void updateStaff(Staff staff);

//    delete Staff
    public void deleteStaff(Staff staff);

//    list of the Staff
    public List<Staff> selectStaff();


//    public Staff findPhotoByStaffId(Staff staff);

    public void comboBoxStaff();
}
