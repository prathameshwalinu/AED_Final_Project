package ui.ClientRole;
/**
 *
 * @author prathmeshw
 */

import Model.*;
import java.util.function.Consumer;


public class AddServiceJPanel extends javax.swing.JPanel {

    private Admin systems;
    private Consumer<HallBooking> callOnEventBooking;
    private Consumer<HallBooking> callOnCateringBooking;
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
        this.callOnCateringBooking = callOnOrderBooking;
        this.callOnEntertainmentBooking = callOnEntertainmentBooking;
        this.callOnResortServiceBooking = callOnResortServiceBooking;
        this.backButton4 = backButton;
        this.username = username;
        this.booking = booking;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        btnEvent = new javax.swing.JButton();
        btnCatering = new javax.swing.JButton();
        btnEntertainment = new javax.swing.JButton();
        btnOthers = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VIEW SERVICES DETAILS");
        add(jLabel1);
        jLabel1.setBounds(180, 100, 483, 43);

        backBtn.setBackground(new java.awt.Color(204, 204, 255));
        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(38, 27, 54, 36);

        btnEvent.setBackground(new java.awt.Color(204, 204, 255));
        btnEvent.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnEvent.setText("EVENT");
        btnEvent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventActionPerformed(evt);
            }
        });
        add(btnEvent);
        btnEvent.setBounds(62, 438, 262, 38);

        btnCatering.setBackground(new java.awt.Color(204, 204, 255));
        btnCatering.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnCatering.setText("CATERING");
        btnCatering.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCatering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCateringActionPerformed(evt);
            }
        });
        add(btnCatering);
        btnCatering.setBounds(444, 438, 262, 42);

        btnEntertainment.setBackground(new java.awt.Color(204, 204, 255));
        btnEntertainment.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnEntertainment.setText("ENTERTAINMENT");
        btnEntertainment.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEntertainment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntertainmentActionPerformed(evt);
            }
        });
        add(btnEntertainment);
        btnEntertainment.setBounds(62, 524, 262, 42);

        btnOthers.setBackground(new java.awt.Color(204, 204, 255));
        btnOthers.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnOthers.setText("OTHERS");
        btnOthers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOthersActionPerformed(evt);
            }
        });
        add(btnOthers);
        btnOthers.setBounds(444, 524, 262, 42);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ClientRole/service.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 840, 690);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventActionPerformed
        callOnEventBooking.accept(booking);
    }//GEN-LAST:event_btnEventActionPerformed

    private void btnCateringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCateringActionPerformed
        callOnCateringBooking.accept(booking);
    }//GEN-LAST:event_btnCateringActionPerformed

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
    private javax.swing.JButton btnCatering;
    private javax.swing.JButton btnEntertainment;
    private javax.swing.JButton btnEvent;
    private javax.swing.JButton btnOthers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
