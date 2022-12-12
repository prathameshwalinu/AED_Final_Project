package ui.ClientRole;
/**
 *
 * @author prathmeshw
 */

import Model.*;
import Model.EmailFun;
import Model.HallType.RoomType;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import ui.main.DateUtils;

public class ResortBookingServicesJPanel extends javax.swing.JPanel {

    private Admin systems;
    private Runnable callOnCreateMethod1;
    private String username;
    private HallBooking booking;

    public ResortBookingServicesJPanel(Admin systems, Runnable callOnCreateMethod1, String username) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        for (ServiceLocation location : systems.getListOfServiceLocation()) {
            cityCombo.addItem(location.getName());
        }
        for (RoomType type : RoomType.values()) {
            roomtypeComboBox.addItem(type);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        lbldate = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        lblhotel = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        btnnoofpeople = new javax.swing.JLabel();
        lblroom = new javax.swing.JLabel();
        bookRoomBtn = new javax.swing.JButton();
        lblbookservices = new javax.swing.JLabel();
        peopleField = new javax.swing.JTextField();
        roomField = new javax.swing.JTextField();
        cmbResort = new javax.swing.JComboBox<>();
        cityCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        roomtypeComboBox = new javax.swing.JComboBox<>();
        priceBtn = new javax.swing.JButton();
        DCcheckin = new com.toedter.calendar.JDateChooser();
        DCcheckout = new com.toedter.calendar.JDateChooser();
        lblroom1 = new javax.swing.JLabel();
        emailid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

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
        backBtn.setBounds(42, 26, 95, 38);

        lbldate.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbldate.setForeground(new java.awt.Color(255, 255, 255));
        lbldate.setText("CHECK-IN & CHECK-OUT");
        add(lbldate);
        lbldate.setBounds(198, 173, 235, 22);

        lblcity.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblcity.setForeground(new java.awt.Color(255, 255, 255));
        lblcity.setText("CITY");
        add(lblcity);
        lblcity.setBounds(198, 247, 121, 22);

        lblhotel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblhotel.setForeground(new java.awt.Color(255, 255, 255));
        lblhotel.setText("RESORT");
        add(lblhotel);
        lblhotel.setBounds(198, 306, 121, 22);
        add(priceField);
        priceField.setBounds(755, 643, 101, 37);

        btnnoofpeople.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnnoofpeople.setForeground(new java.awt.Color(255, 255, 255));
        btnnoofpeople.setText("NO OF PEOPLE");
        add(btnnoofpeople);
        btnnoofpeople.setBounds(198, 434, 135, 22);

        lblroom.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblroom.setForeground(new java.awt.Color(255, 255, 255));
        lblroom.setText("NO OF ROOMS");
        add(lblroom);
        lblroom.setBounds(198, 489, 134, 22);

        bookRoomBtn.setBackground(new java.awt.Color(204, 255, 255));
        bookRoomBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        bookRoomBtn.setText("BOOK");
        bookRoomBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bookRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRoomBtnActionPerformed(evt);
            }
        });
        add(bookRoomBtn);
        bookRoomBtn.setBounds(667, 732, 189, 45);

        lblbookservices.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblbookservices.setForeground(new java.awt.Color(255, 255, 255));
        lblbookservices.setText("RESORT BOOKING AND SERVICES");
        add(lblbookservices);
        lblbookservices.setBounds(212, 70, 628, 43);
        add(peopleField);
        peopleField.setBounds(398, 436, 198, 23);
        add(roomField);
        roomField.setBounds(398, 491, 198, 23);

        cmbResort.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        cmbResort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Resort" }));
        cmbResort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbResortActionPerformed(evt);
            }
        });
        add(cmbResort);
        cmbResort.setBounds(398, 307, 197, 21);

        cityCombo.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        cityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select city" }));
        cityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboActionPerformed(evt);
            }
        });
        add(cityCombo);
        cityCombo.setBounds(398, 249, 197, 22);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HALL TYPE ");
        add(jLabel1);
        jLabel1.setBounds(198, 366, 120, 22);

        roomtypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomtypeComboBoxActionPerformed(evt);
            }
        });
        add(roomtypeComboBox);
        roomtypeComboBox.setBounds(398, 368, 198, 23);

        priceBtn.setBackground(new java.awt.Color(204, 255, 255));
        priceBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        priceBtn.setText("TOTAL PRICE");
        priceBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        priceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceBtnActionPerformed(evt);
            }
        });
        add(priceBtn);
        priceBtn.setBounds(561, 643, 136, 37);
        add(DCcheckin);
        DCcheckin.setBounds(460, 172, 189, 23);
        add(DCcheckout);
        DCcheckout.setBounds(667, 172, 189, 23);

        lblroom1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblroom1.setForeground(new java.awt.Color(255, 255, 255));
        lblroom1.setText("EMAIL ID");
        add(lblroom1);
        lblroom1.setBounds(198, 552, 82, 22);
        add(emailid);
        emailid.setBounds(398, 551, 198, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ClientRole/hotel5.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1170, 880);
    }// </editor-fold>//GEN-END:initComponents

    private void bookRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRoomBtnActionPerformed
        Date checkinDate = DCcheckin.getDate();
        Date checkoutdate = DCcheckout.getDate();
        String email = emailid.getText();
        String city = cityCombo.getSelectedItem().toString();
        int roomCount = Integer.parseInt(roomField.getText());
        RoomType roomType = (RoomType) roomtypeComboBox.getSelectedItem();

        if (checkinDate.compareTo(DateUtils.now()) < 0 || checkoutdate.compareTo(DateUtils.now()) < 0) {
            JOptionPane.showMessageDialog(this, "Checkin and checkout dates cannot be in the past.");
            return;
        }

        if (checkinDate.compareTo(checkoutdate) > 0) {
            JOptionPane.showMessageDialog(this, "Checkout date should be after checkin date.");
            return;
        }
               
        if(emailid.getText() != null && !emailid.getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
            {
                JOptionPane.showMessageDialog(this,"Invalid input : Invalid Email format. ");
                emailid.requestFocus();
                emailid.setText("");

            }
            ServiceLocation location = systems.findServiceLocation(city);

            Resort hotel = location.getBusinessCatalogueDirectory().findResort(cmbResort.getSelectedItem().toString());
            List<HallType> availableRooms = hotel.availableRooms(checkinDate, checkoutdate, roomType);
            if (availableRooms.size() < roomCount) {
                JOptionPane.showMessageDialog(this, "Rooms not available for the specified date.");
                return;
            }

            hotel.bookRooms(checkinDate, checkoutdate, roomCount, roomType);
            Client customer = systems.getClientDirectory().findClientUsername(username);
            HallBooking booking = customer.addBooking(hotel, location);  //add bookings in customer class
            booking.getResortService().getHallroomlist().createHallRoom(roomType);     // add rooms in booking class 
            booking.setCheckin(checkinDate);
            booking.setCheckout(checkoutdate);
            booking.setStatus("Booked");
            booking.setCost(roomType.getRate());

            JOptionPane.showMessageDialog(this, "Room booked successfully. The total cost for your booking is "
                    + (roomCount * roomType.getRate()) + "$");
            callOnCreateMethod1.run();

            String message = booking.prettyPrint();
            EmailFun.sendMail(emailid.getText(), message);
    }//GEN-LAST:event_bookRoomBtnActionPerformed

    private void cityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityComboActionPerformed
        String city = cityCombo.getSelectedItem().toString();
        ServiceLocation location = systems.findServiceLocation(city);
        cmbResort.removeAllItems();
        if (location != null) {
            for (Resort resort : location.getBusinessCatalogueDirectory().getListOfResort()) {  //populate all resort in that city
                cmbResort.addItem(resort.getName());
            }
        }
    }//GEN-LAST:event_cityComboActionPerformed

    private void roomtypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomtypeComboBoxActionPerformed

    }//GEN-LAST:event_roomtypeComboBoxActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void priceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceBtnActionPerformed
        final String roomNum = roomField.getText();
        if (roomNum != null && !roomNum.isEmpty()) {
            int roomCount = Integer.parseInt(roomNum);
            RoomType selectType = (RoomType) roomtypeComboBox.getSelectedItem();
            priceField.setText(selectType.getRate() * roomCount + "$");
        } else {
            JOptionPane.showMessageDialog(this, "Please provide number of rooms to calculate price.");
        }
    }//GEN-LAST:event_priceBtnActionPerformed

    private void cmbResortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbResortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbResortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCcheckin;
    private com.toedter.calendar.JDateChooser DCcheckout;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookRoomBtn;
    private javax.swing.JLabel btnnoofpeople;
    private javax.swing.JComboBox<String> cityCombo;
    private javax.swing.JComboBox<String> cmbResort;
    private javax.swing.JTextField emailid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblhotel;
    private javax.swing.JLabel lblroom;
    private javax.swing.JLabel lblroom1;
    private javax.swing.JTextField peopleField;
    private javax.swing.JButton priceBtn;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField roomField;
    private javax.swing.JComboBox<RoomType> roomtypeComboBox;
    // End of variables declaration//GEN-END:variables
}
