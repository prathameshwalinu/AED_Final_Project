package ui.EventPlannerAdminRole;
/**
 *
 * @author prathmeshw
 */

import Model.*;
import Model.services.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ui.main.Validator;

public class ManageClientJPanel extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod;

    public ManageClientJPanel(Admin Admin, Runnable callOnCreateMethod) {
        initComponents();
        this.Admin = Admin;
        this.callOnCreateMethod = callOnCreateMethod;
        populateTable();
    }

    public boolean validateName() {
        if (nameField.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean validateContactNum() {
        if (contactField.getText().matches("[0-9]{10}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid contact: contact should contain only 10 digits");
            return false;
        }
    }

    public boolean validateCity() {
        if (cityField.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : city should contain only alphabets");
            return false;
        }
    }

    public boolean validateAddress() {
        if (txtStreet.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : address should contain only alphabets");
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
        lblsysadmin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClient = new javax.swing.JTable();
        contactField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

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
        backButton.setBounds(31, 34, 90, 30);

        lblsysadmin.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblsysadmin.setForeground(new java.awt.Color(255, 255, 255));
        lblsysadmin.setText("MANAGE CLIENTS");
        add(lblsysadmin);
        lblsysadmin.setBounds(326, 97, 358, 43);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MOBILE NO");
        add(jLabel3);
        jLabel3.setBounds(557, 381, 137, 22);

        deleteBtn.setBackground(new java.awt.Color(204, 255, 255));
        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn);
        deleteBtn.setBounds(930, 317, 110, 26);

        tblClient.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        tblClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CLIENT NAME", "MOBILE NO", "CITY", "STREET", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClient);

        add(jScrollPane1);
        jScrollPane1.setBounds(118, 191, 800, 154);
        add(contactField);
        contactField.setBounds(725, 383, 173, 23);

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
        addButton.setBounds(930, 225, 110, 26);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USERNAME");
        add(jLabel4);
        jLabel4.setBounds(557, 453, 138, 22);
        add(nameField);
        nameField.setBounds(275, 383, 168, 23);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PASSWORD");
        add(jLabel5);
        jLabel5.setBounds(557, 521, 138, 22);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CLIENT NAME");
        add(jLabel2);
        jLabel2.setBounds(118, 381, 126, 22);

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
        updateButton.setBounds(930, 271, 110, 26);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CITY");
        add(jLabel6);
        jLabel6.setBounds(118, 453, 130, 22);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("STREET");
        add(jLabel9);
        jLabel9.setBounds(118, 521, 130, 22);
        add(txtStreet);
        txtStreet.setBounds(275, 523, 168, 23);
        add(passwordField);
        passwordField.setBounds(725, 523, 173, 23);
        add(usernameField);
        usernameField.setBounds(725, 455, 173, 23);
        add(cityField);
        cityField.setBounds(275, 455, 168, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/EventPlannerAdminRole/client.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1210, 830);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblClient.getModel();
        String username = model.getValueAt(tblClient.getSelectedRow(), 4).toString();
        ClientDirectory clientDirectory = Admin.getClientDirectory();
        if (clientDirectory.getListOfClientDirectory() != null) {
            for (Client client : clientDirectory.getListOfClientDirectory()) {
                if (client.getUserName().equals(username)) {
                    Admin.deleteCustomer(client);
                    populateTable();
                    JOptionPane.showMessageDialog(this, "Client deleted successfully");
                    return;
                }
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String name = nameField.getText();
        String contact = contactField.getText();
        String city = cityField.getText();
        String street = txtStreet.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (!Validator.validateName(this, name) || !Validator.validateUserName(this, username)
                || !Validator.validatePassword(this, password)) {
            return;
        }

        if (Admin.userExistsInSystem(username)) {
            JOptionPane.showMessageDialog(this, "Username already exists.");
            return;
        }

        Client client = Admin.getClientDirectory().addCustomer();  //add client to directory in system
        client.setName(name);
        client.setContact(contact);
        client.setCity(city);
        client.setAddress(street);
        client.setUserName(username);
        client.setPassword(password);
        populateTable();
        JOptionPane.showMessageDialog(this, "Client added successfully");

        Admin.addUser(username, password, "Client");

        nameField.setText("");
        contactField.setText("");
        cityField.setText("");
        usernameField.setText("");
        txtStreet.setText("");
        passwordField.setText("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (tblClient.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblClient.getModel();
        if (tblClient.getSelectedRowCount() == 1) {
            String user = usernameField.getText();
            Client client = Admin.findCustomer(user);
            client.setAddress(txtStreet.getText());
            client.setName(nameField.getText());
            client.setContact(contactField.getText());
            client.setCity(cityField.getText());
            JOptionPane.showMessageDialog(this, "updated Successfully");
            populateTable();

        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void tblClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblClient.getModel();
        String clientName = model.getValueAt(tblClient.getSelectedRow(), 0).toString();
        String clientContact = model.getValueAt(tblClient.getSelectedRow(), 1).toString();
        String clientCity = model.getValueAt(tblClient.getSelectedRow(), 2).toString();
        String clientStreet = model.getValueAt(tblClient.getSelectedRow(), 3).toString();
        String username = model.getValueAt(tblClient.getSelectedRow(), 4).toString();
        String password = model.getValueAt(tblClient.getSelectedRow(), 5).toString();
        nameField.setText(clientName);
        contactField.setText(clientContact);
        cityField.setText(clientCity);
        txtStreet.setText(clientStreet);
        usernameField.setText(username);
        passwordField.setText(password);
        usernameField.setEnabled(false);
        passwordField.setEnabled(false);
    }//GEN-LAST:event_tblClientMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField contactField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTable tblClient;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblClient.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        for (Client client : Admin.getClientDirectory().getListOfClientDirectory()) {
            row[0] = client.getName();
            row[1] = client.getContact();
            row[2] = client.getCity();
            row[3] = client.getAddress();
            row[4] = client.getUserName();
            row[5] = client.getPassword();
            model.addRow(row);
        }
    }
}
