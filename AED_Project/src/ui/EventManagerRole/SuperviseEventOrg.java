package ui.EventManagerRole;
/**
 *
 * @author himanshu
 */

import Model.*;
import Model.services.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SuperviseEventOrg extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod;
    private String type;
    private String user;
    private ServiceLocation location;

    public SuperviseEventOrg(Admin Admin, Runnable callOnCreateMethod, String user, String type, ServiceLocation network) {
        initComponents();
        this.Admin = Admin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.location = network;

        cityNameTextField.setText(network.getName());
        cityNameTextField.setEditable(false);

        populateTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        orgCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        contactField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        cityNameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORGANISATION TYPE", "NAME", "CONTACT", "CITY"
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
        jScrollPane1.setBounds(137, 221, 760, 183);

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
        backButton.setBounds(25, 32, 96, 32);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("MANAGE ORGANISATION FOR EVENTS ");
        add(jLabel1);
        jLabel1.setBounds(164, 108, 723, 43);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("ORGANISATION TYPE");
        add(jLabel2);
        jLabel2.setBounds(137, 446, 222, 22);

        orgCombo.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an organisation", "Meeting", "BirthdayParty", "Wedding" }));
        add(orgCombo);
        orgCombo.setBounds(381, 448, 210, 22);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("NAME");
        add(jLabel3);
        jLabel3.setBounds(137, 499, 222, 22);

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        add(nameField);
        nameField.setBounds(381, 501, 210, 23);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("PHONE NO.");
        add(jLabel4);
        jLabel4.setBounds(137, 542, 222, 22);
        add(contactField);
        contactField.setBounds(381, 544, 210, 23);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("CITY");
        add(jLabel5);
        jLabel5.setBounds(137, 585, 98, 22);

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
        addBtn.setBounds(923, 261, 116, 37);

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
        deleteBtn.setBounds(923, 365, 116, 39);

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
        updateBtn.setBounds(923, 310, 116, 37);

        cityNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityNameTextFieldActionPerformed(evt);
            }
        });
        add(cityNameTextField);
        cityNameTextField.setBounds(381, 587, 210, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/EventManagerRole/N.jpeg"))); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6);
        jLabel6.setBounds(0, 0, 1120, 710);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object row[] = new Object[20];
        String locationName = location.getName();
        String name = nameField.getText();
        String contact = contactField.getText();
        boolean valid = validationForFields();
        if(valid)
        {

            String orgType1 = orgCombo.getSelectedItem().toString();      // org-type (physician org)     
            BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
            List<Events> events = businessCatalogueDirectory.getListOfEvents();
            for (int i = 0; i < events.size(); i++) {
                events.get(i).findSupervisor(user);      //find healthclub for which manager is working for
                if (orgType1.equals("BirthdayParty")) {
                    events.get(i).addBirthdayParty(name, contact, locationName);
                    row[0] = orgType1;
                    row[1] = name;
                    row[2] = contact;
                    row[3] = locationName;
                    model.addRow(row);
                    JOptionPane.showMessageDialog(this, "Birthday Party Event Org added successfully");
                    return;
                } else if (orgType1.equals("Meeting")) {
                    events.get(i).addMeetings(name, contact, locationName);
                    row[0] = orgType1;
                    row[1] = name;
                    row[2] = contact;
                    row[3] = locationName;
                    model.addRow(row);
                    JOptionPane.showMessageDialog(this, "Meeting Organisation successfully");
                    return;
                } else {
                    events.get(i).addWeddingServices(name, contact, locationName);
                    row[0] = orgType1;
                    row[1] = name;
                    row[2] = contact;
                    row[3] = locationName;
                    model.addRow(row);
                    JOptionPane.showMessageDialog(this, "Wedding Organisation added successfully");
                    return;
                }
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void cityNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityNameTextFieldActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        String OrgType = (String) model.getValueAt(selectedRowIndex, 0);
        String OrgName = (String) model.getValueAt(selectedRowIndex, 1);
        BusinessCatalogueDirectory enterpriseDirec = location.getBusinessCatalogueDirectory();
        for (Events event : enterpriseDirec.getListOfEvents()) {
            if (event.findSupervisor(user) != null) {
                if (OrgType.equals("BirthdayParty") && event.getListOfBirthdayParty() != null) {
                    for (Event_BirthdayParty birthday : event.getListOfBirthdayParty()) {
                        if (birthday.getName().equals(OrgName)) {
                            event.deleteBirthdayParty(birthday);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Wedding") && event.getListOfWeddingServices() != null) {
                    for (Event_Wedding wed : event.getListOfWeddingServices()) {
                        if (wed.getName().equals(OrgName)) {
                            event.deleteWeddingServices(wed);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Meeting") && event.getListOfMeetings() != null) {
                    for (Event_Meetings met : event.getListOfMeetings()) {
                        if (met.getName().equals(OrgName)) {
                            event.deleteMeetings(met);
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
        contactField.setText(orgContact);
        cityNameTextField.setText(orgCity);
        orgCombo.setSelectedItem(orgType);
        cityNameTextField.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String orgType = orgCombo.getSelectedItem().toString();
        String orgname = model.getValueAt(jTable1.getSelectedRow(), 1).toString();

        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        for (Events event : businessCatalogueDirectory.getListOfEvents()) {
            if (orgType.equals("BirthdayParty") && event.getListOfBirthdayParty() != null) {
                for (Event_BirthdayParty birthday : event.getListOfBirthdayParty()) {
                    if (birthday.getName().equals(orgname)) {
                        birthday.setName(nameField.getText());
                        birthday.setContact(contactField.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Meeting") && event.getListOfMeetings() != null) {
                for (Event_Meetings meeting : event.getListOfMeetings()) {
                    if (meeting.getName().equals(orgname)) {
                        meeting.setName(nameField.getText());
                        meeting.setContact(contactField.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Wedding") && event.getListOfWeddingServices() != null) {
                for (Event_Wedding wed : event.getListOfWeddingServices()) {
                    if (wed.getName().equals(orgname)) {
                        wed.setName(nameField.getText());
                        wed.setContact(contactField.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            }

        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

private boolean validationForFields() 
{
    if(nameField.getText().length()==0)
    {
         JOptionPane.showMessageDialog(this," Name Can't be blank, please enter Name");
         nameField.requestFocus();
         nameField.setText("");
         return false;
    }

    else
    {
        if(!nameField.getText().matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
        {
             JOptionPane.showMessageDialog(this," Invalid name. ");
             nameField.requestFocus();
             nameField.setText("");
             return false;   
        }
    }
    if(contactField.getText().isBlank())
    {
         JOptionPane.showMessageDialog(this,"Invalid Contact");
         contactField.requestFocus();
         contactField.setText("");
        return false;
    }
    else
    {
        if(!contactField.getText().matches("^[2-9]{2}[0-9]{8}$"))
        {
                JOptionPane.showMessageDialog(this," Invalid Phone Number format, please enter a valid 10 digit US Phone No. ");
                contactField.requestFocus();
                contactField.setText("");
               return false;
        }
    }
    return true;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cityNameTextField;
    private javax.swing.JTextField contactField;
    private javax.swing.JButton deleteBtn;
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
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = orgCombo.getSelectedItem().toString();
        ServiceLocation location1 = Admin.findServiceLocation(location.getName());
        BusinessCatalogueDirectory businessCatalogueDirectory = location1.getBusinessCatalogueDirectory();
        if (businessCatalogueDirectory == null) {
            return;
        }
        for (Events event : businessCatalogueDirectory.getListOfEvents()) {
            if (event.findSupervisor(user) != null) {
                if (event.getListOfBirthdayParty() != null) {
                    row[0] = "BirthdayParty";
                    for (Event_BirthdayParty birthday : event.getListOfBirthdayParty()) {
                        row[0] = "BirthdayParty";
                        row[1] = birthday.getName();
                        row[2] = birthday.getContact();
                        row[3] = location1.getName();
                        model.addRow(row);
                    }
                }
                if (event.getListOfMeetings() != null) {
                    row[0] = "Meeting";
                    for (Event_Meetings meet : event.getListOfMeetings()) {
                        row[0] = "Meeting";
                        row[1] = meet.getName();
                        row[2] = meet.getContact();
                        row[3] = location.getName();
                        model.addRow(row);
                    }
                }
                if (event.getListOfWeddingServices() != null) {
                    row[0] = "Wedding";
                    for (Event_Wedding wed : event.getListOfWeddingServices()) {
                        row[0] = "Wedding";
                        row[1] = wed.getName();
                        row[2] = wed.getContact();
                        row[3] = location.getName();
                        model.addRow(row);
                    }
                }

            }
        }
    }
}
