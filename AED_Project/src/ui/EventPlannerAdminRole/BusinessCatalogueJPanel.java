package ui.EventPlannerAdminRole;

import Model.Admin;
import Model.BusinessCatalogue;
import Model.BusinessCatalogueDirectory;
import Model.Catering;
import Model.Entertainment;
import Model.Events;
import Model.Resort;
import Model.ServiceLocation;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BusinessCatalogueJPanel extends javax.swing.JPanel {
    
    private Admin EPAdmin;
    private Runnable callOnCreateMethod;

    public BusinessCatalogueJPanel(Admin EPAdmin, Runnable callOnCreateMethod) {
        
        initComponents();
        this.EPAdmin = EPAdmin;
        
        this.callOnCreateMethod = callOnCreateMethod;
        for (ServiceLocation location : EPAdmin.getListOfServiceLocation()) {      //populate items in location combobox
            cmbLocation.addItem(location.getName());
        }
        for (ServiceLocation location : EPAdmin.getListOfServiceLocation()) {
            cmbLocationSearch.addItem(location.getName());
        }
//        setBackground(new java.awt.Color(255, 208, 56));
//        btnDelete.setBackground(new java.awt.Color(0, 102, 102));
//        btnDelete.setOpaque(true);
//        btnAdd.setBackground(new java.awt.Color(0, 102, 102));
//        btnAdd.setOpaque(true);
//        BtnUpdate.setBackground(new java.awt.Color(0, 102, 102));
//        BtnUpdate.setOpaque(true);
//        backButton.setBackground(new java.awt.Color(0, 102, 102));
//        backButton.setOpaque(true);
//        btnDisplay.setBackground(new java.awt.Color(0, 102, 102));
//        btnDisplay.setOpaque(true);
    }

    public boolean validateName() {
        if (txtBCName.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean validateContactNum() {
        if (txtMobile.getText().matches("[0-9]{10}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid contact: contact should contain only 10 digits");
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLBC = new javax.swing.JLabel();
        BtnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        txtBCName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbLocation = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbLocationType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        cmbLocationSearch = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnDisplay = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        lbLBC.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lbLBC.setText("BUSINESS CATALOGUE");
        add(lbLBC);
        lbLBC.setBounds(360, 140, 319, 30);

        BtnUpdate.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        BtnUpdate.setText("UPDATE");
        BtnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });
        add(BtnUpdate);
        BtnUpdate.setBounds(390, 440, 182, 26);

        btnDelete.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(610, 440, 173, 26);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LOCATION NAME", "BUSINESS CATALOGUE", "BUSINESS CATALOGUE TYPE", "MOBILE NO"
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
        jScrollPane1.setBounds(90, 250, 769, 171);

        btnAdd.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(170, 440, 182, 26);

        txtBCName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBCName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBCNameActionPerformed(evt);
            }
        });
        add(txtBCName);
        txtBCName.setBounds(550, 560, 180, 28);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("CATALOGUE:");
        add(jLabel1);
        jLabel1.setBounds(220, 630, 143, 22);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("LOCATION:");
        add(jLabel2);
        jLabel2.setBounds(220, 500, 133, 22);

        cmbLocation.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        cmbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one" }));
        cmbLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocationActionPerformed(evt);
            }
        });
        add(cmbLocation);
        cmbLocation.setBounds(550, 500, 180, 28);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("BUSNIESS CATALOGUE NAME:");
        add(jLabel3);
        jLabel3.setBounds(220, 560, 268, 29);

        cmbLocationType.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        cmbLocationType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one", "Event", "Resort", "Admin", "Entertainment" }));
        cmbLocationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocationTypeActionPerformed(evt);
            }
        });
        add(cmbLocationType);
        cmbLocationType.setBounds(550, 630, 180, 28);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("MOBILE NO:");
        add(jLabel6);
        jLabel6.setBounds(220, 700, 166, 22);

        txtMobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtMobile);
        txtMobile.setBounds(550, 690, 180, 28);

        cmbLocationSearch.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbLocationSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one " }));
        add(cmbLocationSearch);
        cmbLocationSearch.setBounds(380, 210, 168, 30);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setText("SELECT A LOCATION");
        add(jLabel7);
        jLabel7.setBounds(200, 210, 150, 27);

        btnDisplay.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnDisplay.setText("VIEW");
        btnDisplay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });
        add(btnDisplay);
        btnDisplay.setBounds(670, 210, 122, 26);

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(51, 24, 107, 44);

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/nishapatil/Downloads/N.jpeg")); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(0, 0, 880, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String locationName = (String) model.getValueAt(selectedRowIndex, 0);
        String businessCatalogueType = (String) model.getValueAt(selectedRowIndex, 2);
        String businessCatalogueName = (String) model.getValueAt(selectedRowIndex, 1);
        ServiceLocation network = EPAdmin.findServiceLocation(locationName);
        BusinessCatalogueDirectory enterpriseDirec = network.getBusinessCatalogueDirectory();
        if (businessCatalogueType.equals("Event") && enterpriseDirec.getListOfEvents() != null) {
            for (Events event : enterpriseDirec.getListOfEvents()) {
                if (event.getName().equals(businessCatalogueName)) {
                    enterpriseDirec.deleteBusinessCatalogueEvents(event);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } 
        else if (businessCatalogueType.equals("Resort") && enterpriseDirec.getListOfResort() != null) {
            for (Resort resort : enterpriseDirec.getListOfResort()) {
                if (resort.getName().equals(businessCatalogueName)) {
                    enterpriseDirec.deleteBusinessCatalogueResort(resort);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } 
        else if (businessCatalogueType.equals("Catering") && enterpriseDirec.getListOfCatering() != null) {
            for (Catering cat : enterpriseDirec.getListOfCatering()) {
                if (cat.getName().equals(businessCatalogueName)) {
                    enterpriseDirec.deleteBusinessCatalogueCatering(cat);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } 
        else if (businessCatalogueType.equals("Entertainment") && enterpriseDirec.getListOfEntertainment() != null) {
            for (Entertainment ent : enterpriseDirec.getListOfEntertainment()) {
                if (ent.getName().equals(businessCatalogueName)) {
                    enterpriseDirec.deleteBusinessCatalogueEntertainment(ent);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "not found");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbLocationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocationTypeActionPerformed

    }//GEN-LAST:event_cmbLocationTypeActionPerformed

    private void cmbLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocationActionPerformed

    }//GEN-LAST:event_cmbLocationActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
     
        String contact = txtMobile.getText();
        String name = txtBCName.getText();
        String locationName = cmbLocation.getSelectedItem().toString();
        String businessCatalogueType1 = cmbLocationType.getSelectedItem().toString();
        ServiceLocation network = EPAdmin.findServiceLocation(locationName);

        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Invalid input: Enterprise name should be atleast 2 characters long.");
            return;
        }

        BusinessCatalogueDirectory businessCatalogueDirectory = network.getBusinessCatalogueDirectory();
        if (businessCatalogueType1.equals("Entertainment") && businessCatalogueDirectory != null) {
            businessCatalogueDirectory.addEntertainment(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");
            return;
        } 
        else if (businessCatalogueType1.equals("Catering") && businessCatalogueDirectory != null) {
            businessCatalogueDirectory.addCatering(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");

            return;
        } 
        else if (businessCatalogueType1.equals("Event") && businessCatalogueDirectory != null) {
            businessCatalogueDirectory.addEvents(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");

            return;
        } 
        else if (businessCatalogueType1.equals("Resort") && businessCatalogueDirectory != null) {
            businessCatalogueDirectory.addResort(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");
            return;
        }
        txtBCName.setText("");
        txtMobile.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        
            populateTable();
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       
        callOnCreateMethod.run();
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
       if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select 1 row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String locationName = cmbLocation.getSelectedItem().toString();
        String businessCatalogueType1 = cmbLocationType.getSelectedItem().toString();
        String businessCatalogueName = model.getValueAt(jTable1.getSelectedRow(), 1).toString();

        ServiceLocation location = EPAdmin.findServiceLocation(locationName);
       BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();

       BusinessCatalogue BCToUpdate = null;
        if (businessCatalogueType1.equals("Entertainment") && businessCatalogueDirectory != null) {

            for (Entertainment list : businessCatalogueDirectory.getListOfEntertainment()) {
                if (list.getName().equals(businessCatalogueName)) {  //if enterprise name matches 
                    BCToUpdate = list;
                }
            }
            JOptionPane.showMessageDialog(this, "Enterprise updated successfully");
            return;
        } else if (businessCatalogueType1.equals("Event") && businessCatalogueDirectory != null) {
            for (Events list : businessCatalogueDirectory.getListOfEvents()) {
                if (list.getName().equals(businessCatalogueName)) {
                    BCToUpdate = list;
                }
            }
        } else if (businessCatalogueType1.equals("Resort") && businessCatalogueDirectory != null) {
            for (Resort list : businessCatalogueDirectory.getListOfResort()) {
                if (list.getName().equals(businessCatalogueName)) {           //if enterprise name matches 
                    BCToUpdate = list;
                }
            }
        } else if (businessCatalogueType1.equals("Catering") && businessCatalogueDirectory != null) {
            for (Catering list : businessCatalogueDirectory.getListOfCatering()) {
                if (list.getName().equals(businessCatalogueName)) {           //if enterprise name matches 
                    BCToUpdate = list;
                }
            }
        }

        if (BCToUpdate == null) {
            JOptionPane.showMessageDialog(this, "Unknown Business Catalogue.");
            return;
        }

        BCToUpdate.setName(txtBCName.getText());
        BCToUpdate.setContact(txtMobile.getText());
        populateTable();
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (jTable1.getSelectedRowCount() != 1) {
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String locationName = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String bcName = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String bcType1 = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String bcContact = model.getValueAt(jTable1.getSelectedRow(), 3).toString();

        cmbLocation.setSelectedItem(locationName);
        cmbLocationType.setSelectedItem(bcType1);
        txtBCName.setText(bcName);
        txtMobile.setText(bcContact);
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtBCNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBCNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBCNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JComboBox<String> cmbLocation;
    private javax.swing.JComboBox<String> cmbLocationSearch;
    private javax.swing.JComboBox<String> cmbLocationType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbLBC;
    private javax.swing.JTextField txtBCName;
    private javax.swing.JTextField txtMobile;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String locationItem = cmbLocationSearch.getSelectedItem().toString();
        ServiceLocation location = EPAdmin.findServiceLocation(locationItem);

        List<Events> eventList = location.getBusinessCatalogueDirectory().getListOfEvents();
        if (eventList != null) {
            for (int i = 0; i < eventList.size(); i++) {
                row[0] = locationItem;
                row[1] = eventList.get(i).getName();
                row[2] = "Event";
                row[3] = eventList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<Catering> cateringList = location.getBusinessCatalogueDirectory().getListOfCatering();
        if (cateringList != null) {
            for (int i = 0; i < cateringList.size(); i++) {
                row[0] = locationItem;
                row[1] = cateringList.get(i).getName();
                row[2] = "Catering";
                row[3] = cateringList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<Entertainment> entertainmentList = location.getBusinessCatalogueDirectory().getListOfEntertainment();
        if (entertainmentList != null) {
            for (int i = 0; i < entertainmentList.size(); i++) {
                row[0] = locationItem;
                row[1] = entertainmentList.get(i).getName();
                row[2] = "Entertainment";
                row[3] = entertainmentList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<Resort> resortList = location.getBusinessCatalogueDirectory().getListOfResort();
        if (resortList != null) {
            for (int i = 0; i < resortList.size(); i++) {
                row[0] = locationItem;
                row[1] = resortList.get(i).getName();
                row[2] = "Resort";
                row[3] = resortList.get(i).getContact();
                model.addRow(row);
            }
        }
    }
}