package ui.ClientRole;

import Model.Admin;

public class ClientJPanel extends javax.swing.JPanel {

    private Admin admin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private String user;

    public ClientJPanel(Admin admin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2) {
        initComponents();
        this.admin = admin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
//        setBackground(new java.awt.Color(255, 208, 56));
//        backBtn.setBackground(new java.awt.Color(0, 102, 102));
//        backBtn.setOpaque(true);
//        btnBookResort.setBackground(new java.awt.Color(0, 102, 102));
//        btnBookResort.setOpaque(true);
//        manageBooking.setBackground(new java.awt.Color(0, 102, 102));
//        manageBooking.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBookResort = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        manageBooking = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("CLIENT PANEL ");

        btnBookResort.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBookResort.setText("RESORT BOOKING AND SERVICES");
        btnBookResort.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBookResort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookResortActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        manageBooking.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        manageBooking.setText("MANAGE BOOKING");
        manageBooking.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBookResort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(428, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addComponent(manageBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnBookResort, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(466, Short.MAX_VALUE))
        );
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
    private javax.swing.JButton manageBooking;
    // End of variables declaration//GEN-END:variables
}
