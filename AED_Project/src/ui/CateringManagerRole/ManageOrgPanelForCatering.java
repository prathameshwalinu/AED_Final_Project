package ui.CateringManagerRole;
/**
 *
 * @author himanshu
 */
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.*;
import Model.services.*;
import ui.main.Validator;

public class ManageOrgPanelForCatering extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod;
    private String type;
    private String user;
    private ServiceLocation location;

    public ManageOrgPanelForCatering(Admin Admin, Runnable callOnCreateMethod, String user, String type, ServiceLocation location) {
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
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

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

        add(jScrollPane1);
        jScrollPane1.setBounds(75, 148, 754, 172);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("ORGANIZATION TYPE");
        add(jLabel1);
        jLabel1.setBounds(75, 355, 210, 34);

        orgCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a organisation", "ServiceAgent" }));
        add(orgCombo);
        orgCombo.setBounds(365, 362, 232, 23);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("NAME");
        add(jLabel2);
        jLabel2.setBounds(75, 421, 210, 22);

        nameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(nameField);
        nameField.setBounds(365, 422, 232, 23);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("CONTACT");
        add(jLabel3);
        jLabel3.setBounds(75, 472, 210, 22);

        contactField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(contactField);
        contactField.setBounds(365, 473, 232, 23);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("CITY");
        add(jLabel4);
        jLabel4.setBounds(75, 523, 210, 22);

        backButton.setBackground(new java.awt.Color(255, 204, 204));
        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(25, 23, 121, 39);

        addButton.setBackground(new java.awt.Color(255, 204, 204));
        addButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(835, 204, 102, 36);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel5.setText("MANAGE CATERING ORGANISATION");
        add(jLabel5);
        jLabel5.setBounds(107, 80, 684, 43);
        add(cityNameTextField);
        cityNameTextField.setBounds(365, 525, 232, 23);

        deleteBtn.setBackground(new java.awt.Color(255, 204, 204));
        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn);
        deleteBtn.setBounds(835, 286, 102, 34);

        updateButton.setBackground(new java.awt.Color(255, 204, 204));
        updateButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton);
        updateButton.setBounds(835, 246, 102, 34);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/CateringManagerRole/catbk.jpeg"))); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6);
        jLabel6.setBounds(0, 0, 1090, 740);
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
        boolean valid = validationForFields();
        if(valid)
        {
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
                    populateTable();
                    return;
                    
                }
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
    private javax.swing.JLabel jLabel6;
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
        ServiceLocation location1 = Admin.findServiceLocation(location.getName());
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
