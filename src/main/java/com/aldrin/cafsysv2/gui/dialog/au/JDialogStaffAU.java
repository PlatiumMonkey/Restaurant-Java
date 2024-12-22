/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.aldrin.cafsysv2.gui.dialog.au;


import com.aldrin.cafsysv2.CafSysv2;
import com.aldrin.cafsysv2.dao.impl.RoleDAOImpl;
import com.aldrin.cafsysv2.dao.impl.StaffDAOImpl;
import com.aldrin.cafsysv2.dao.impl.UserAccountDAOImpl;
import com.aldrin.cafsysv2.gui.JFrameCafSys;
import com.aldrin.cafsysv2.model.Role;
import com.aldrin.cafsysv2.model.Staff;
import com.aldrin.cafsysv2.model.UserAccount;
import com.aldrin.cafsysv2.util.ComboBoxList;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ALDRIN B. C.
 */
public class JDialogStaffAU extends javax.swing.JDialog {

    private RoleDAOImpl roleDAOImpl = new RoleDAOImpl();
    private UserAccountDAOImpl studentDAOImpl = new UserAccountDAOImpl();
    private UserAccount userAccount = new UserAccount();
    
    
    private StaffDAOImpl staffDAOImpl = new StaffDAOImpl();
    private JFrameCafSys jFrameCafSys;
    private Staff staff = new Staff();
    static String title = "";

    public JDialogStaffAU(JFrameCafSys jFrameSariPOS, boolean modal) {
        super(jFrameSariPOS, modal);
        initComponents();
        this.jFrameCafSys =jFrameSariPOS;
        setTitle("New staff");
        this.title = "New";
        jTextFieldName.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "NAME");
        jTextFieldGender.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "GENDER");
        jTextFieldPhoneNumber.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PHONE NUMBER");
        jTextFieldEmail.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT,"EMAIL");
        jButton1.setIcon(new FlatSVGIcon("svg/save.svg",24,24));
        

    }

    public JDialogStaffAU(JFrameCafSys jFrameCafSys, boolean modal, Staff staff, String title) {
        super(jFrameCafSys, modal);
        initComponents();
        setTitle("Update staff");
        this.staff = staff;
        this.title = title;
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(187, 187, 187));
        jTextFieldName.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "NAME");
        jTextFieldGender.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "GENDER");
        jTextFieldPhoneNumber.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PHONE NUMBER");
        jTextFieldEmail.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT,"EMAIL");
        jTextFieldName.setText(staff.getName());
        jTextFieldGender.setText(staff.getGender());
        jDateDOB.setDate(staff.getDob());
        jTextFieldPhoneNumber.setText(staff.getPhoneNumber());
        jTextFieldEmail.setText(staff.getEmail());
        jComboBoxPosition.setSelectedItem(staff.getPosition());
//        for (ComboBoxList a : this.roleDAOImpl.getList()) {
//            a.setSelectedId(roleDAOImpl.getList(), String.valueOf(userAccount.getRole().getId()), jComboBoxPosition);
//        }
//        displayPicture(userAccount);
        jButton1.setIcon(new FlatSVGIcon("svg/edit.svg",24,24));

    }

    public JDialogStaffAU(JFrameCafSys jFrameCafSys, boolean modal, String title, UserAccount userAccount) {
        super(jFrameCafSys, modal);
        initComponents();
        setTitle("Delete user account");
        this.userAccount = userAccount;
        this.title = title;
         getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(187, 187, 187));
        jTextFieldName.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "NAME");
        jTextFieldGender.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "GENDER");
        jTextFieldPhoneNumber.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PHONE NUMBER");
        jTextFieldEmail.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT,"EMAIL");
        jTextFieldName.setText(staff.getName());
        jTextFieldGender.setText(staff.getGender());
        jDateDOB.setDate(staff.getDob());
        jTextFieldPhoneNumber.setText(staff.getPhoneNumber());
        jTextFieldEmail.setText(staff.getEmail());
        jComboBoxPosition.setSelectedItem(staff.getPosition());
        
