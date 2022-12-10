package ui.CateringManagerRole;

import Model.Admin;
import Model.BusinessCatalogueDirectory;
import Model.Catering;
import Model.ServiceAgentOrganisation;
import Model.ServiceLocation;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import ui.main.Validator;

public class ManageOrgPanelForCatering extends javax.swing.JPanel {
    
    private Admin EPAdmin;
    private Runnable callOnCreateMethod;
    private String type;
    private String user;
    private ServiceLocation location;

    public ManageOrgPanelForCatering( Admin EPAdmin, Runnable callOnCreateMethod, String user, String type, ServiceLocation location) {
        initComponents();
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.location = location;
        //setBackground(new java.awt.Color(255, 208, 56));
        cityNameTextField.setText(location.getName());
        cityNameTextField.setEditable(false);

        //deleteBtn.setBackground(new java.awt.Color(0, 102, 102));
        //deleteBtn.setOpaque(true);
        //addButton.setBackground(new java.awt.Color(0, 102, 102));
        //addButton.setOpaque(true);
        //updateButton.setBackground(new java.awt.Color(0, 102, 102));
        //updateButton.setOpaque(true);
        //backButton.setBackground(new java.awt.Color(0, 102, 102));
        //backButton.setOpaque(true);

        populateTable();
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
        contactField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cityNameTextField = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("ORGANIZATION TYPE");

        orgCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a organisation", "ServiceAgent" }));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("NAME");

        nameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("CONTACT");

        contactField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("CITY");

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel5.setText("MANAGE CATERING ORGANISATION");

        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        updateButton.setText("UPDATE");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(132, 132, 132)
                                    .addComponent(updateButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(430, 430, 430)
                                    .addComponent(deleteBtn)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(80, 80, 80)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cityNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backButton)
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateButton)
                    .addComponent(deleteBtn))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cityNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(476, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object row[] = new Object[20];
        String name = nameField.getText();
        String contact = contactField.getText();
        String locationName = location.getName();
        String orgType1 = orgCombo.getSelectedItem().toString();      // org-type (delivery org)    
        BusinessCatalogueDirectory enterpriseCatalogueDirectory = location.getBusinessCatalogueDirectory();

        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Organization name should be at least 2 characters long.");
            return;
        }

        List<Catering> res = enterpriseCatalogueDirectory.getListOfCatering();
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i).findSupervisor(user) != null) {     //find catering for which manager is working for   
                res.get(i).addServiceAgentOrganisation(name, contact, locationName);   //add deliveryman org name
                row[0] = orgType1;
                row[1] = name;
                row[2] = contact;
                row[3] = locationName;
                model.addRow(row);
                JOptionPane.showMessageDialog(this, "Organization added successfully");
                return;
            }
        } 
    }//GEN-LAST:event_addButtonActionPerformed

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
        for (Catering res : enterpriseDirec.getListOfCatering()) {
            if (res.findSupervisor(user) != null) {
                if (res.getListOfServiceAgentOrganisation() != null) {
                    for (ServiceAgentOrganisation del : res.getListOfServiceAgentOrganisation()) {
                        if (del.getName().equals(OrgName)) {
                            del.deleteServiceAgent(del);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
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

        BusinessCatalogueDirectory enterpriseCatalogueDirectory = location.getBusinessCatalogueDirectory();
        for (Catering res : enterpriseCatalogueDirectory.getListOfCatering()) {
            if (orgType.equals("ServiceAgent") && res.getListOfServiceAgentOrganisation() != null) {
                for (ServiceAgentOrganisation del : res.getListOfServiceAgentOrganisation()) {
                    if (del.getName().equals(orgname)) {
                        del.setName(nameField.getText());
                        del.setContact(contactField.getText());
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
        contactField.setText(orgContact);
        cityNameTextField.setText(orgCity);
        orgCombo.setSelectedItem(orgType);
        cityNameTextField.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cityNameTextField;
    private javax.swing.JTextField contactField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = orgCombo.getSelectedItem().toString();
        ServiceLocation location1 = EPAdmin.findServiceLocation(location.getName());
        BusinessCatalogueDirectory enterpriseCatalogueDirectory = location1.getBusinessCatalogueDirectory();
        for (Catering catering : enterpriseCatalogueDirectory.getListOfCatering()) {
            if (catering.findSupervisor(user) != null) {
                if (catering.getListOfServiceAgentOrganisation() != null) {
                    row[0] = "ServiceAgent";
                    for (ServiceAgentOrganisation delivery : catering.getListOfServiceAgentOrganisation()) {
                        row[0] = "ServiceAgent";
                        row[1] = delivery.getName();
                        row[2] = delivery.getContact();
                        row[3] = location1.getName();
                        model.addRow(row);
                    }
                }
            }
        }
    }
}
