package ui.ResortManagerRole;

import Model.Admin;
import Model.BusinessCatalogueDirectory;
import Model.CarServiceORG;
import Model.Resort;
import Model.ServiceLocation;
import Model.TourGuideORG;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SuperviseOrgForResort extends javax.swing.JPanel {

    private Admin EPAdmin;
    private ServiceLocation location;
    
    private Runnable callOnCreateMethod;
    private String type;
    private String user;
    

    public SuperviseOrgForResort(Admin EPAdmin, Runnable callOnCreateMethod, String user, String type,ServiceLocation location) {
        initComponents();
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.location = location;
//        setBackground(new java.awt.Color(255, 208, 56));
//        cityNameTextField.setText(location.getName());
//        cityNameTextField.setEditable(false);
//
//        deleteBtn.setBackground(new java.awt.Color(0, 102, 102));
//        deleteBtn.setOpaque(true);
//        addBtn.setBackground(new java.awt.Color(0, 102, 102));
//        addBtn.setOpaque(true);
//        updateButton.setBackground(new java.awt.Color(0, 102, 102));
//        updateButton.setOpaque(true);
//        backButton.setBackground(new java.awt.Color(0, 102, 102));
//        backButton.setOpaque(true);

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

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
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

        orgCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a organisation", "TourGuide", "CarService" }));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("CONTACT:");

        txtCreateMobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreateMobileNumberActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("NAME:");

        lblsysadmin.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblsysadmin.setText("SUPERVISE ORGANISATION FOR RESORT");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("CITY");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("ORGANISATION TYPE:");

        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtCreateMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(167, 167, 167)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cityNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(error_mobilenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(218, 218, 218)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblsysadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(backButton)
                .addGap(31, 31, 31)
                .addComponent(lblsysadmin)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel6)
                                .addGap(52, 52, 52))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCreateMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(cityNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(error_mobilenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
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

    else
    {
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
        else
        {
            if(txtCreateMobileNumber.getText().length() != 10)
            {
             invalidphoneno();   
            }
            
            else
            {
                String orgType1 = orgCombo.getSelectedItem().toString();      // org-type (physician org)     
                BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
                List<Resort> resort = businessCatalogueDirectory.getListOfResort();

                for (int i = 0; i < resort.size(); i++)
                {
                    resort.get(i).findSupervisor(user);      //find healthclub for which manager is working for
                    if (orgType1.equals("TourGuide")) 
                    {
                        resort.get(i).addTourGuideORG(name, contact, networkName);
                        row[0] = orgType1;
                        row[1] = name;
                        row[2] = contact;
                        row[3] = networkName;
                        model.addRow(row);
                        JOptionPane.showMessageDialog(this, " Organisation added successfully");
                        return;                               //healthclub found
                    } 
                    else
                    {
                        resort.get(i).addCarServiceORG(name, contact, networkName);
                        row[0] = orgType1;
                        row[1] = name;
                        row[2] = contact;
                        row[3] = networkName;
                        model.addRow(row);
                        JOptionPane.showMessageDialog(this, "Organisation added successfully");
                        return;
                    }
                }
            }
        }    
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
                } 
                else if (resort.getCarServiceORGList() != null) {
                    for (CarServiceORG carServices : resort.getCarServiceORGList()) {
                        if (carServices.getName().equals(OrgName)) {
                            resort.deleteCarService(carServices);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                }
                else
                {
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
        ServiceLocation location1 = EPAdmin.findServiceLocation(location.getName());
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

        else
        {
            error_mobilenumber.setText(" ");
        }
    }
}
