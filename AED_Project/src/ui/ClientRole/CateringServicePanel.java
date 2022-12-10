package ui.ClientRole;

import Model.Admin;
import Model.Admin;
import Model.Admin_Menu;
import Model.HallBooking;
import Model.services.AdminService;
import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import ui.main.DateUtils;

public class AdminServicePanel extends javax.swing.JPanel {
    
    private Admin systems;
    private Consumer<HallBooking> callOnCreateMethod1;
    private String username;
    private HallBooking booking;

    public AdminServicePanel(Admin systems, Consumer<HallBooking> callOnCreateMethod1, String username, HallBooking booking) {
initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;

        for (Admin cat : booking.getServiceLocation().getBusinessCatalogueDirectory().getListOfAdmin()) {
            cmbAdmin.addItem(cat);
        }
//        setBackground(new java.awt.Color(255, 208, 56));
//        backBtn.setBackground(new java.awt.Color(0, 102, 102));
//        backBtn.setOpaque(true);
//        placeOrder.setBackground(new java.awt.Color(0, 102, 102));
//        placeOrder.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuItem = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        placeOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbAdmin = new javax.swing.JComboBox();

        menuItem.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("MENU ITEMS IN Admin");

        placeOrder.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        placeOrder.setText("PLACE ORDER");
        placeOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("SELECT ITEM FROM LIST: ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("SELECT A Admin NAME: ");

        cmbAdmin.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(placeOrder)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(menuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(menuItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(placeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(345, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void cmbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAdminActionPerformed
        menuItem.removeAllItems();
        Admin Admin = (Admin) cmbAdmin.getSelectedItem();
        if (Admin != null) {
            for (Admin_Menu item : Admin.getListOfMenuItem()) {
                menuItem.addItem(item);
            }
        }
    }//GEN-LAST:event_cmbAdminActionPerformed

    private void menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActionPerformed

    }//GEN-LAST:event_menuItemActionPerformed

    private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderActionPerformed
       Date date = DateUtils.formatDate(new Date());
        Admin_Menu item = (Admin_Menu) menuItem.getSelectedItem();
        Admin Admin = (Admin) cmbAdmin.getSelectedItem();

        AdminService service = new AdminService(Admin, date, item.getDetails(), item.getPrice());
        booking.addService(service);
        JOptionPane.showMessageDialog(this, "Order placed successfully");

        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_placeOrderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox cmbAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox menuItem;
    private javax.swing.JButton placeOrder;
    // End of variables declaration//GEN-END:variables
}
