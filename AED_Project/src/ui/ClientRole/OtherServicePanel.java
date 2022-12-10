package ui.ClientRole;

import Model.Admin;
import Model.HallBooking;
import Model.services.ResortService;
import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;

import ui.main.DateUtils;

public class OtherServicePanel extends javax.swing.JPanel {

    private Admin systems;
    private Consumer<HallBooking> callOnCreateMethod1;
    private String username;
    private HallBooking booking;

    public OtherServicePanel(Admin systems, Consumer<HallBooking> callOnCreateMethod1, String username, HallBooking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;
//        setBackground(new java.awt.Color(255, 208, 56));
//        backBtn.setBackground(new java.awt.Color(0, 102, 102));
//        backBtn.setOpaque(true);
//        placeRequest.setBackground(new java.awt.Color(0, 102, 102));
//        placeRequest.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        RbtnTourGuide = new javax.swing.JRadioButton();
        RBtnCarService = new javax.swing.JRadioButton();
        placeRequest = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("HOTEL SERVICE PANEL");

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText(" BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        RbtnTourGuide.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        RbtnTourGuide.setText("TOUR GUIDE ($100)");
        RbtnTourGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnTourGuideActionPerformed(evt);
            }
        });

        RBtnCarService.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        RBtnCarService.setText("CAR SERVICE ($100)");

        placeRequest.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        placeRequest.setText("PLACE REQUEST");
        placeRequest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        placeRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeRequestActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("DATE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(RbtnTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RBtnCarService)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(backBtn)))
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(placeRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(backBtn)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addComponent(RbtnTourGuide)
                .addGap(26, 26, 26)
                .addComponent(RBtnCarService)
                .addGap(29, 29, 29)
                .addComponent(placeRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void placeRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeRequestActionPerformed
        boolean tourGuideBtnSelected = RbtnTourGuide.isSelected();
        boolean carServiceBtnSelected = RBtnCarService.isSelected();
        Date date = DateUtils.formatDate(dateField.getDate());
        Date checkin = booking.getCheckin();
        Date checkout = booking.getCheckout();
        if (date.compareTo(checkin) < 0 || date.compareTo(checkout) > 0) {
            JOptionPane.showMessageDialog(this, "Selected date should be within check-in date (" + checkin
                    + ") and checkout date (" + checkout + ")");
            return;
        }

        ResortService resortService = booking.getResortService();
        if (tourGuideBtnSelected) {
            resortService.addService(ResortService.ResortServiceType.TOURGUIDE);
        }
        if (carServiceBtnSelected) {
            resortService.addService(ResortService.ResortServiceType.CARSERVICE);
        }

        resortService.setDate(date);
        JOptionPane.showMessageDialog(this, "Your hotel services are been added.");
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_placeRequestActionPerformed

    private void RbtnTourGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnTourGuideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbtnTourGuideActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBtnCarService;
    private javax.swing.JRadioButton RbtnTourGuide;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton placeRequest;
    // End of variables declaration//GEN-END:variables
}
