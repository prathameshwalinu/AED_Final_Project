package ui.EntertainmentsupervisorRole;

import Model.Admin;
import Model.BusinessCatalogueDirectory;
import Model.Entertainment;
import Model.Entertainment_ChoreographerORG;
import Model.Entertainment_MagicianORG;
import Model.Entertainment_SingerORG;
import Model.ServiceLocation;
import Model.Supervisor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import ui.main.Validator;

public class OrganizationAdminPanel extends javax.swing.JPanel {

    private Admin EPAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private ServiceLocation location;

    public OrganizationAdminPanel(Admin EPAdmin, Runnable callOnCreateMethod, String user, String type, ServiceLocation location) {
        
        initComponents();
        
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.location = location;
        
        txtlocation.setText(location.getName());
        txtlocation.setEditable(false);
        
//        setBackground(new java.awt.Color(255, 208, 56));
//        updateButton.setBackground(new java.awt.Color(0, 102, 102));
//        updateButton.setOpaque(true);
//        backButton.setBackground(new java.awt.Color(0, 102, 102));
//        backButton.setOpaque(true);
//        deleteButton.setBackground(new java.awt.Color(0, 102, 102));
//        deleteButton.setOpaque(true);
//        addButton.setBackground(new java.awt.Color(0, 102, 102));
//        addButton.setOpaque(true);
    }

    public boolean validateName() 
    {
        if (nameField.getText().matches("[a-zA-Z]{2,19}") && nameField.getText() != null) {
            return true;
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean PasswordName() 
    {
        if (passwordField.getText().matches("[a-zA-Z]{3,}") && passwordField.getText() != null) {
            return true;
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Invalid input : password should contain more than 3 or more letters");
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        orgCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        orgName = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        txtlocation = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LOCATION", "ORGNANIZATION TYPE", "ORGANIZATION NAME", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("ORGANIZATION TYPE");

        orgCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an organisation type", "Magician", "Choreographer", "Singer" }));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("NAME");

        nameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("USERNAME");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("PASSWORD");

        addButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setText("ORGANIZATION NAME ");

        orgName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("LOCATION");

        updateButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(363, 363, 363)
                        .addComponent(jLabel4)
                        .addContainerGap(305, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(orgName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtlocation, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(107, 107, 107)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(updateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))))
                                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(orgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );
    }// </editor-fold>//GEN-END:initComponents

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

        if (!EPAdmin.userExistsInSystem(username)) {

            BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
            List<Entertainment> list = businessCatalogueDirectory.getListOfEntertainment();

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).findSupervisor(user) != null) {    //if entertainment ent supervisor found in location
                    if (orgType.equals("Magician")) {
                        List<Entertainment_MagicianORG> org1 = list.get(i).getListOfMagicianORG();
                        for (int j = 0; j < org1.size(); j++) {
                            if (org1.get(j).getName().equals(orgName1)) {
                                org1.get(j).addSupervisor(name, location.getName(), username, password); //add managers for each org (eg:physiican org)
                                row[0] = location.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                EPAdmin.addUser(username, password, "Magician");
                                JOptionPane.showMessageDialog(this, "Successfully added Magician organization");
                                return;
                            }
                        }
                    }
                    else if (orgType.equals("Choreographer"))
                    {
                        List<Entertainment_ChoreographerORG> org2 = list.get(i).getListOfChoreographerORG();
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
                                EPAdmin.addUser(username, password, "Choreographer");
                                JOptionPane.showMessageDialog(this, "Successfully added Choreographer organization");
                                return;
                            }
                        }
                    } else {
                        List<Entertainment_SingerORG> org3 = list.get(i).getListOfSingerORG();
                        for (int j = 0; j < org3.size(); j++) {
                            if (org3.get(j).getName().equals(orgName1)) {
                                org3.get(j).addSupervisor(name, location.getName(), username, password);
                                row[0] = location.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                EPAdmin.addUser(username, password, "Singer");
                                JOptionPane.showMessageDialog(this, "Successfully added Singer organization");
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, " username already exits");
        }          
    }//GEN-LAST:event_addButtonActionPerformed

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboActionPerformed
        orgName.removeAllItems();
        String orgType = orgCombo.getSelectedItem().toString();

