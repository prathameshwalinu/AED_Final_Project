package ui.ClientRole;
/**
 *
 * @author prathmeshw
 */

import Model.*;
import Model.services.*;
import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import ui.main.DateUtils;

public class CateringServicePanel extends javax.swing.JPanel {

    private Admin systems;
    private Consumer<HallBooking> callOnCreateMethod1;
    private String username;
    private HallBooking booking;

    public CateringServicePanel(Admin systems, Consumer<HallBooking> callOnCreateMethod1, String username, HallBooking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;

        for (Catering cat : booking.getServiceLocation().getBusinessCatalogueDirectory().getListOfCatering()) {
            cmbCatering.addItem(cat);
        }
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
        cmbCatering = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        menuItem.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActionPerformed(evt);
            }
        });
        add(menuItem);
        menuItem.setBounds(482, 361, 287, 22);

        backBtn.setBackground(new java.awt.Color(255, 204, 204));
        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(39, 30, 100, 40);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("MENU ITEMS IN DINING");
        add(jLabel1);
        jLabel1.setBounds(181, 140, 539, 43);

        placeOrder.setBackground(new java.awt.Color(255, 204, 204));
        placeOrder.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        placeOrder.setText("PLACE ORDER");
        placeOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });
        add(placeOrder);
        placeOrder.setBounds(629, 444, 140, 43);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("SELECT ITEM FROM LIST: ");
        add(jLabel2);
        jLabel2.setBounds(156, 360, 231, 22);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("SELECT A CATERING NAME: ");
        add(jLabel4);
        jLabel4.setBounds(156, 293, 256, 22);

        cmbCatering.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbCatering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCateringActionPerformed(evt);
            }
        });
        add(cmbCatering);
        cmbCatering.setBounds(479, 294, 290, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ClientRole/catbk.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, 0, 840, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void cmbCateringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCateringActionPerformed
        menuItem.removeAllItems();
        Catering catering = (Catering) cmbCatering.getSelectedItem();
        if (catering != null) {
            for (Catering_Menu item : catering.getListOfMenuItem()) {
                menuItem.addItem(item);
            }
        }
    }//GEN-LAST:event_cmbCateringActionPerformed

    private void menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActionPerformed

    }//GEN-LAST:event_menuItemActionPerformed

    private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderActionPerformed
        Date date = DateUtils.formatDate(new Date());
        Catering_Menu item = (Catering_Menu) menuItem.getSelectedItem();
        Catering catering = (Catering) cmbCatering.getSelectedItem();

        CateringService service = new CateringService(catering, date, item.getDetails(), item.getPrice());
        booking.addService(service);
        JOptionPane.showMessageDialog(this, "Order placed successfully");

        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_placeOrderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox cmbCatering;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox menuItem;
    private javax.swing.JButton placeOrder;
    // End of variables declaration//GEN-END:variables
}
