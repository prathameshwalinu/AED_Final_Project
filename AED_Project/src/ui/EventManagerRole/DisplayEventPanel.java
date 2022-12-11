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
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(27, 17, 133, 26);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("VIEW ORDER DETAILS FOR EVENTS");
        add(jLabel1);
        jLabel1.setBounds(170, 160, 666, 43);

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

        add(jScrollPane1);
        jScrollPane1.setBounds(80, 220, 800, 194);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("SELECT A BIRTHDAY PARTY ORG:");
        add(jLabel2);
        jLabel2.setBounds(110, 470, 321, 21);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("SELECT A MEETING ORG:");
        add(jLabel3);
        jLabel3.setBounds(510, 470, 267, 22);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("SELECT A WEDDING ORG:");
        add(jLabel4);
        jLabel4.setBounds(150, 570, 262, 22);

        add(birthdayOrg);
        birthdayOrg.setBounds(150, 510, 236, 23);

        add(meetingOrg);
        meetingOrg.setBounds(520, 510, 206, 23);

        weddingOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weddingOrgActionPerformed(evt);
            }
        });
        add(weddingOrg);
        weddingOrg.setBounds(520, 570, 203, 23);

        confirmBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        confirmBtn.setText("CONFIRM REQUEST");
        confirmBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        add(confirmBtn);
        confirmBtn.setBounds(260, 690, 246, 50);

        denyButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        denyButton.setText("DENY REQUEST");
        denyButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        denyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyButtonActionPerformed(evt);
            }
        });
        add(denyButton);
        denyButton.setBounds(590, 690, 189, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/nishapatil/Downloads/N.jpeg")); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6);
        jLabel6.setBounds(0, 0, 910, 760);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox meetingOrg;
    private javax.swing.JComboBox weddingOrg;
    // End of variables declaration//GEN-END:variables
}