        BusinessCatalogueDirectory enterpriseDirec = location.getBusinessCatalogueDirectory();
        List<Entertainment> list = enterpriseDirec.getListOfEntertainment();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).findSupervisor(user) != null) {
                if (orgType.equals("Magician")) {
                    List<Entertainment_MagicianORG> org1 = list.get(i).getListOfMagicianORG();
                    for (int j = 0; j < org1.size(); j++) {
                        orgName.addItem(org1.get(j).getName());
                    }
                } else if (orgType.equals("Choreographer")) {
                    List<Entertainment_ChoreographerORG> org2 = list.get(i).getListOfChoreographerORG();
                    for (int j = 0; j < org2.size(); j++) {
                        orgName.addItem(org2.get(j).getName());
                    }
                } else {
                    List<Entertainment_SingerORG> org3 = list.get(i).getListOfSingerORG();
                    for (int j = 0; j < org3.size(); j++) {
                        orgName.addItem(org3.get(j).getName());
                    }
                }
                return;
            }
        }        
    }//GEN-LAST:event_orgComboActionPerformed

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
        for (Entertainment ent : businessCatalogueDirectory.getListOfEntertainment()) {
            if (ent.findSupervisor(user) != null) {
                if (orgType.equals("Singer") && ent.getListOfSingerORG() != null) {
                    for (Entertainment_SingerORG singer : ent.getListOfSingerORG()) {
                        if (singer.getName().equals(OrgName)) {
                            for (Supervisor supr : singer.getListOfSupervisor()) {
                                if (supr.getUsername().equals(selectedUser)) {
                                    singer.deleteSupervisor(supr);
                                    JOptionPane.showMessageDialog(this, " Organisation Supervisor added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else if (orgType.equals("Magician") && ent.getListOfMagicianORG() != null) {
                    for (Entertainment_MagicianORG magician : ent.getListOfMagicianORG()) {
                        if (magician.getName().equals(OrgName)) {
                            for (Supervisor supr : magician.getListOfSupervisor()) {
                                if (supr.getUsername().equals(selectedUser)) {
                                    magician.deleteSupervisor(supr);
                                    JOptionPane.showMessageDialog(this, " Organisation Supervisor added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    for (Entertainment_ChoreographerORG choreographer : ent.getListOfChoreographerORG()) {
                        if (choreographer.getName().equals(OrgName)) {
                            for (Supervisor supr : choreographer.getListOfSupervisor()) {
                                if (supr.getUsername().equals(selectedUser)) {
                                    choreographer.deleteSupervisor(supr);
                                    JOptionPane.showMessageDialog(this, " Organisation Supervisor added successfully");
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String city = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String orgType = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String oName = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String supervisorName = model.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String supervisorUsername = model.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String supervisorPassword = model.getValueAt(jTable1.getSelectedRow(), 5).toString();

        nameField.setText(supervisorName);
        usernameField.setText(supervisorUsername);
        passwordField.setText(supervisorPassword);
        usernameField.setEnabled(false);
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
            for (Entertainment ent : businessCatalogueDirectory.getListOfEntertainment()) {
                if (orgType.equals("Magician") && ent.getListOfMagicianORG() != null) {
                    for (Entertainment_MagicianORG mag : ent.getListOfMagicianORG()) {
                        for (Supervisor supr : mag.getListOfSupervisor()) {
                            if (supr.getUsername().equals(usernameField.getText())) {
                                supr.setName(nameField.getText());
                                supr.setPassword(passwordField.getText());
                                EPAdmin.updateUser(userName, password);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else if (orgType.equals("Singer") && ent.getListOfSingerORG() != null) {
                    for (Entertainment_SingerORG sing : ent.getListOfSingerORG()) {
                        for (Supervisor supr : sing.getListOfSupervisor()) {
                            if (supr.getUsername().equals(usernameField.getText())) {
                                supr.setName(nameField.getText());
                                supr.setPassword(passwordField.getText());
                                EPAdmin.updateUser(userName, password);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else if (orgType.equals("Choreographer") && ent.getListOfChoreographerORG() != null) {
                    for (Entertainment_ChoreographerORG choreo : ent.getListOfChoreographerORG()) {
                        for (Supervisor supr : choreo.getListOfSupervisor()) {
                            if (supr.getUsername().equals(usernameField.getText())) {
                                supr.setName(nameField.getText());
                                supr.setPassword(passwordField.getText());
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JComboBox<String> orgName;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField txtlocation;
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
        for (Entertainment entertainment : businessCatalogueDirectory.getListOfEntertainment()) {
            if (entertainment.findSupervisor(user) != null) {
                if (entertainment.getListOfMagicianORG() != null) {
                    row[0] = "Magician";
                    for (Entertainment_MagicianORG magician : entertainment.getListOfMagicianORG()) {
                        for (Supervisor supervisor : magician.getListOfSupervisor()) {       //add supervisor 
                            row[0] = location1.getName();
                            row[1] = "Magician";
                            row[2] = magician.getName();
                            row[3] = supervisor.getName();
                            row[4] = supervisor.getUsername();
                            row[5] = supervisor.getPassword();
                            model.addRow(row);
                        }
                    }
                }
                if (entertainment.getListOfSingerORG() != null) {
                    row[0] = "Singer";
                    for (Entertainment_SingerORG singer : entertainment.getListOfSingerORG()) {
                        for (Supervisor supervisor : singer.getListOfSupervisor()) {       //add supervisor 
                            row[0] = location1.getName();
                            row[1] = "Singer";
                            row[2] = singer.getName();
                            row[3] = supervisor.getName();
                            row[4] = supervisor.getUsername();
                            row[5] = supervisor.getPassword();
                            model.addRow(row);
                        }
                    }
                }
                if (entertainment.getListOfChoreographerORG() != null) {
                    row[0] = "Choreographer";
                    for (Entertainment_ChoreographerORG choreographer : entertainment.getListOfChoreographerORG()) {
                        for (Supervisor supervisor : choreographer.getListOfSupervisor()) {       //add supervisor 
                            row[0] = location1.getName();
                            row[1] = "Choreographer";
                            row[2] = choreographer.getName();
                            row[3] = supervisor.getName();
                            row[4] = supervisor.getUsername();
                            row[5] = supervisor.getPassword();
                            model.addRow(row);
                        }
                    }
                }

            }
        }
    }
}
