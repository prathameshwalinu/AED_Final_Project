package ui.ClientRole;
/**
 *
 * @author prathmeshw
 */

import Model.*;

public class ClientJPanel extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private String user;

    public ClientJPanel(Admin Admin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2) {
        initComponents();
        this.Admin = Admin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBookResort = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        manageBooking = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CLIENT PANEL ");
        add(jLabel1);
        jLabel1.setBounds(240, 102, 320, 43);

        btnBookResort.setBackground(new java.awt.Color(204, 255, 255));
        btnBookResort.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBookResort.setText("RESORT BOOKING AND SERVICES");
        btnBookResort.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBookResort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookResortActionPerformed(evt);
            }
        });
        add(btnBookResort);
        btnBookResort.setBounds(226, 276, 334, 38);

        backBtn.setBackground(new java.awt.Color(204, 255, 255));
        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(backBtn);
        backBtn.setBounds(50, 33, 79, 38);

        manageBooking.setBackground(new java.awt.Color(204, 255, 255));
        manageBooking.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        manageBooking.setText("MANAGE BOOKING");
        manageBooking.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBookingActionPerformed(evt);
            }
        });
        add(manageBooking);
        manageBooking.setBounds(226, 361, 334, 39);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ClientRole/client.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 780, 750);
    }// </editor-fold>//GEN-END:initComponents

    private void manageBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBookingActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_manageBookingActionPerformed

    private void btnBookResortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookResortActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnBookResortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnBookResort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageBooking;
    // End of variables declaration//GEN-END:variables
}
