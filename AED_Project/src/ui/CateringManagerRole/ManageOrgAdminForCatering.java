package ui.CateringManagerRole;

import Model.Admin;
import Model.BusinessCatalogueDirectory;
import Model.Catering;
import Model.ServiceAgentOrganisation;
import Model.ServiceLocation;
import Model.Supervisor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import ui.main.Validator;

public class ManageOrgAdminForCatering extends javax.swing.JPanel {

    private Admin EPAdmin;
    private Runnable callOnCreateMethod;
    private String type;
    private String user;
    private ServiceLocation location;
   
    public ManageOrgAdminForCatering(Admin EPAdmin, Runnable callOnCreateMethod, String user, String type, ServiceLocation location) {
        initComponents();
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.location = location;
        networkName.setText(location.getName());
        networkName.setEditable(false);

        populateTable();
        //setBackground(new java.awt.Color(255, 208, 56));
        //deleteBtn.setBackground(new java.awt.Color(0, 102, 102));
        //deleteBtn.setOpaque(true);
        //addButton.setBackground(new java.awt.Color(0, 102, 102));
        //addButton.setOpaque(true);
        //updateButton.setBackground(new java.awt.Color(0, 102, 102));
        //updateButton.setOpaque(true);
        //backBtn.setBackground(new java.awt.Color(0, 102, 102));
        //backBtn.setOpaque(true);
    }

//    public boolean validateName() {
//        if (nameField.getText() != null && nameField.getText().matches("[a-zA-Z]{2,19}")) {
//            return true;
//        } else {
//            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
//            return false;
//        }
//    }
//
//    public boolean validatePassword() {
//        if (passwordField.getText() != null && passwordField.getText().matches("[a-zA-Z]{3,}")) {
//            return true;
//        } else {
//            JOptionPane.showMessageDialog(this, "Invalid input : password should contain 3 or more letters");
//            return false;
//        }
//    }
//
//    public boolean validateUserName() {
//        if (usernameField.getText() != null && usernameField.getText().length() > 1) {
//            return true;
//        }
//        JOptionPane.showMessageDialog(this, "Invalid input : username should contain 2 or more charactewrs");
//        return false;
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orgName = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        orgCombo = new javax.swing.JComboBox<>();
        deleteBtn = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        networkName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LOCATION", "ORGANIZATION TYPE", "ORGANIZATION NAME", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jScrollPane1.setBounds(58, 178, 764, 171);

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(62, 6, 126, 42);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("LOCATION");
        add(jLabel1);
        jLabel1.setBounds(76, 467, 103, 22);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("ORGANIZATION TYPE");
        add(jLabel2);
        jLabel2.setBounds(27, 548, 197, 22);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("ORGANIZATION NAME");
        add(jLabel3);
        jLabel3.setBounds(27, 657, 218, 22);

        orgName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(orgName);
        orgName.setBounds(275, 658, 197, 23);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("NAME");
        add(jLabel4);
        jLabel4.setBounds(565, 467, 60, 22);

        nameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(nameField);
        nameField.setBounds(631, 468, 182, 23);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setText("USERNAME");
        add(jLabel5);
        jLabel5.setBounds(525, 548, 100, 22);

        usernameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(usernameField);
        usernameField.setBounds(631, 549, 182, 23);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("PASSWORD");
        add(jLabel6);
        jLabel6.setBounds(524, 657, 101, 22);

        passwordField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(passwordField);
        passwordField.setBounds(631, 658, 182, 23);

        addButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(851, 178, 110, 44);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel7.setText("MANAGE ORGANIZATION ADMIN FOR CATERING");
        add(jLabel7);
        jLabel7.setBounds(71, 123, 913, 43);

        orgCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ServiceAgent" }));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });
        add(orgCombo);
        orgCombo.setBounds(275, 549, 197, 23);

        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn);
        deleteBtn.setBounds(851, 293, 116, 44);

        updateButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton);
        updateButton.setBounds(851, 234, 110, 41);

        networkName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkNameActionPerformed(evt);
            }
        });
        add(networkName);
        networkName.setBounds(275, 469, 197, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object row[] = new Object[20];
        String orgType = orgCombo.getSelectedItem().toString();
        String orgName1 = orgName.getSelectedItem().toString();
        String name = nameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (!Validator.validateName(this, name) || !Validator.validateUserName(this, username)
                || !Validator.validatePassword(this, password)) {
            return;
        }

        if (!EPAdmin.userExistsInSystem(username)) {
            BusinessCatalogueDirectory enterpriseCatalogueDirectory = location.getBusinessCatalogueDirectory();
            List<Catering> list = enterpriseCatalogueDirectory.getListOfCatering();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).findSupervisor(user) != null) {    //if manager found 
                    if (orgType.equals("ServiceAgent")) {
                        List<ServiceAgentOrganisation> org1 = list.get(i).getListOfServiceAgentOrganisation();
                        for (int j = 0; j < org1.size(); j++) {
                            if (org1.get(j).getName().equals(orgName1)) {
                                org1.get(j).addSupervisor(name, location.getName(), username, password);  // add manager for deliveryman org
                                row[0] = location.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                EPAdmin.addUser(username, password, "ServiceAgent");
                                JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "username already exists");
        }

        nameField.setText("");
        usernameField.setText("");
        passwordField.setText("");

        
    }//GEN-LAST:event_addButtonActionPerformed

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboActionPerformed
        String orgType = (String) orgCombo.getSelectedItem();
        orgName.removeAllItems();

        BusinessCatalogueDirectory enterpriseCatalogueDirectory = location.getBusinessCatalogueDirectory();
        List<Catering> list = enterpriseCatalogueDirectory.getListOfCatering();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).findSupervisor(user) != null) {
                if (orgType.equals("ServiceAgent")) {
                    List<ServiceAgentOrganisation> org1 = list.get(i).getListOfServiceAgentOrganisation();
                    for (int j = 0; j < org1.size(); j++) {
                        orgName.addItem(org1.get(j).getName());
                    }
                }
                return;
            }
        }       
    }//GEN-LAST:event_orgComboActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
 
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }

        String orgType = (String) model.getValueAt(selectedRowIndex, 1);
        String OrgName = (String) model.getValueAt(selectedRowIndex, 2);
        String selectedUser = (String) model.getValueAt(selectedRowIndex, 4);
        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        for (Catering res : businessCatalogueDirectory.getListOfCatering()) {
            if (res.findSupervisor(user) != null) {
                if (res.getListOfServiceAgentOrganisation() != null) {
                    for (ServiceAgentOrganisation del : res.getListOfServiceAgentOrganisation()) {
                        if (del.getName().equals(OrgName)) {
                            for (Supervisor man : del.getListOfSupervisor()) {
                                if (man.getUsername().equals(selectedUser)) {
                                    del.deleteSupervisor(man);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                }
            }

        }       
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String city = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String orgType = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String oName = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String managerName = model.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String managerUsername = model.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String managerPassword = model.getValueAt(jTable1.getSelectedRow(), 5).toString();

        nameField.setText(managerName);
        usernameField.setText(managerUsername);
        passwordField.setText(managerPassword);
        usernameField.setEnabled(false);
        networkName.setText(city);
        orgCombo.setSelectedItem(orgType);
        orgName.setSelectedItem(oName);
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (jTable1.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {

            String orgType = orgCombo.getSelectedItem().toString();
            String orgname = orgName.getSelectedItem().toString();
            String userName = usernameField.getText();
            String password = passwordField.getText();

            BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
            for (Catering rest : businessCatalogueDirectory.getListOfCatering()) {
                if (orgType.equals("ServiceAgent") && rest.getListOfServiceAgentOrganisation() != null) {
                    for (ServiceAgentOrganisation del : rest.getListOfServiceAgentOrganisation()) {
                        for (Supervisor man : del.getListOfSupervisor()) {
                            if (man.getUsername().equals(usernameField.getText())) {
                                man.setName(nameField.getText());
                                man.setPassword(passwordField.getText());
                                EPAdmin.updateUser(userName, password);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid organization");
                }
            }
        }       
    }//GEN-LAST:event_updateButtonActionPerformed

    private void networkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField networkName;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JComboBox<String> orgName;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = orgCombo.getSelectedItem().toString();
        ServiceLocation location1 = EPAdmin.findServiceLocation(location.getName());
        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        if (businessCatalogueDirectory == null) {
            return;
        }
        for (Catering restaurant : businessCatalogueDirectory.getListOfCatering()) {
            if (restaurant.findSupervisor(user) != null) {
                if (restaurant.getListOfServiceAgentOrganisation() != null) {
                    row[0] = "ServiceAgent";
                    for (ServiceAgentOrganisation delivery : restaurant.getListOfServiceAgentOrganisation()) {
                        for (Supervisor manager : delivery.getListOfSupervisor()) {       //add manager 
                            row[0] = location1.getName();
                            row[1] = "ServiceAgent";
                            row[2] = delivery.getName();
                            row[3] = manager.getName();
                            row[4] = manager.getUsername();
                            row[5] = manager.getPassword();
                            model.addRow(row);
                        }
                    }
                }
            }
        }

        
    }
}
