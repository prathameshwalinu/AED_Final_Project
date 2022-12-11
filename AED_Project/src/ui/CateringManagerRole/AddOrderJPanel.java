package ui.CateringManagerRole;

import Model.Admin;
import Model.BusinessCatalogueDirectory;
import Model.Catering;
import Model.Catering_Menu;
import Model.ServiceLocation;
import Model.Supervisor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AddOrderJPanel extends javax.swing.JPanel {

    private Admin EPAdmin;
    private Runnable callOnCreateMethod;
    private String type;
    private String user;
    private ServiceLocation location;


    public AddOrderJPanel(Admin EPAdmin, Runnable callOnCreateMethod, String user, String type, ServiceLocation location) {
        initComponents();
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.location = location;
        //setBackground(new java.awt.Color(255,208,56));
        populateMenu();
        //addBtn.setBackground(new java.awt.Color(0, 102, 102));
        //addBtn.setOpaque(true);
        //backButton.setBackground(new java.awt.Color(0, 102, 102));
        //backButton.setOpaque(true);

    }

    public boolean validateMenu() {
        if (menuField.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : menu should contain only alphabets");
            return false;
        }
    }
    
   public boolean priceField() {
    if (priceField == null) {
        JOptionPane.showMessageDialog(this, "price field should not b left blank");
        return false;
    } else {
        return true;
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        menuField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setLayout(null);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MENU ITEM DETAILS", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(132, 171, 631, 177);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("ADD AN ITEM ");
        add(jLabel1);
        jLabel1.setBounds(38, 444, 140, 22);

        menuField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(menuField);
        menuField.setBounds(196, 445, 177, 23);

        addBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn);
        addBtn.setBounds(651, 366, 112, 26);

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(48, 18, 54, 26);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("PRICE ");
        add(jLabel3);
        jLabel3.setBounds(459, 444, 109, 22);
        add(priceField);
        priceField.setBounds(586, 446, 177, 23);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel4.setText("MENU ITEM LIST");
        add(jLabel4);
        jLabel4.setBounds(271, 110, 333, 43);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

    }//GEN-LAST:event_backButtonActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String item = menuField.getText();
        int price = Integer.parseInt(priceField.getText().trim());

        BusinessCatalogueDirectory enterpriseCatalogueDirectory = location.getBusinessCatalogueDirectory();
       List<Catering> resList = enterpriseCatalogueDirectory.getListOfCatering();                // get all restaurants
        for (Catering res : resList) {
            List<Supervisor> supervisor = res.getListOfSupervisor();
            for (Supervisor manager : supervisor) {
                if (manager.getUsername().equals(user)) {            //if manager is found in that catering then add item to that res...
                    res.addMenuItem(item, price);

                    populateMenu();
                    JOptionPane.showMessageDialog(this, "Item added successfully");
                    return;
                }
            }
        }


    }//GEN-LAST:event_addBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField menuField;
    private javax.swing.JTextField priceField;
    // End of variables declaration//GEN-END:variables

    private void populateMenu() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        BusinessCatalogueDirectory enterpriseCatalogueDirectory = location.getBusinessCatalogueDirectory();
        for (Catering catering : enterpriseCatalogueDirectory.getListOfCatering()) {
            if (catering.findSupervisor(user) != null) {
                Object row[] = new Object[10];
                for (Catering_Menu item : catering.getListOfMenuItem()) {
                    row[0] = item.getDetails();
                    row[1] = item.getPrice();
                    model.addRow(row);
                }
            }
        }

    }
}
