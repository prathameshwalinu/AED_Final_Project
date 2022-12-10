package ui.ClientRole;

import Model.Admin;
import Model.HallBooking;
import java.util.function.Consumer;


public class AddServiceJPanel extends javax.swing.JPanel {
    
    private Admin systems;
    private Consumer<HallBooking> callOnEventBooking;
    private Consumer<HallBooking> callOnAdminBooking;
    private Consumer<HallBooking> callOnEntertainmentBooking;
    private Consumer<HallBooking> callOnResortServiceBooking;
    private Runnable backButton4;
    private String username;
    private String hotelName;
    private HallBooking booking;


    public AddServiceJPanel(Admin systems, Consumer<HallBooking> callOnEventBooking, Consumer<HallBooking> callOnOrderBooking,
            Consumer<HallBooking> callOnEntertainmentBooking, Consumer<HallBooking> callOnResortServiceBooking, Runnable backButton, String username, HallBooking booking) {
        
        initComponents();
        this.systems = systems;
        this.callOnEventBooking = callOnEventBooking;
        this.callOnAdminBooking = callOnOrderBooking;
        this.callOnEntertainmentBooking = callOnEntertainmentBooking;
        this.callOnResortServiceBooking = callOnResortServiceBooking;
        this.backButton4 = backButton;
        this.username = username;
        this.booking = booking;
//        setBackground(new java.awt.Color(255, 208, 56));
//        backBtn.setBackground(new java.awt.Color(0, 102, 102));
//        backBtn.setOpaque(true);
//        btnEvent.setBackground(new java.awt.Color(0, 102, 102));
//        btnEvent.setOpaque(true);
//        btnAdmin.setBackground(new java.awt.Color(0, 102, 102));
//        btnAdmin.setOpaque(true);
//        btnEntertainment.setBackground(new java.awt.Color(0, 102, 102));
//        btnEntertainment.setOpaque(true);
//        btnOthers.setBackground(new java.awt.Color(0, 102, 102));
//        btnOthers.setOpaque(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        btnEvent = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnEntertainment = new javax.swing.JButton();
        btnOthers = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("VIEW SERVICES DETAILS");

        backBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        backBtn.setText("< BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        btnEvent.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnEvent.setText("EVENT");
        btnEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventActionPerformed(evt);
            }
        });

        btnAdmin.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnEntertainment.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnEntertainment.setText("ENTERTAINMENT");
        btnEntertainment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntertainmentActionPerformed(evt);
            }
        });

        btnOthers.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnOthers.setText("OTHERS");
        btnOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOthersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEntertainment, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOthers, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntertainment, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOthers, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(413, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventActionPerformed
        callOnEventBooking.accept(booking);
    }//GEN-LAST:event_btnEventActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        callOnAdminBooking.accept(booking);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnEntertainmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntertainmentActionPerformed
        callOnEntertainmentBooking.accept(booking);
    }//GEN-LAST:event_btnEntertainmentActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        backButton4.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOthersActionPerformed
        callOnResortServiceBooking.accept(booking);
    }//GEN-LAST:event_btnOthersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnEntertainment;
    private javax.swing.JButton btnEvent;
    private javax.swing.JButton btnOthers;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
