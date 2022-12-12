package ui.ResortManagerRole;
/**
 *
 * @author prathmeshw
 */
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.*;
import Model.services.*;
import ui.main.Validator;

public class SuperviseAdminOrgForResort extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private ServiceLocation location;

    public SuperviseAdminOrgForResort(Admin Admin, Runnable callOnCreateMethod, String user, String type, ServiceLocation location) {
        initComponents();
        this.Admin = Admin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.location = location;
        networkName.setText(location.getName());
        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        orgCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        lblsysadmin = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        orgName = new javax.swing.JComboBox<>();
        networkName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        addButton.setBackground(new java.awt.Color(204, 255, 255));
        addButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(958, 159, 100, 39);

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        add(nameField);
        nameField.setBounds(750, 362, 144, 23);

        orgCombo.setFont(new java.awt.Font("Baskerville Old Face", 0, 10)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TourGuide", "CarService" }));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });
        add(orgCombo);
        orgCombo.setBounds(336, 434, 187, 22);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ORGANIZATION TYPE");
        add(jLabel1);
        jLabel1.setBounds(94, 431, 197, 22);

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NAME");
        add(jLabel6);
        jLabel6.setBounds(606, 360, 113, 22);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOCATION");
        add(jLabel2);
        jLabel2.setBounds(94, 356, 197, 31);

        updateButton.setBackground(new java.awt.Color(204, 255, 255));
        updateButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton);
        updateButton.setBounds(958, 214, 100, 40);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ORGANIZATION NAME");
        add(jLabel3);
        jLabel3.setBounds(94, 500, 205, 22);

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        add(usernameField);
        usernameField.setBounds(750, 434, 144, 23);
        add(passwordField);
        passwordField.setBounds(750, 502, 144, 23);

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USERNAME");
        add(jLabel4);
        jLabel4.setBounds(606, 432, 113, 22);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PASSWORD");
        add(jLabel5);
        jLabel5.setBounds(606, 500, 113, 22);

        backButton.setBackground(new java.awt.Color(204, 255, 255));
        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(32, 21, 80, 30);

        lblsysadmin.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblsysadmin.setForeground(new java.awt.Color(255, 255, 255));
        lblsysadmin.setText("MANAGE RESORT ORGANISATION ADMIN");
        add(lblsysadmin);
        lblsysadmin.setBounds(105, 83, 823, 43);

        deleteButton.setBackground(new java.awt.Color(204, 255, 255));
        deleteButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton);
        deleteButton.setBounds(958, 271, 100, 46);

        jTable1.setFont(new java.awt.Font("Baskerville Old Face", 3, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LOCATION NAME", "ORGANIZATION TYPE", "ORGANIZATION NAME", "NAME", "USERNAME", "PASSWORD"
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
        jScrollPane1.setBounds(94, 159, 846, 158);

        orgName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgNameActionPerformed(evt);
            }
        });
        add(orgName);
        orgName.setBounds(336, 502, 187, 23);
        add(networkName);
        networkName.setBounds(336, 362, 187, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ResortManagerRole/hotel5.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        add(jLabel7);
        jLabel7.setBounds(0, 0, 1190, 740);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
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
        for (Resort resort : businessCatalogueDirectory.getListOfResort()) {
            if (resort.findSupervisor(user) != null) {
                if (orgType.equals("TourGuide") && resort.getTourGuideORG() != null) {
                    for (TourGuideORG tourGuide : resort.getTourGuideORG()) {
                        if (tourGuide.getName().equals(OrgName)) {
                            for (Supervisor supr : tourGuide.getListOfSupervisor()) {
                                if (supr.getUsername().equals(selectedUser)) {
                                    tourGuide.deleteManager(supr);
                                    JOptionPane.showMessageDialog(this, " Organisation Supervisor added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else if (orgType.equals("CarService") && resort.getCarServiceORGList() != null) {
                    for (CarServiceORG carService : resort.getCarServiceORGList()) {
                        if (carService.getName().equals(OrgName)) {
                            for (Supervisor supr : carService.getListOfSupervisor()) {
                                if (supr.getUsername().equals(selectedUser)) {
                                    carService.deleteSupervisor(supr);
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
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

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

        if (!Admin.userExistsInSystem(username)) {

            BusinessCatalogueDirectory enterpriseDirec = location.getBusinessCatalogueDirectory();
            List<Resort> list = enterpriseDirec.getListOfResort();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).findSupervisor(user) != null) {    //if supr found for resort enterprise
                    if (orgType.equals("TourGuide")) {
                        List<TourGuideORG> org1 = list.get(i).getTourGuideORG();
                        for (int j = 0; j < org1.size(); j++) {
                            if (org1.get(j).getName().equals(orgName1)) {
                                org1.get(j).addSupervisor(name, location.getName(), username, password); // add managers for each org
                                row[0] = location.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                Admin.addUser(username, password, "TourGuide");
                                JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                return;
                            }
                        }
                    } else if (orgType.equals("CarService")) {
                        List<CarServiceORG> org2 = list.get(i).getCarServiceORGList();
                        for (int j = 0; j < org2.size(); j++) {
                            if (org2.get(j).getName().equals(orgName1)) {
                                org2.get(j).addSupervisor(name, location.getName(), username, password);
                                row[0] = location.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                Admin.addUser(username, password, "CarService");
                                JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, " This username already exists");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboActionPerformed
        String orgType = orgCombo.getSelectedItem().toString();
        orgName.removeAllItems();

        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        List<Resort> list = businessCatalogueDirectory.getListOfResort();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).findSupervisor(user) != null) {
                if (orgType.equals("TourGuide")) {
                    List<TourGuideORG> org1 = list.get(i).getTourGuideORG();
                    for (int j = 0; j < org1.size(); j++) {
                        orgName.addItem(org1.get(j).getName());
                        return;
                    }
                } else {
                    List<CarServiceORG> org3 = list.get(i).getCarServiceORGList();
                    for (int j = 0; j < org3.size(); j++) {
                        orgName.addItem(org3.get(j).getName());
                    }
                }
                return;
            }
        }

    }//GEN-LAST:event_orgComboActionPerformed

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
            for (Resort resort : businessCatalogueDirectory.getListOfResort()) {
                if (orgType.equals("TourGuide") && resort.getTourGuideORG() != null) {
                    for (TourGuideORG tourGuide : resort.getTourGuideORG()) {
                        for (Supervisor supr : tourGuide.getListOfSupervisor()) {
                            if (supr.getUsername().equals(usernameField.getText())) {
                                supr.setName(nameField.getText());
                                supr.setPassword(passwordField.getText());
                                Admin.updateUser(userName, password);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else if (orgType.equals("CarService") && resort.getCarServiceORGList() != null) {
                    for (CarServiceORG car : resort.getCarServiceORGList()) {
                        for (Supervisor supr : car.getListOfSupervisor()) {
                            if (supr.getUsername().equals(usernameField.getText())) {
                                supr.setName(nameField.getText());
                                supr.setPassword(passwordField.getText());
                                Admin.updateUser(userName, password);
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

        orgCombo.setSelectedItem(orgType);
        orgName.setSelectedItem(oName);
    }//GEN-LAST:event_jTable1MouseClicked

    private void orgNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgNameActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblsysadmin;
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

        ServiceLocation location1 = Admin.findServiceLocation(location.getName());
        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        if (businessCatalogueDirectory == null) {
            return;
        }
        for (Resort resort : businessCatalogueDirectory.getListOfResort()) {
            if (resort.findSupervisor(user) != null) {
                if (resort.getTourGuideORG() != null) {
                    row[0] = "TourGuide";
                    for (TourGuideORG tourGuide : resort.getTourGuideORG()) {
                        for (Supervisor supr : tourGuide.getListOfSupervisor()) {       //add supr 
                            row[0] = location1.getName();
                            row[1] = "TourGuide";
                            row[2] = tourGuide.getName();
                            row[3] = supr.getName();
                            row[4] = supr.getUsername();
                            row[5] = supr.getPassword();
                            model.addRow(row);
                        }
                    }
                }
                if (resort.getCarServiceORGList() != null) {
                    row[0] = "CarService";
                    for (CarServiceORG carService : resort.getCarServiceORGList()) {
                        for (Supervisor supr : carService.getListOfSupervisor()) {       //add supr 
                            row[0] = location1.getName();
                            row[1] = "CarService";
                            row[2] = carService.getName();
                            row[3] = supr.getName();
                            row[4] = supr.getUsername();
                            row[5] = supr.getPassword();
                            model.addRow(row);
                        }
                    }
                }
            }
        }
    }
}