//        for (ComboBoxList a : this.roleDAOImpl.getList()) {
//            a.setSelectedId(roleDAOImpl.getList(), String.valueOf(userAccount.getRole().getId()), jComboBoxPosition);
//        }
//        displayPicture(userAccount);
        jButton1.setIcon(new FlatSVGIcon("svg/delete.svg",24,24));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldGender = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelPicture = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBoxPosition = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateDOB = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Staff");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("NAME:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 20, 70, 30));

        jTextFieldName.setPreferredSize(new java.awt.Dimension(64, 30));
        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 250, -1));

        jTextFieldGender.setPreferredSize(new java.awt.Dimension(64, 30));
        getContentPane().add(jTextFieldGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 250, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "PHOTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 153))); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabelPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/no photo.jpg"))); // NOI18N
        jLabelPicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPictureMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelPicture, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setPreferredSize(new java.awt.Dimension(210, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 210, 230));

        jTextFieldPhoneNumber.setMinimumSize(new java.awt.Dimension(64, 32));
        jTextFieldPhoneNumber.setPreferredSize(new java.awt.Dimension(64, 32));
        getContentPane().add(jTextFieldPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 250, -1));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 168, 32));

        jComboBoxPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "manager", "waiter", "chef", "cashier", "" }));
        jComboBoxPosition.setToolTipText("");
        jComboBoxPosition.setPreferredSize(new java.awt.Dimension(72, 32));
        jComboBoxPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPositionActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 250, 30));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("GENDER:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 60, 70, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("DOB:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 100, 70, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("PHONE NUM:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 80, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("POSITION:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 70, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 550, -1));

        jTextFieldEmail.setMinimumSize(new java.awt.Dimension(64, 32));
        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(64, 32));
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 250, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("EMAIL:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 180, 70, 30));
        getContentPane().add(jDateDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 250, 30));

        setSize(new java.awt.Dimension(589, 344));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.title.equals("New")) {
            int response = JOptionPane.showConfirmDialog(jFrameCafSys, "Are you sure to save " + jTextFieldName.getText() + " " + jTextFieldGender.getText() + " ?", "Save confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
//                this.userAccount.setFirstname(jTextFieldName.getText());
//                this.userAccount.setSurname(jTextFieldGender.getText());
//                this.userAccount.setUsername(jDateDOB.getText());
//                this.userAccount.setPassword(jTextFieldPhoneNumber.getText());
//                
//                ComboBoxList roleId = (ComboBoxList) this.jComboBoxPosition.getSelectedItem();
//                Role role = new Role();
//                role.setId(roleId.getId());
//                this.userAccount.setRole(role);
//                try {
//                    validatePhoto();
//                } catch (URISyntaxException ex) {
//                    Logger.getLogger(JDialogStaffAU.class.getName()).log(Level.SEVERE, null, ex);
//                }

                this.staff.setName(jTextFieldName.getText());
                this.staff.setGender(jTextFieldGender.getText());
                this.staff.setDob(new Date(jDateDOB.getDate().getTime()));
                this.staff.setEmail(jTextFieldEmail.getText());
                this.staff.setPhoneNumber(jTextFieldPhoneNumber.getText());
                this.staff.setPosition(jComboBoxPosition.getSelectedItem().toString());
                staffDAOImpl.addStaff(staff);
                this.dispose();
            }
        } else if (this.title.equals("Update")) {
            int response = JOptionPane.showConfirmDialog(jFrameCafSys, "Are you sure to update " + jTextFieldName.getText() + " " + jTextFieldGender.getText() + " ?", "Save confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
//                this.userAccount.setFirstname(jTextFieldName.getText());
//                this.userAccount.setSurname(jTextFieldGender.getText());
////                this.userAccount.setUsername(jDateDOB.getText());
//                this.userAccount.setPassword(jTextFieldPhoneNumber.getText());
//                
//                ComboBoxList roleId = (ComboBoxList) this.jComboBoxPosition.getSelectedItem();
//                Role role = new Role();
//                role.setId(roleId.getId());
//                this.userAccount.setRole(role);
//                try {
//                    validatePhoto();
//                } catch (URISyntaxException ex) {
//                    Logger.getLogger(JDialogStaffAU.class.getName()).log(Level.SEVERE, null, ex);
//                }

                this.staff.setName(jTextFieldName.getText());
                this.staff.setGender(jTextFieldGender.getText());
                this.staff.setDob(new Date(jDateDOB.getDate().getTime()));
                this.staff.setEmail(jTextFieldEmail.getText());
                this.staff.setPhoneNumber(jTextFieldPhoneNumber.getText());
                this.staff.setPosition(jComboBoxPosition.getSelectedItem().toString());
                staffDAOImpl.updateStaff(staff);                       
                this.dispose();
            }
        } else if (this.title.equals("Delete")) {
            int response = JOptionPane.showConfirmDialog(jFrameCafSys, "Are you sure to delete " + jTextFieldName.getText() + " " + jTextFieldGender.getText() + " ?", "Save confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                studentDAOImpl.deleteUserAccount(userAccount);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabelPictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPictureMouseClicked

        browse();
    }//GEN-LAST:event_jLabelPictureMouseClicked

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jComboBoxPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPositionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Object> jComboBoxPosition;
    private com.toedter.calendar.JDateChooser jDateDOB;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    // End of variables declaration//GEN-END:variables

    private void comboBoxUserAccount() {
        roleDAOImpl.comboBoxRole();
        jComboBoxPosition.removeAllItems();
        for (ComboBoxList a : roleDAOImpl.getList()) {
            this.jComboBoxPosition.addItem(a);
        }
    }

    private File pictureFile = null;

    private void browse() {
        try {
            int returnVal = jFileChooser1.showOpenDialog(this);
            if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
                pictureFile = jFileChooser1.getSelectedFile();
                uploadPhoto(pictureFile);
                int IMG_WIDTH = jLabelPicture.getWidth();
                int IMG_HEIGHT = jLabelPicture.getHeight();

                try {
                    BufferedImage originalImage = ImageIO.read(pictureFile);
                    int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();

                    BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
                    Graphics2D g = resizedImage.createGraphics();
                    g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
                    g.dispose();
                    g.setComposite(AlphaComposite.Src);

                    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                            RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                    g.setRenderingHint(RenderingHints.KEY_RENDERING,
                            RenderingHints.VALUE_RENDER_QUALITY);
                    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);

                    jLabelPicture.setIcon(new ImageIcon(resizedImage)); //to eliminate .jpeg from picture filename
                    ImageIO.write(resizedImage, "png", new File(CafSysv2.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "\\images\\model.jpg"));

                } catch (final IOException ex) {
                    
                }

            } else {
                File defaultDirectory = new File(System.getProperty("user.home"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void uploadPhoto(File file) {
        if (file != null) {
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] imageData = new byte[(int) file.length()];
                fis.read(imageData);
                userAccount.setPhoto(imageData);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    int IMG_WIDTH = 200;
    int IMG_HEIGHT = 200;

    private void displayPicture(UserAccount userAccount) {
        try {
            byte[] imageData = userAccount.getPhoto();
            ImageIcon imageIcon = new ImageIcon(imageData);

            Image image = imageIcon.getImage();
            int type = BufferedImage.TYPE_INT_ARGB;

            BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(image, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
            g.dispose();
            g.setComposite(AlphaComposite.Src);

            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g.setRenderingHint(RenderingHints.KEY_RENDERING,
                    RenderingHints.VALUE_RENDER_QUALITY);
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            jLabelPicture.setIcon(new ImageIcon(resizedImage));//image to label

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void validatePhoto() throws URISyntaxException {
        if (userAccount.getPhoto() == null) {
            File targetClassesDir = new File(CafSysv2.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "\\images\\no photo.jpg");
            try {
                FileInputStream fis = new FileInputStream(targetClassesDir);
                byte[] imageData = new byte[(int) targetClassesDir.length()];
                fis.read(imageData);
                userAccount.setPhoto(imageData);
            } catch (Exception e) {
                System.out.println("default of no photo is error");
            }
        }
    }

}
