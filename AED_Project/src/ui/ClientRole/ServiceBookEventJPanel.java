package ui.ClientRole;
/**
 *
 * @author prathmeshw
 */

import Model.*;
import Model.Event_BirthdayParty.BirthdayPartyType;
import Model.Event_Meetings.*;
import Model.Event_Wedding.*;
import Model.services.*;
import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import ui.main.DateUtils;

public class ServiceBookEventJPanel extends javax.swing.JPanel {

    private Admin systems;
    private Consumer<HallBooking> callOnCreateMethod1;
    private String username;
    private HallBooking booking;

    public ServiceBookEventJPanel(Admin systems, Consumer<HallBooking> callOnCreateMethod1, String username, HallBooking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;

        orgComboBox.addItem(null);
        for (Events eventOrg : booking.getServiceLocation().getBusinessCatalogueDirectory().getListOfEvents()) {
            orgComboBox.addItem(eventOrg);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        backBtn = new javax.swing.JButton();
        lblbookservices = new javax.swing.JLabel();
        radioWedding = new javax.swing.JRadioButton();
        radioBirthdayParty = new javax.swing.JRadioButton();
        bookEventBtn = new javax.swing.JButton();
        cmbMeeting = new javax.swing.JComboBox();
        cmbWedding = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbBirthdayParty = new javax.swing.JComboBox();
        radioMeeting = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        orgComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

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
        backBtn.setBounds(33, 21, 110, 26);

        lblbookservices.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblbookservices.setForeground(new java.awt.Color(255, 255, 255));
        lblbookservices.setText("BOOK EVENTS");
        add(lblbookservices);
        lblbookservices.setBounds(241, 65, 286, 43);

        radioWedding.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        radioWedding.setForeground(new java.awt.Color(255, 255, 255));
        radioWedding.setText("WEDDING");
        radioWedding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioWeddingActionPerformed(evt);
            }
        });
        add(radioWedding);
        radioWedding.setBounds(33, 262, 111, 26);

        radioBirthdayParty.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        radioBirthdayParty.setForeground(new java.awt.Color(255, 255, 255));
        radioBirthdayParty.setText("BIRTHDAY PARTY");
        radioBirthdayParty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBirthdayPartyActionPerformed(evt);
            }
        });
        add(radioBirthdayParty);
        radioBirthdayParty.setBounds(33, 323, 183, 26);

        bookEventBtn.setBackground(new java.awt.Color(204, 255, 255));
        bookEventBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        bookEventBtn.setText("BOOK EVENT");
        bookEventBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bookEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookEventBtnActionPerformed(evt);
            }
        });
        add(bookEventBtn);
        bookEventBtn.setBounds(408, 691, 178, 38);

        cmbMeeting.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(cmbMeeting);
        cmbMeeting.setBounds(405, 390, 445, 26);

        cmbWedding.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbWedding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWeddingActionPerformed(evt);
            }
        });
        add(cmbWedding);
        cmbWedding.setBounds(408, 263, 445, 26);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TYPE OF PACKAGE ");
        add(jLabel5);
        jLabel5.setBounds(222, 264, 165, 22);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TYPE OF PACKAGE");
        add(jLabel1);
        jLabel1.setBounds(222, 325, 165, 22);

        cmbBirthdayParty.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbBirthdayParty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBirthdayPartyActionPerformed(evt);
            }
        });
        add(cmbBirthdayParty);
        cmbBirthdayParty.setBounds(408, 324, 445, 26);

        radioMeeting.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        radioMeeting.setForeground(new java.awt.Color(255, 255, 255));
        radioMeeting.setText("MEETINGS");
        radioMeeting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMeetingActionPerformed(evt);
            }
        });
        add(radioMeeting);
        radioMeeting.setBounds(33, 389, 183, 26);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TYPE OF PACKAGE");
        add(jLabel6);
        jLabel6.setBounds(222, 390, 165, 25);
        add(priceField);
        priceField.setBounds(408, 561, 178, 28);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATE ");
        add(jLabel2);
        jLabel2.setBounds(33, 147, 98, 22);
        add(dateField);
        dateField.setBounds(212, 147, 200, 23);

        add(orgComboBox);
        orgComboBox.setBounds(212, 190, 200, 23);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EVENT");
        add(jLabel4);
        jLabel4.setBounds(33, 188, 61, 22);

        totalPrice.setBackground(new java.awt.Color(204, 255, 255));
        totalPrice.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        totalPrice.setText("TOTAL PRICE");
        totalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceActionPerformed(evt);
            }
        });
        add(totalPrice);
        totalPrice.setBounds(236, 558, 151, 28);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ClientRole/hotel5.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1130, 790);
    }// </editor-fold>//GEN-END:initComponents

    private void radioWeddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioWeddingActionPerformed
        if (radioWedding.isSelected()) {
            cmbWedding.removeAllItems();
            for (WeddingType wed : WeddingType.values()) {
                cmbWedding.addItem(wed);
            }
        }
    }//GEN-LAST:event_radioWeddingActionPerformed

    private void bookEventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookEventBtnActionPerformed

        Events businessEvent = (Events) orgComboBox.getSelectedItem();

        if (businessEvent == null) {
            JOptionPane.showMessageDialog(this, "Please select a Business Event organization from the dropdown.");
            return;
        }

        Date date = DateUtils.formatDate(dateField.getDate());
        Date checkin = booking.getCheckin();
        Date checkout = booking.getCheckout();
        if (date.compareTo(checkin) < 0 || date.compareTo(checkout) > 0) {
            JOptionPane.showMessageDialog(this, "Selected date should be within check-in date (" + checkin
                    + ") and checkout date (" + checkout + ")");
            return;
        }

        boolean weddingRadioBtnSelected = radioWedding.isSelected();
        boolean MeetingRadioBtnSelected = radioMeeting.isSelected();
        boolean birthdayPartyRadioBtnSelected = radioBirthdayParty.isSelected();

        if (!weddingRadioBtnSelected && !MeetingRadioBtnSelected && !birthdayPartyRadioBtnSelected) {
            JOptionPane.showMessageDialog(this, "Please select at least one service for Business Event.");
            return;
        }

        int price = 0;
        EventService service = new EventService(businessEvent, date);
        if (weddingRadioBtnSelected) {
            WeddingType weddin = (WeddingType) cmbWedding.getSelectedItem();
            service.addService(EventService.EventServiceType.WEDDING, weddin.getRate());
            price += weddin.getRate();
        }

        if (MeetingRadioBtnSelected) {
            MeetingsType meet = (MeetingsType) cmbMeeting.getSelectedItem();
            service.addService(EventService.EventServiceType.MEETINGS, meet.getRate());
            price += meet.getRate();
        }

        if (birthdayPartyRadioBtnSelected) {
            BirthdayPartyType birthdayParty = (BirthdayPartyType) cmbBirthdayParty.getSelectedItem();
            service.addService(EventService.EventServiceType.BIRTHDAYPARTY, birthdayParty.getRate());
            price += birthdayParty.getRate();
        }

        priceField.setText(String.valueOf(price));
        booking.addService(service);

        JOptionPane.showMessageDialog(this, "Business event service added successfully.");
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_bookEventBtnActionPerformed

    private void cmbBirthdayPartyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBirthdayPartyActionPerformed

    }//GEN-LAST:event_cmbBirthdayPartyActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void radioBirthdayPartyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBirthdayPartyActionPerformed
        if (radioBirthdayParty.isSelected()) {
            cmbBirthdayParty.removeAllItems();
            for (BirthdayPartyType catering : BirthdayPartyType.values()) {
                cmbBirthdayParty.addItem(catering);
            }

        }
    }//GEN-LAST:event_radioBirthdayPartyActionPerformed

    private void radioMeetingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMeetingActionPerformed
        if (radioMeeting.isSelected()) {
            cmbMeeting.removeAllItems();
            for (MeetingsType meet : MeetingsType.values()) {
                cmbMeeting.addItem(meet);
            }
        }
    }//GEN-LAST:event_radioMeetingActionPerformed

    private void totalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceActionPerformed

        Events businessEvent = (Events) orgComboBox.getSelectedItem();

        if (businessEvent == null) {
            JOptionPane.showMessageDialog(this, "Please select a Business Event organization from the dropdown.");
            return;
        }
        boolean photoRadioBtnSelected = radioWedding.isSelected();
        boolean decorRadioBtnSelected = radioMeeting.isSelected();
        boolean cateringRadioBtnSelected = radioBirthdayParty.isSelected();
        Date date = DateUtils.formatDate(dateField.getDate());

        int price = 0;
        EventService service = new EventService(businessEvent, date);
        if (photoRadioBtnSelected) {
            WeddingType photography = (WeddingType) cmbWedding.getSelectedItem();
            service.addService(EventService.EventServiceType.WEDDING, photography.getRate());
            price += photography.getRate();
        }

        if (decorRadioBtnSelected) {
            MeetingsType decor = (MeetingsType) cmbMeeting.getSelectedItem();
            service.addService(EventService.EventServiceType.MEETINGS, decor.getRate());
            price += decor.getRate();
        }

        if (cateringRadioBtnSelected) {
            BirthdayPartyType catering = (BirthdayPartyType) cmbBirthdayParty.getSelectedItem();
            service.addService(EventService.EventServiceType.BIRTHDAYPARTY, catering.getRate());
            price += catering.getRate();
        }

        priceField.setText(String.valueOf(price));
    }//GEN-LAST:event_totalPriceActionPerformed

    private void cmbWeddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWeddingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbWeddingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookEventBtn;
    private javax.swing.JComboBox cmbBirthdayParty;
    private javax.swing.JComboBox cmbMeeting;
    private javax.swing.JComboBox cmbWedding;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JComboBox orgComboBox;
    private javax.swing.JTextField priceField;
    private javax.swing.JRadioButton radioBirthdayParty;
    private javax.swing.JRadioButton radioMeeting;
    private javax.swing.JRadioButton radioWedding;
    private javax.swing.JButton totalPrice;
    // End of variables declaration//GEN-END:variables
}
