package ui.EventPlannerAdminRole;
/**
 *
 * @author himanshu
 */

import Model.*;
import Model.services.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import ui.main.Validator;

public class BusinessCatalogueSupervisorJPanel extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod;

    public BusinessCatalogueSupervisorJPanel(Admin Admin, Runnable callOnCreateMethod) {
        initComponents();
        this.Admin = Admin;
        this.callOnCreateMethod = callOnCreateMethod;
        for (ServiceLocation location : Admin.getListOfServiceLocation()) {
            cmbLocation.addItem(location.getName());
        }
        populateTable();
    }

    public boolean validateName() {
        if (txtSuprName.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean PasswordName() {
        if (passwordField.getText().matches("[a-zA-Z]{3}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : password should contain only 3 inputs");
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        lblBCSupr = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBusinessCatalogue = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        txtSuprName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbLocation = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        cmbBCType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbBCName = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

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
        backButton.setBounds(44, 23, 90, 26);

        lblBCSupr.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblBCSupr.setForeground(new java.awt.Color(255, 255, 255));
        lblBCSupr.setText("ENTERPRISE CATALOGUE ADMIN");
        add(lblBCSupr);
        lblBCSupr.setBounds(133, 71, 695, 43);

        btnDelete.setBackground(new java.awt.Color(204, 255, 255));
        btnDelete.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(824, 341, 104, 39);

        tblBusinessCatalogue.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblBusinessCatalogue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LOCATION NAME", "ENTERPRISE TYPE", "ENTERPRISE CATALOGUE NAME", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBusinessCatalogue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBusinessCatalogueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBusinessCatalogue);

        add(jScrollPane1);
        jScrollPane1.setBounds(73, 194, 745, 186);

        btnAdd.setBackground(new java.awt.Color(204, 255, 255));
        btnAdd.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(824, 241, 104, 38);

        txtSuprName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtSuprName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuprNameActionPerformed(evt);
            }
        });
        add(txtSuprName);
        txtSuprName.setBounds(434, 523, 228, 23);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTERPRISE CATALOGUE");
        add(jLabel1);
        jLabel1.setBounds(73, 472, 285, 22);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOCATION:");
        add(jLabel2);
        jLabel2.setBounds(73, 158, 119, 22);

        cmbLocation.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Location" }));
        cmbLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocationActionPerformed(evt);
            }
        });
        add(cmbLocation);
        cmbLocation.setBounds(210, 159, 194, 23);

        btnUpdate.setBackground(new java.awt.Color(204, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(824, 291, 104, 38);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADMIN NAME");
        add(jLabel3);
        jLabel3.setBounds(73, 522, 285, 22);

        usernameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(usernameField);
        usernameField.setBounds(434, 578, 228, 23);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USERNAME");
        add(jLabel4);
        jLabel4.setBounds(73, 580, 285, 22);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PASSWORD");
        add(jLabel5);
        jLabel5.setBounds(73, 634, 285, 22);

        passwordField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(passwordField);
        passwordField.setBounds(434, 635, 228, 23);

        cmbBCType.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbBCType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Enterprise Catalogue", "Entertainment", "Catering", "Resort", "Event" }));
        cmbBCType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBCTypeActionPerformed(evt);
            }
        });
        add(cmbBCType);
        cmbBCType.setBounds(434, 471, 228, 23);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ENTERPRISE NAME");
        add(jLabel7);
        jLabel7.setBounds(73, 419, 285, 22);

        cmbBCName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbBCName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecte Name of Enterprise" }));
        add(cmbBCName);
        cmbBCName.setBounds(434, 420, 228, 23);

        jLabel6.setBackground(new java.awt.Color(204, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/EventPlannerAdminRole/client.jpeg"))); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6);
        jLabel6.setBounds(0, 0, 1220, 830);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRowIndex = tblBusinessCatalogue.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblBusinessCatalogue.getModel();
        String locationName = (String) model.getValueAt(selectedRowIndex, 0);
        String enterpriseType = (String) model.getValueAt(selectedRowIndex, 1);
        String enterpriseName = (String) model.getValueAt(selectedRowIndex, 2);
        String selectedUser = (String) model.getValueAt(selectedRowIndex, 4);
        ServiceLocation location = Admin.findServiceLocation(locationName);
        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        if (enterpriseType.equals("Event")) {
            for (Events event : businessCatalogueDirectory.getListOfEvents()) {
                for (Supervisor supr : event.getListOfSupervisor()) {
                    if (supr.getName().equals(selectedUser)) {
                        event.deleteSupervisor(supr);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        } else if (enterpriseType.equals("Catering")) {
            for (Catering cat : businessCatalogueDirectory.getListOfCatering()) {
                for (Supervisor supr : cat.getListOfSupervisor()) {
                    if (supr.getName().equals(selectedUser)) {
                        cat.deleteSupervisor(supr);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        } else if (enterpriseType.equals("Resort")) {
            for (Resort resort : businessCatalogueDirectory.getListOfResort()) {
                for (Supervisor supr : resort.getListOfSupervisor()) {
                    if (supr.getName().equals(selectedUser)) {
                        resort.deleteSupervisor(supr);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        }
        else if (enterpriseType.equals("Entertainment")) {
            for (Entertainment ent : businessCatalogueDirectory.getListOfEntertainment()) {
                for (Supervisor supr : ent.getListOfSupervisor()) {
                    if (supr.getName().equals(selectedUser)) {
                        ent.deleteSupervisor(supr);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSuprNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuprNameActionPerformed

    }//GEN-LAST:event_txtSuprNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblBusinessCatalogue.getModel();
        Object row[] = new Object[10];
        String name = txtSuprName.getText();
        String userName = usernameField.getText();
        String password = passwordField.getText();
        String locationName = cmbLocation.getSelectedItem().toString();
        String enterpriseType1 = cmbBCType.getSelectedItem().toString();   //type of enterprises eg:healthclub
        String enterpriseName1 = cmbBCName.getSelectedItem().toString();

        if (!Validator.validateName(this, name) || !Validator.validateUserName(this, userName)
                || !Validator.validatePassword(this, password)) {
            return;
        }

        if (!Admin.userExistsInSystem(userName)) {
            ServiceLocation location = Admin.findServiceLocation(locationName);  //finiding location
            BusinessCatalogueDirectory businessCatelogDirectory = location.getBusinessCatalogueDirectory();
            if (enterpriseType1.equals("Entertainment") && businessCatelogDirectory != null) {
                Entertainment entertainmentName1 = businessCatelogDirectory.findEntertainment(enterpriseName1);
                entertainmentName1.addSupervisor(name, userName, password);
                Admin.getUserNamePasswordMap();
                Admin.addUser(userName, password, "Entertainment");
                row[0] = locationName;
                row[1] = "Entertainment";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
                return;
            } else if (enterpriseType1.equals("Event") && businessCatelogDirectory != null) {
                Events event1 = businessCatelogDirectory.findEvents(enterpriseName1);
                event1.addSupervisor(name, userName, password);
                Admin.addUser(userName, password, "Event");
                row[0] = locationName;
                row[1] = "Event";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
            } else if (enterpriseType1.equals("Catering") && businessCatelogDirectory != null) {
                Catering res1 = businessCatelogDirectory.findCatering(enterpriseName1);
                res1.addSupervisor(userName, userName, password);
                Admin.addUser(userName, password, "Catering");

                row[0] = locationName;
                row[1] = "Catering";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
            } else if (enterpriseType1.equals("Resort") && businessCatelogDirectory != null) {
                Resort hotel1 = businessCatelogDirectory.findResort(enterpriseName1);
                hotel1.addSupervisor(name, userName, password);
                Admin.addUser(userName, password, "Resort");
                row[0] = locationName;
                row[1] = "Resort";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
            }
        } else {
            JOptionPane.showMessageDialog(this, String.format("This username '%s' already exists", userName));
        }
        JOptionPane.showMessageDialog(this, "Manager added successfully");
        txtSuprName.setText("");
        usernameField.setText("");
        passwordField.setText("");
        cmbBCName.setSelectedIndex(0);
        cmbBCType.setSelectedIndex(0);
        cmbLocation.setSelectedIndex(0);
    }//GEN-LAST:event_btnAddActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void cmbLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocationActionPerformed

    }//GEN-LAST:event_cmbLocationActionPerformed

    private void cmbBCTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBCTypeActionPerformed
        cmbBCName.removeAllItems();
        String locationName = cmbLocation.getSelectedItem().toString();
        ServiceLocation location = Admin.findServiceLocation(locationName);
        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        String enterpriseType1 = cmbBCType.getSelectedItem().toString();
        if (enterpriseType1.equals("Entertainment")) {
            for (Entertainment entertainment : businessCatalogueDirectory.getListOfEntertainment()) {
                cmbBCName.addItem(entertainment.getName());
            }
        } else if (enterpriseType1.equals("Event")) {
            for (Events event : businessCatalogueDirectory.getListOfEvents()) {
                cmbBCName.addItem(event.getName());
            }
        } else if (enterpriseType1.equals("Catering")) {
            for (Catering cat : businessCatalogueDirectory.getListOfCatering()) {
                cmbBCName.addItem(cat.getName());
            }
        } else if (enterpriseType1.equals("Resort")) {
            for (Resort res : businessCatalogueDirectory.getListOfResort()) {
                cmbBCName.addItem(res.getName());
            }
        } else {
            return;
        }

    }//GEN-LAST:event_cmbBCTypeActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if (tblBusinessCatalogue.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        String locationkName = cmbLocation.getSelectedItem().toString();
        String enterpriseType1 = cmbBCType.getSelectedItem().toString();
        String enterpriseName1 = cmbBCName.getSelectedItem().toString();
        String managerUserName = usernameField.getText();

        String password = passwordField.getText();
        String name = txtSuprName.getText();

        ServiceLocation location = Admin.findServiceLocation(locationkName);  //finiding location
        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();

        if (enterpriseType1.equals("Entertainment")) {
            Entertainment entertainmentName1 = businessCatalogueDirectory.findEntertainment(enterpriseName1);
            for (Supervisor ent : entertainmentName1.getListOfSupervisor()) {
                if (ent.getUsername().equals(managerUserName)) {

                    ent.setName(name);
                    ent.setPassword(password);

                    Admin.updateUser(managerUserName, password);
                    populateTable();
                    JOptionPane.showMessageDialog(this, " Updated successfully ");
                    return;
                }
            }
        } else if (enterpriseType1.equals("Event")) {
            Events event1 = businessCatalogueDirectory.findEvents(enterpriseName1);
            for (Supervisor man : event1.getListOfSupervisor()) {
                if (man.getUsername().equals(managerUserName)) {

                    man.setName(name);
                    man.setPassword(password);

                    Admin.updateUser(managerUserName, password);
                    populateTable();
                    JOptionPane.showMessageDialog(this, " Updated successfully ");
                    return;
                }
            }
        } else if (enterpriseType1.equals("Resort")) {
            Resort resort = businessCatalogueDirectory.findResort(enterpriseName1);
            for (Supervisor man : resort.getListOfSupervisor()) {
                if (man.getUsername().equals(managerUserName)) {

                    man.setName(name);
                    man.setPassword(password);

                    Admin.updateUser(managerUserName, password);
                    populateTable();
                    JOptionPane.showMessageDialog(this, " Updated successfully ");
                    return;
                }
            }
        } else if (enterpriseType1.equals("Catering")) {
            Catering cat = businessCatalogueDirectory.findCatering(enterpriseName1);
            for (Supervisor man : cat.getListOfSupervisor()) {
                if (man.getUsername().equals(managerUserName)) {
                    man.setName(name);
                    man.setPassword(password);

                    Admin.updateUser(managerUserName, password);

                    populateTable();
                    JOptionPane.showMessageDialog(this, "Updated successfully ");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid enterprise [" + enterpriseType1 + "]");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblBusinessCatalogueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBusinessCatalogueMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblBusinessCatalogue.getModel();
        if (tblBusinessCatalogue.getSelectedRowCount() != 1) {
            return;
        }

        String locationName = model.getValueAt(tblBusinessCatalogue.getSelectedRow(), 0).toString();

        String eType = model.getValueAt(tblBusinessCatalogue.getSelectedRow(), 1).toString();
        String eName = model.getValueAt(tblBusinessCatalogue.getSelectedRow(), 2).toString();

        String managerName = model.getValueAt(tblBusinessCatalogue.getSelectedRow(), 3).toString();
        String managerUserName = model.getValueAt(tblBusinessCatalogue.getSelectedRow(), 4).toString();
        String managerPassword = model.getValueAt(tblBusinessCatalogue.getSelectedRow(), 5).toString();

        txtSuprName.setText(managerName);
        usernameField.setText(managerUserName);
        passwordField.setText(managerPassword);

        cmbLocation.setSelectedItem(locationName);
        cmbBCName.setSelectedItem(eName);
        cmbBCType.setSelectedItem(eType);
    }//GEN-LAST:event_tblBusinessCatalogueMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbBCName;
    private javax.swing.JComboBox<String> cmbBCType;
    private javax.swing.JComboBox<String> cmbLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBCSupr;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTable tblBusinessCatalogue;
    private javax.swing.JTextField txtSuprName;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblBusinessCatalogue.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        for (ServiceLocation location : Admin.getListOfServiceLocation()) {        //populate location
            row[0] = location.getName();
            BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();  //populate enterpirse name
            for (Events event : businessCatalogueDirectory.getListOfEvents()) {   //poplulate events enterprise
                row[1] = "Event";
                row[2] = event.getName();
                for (Supervisor supervisor : event.getListOfSupervisor()) {
                    row[0] = location.getName();
                    row[1] = "Event";
                    row[2] = event.getName();
                    row[3] = supervisor.getName();
                    row[4] = supervisor.getUsername();
                    row[5] = supervisor.getPassword();
                    model.addRow(row);
                }
            }
            for (Catering cat : businessCatalogueDirectory.getListOfCatering()) {   //poplulate restauarant enterprise
                row[1] = "Catering";
                row[2] = cat.getName();
                for (Supervisor supervisor : cat.getListOfSupervisor()) {
                    row[0] = location.getName();
                    row[1] = "Catering";
                    row[2] = cat.getName();
                    row[3] = supervisor.getName();
                    row[4] = supervisor.getUsername();
                    row[5] = supervisor.getPassword();
                    model.addRow(row);
                }
            }
            for (Resort resort : businessCatalogueDirectory.getListOfResort()) {   //poplulate ent enterprise
                row[1] = "Resort";
                row[2] = resort.getName();
                for (Supervisor supervisor : resort.getListOfSupervisor()) {
                    row[0] = location.getName();
                    row[1] = "Resort";
                    row[2] = resort.getName();
                    row[3] = supervisor.getName();
                    row[4] = supervisor.getUsername();
                    row[5] = supervisor.getPassword();
                    model.addRow(row);
                }
            }
            for (Entertainment entertainment : businessCatalogueDirectory.getListOfEntertainment()) {   //poplulate ent enterprise
                row[1] = "Entertainment";
                row[2] = entertainment.getName();
                for (Supervisor supervisor : entertainment.getListOfSupervisor()) {
                    row[0] = location.getName();
                    row[1] = "Entertainment";
                    row[2] = entertainment.getName();
                    row[3] = supervisor.getName();
                    row[4] = supervisor.getUsername();
                    row[5] = supervisor.getPassword();
                    model.addRow(row);
                }
            }

        }
    }

}
