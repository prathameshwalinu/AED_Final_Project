package ui.ClientRole;

import Model.Admin;
import Model.Client;
import Model.EmailFun;
import Model.HallBooking;
import Model.HallType;
import Model.HallType.RoomType;
import Model.Resort;
import Model.ServiceLocation;
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
//        setBackground(new java.awt.Color(255, 208, 56));
//        backBtn.setBackground(new java.awt.Color(0, 102, 102));
//        backBtn.setOpaque(true);
//        priceBtn.setBackground(new java.awt.Color(0, 102, 102));
//        priceBtn.setOpaque(true);
//        bookRoomBtn.setBackground(new java.awt.Color(0, 102, 102));
//        bookRoomBtn.setOpaque(true);
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
        jLabel8 = new javax.swing.JLabel();
        lbldate1 = new javax.swing.JLabel();
        lblroom1 = new javax.swing.JLabel();
        emailid = new javax.swing.JTextField();

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        lbldate.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbldate.setText("CHECK-IN");

        lblcity.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblcity.setText("CITY");

        lblhotel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblhotel.setText("RESORT");

        btnnoofpeople.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnnoofpeople.setText("NO OF PEOPLE");

        lblroom.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblroom.setText("NO OF ROOMS");

        bookRoomBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        bookRoomBtn.setText("BOOK");
        bookRoomBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bookRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRoomBtnActionPerformed(evt);
            }
        });

        lblbookservices.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblbookservices.setText("RESORT BOOKING AND SERVICES");

        cmbResort.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        cmbResort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Resort" }));

        cityCombo.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        cityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select city" }));
        cityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("HALL TYPE ");

        roomtypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomtypeComboBoxActionPerformed(evt);
            }
        });

        priceBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        priceBtn.setText("TOTAL PRICE");
        priceBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        priceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("jLabel7");

        lbldate1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbldate1.setText("CHECK-OUT");

        lblroom1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblroom1.setText("EMAIL ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addComponent(lblbookservices, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbldate)
                                        .addGap(252, 252, 252)
                                        .addComponent(lbldate1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bookRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnnoofpeople)
                                                    .addGap(30, 30, 30)
                                                    .addComponent(peopleField))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(lblcity, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(42, 42, 42))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addComponent(lblhotel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cmbResort, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lblroom, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(lblroom1)))
                                                    .addGap(31, 31, 31)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(roomtypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(roomField)
                                                        .addComponent(emailid)))
                                                .addComponent(priceBtn))
                                            .addGap(48, 48, 48)
                                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 464, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblbookservices)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbldate)
                            .addComponent(lbldate1))
                        .addGap(29, 29, 29)
                        .addComponent(lblcity))
                    .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbResort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblhotel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnnoofpeople))
                    .addComponent(peopleField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(roomtypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblroom)
                    .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblroom1)
                    .addComponent(emailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(bookRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRoomBtnActionPerformed
        Date checkinDate = DCcheckin.getDate();
        Date checkoutdate = DCcheckout.getDate();
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
//        System.out.println(message); 
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookRoomBtn;
    private javax.swing.JLabel btnnoofpeople;
    private javax.swing.JComboBox<String> cityCombo;
    private javax.swing.JComboBox<String> cmbResort;
    private javax.swing.JTextField emailid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldate1;
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
