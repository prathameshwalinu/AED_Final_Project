package ui.EventManagerRole;

import Model.Admin;
import Model.Client;
import Model.ClientDirectory;
import Model.Event_BirthdayParty;
import Model.Event_Meetings;
import Model.Event_Wedding;
import Model.Events;
import Model.HallBooking;
import Model.Organization;
import Model.services.EService;
import Model.services.EventService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DisplayEventPanel extends javax.swing.JPanel {

    private Admin EPAdmin;
    private Events businessEvent;
    
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    



    public DisplayEventPanel( Admin EPAdmin, Runnable callOnCreateMethod, String user, String type, Events businessEvent) {
        initComponents();
        
        this.EPAdmin = EPAdmin;
        this.businessEvent = businessEvent;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;

        populateComboBox();
        populateTable();
        
//        setBackground(new java.awt.Color(255,208,56));
//        backBtn.setBackground(new java.awt.Color(0, 102, 102));
//        backBtn.setOpaque(true);
//       confirmBtn.setBackground(new java.awt.Color(0, 102, 102));
//       confirmBtn.setOpaque(true);
//       denyButton.setBackground(new java.awt.Color(0, 102, 102));
//       confirmBtn.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        birthdayOrg = new javax.swing.JComboBox();
        meetingOrg = new javax.swing.JComboBox();
        weddingOrg = new javax.swing.JComboBox();
        confirmBtn = new javax.swing.JButton();
        denyButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("VIEW ORDER DETAILS FOR EVENTS");

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKING ID", "NAME", "STATUS", "Admin", "DECOR", "PHOTOGRAPHY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("SELECT A BIRTHDAY PARTY ORG:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("SELECT A MEETING ORG:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("SELECT A WEDDING ORG:");

        weddingOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weddingOrgActionPerformed(evt);
            }
        });

        confirmBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        confirmBtn.setText("CONFIRM REQUEST");
        confirmBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        denyButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        denyButton.setText("DENY REQUEST");
        denyButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        denyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(birthdayOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(92, 92, 92)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(meetingOrg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(weddingOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(denyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(backBtn)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(meetingOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(birthdayOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(weddingOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(denyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        HallBooking booking = (HallBooking) model.getValueAt(selectedRowIndex, 0);

        EventService eventService = null;
        for (EService service : booking.getServices()) {
            if (businessEvent.getName().equals(service.getBusinessCatalogue().getName())) {
                eventService = (EventService) service;
                break;
            }
        }

        if (eventService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find business event");
            return;
        }

        if (!eventService.getStatus().equals(EService.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        Event_BirthdayParty birthdayService = (Event_BirthdayParty) birthdayOrg.getSelectedItem();
        Event_Wedding weddingService = (Event_Wedding) weddingOrg.getSelectedItem();
        Event_Meetings meetingService = (Event_Meetings) meetingOrg.getSelectedItem();

        List<Organization> organizations = new ArrayList<>();
        for (EventService.EventServiceType type : eventService.getEventServiceTypes().keySet()) {
            switch (type) {
                case BIRTHDAYPARTY:
                    if (birthdayService == null) {
                        JOptionPane.showMessageDialog(this, "Please select Birthday party organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(birthdayService);
                    }
                    break;
                case MEETINGS:
                    if (meetingService == null) {
                        JOptionPane.showMessageDialog(this, "Please select Meeting organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(meetingService);
                    }
                    break;
                case WEDDING:
                    if (weddingService == null) {
                        JOptionPane.showMessageDialog(this, "Please select wedding organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(weddingService);
                    }
                    break;
            }
        }

        for (Organization organization : organizations) {
            eventService.addOrganization(organization);
        }
        eventService.setStatus(EService.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all event services to the booking: " + booking.getId());
        populateTable();
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void denyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denyButtonActionPerformed
       int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to deny request.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        HallBooking booking = (HallBooking) model.getValueAt(selectedRowIndex, 0);

        EventService eventService = null;
        for (EService service : booking.getServices()) {
            if (businessEvent.getName().equals(service.getBusinessCatalogue().getName())) {
                eventService = (EventService) service;
                break;
            }
        }

        if (eventService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find business event");
            return;
        }

        if (!eventService.getStatus().equals(EService.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be denied.",
                    booking.getId()));
            return;
        }

        eventService.setStatus(EService.Status.REJECTED);
        JOptionPane.showMessageDialog(this, "Denied booking request with id: " + booking.getId());
        populateTable();
 
    }//GEN-LAST:event_denyButtonActionPerformed

    private void weddingOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weddingOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weddingOrgActionPerformed

    private void populateTable() {

      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        ClientDirectory clientDirectory = EPAdmin.getClientDirectory(); //get all customers
        for (Client customer : clientDirectory.getListOfClientDirectory()) {
            for (HallBooking booking : customer.getHallbookingList()) {      //get booking details each customer
                for (EService service : booking.getServices()) {       //get services under booking

                    if (service.getBusinessCatalogue().getName().equals(businessEvent.getName())) {

                        EventService businessEventService = (EventService) service;
                        Object row[] = new Object[10];
                        row[0] = booking;
                        row[1] = customer;
                        row[2] = businessEventService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";
                        row[5] = "NO";

                        for (EventService.EventServiceType type : businessEventService.getEventServiceTypes().keySet()) {
                            switch (type) {
                                case BIRTHDAYPARTY:
                                    row[3] = "YES";
                                    break;
                                case MEETINGS:
                                    row[4] = "YES";
                                    break;
                                case WEDDING:
                                    row[5] = "YES";
                                    break;
                            }
                        }
                        model.addRow(row);
                    }
                }
            }
        }
 
    }

    private void populateComboBox() {
        birthdayOrg.removeAllItems();
        meetingOrg.removeAllItems();
        weddingOrg.removeAllItems();

        birthdayOrg.addItem(null);
        meetingOrg.addItem(null);
        weddingOrg.addItem(null);

        for (Event_BirthdayParty Admin : businessEvent.getListOfBirthdayParty()) {
            if (Admin != null) {
                birthdayOrg.addItem(Admin);
            }
        }
        for (Event_Meetings decor : businessEvent.getListOfMeetings()) {
            if (decor != null) {
                meetingOrg.addItem(decor);
            }
        }
        for (Event_Wedding photography : businessEvent.getListOfWeddingServices()) {
            if (photography != null) {
                weddingOrg.addItem(photography);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox birthdayOrg;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JButton denyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox meetingOrg;
    private javax.swing.JComboBox weddingOrg;
    // End of variables declaration//GEN-END:variables
}
