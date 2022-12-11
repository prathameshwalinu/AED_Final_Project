package ui.ClientRole;

import java.util.Date;
import java.util.function.Consumer;
import Model.HallBooking;
import Model.Admin;

public class ReportServiceDetailsPanel extends javax.swing.JPanel {

    private Admin systems;
    private Runnable callOnCreateMethod1;
    private String username;
    private HallBooking booking;

    public ReportServiceDetailsPanel(Admin systems, Runnable callOnCreateMethod1, String username, HallBooking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;
        populatePanel();
        setBackground(new java.awt.Color(255, 208, 56));
        backBtn.setBackground(new java.awt.Color(0, 102, 102));
        backBtn.setOpaque(true);
        bookingDetails.setColumns(19);
        bookingDetails.setRows(7);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bookingDetails = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkout = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        checkin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        bookingDetails.setColumns(20);
        bookingDetails.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        bookingDetails.setRows(5);
        jScrollPane1.setViewportView(bookingDetails);

        add(jScrollPane1);
        jScrollPane1.setBounds(114, 268, 559, 496);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHECK-IN ");
        add(jLabel1);
        jLabel1.setBounds(185, 171, 101, 22);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CHECK-OUT");
        add(jLabel2);
        jLabel2.setBounds(185, 213, 115, 22);

        checkout.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        add(checkout);
        checkout.setBounds(369, 214, 249, 23);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DETAILED  ORDER REPORT");
        add(jLabel3);
        jLabel3.setBounds(143, 77, 562, 43);

        backBtn.setBackground(new java.awt.Color(204, 255, 255));
        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(22, 18, 89, 36);

        checkin.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        add(checkin);
        checkin.setBounds(369, 172, 249, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ClientRole/hotel5.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(0, 0, 780, 820);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextArea bookingDetails;
    private javax.swing.JTextField checkin;
    private javax.swing.JTextField checkout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populatePanel() {
        checkin.setText(booking.getCheckin().toString());
        checkout.setText(booking.getCheckout().toString());
        bookingDetails.setText(booking.prettyPrint());
    }
}
