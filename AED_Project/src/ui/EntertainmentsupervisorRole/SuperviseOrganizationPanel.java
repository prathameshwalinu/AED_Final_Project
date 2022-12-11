package ui.EntertainmentsupervisorRole;
/**
 *
 * @author nishapatil
 */

import Model.*;
import Model.services.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SuperviseOrganizationPanel extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod;
    private String user;
    private ServiceLocation location;

    public SuperviseOrganizationPanel(Admin Admin, Runnable callOnCreateMethod, String user, ServiceLocation location) {
        initComponents();
        this.Admin = Admin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.location = location;
        cityNameTextField.setText(location.getName());
        cityNameTextField.setEditable(false);
        populateTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        orgCombo = new javax.swing.JComboBox<>();
        deleteBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        cityNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORGANIZATION TYPE", "NAME", "MOBILE NO", "CITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
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
        jScrollPane1.setBounds(55, 213, 968, 185);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME ");
        add(jLabel2);
        jLabel2.setBounds(66, 540, 221, 22);

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtName);
        txtName.setBounds(398, 541, 218, 23);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MOBILE NO");
        add(jLabel3);
        jLabel3.setBounds(66, 582, 221, 22);

        orgCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a organization", "Magician", "Choreographer", "Singer" }));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });
        add(orgCombo);
        orgCombo.setBounds(398, 492, 218, 23);

        deleteBtn.setBackground(new java.awt.Color(153, 153, 255));
        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn);
        deleteBtn.setBounds(1035, 358, 128, 40);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CITY");
        add(jLabel6);
        jLabel6.setBounds(66, 624, 221, 22);

        addButton.setBackground(new java.awt.Color(153, 153, 255));
        addButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(1035, 262, 128, 40);

        updateButton.setBackground(new java.awt.Color(153, 153, 255));
        updateButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton);
        updateButton.setBounds(1035, 311, 128, 40);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SUPERVISE ORGANIZATION FOR ENTERTAINMENT");
        add(jLabel1);
        jLabel1.setBounds(109, 96, 948, 43);

        txtMobile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileActionPerformed(evt);
            }
        });
        add(txtMobile);
        txtMobile.setBounds(398, 583, 218, 23);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ORGANIZATION TYPE ");
        add(jLabel7);
        jLabel7.setBounds(66, 491, 221, 22);

        backButton.setBackground(new java.awt.Color(153, 153, 255));
        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(35, 19, 78, 26);
        add(cityNameTextField);
        cityNameTextField.setBounds(398, 626, 218, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/EntertainmentsupervisorRole/entertainmentfinal.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(0, 0, 1200, 730);
    }// </editor-fold>//GEN-END:initComponents

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
        for (Entertainment club : businessCatalogueDirectory.getListOfEntertainment()) {
            if (club.findSupervisor(user) != null) {
                if (OrgType.equals("Magician") && club.getListOfMagicianORG() != null) {
                    for (Entertainment_MagicianORG magician : club.getListOfMagicianORG()) {
                        if (magician.getName().equals(OrgName)) {
                            club.deleteMagician(magician);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Choreographer") && club.getListOfChoreographerORG() != null) {
                    for (Entertainment_ChoreographerORG choreographer : club.getListOfChoreographerORG()) {
                        if (choreographer.getName().equals(OrgName)) {
                            club.deleteChoreographer(choreographer);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Singer") && club.getListOfSingerORG() != null) {
                    for (Entertainment_SingerORG singer : club.getListOfSingerORG()) {
                        if (singer.getName().equals(OrgName)) {
                            club.deleteSinger(singer);
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

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String locationName = location.getName();  //find the location 
        String name = txtName.getText();

        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Organization name should be at least 2 characters long.");
            return;
        }

        String mobile = txtMobile.getText();
        String orgType1 = orgCombo.getSelectedItem().toString();
        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        List<Entertainment> entertainment = businessCatalogueDirectory.getListOfEntertainment();
        for (int i = 0; i < entertainment.size(); i++) {
            entertainment.get(i).findSupervisor(user);      //find entertainment for which manager is working for
            if (orgType1.equals("Magician")) {
                entertainment.get(i).addMagicianORG(name, mobile, locationName);
                JOptionPane.showMessageDialog(this, "Magician Organisation added successfully");
            } else if (orgType1.equals("Choreographer")) {
                entertainment.get(i).addChoreographerORG(name, mobile, locationName);
                JOptionPane.showMessageDialog(this, "Choreographer Organisation successfully");
            } else {
                entertainment.get(i).addSingerORG(name, mobile, locationName);
                JOptionPane.showMessageDialog(this, "Singer Organisation added successfully");
            }
        }
        populateTable();
    }//GEN-LAST:event_addButtonActionPerformed

    private void txtMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileActionPerformed

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgComboActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String orgType = orgCombo.getSelectedItem().toString();
        String orgname = model.getValueAt(jTable1.getSelectedRow(), 1).toString();

        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        for (Entertainment ent : businessCatalogueDirectory.getListOfEntertainment()) {
            if (orgType.equals("Magician") && ent.getListOfMagicianORG() != null) {
                for (Entertainment_MagicianORG mag : ent.getListOfMagicianORG()) {
                    if (mag.getName().equals(orgname)) {
                        mag.setName(txtName.getText());
                        mag.setContact(txtMobile.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Singer") && ent.getListOfSingerORG() != null) {
                for (Entertainment_SingerORG singer : ent.getListOfSingerORG()) {
                    if (singer.getName().equals(orgname)) {
                        singer.setName(txtName.getText());
                        singer.setContact(txtMobile.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Choreographer") && ent.getListOfChoreographerORG() != null) {
                for (Entertainment_ChoreographerORG choreo : ent.getListOfChoreographerORG()) {
                    if (choreo.getName().equals(orgname)) {
                        choreo.setName(txtName.getText());
                        choreo.setContact(txtMobile.getText());
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

        txtName.setText(orgName);
        txtMobile.setText(orgContact);
        cityNameTextField.setText(orgCity);
        orgCombo.setSelectedItem(orgType);
        cityNameTextField.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cityNameTextField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = orgCombo.getSelectedItem().toString();
        ServiceLocation location1 = Admin.findServiceLocation(location.getName());
        BusinessCatalogueDirectory businessCatalogueDirectory = location1.getBusinessCatalogueDirectory();
        for (Entertainment entertain : businessCatalogueDirectory.getListOfEntertainment()) {
            if (entertain.findSupervisor(user) != null) {
                if (entertain.getListOfMagicianORG() != null) {
                    row[0] = "Magician";
                    for (Entertainment_MagicianORG magician : entertain.getListOfMagicianORG()) {
                        row[0] = "Magician";
                        row[1] = magician.getName();
                        row[2] = magician.getContact();
                        row[3] = location1.getName();
                        model.addRow(row);
                    }
                }
                if (entertain.getListOfSingerORG() != null) {
                    row[0] = "Singer";
                    for (Entertainment_SingerORG singer : entertain.getListOfSingerORG()) {
                        row[0] = "Singer";
                        row[1] = singer.getName();
                        row[2] = singer.getContact();
                        row[3] = location.getName();
                        model.addRow(row);
                    }
                }
                if (entertain.getListOfChoreographerORG() != null) {
                    row[0] = "Choreographer";
                    for (Entertainment_ChoreographerORG choreographer : entertain.getListOfChoreographerORG()) {
                        row[0] = "Choreographer";
                        row[1] = choreographer.getName();
                        row[2] = choreographer.getContact();
                        row[3] = location.getName();
                        model.addRow(row);
                    }
                }

            }
        }
    }

}
