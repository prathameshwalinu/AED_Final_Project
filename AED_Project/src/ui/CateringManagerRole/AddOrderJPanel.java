package ui.AdminManagerRole;

import Model.Admin;
import Model.BusinessCatalogueDirectory;
import Model.Admin;
import Model.Admin_Menu;
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
        setForeground(new java.awt.Color(64, 162, 237));

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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("ADD AN ITEM ");

        menuField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        addBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("PRICE ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel4.setText("MENU ITEM LIST");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(backButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(menuField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addGap(66, 66, 66)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addBtn)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

    }//GEN-LAST:event_backButtonActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String item = menuField.getText();
        int price = Integer.parseInt(priceField.getText().trim());

        BusinessCatalogueDirectory enterpriseCatalogueDirectory = location.getBusinessCatalogueDirectory();
        List<Admin> resList = enterpriseCatalogueDirectory.getListOfAdmin();                // get all restaurants
        for (Admin res : resList) {
            List<Supervisor> supervisor = res.getListOfSupervisor();
            for (Supervisor manager : supervisor) {
                if (manager.getUsername().equals(user)) {            //if manager is found in that Admin then add item to that res...
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
        for (Admin Admin : enterpriseCatalogueDirectory.getListOfAdmin()) {
            if (Admin.findSupervisor(user) != null) {
                Object row[] = new Object[10];
                for (Admin_Menu item : Admin.getListOfMenuItem()) {
                    row[0] = item.getDetails();
                    row[1] = item.getPrice();
                    model.addRow(row);
                }
            }
        }

    }
}
