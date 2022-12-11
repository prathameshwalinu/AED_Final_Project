package ui.ResortManagerRole;
/**
 *
 * @author prathmeshw
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.*;
import Model.services.*;

public class SuperviseOrgForResort extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod;
    private String type;
    private String user;
    private ServiceLocation location;

    public SuperviseOrgForResort(Admin Admin, Runnable callOnCreateMethod, String user, String type, ServiceLocation location) {
        initComponents();
        this.Admin = Admin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.location = location;
        setBackground(new java.awt.Color(255, 208, 56));
        cityNameTextField.setText(location.getName());
        cityNameTextField.setEditable(false);

        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        orgCombo = new javax.swing.JComboBox<>();
        updateButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCreateMobileNumber = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblsysadmin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        cityNameTextField = new javax.swing.JTextField();
        error_mobilenumber = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORGANIZATION TYPE", "NAME", "CONTACT", "CITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(83, 140, 801, 193);

        orgCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a organisation", "TourGuide", "CarService" }));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });
        add(orgCombo);
        orgCombo.setBounds(336, 387, 212, 23);

        updateButton.setBackground(new java.awt.Color(204, 255, 255));
        updateButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton);
        updateButton.setBounds(890, 234, 114, 41);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTACT");
        add(jLabel3);
        jLabel3.setBounds(83, 522, 236, 22);

        txtCreateMobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreateMobileNumberActionPerformed(evt);
            }
        });
        add(txtCreateMobileNumber);
        txtCreateMobileNumber.setBounds(337, 523, 211, 25);

        addBtn.setBackground(new java.awt.Color(204, 255, 255));
        addBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn);
        addBtn.setBounds(890, 175, 114, 41);

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        add(nameField);
        nameField.setBounds(336, 459, 212, 26);

        backButton.setBackground(new java.awt.Color(204, 255, 255));
        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(25, 25, 111, 28);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NAME");
        add(jLabel1);
        jLabel1.setBounds(83, 457, 235, 22);

        lblsysadmin.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblsysadmin.setForeground(new java.awt.Color(255, 255, 255));
        lblsysadmin.setText("SUPERVISE ORGANISATION FOR RESORT");
        add(lblsysadmin);
        lblsysadmin.setBounds(102, 79, 769, 43);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CITY");
        add(jLabel6);
        jLabel6.setBounds(83, 583, 236, 22);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ORGANISATION TYPE");
        add(jLabel2);
        jLabel2.setBounds(83, 388, 235, 22);

        deleteBtn.setBackground(new java.awt.Color(204, 255, 255));
        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn);
        deleteBtn.setBounds(890, 293, 114, 40);
        add(cityNameTextField);
        cityNameTextField.setBounds(337, 583, 211, 27);
        add(error_mobilenumber);
        error_mobilenumber.setBounds(236, 491, 215, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ResortManagerRole/hotel5.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(0, 0, 1060, 690);
    }// </editor-fold>//GEN-END:initComponents
    private void txtCreateMobileNumberKeyReleased(java.awt.event.KeyEvent evt){
    String PATTERN = "^[0-9]{0,10}$";
    Pattern pattern = Pattern.compile(PATTERN);
Matcher match = pattern.matcher(txtCreateMobileNumber.getText());
if(!match.matches())
{
error_mobilenumber.setText("Mobile Number format is incorrect!");
}
else if(txtCreateMobileNumber.getText().length()!= 10)
{
    error_mobilenumber.setText("Enter 10 digit phone no.");
//JOptionPane.showMessageDialog(null,"Enter 10 digit phone no.");
}

else{
error_mobilenumber.setText(null);
}

    }
    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed

    }//GEN-LAST:event_nameFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboActionPerformed

    }//GEN-LAST:event_orgComboActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object row[] = new Object[20];
        String networkName = location.getName(); //find the location from city-combobox
        String name = nameField.getText();
        String contact = txtCreateMobileNumber.getText();
        

        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Organization name should be at least 2 characters long.");
            return;
            
        }
        
        
        
        else {
            if(txtCreateMobileNumber.getText().length() != 10){
             invalidphoneno();   
            }
            else{
        String orgType1 = orgCombo.getSelectedItem().toString();      // org-type (physician org)     
        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        List<Resort> resort = businessCatalogueDirectory.getListOfResort();

        for (int i = 0; i < resort.size(); i++) {
            resort.get(i).findSupervisor(user);      //find healthclub for which manager is working for
            if (orgType1.equals("TourGuide")) {
                resort.get(i).addTourGuideORG(name, contact, networkName);
                row[0] = orgType1;
                row[1] = name;
                row[2] = contact;
                row[3] = networkName;
                model.addRow(row);
                JOptionPane.showMessageDialog(this, " Organisation added successfully");
                return;                               //healthclub found
            } else {
                resort.get(i).addCarServiceORG(name, contact, networkName);
                row[0] = orgType1;
                row[1] = name;
                row[2] = contact;
                row[3] = networkName;
                model.addRow(row);
                JOptionPane.showMessageDialog(this, "Organisation added successfully");
                return;
            }
        }}}
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        String OrgType = (String) model.getValueAt(selectedRowIndex, 0);
        String OrgName = (String) model.getValueAt(selectedRowIndex, 1);
        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        for (Resort resort : businessCatalogueDirectory.getListOfResort()) {
            if (resort.findSupervisor(user) != null) {
                if (OrgType.equals("TourGuide") && resort.getTourGuideORG() != null) {
                    for (TourGuideORG tourGuide : resort.getTourGuideORG()) {
                        if (tourGuide.getName().equals(OrgName)) {
                            resort.deleteTourGuide(tourGuide);

                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else if (resort.getCarServiceORGList() != null) {
                    for (CarServiceORG carServices : resort.getCarServiceORGList()) {
                        if (carServices.getName().equals(OrgName)) {
                            resort.deleteCarService(carServices);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else {
                    return;
                }

            }
        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String orgType = orgCombo.getSelectedItem().toString();
        String orgname = model.getValueAt(jTable1.getSelectedRow(), 1).toString();

        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        for (Resort resort : businessCatalogueDirectory.getListOfResort()) {
            if (orgType.equals("TourGuide") && resort.getTourGuideORG() != null) {
                for (TourGuideORG tourGuide : resort.getTourGuideORG()) {
                    if (tourGuide.getName().equals(orgname)) {
                        tourGuide.setName(nameField.getText());
                        tourGuide.setContact(txtCreateMobileNumber.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("CarService") && resort.getCarServiceORGList() != null) {
                for (CarServiceORG car : resort.getCarServiceORGList()) {
                    if (car.getName().equals(orgname)) {
                        car.setName(nameField.getText());
                        car.setContact(txtCreateMobileNumber.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            }

        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() != 1) {
            return;
        }

        String orgType = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String orgName = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String orgContact = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String orgCity = model.getValueAt(jTable1.getSelectedRow(), 3).toString();

        nameField.setText(orgName);
        txtCreateMobileNumber.setText(orgContact);
        cityNameTextField.setText(orgCity);
        orgCombo.setSelectedItem(orgType);
        cityNameTextField.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtCreateMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreateMobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreateMobileNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cityNameTextField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel error_mobilenumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JTextField txtCreateMobileNumber;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = orgCombo.getSelectedItem().toString();
        ServiceLocation location1 = Admin.findServiceLocation(location.getName());
        BusinessCatalogueDirectory businessCatalogueDirectory = location1.getBusinessCatalogueDirectory();
        if (businessCatalogueDirectory != null) {
            return;
        }
        for (Resort resort : businessCatalogueDirectory.getListOfResort()) {
            if (resort.findSupervisor(user) != null) {
                if (resort.getTourGuideORG() != null) {
                    row[0] = "TourGuide";
                    for (TourGuideORG tourGuide : resort.getTourGuideORG()) {
                        row[0] = "TourGuide";
                        row[1] = tourGuide.getName();
                        row[2] = tourGuide.getContact();
                        row[3] = location1.getName();
                        model.addRow(row);
                    }
                }
                if (resort.getCarServiceORGList() != null) {
                    row[0] = "CarService";
                    for (CarServiceORG carService : resort.getCarServiceORGList()) {
                        row[0] = "CarService";
                        row[1] = carService.getName();
                        row[2] = carService.getContact();
                        row[3] = location.getName();
                        model.addRow(row);
                    }
                }

            }
        }
    }

    private void invalidphoneno() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      String PATTERN = "^[0-9]{0,10}$";
    Pattern pattern = Pattern.compile(PATTERN);
Matcher match = pattern.matcher(txtCreateMobileNumber.getText());
if(!match.matches())
{
error_mobilenumber.setText("Mobile Number format is incorrect!");
}
else if(txtCreateMobileNumber.getText().length()!= 10)
{
    error_mobilenumber.setText("Enter 10 digit phone no.");
//JOptionPane.showMessageDialog(null,"Enter 10 digit phone no.");
}

else{
error_mobilenumber.setText(" ");
}
    }
}
