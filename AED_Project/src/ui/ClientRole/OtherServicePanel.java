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
        dateField = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOTEL SERVICE PANEL");
        add(jLabel1);
        jLabel1.setBounds(410, 110, 423, 43);

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
        backBtn.setBounds(30, 30, 75, 26);

        RbtnTourGuide.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        RbtnTourGuide.setForeground(new java.awt.Color(255, 255, 255));
        RbtnTourGuide.setText("TOUR GUIDE ($100)");
        RbtnTourGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnTourGuideActionPerformed(evt);
            }
        });
        add(RbtnTourGuide);
        RbtnTourGuide.setBounds(430, 240, 243, 26);

        RBtnCarService.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        RBtnCarService.setForeground(new java.awt.Color(255, 255, 255));
        RBtnCarService.setText("CAR SERVICE ($100)");
        add(RBtnCarService);
        RBtnCarService.setBounds(670, 240, 211, 26);

        placeRequest.setBackground(new java.awt.Color(204, 255, 255));
        placeRequest.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        placeRequest.setText("PLACE REQUEST");
        placeRequest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        placeRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeRequestActionPerformed(evt);
            }
        });
        add(placeRequest);
        placeRequest.setBounds(570, 290, 231, 47);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATE");
        add(jLabel3);
        jLabel3.setBounds(450, 190, 75, 22);
        add(dateField);
        dateField.setBounds(580, 190, 211, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ClientRole/hotel5.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1180, 840);
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
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton placeRequest;
    // End of variables declaration//GEN-END:variables
}
