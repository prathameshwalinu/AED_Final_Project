package ui.EventManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Events;
import Model.Event_BirthdayParty;
import Model.Event_Meetings;
import Model.BusinessCatalogueDirectory;
import Model.Supervisor;
import Model.ServiceLocation;
import Model.Event_Wedding;
import Model.Admin;
import ui.main.Validator;

public class SuperviseAdminEventOrganisation extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private ServiceLocation location;

    public SuperviseAdminEventOrganisation(Admin Admin, Runnable callOnCreateMethod, String user, String type, ServiceLocation location) {
        initComponents();
        this.Admin = Admin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.location = location;
        locationName.setText(location.getName());
        locationName.setEditable(false);
        populateTable();
        setBackground(new java.awt.Color(255, 208, 56));
        deleteBtn.setBackground(new java.awt.Color(0, 102, 102));
        deleteBtn.setOpaque(true);
        addBtn.setBackground(new java.awt.Color(0, 102, 102));
        addBtn.setOpaque(true);
        updateBtn.setBackground(new java.awt.Color(0, 102, 102));
        updateBtn.setOpaque(true);
        backButton.setBackground(new java.awt.Color(0, 102, 102));
        backButton.setOpaque(true);
    }

    public boolean validateName() {
        if (nameField.getText().matches("[a-zA-Z]{2,19}") && nameField.getText() != null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean PasswordName() {
        if (passwordField.getText().matches("[a-zA-Z]{3,}") && passwordField.getText() != null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : password should contain more than 3 or more letters");
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        orgCombo = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        orgName = new javax.swing.JComboBox<>();
        locationName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("NAME");
        add(jLabel6);
        jLabel6.setBounds(634, 448, 82, 25);
        add(usernameField);
        usernameField.setBounds(823, 518, 176, 23);
        add(nameField);
        nameField.setBounds(823, 451, 176, 23);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("ORGANIZATION TYPE ");
        add(jLabel2);
        jLabel2.setBounds(25, 516, 203, 22);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("LOCATION");
        add(jLabel7);
        jLabel7.setBounds(25, 449, 203, 22);
        add(passwordField);
        passwordField.setBounds(823, 594, 176, 23);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("USERNAME");
        add(jLabel4);
        jLabel4.setBounds(634, 516, 121, 22);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("PASSWORD");
        add(jLabel5);
        jLabel5.setBounds(634, 592, 126, 22);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("ORGANIZATION NAME");
        add(jLabel3);
        jLabel3.setBounds(25, 592, 205, 22);

        deleteBtn.setBackground(new java.awt.Color(255, 255, 204));
        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn);
        deleteBtn.setBounds(1011, 382, 92, 36);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("MANAGE ADMIN EVENT ORGANIZATION");
        add(jLabel1);
        jLabel1.setBounds(138, 109, 803, 43);

        backButton.setBackground(new java.awt.Color(255, 255, 204));
        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(25, 27, 87, 35);

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
        jScrollPane1.setBounds(25, 227, 974, 191);

        orgCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an organisation type", "Meeting", "Wedding", "BirthdayParty" }));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });
        add(orgCombo);
        orgCombo.setBounds(254, 517, 220, 23);

        addBtn.setBackground(new java.awt.Color(255, 255, 204));
        addBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn);
        addBtn.setBounds(1011, 292, 92, 39);

        updateBtn.setBackground(new java.awt.Color(255, 255, 204));
        updateBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn);
        updateBtn.setBounds(1011, 337, 92, 39);

        orgName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orgName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select organisation Name" }));
        add(orgName);
        orgName.setBounds(254, 593, 220, 23);
        add(locationName);
        locationName.setBounds(254, 451, 220, 23);

        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/EventManagerRole/N.jpeg"))); // NOI18N
        jLabel8.setText("jLabel8");
        add(jLabel8);
        jLabel8.setBounds(0, 0, 1120, 760);
    }// </editor-fold>//GEN-END:initComponents

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
        for (Events event : businessCatalogueDirectory.getListOfEvents()) {
            if (event.findSupervisor(user) != null) {
                if (orgType.equals("BirthdayParty") && event.getListOfBirthdayParty() != null) {
                    for (Event_BirthdayParty birthday : event.getListOfBirthdayParty()) {
                        if (birthday.getName().equals(OrgName)) {
                            for (Supervisor supr : birthday.getListOfSupervisor()) {
                                if (supr.getUsername().equals(selectedUser)) {
                                    birthday.deleteSupervisor(supr);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else if (orgType.equals("Meeting") && event.getListOfMeetings() != null) {
                    for (Event_Meetings meeting : event.getListOfMeetings()) {
                        if (meeting.getName().equals(OrgName)) {
                            for (Supervisor supr : meeting.getListOfSupervisor()) {
                                if (supr.getUsername().equals(selectedUser)) {
                                    meeting.deleteSupervisor(supr);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    for (Event_Wedding wed : event.getListOfWeddingServices()) {
                        if (wed.getName().equals(OrgName)) {
                            for (Supervisor supr : wed.getListOfSupervisor()) {
                                if (supr.getUsername().equals(selectedUser)) {
                                    wed.deleteSupervisor(supr);
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

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
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
        
        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        List<Events> list = businessCatalogueDirectory.getListOfEvents();
        if (!Admin.userExistsInSystem(username)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).findSupervisor(user) != null) {    //if enterpirse supervisor found 
                    if (orgType.equals("BirthdayParty")) {
                        List<Event_BirthdayParty> org1 = list.get(i).getListOfBirthdayParty();    // add organisation managers for each org
                        for (int j = 0; j < org1.size(); j++) {
                            if (org1.get(j).getName().equals(orgName1)) {
                                org1.get(j).addSupervisor(name, location.getName(), username, password);
                                row[0] = location.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                Admin.addUser(username, password, "BirthdayParty");
                                JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                return;
                            }
                        }
                    } else if (orgType.equals("Meeting")) {
                        List<Event_Meetings> org2 = list.get(i).getListOfMeetings();

                        for (int j = 0; j < org2.size(); j++) {
                            System.out.println(org2.get(i).getName() + "name of Meeting org");
                            if (org2.get(j).getName().equals(orgName1)) {
                                org2.get(j).addSupervisor(name, location.getName(), username, password);
                                row[0] = location.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                Admin.addUser(username, password, "Meeting");
                                JOptionPane.showMessageDialog(this, " Organisation Supervisor added successfully");
                                return;
                            }
                        }
                    } else {
                        List<Event_Wedding> org3 = list.get(i).getListOfWeddingServices();
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
                                Admin.addUser(username, password, "Wedding");
                                JOptionPane.showMessageDialog(this, " Organisation Supervisor added successfully");
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "username already exists");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboActionPerformed
        orgName.removeAllItems();

        String orgType = orgCombo.getSelectedItem().toString();
        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        List<Events> list = businessCatalogueDirectory.getListOfEvents();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).findSupervisor(user) != null) {
                if (orgType.equals("BirthdayParty")) {
                    List<Event_BirthdayParty> org1 = list.get(i).getListOfBirthdayParty();
                    for (int j = 0; j < org1.size(); j++) {
                        orgName.addItem(org1.get(j).getName());
                    }
                } else if (orgType.equals("Meeting")) {
                    List<Event_Meetings> org2 = list.get(i).getListOfMeetings();
                    for (int j = 0; j < org2.size(); j++) {
                        orgName.addItem(org2.get(j).getName());
                    }
                } else {
                    List<Event_Wedding> org3 = list.get(i).getListOfWeddingServices();
                    for (int j = 0; j < org3.size(); j++) {
                        orgName.addItem(org3.get(j).getName());
                    }
                }
                return;
            }
        }
    }//GEN-LAST:event_orgComboActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

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

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
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
            for (Events event : businessCatalogueDirectory.getListOfEvents()) {
                if (orgType.equals("BirthdayParty") && event.getListOfBirthdayParty() != null) {
                    for (Event_BirthdayParty birthday : event.getListOfBirthdayParty()) {
                        for (Supervisor supr : birthday.getListOfSupervisor()) {
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
                } else if (orgType.equals("Meeting") && event.getListOfMeetings() != null) {
                    for (Event_Meetings meeting : event.getListOfMeetings()) {
                        for (Supervisor supr : meeting.getListOfSupervisor()) {
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
                } else if (orgType.equals("Weeding") && event.getListOfWeddingServices() != null) {
                    for (Event_Wedding wed : event.getListOfWeddingServices()) {
                        for (Supervisor supr : wed.getListOfSupervisor()) {
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
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField locationName;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JComboBox<String> orgName;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = orgCombo.getSelectedItem().toString();
        ServiceLocation location1 = Admin.findServiceLocation(location.getName());
        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        if (businessCatalogueDirectory == null) {
            return;
        }
        for (Events event : businessCatalogueDirectory.getListOfEvents()) {
            if (event.findSupervisor(user) != null) {
                if (event.getListOfBirthdayParty() != null) {
                    row[0] = "BirthdayParty";
                    for (Event_BirthdayParty birthday : event.getListOfBirthdayParty()) {
                        for (Supervisor supervisor : birthday.getListOfSupervisor()) {       //add supervisor 
                            row[0] = location1.getName();
                            row[1] = "BirthdayParty";
                            row[2] = birthday.getName();
                            row[3] = supervisor.getName();
                            row[4] = supervisor.getUsername();
                            row[5] = supervisor.getPassword();
                            model.addRow(row);
                        }
                    }
                }
                if (event.getListOfMeetings() != null) {
                    row[0] = "Meeting";
                    for (Event_Meetings meeting : event.getListOfMeetings()) {
                        for (Supervisor supervisor : meeting.getListOfSupervisor()) {       //add supervisor 
                            row[0] = location1.getName();
                            row[1] = "Meeting";
                            row[2] = meeting.getName();
                            row[3] = supervisor.getName();
                            row[4] = supervisor.getUsername();
                            row[5] = supervisor.getPassword();
                            model.addRow(row);
                        }
                    }
                }
                if (event.getListOfWeddingServices() != null) {
                    row[0] = "Wedding";
                    for (Event_Wedding wed : event.getListOfWeddingServices()) {
                        for (Supervisor supervisor : wed.getListOfSupervisor()) {       //add supervisor 
                            row[0] = location1.getName();
                            row[1] = "Wedding";
                            row[2] = wed.getName();
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
