package ui.EventManagerRole;
/**
 *
 * @author himanshu
 */

import Model.*;
import Model.services.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DisplayEventPanel extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Events businessEvent;

    public DisplayEventPanel(Admin Admin, Runnable callOnCreateMethod, String user, String type, Events businessEvent) {
        initComponents();
        this.Admin = Admin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.businessEvent = businessEvent;
        populateComboBox();
        populateTable();
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
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        backBtn.setBackground(new java.awt.Color(255, 255, 204));
        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(27, 17, 110, 38);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("VIEW ORDER DETAILS FOR EVENTS");
        add(jLabel1);
        jLabel1.setBounds(95, 92, 666, 43);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKING ID", "NAME", "STATUS", "CATERING", "DECOR", "PHOTOGRAPHY"
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
        jScrollPane1.setBounds(19, 147, 830, 194);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("SELECT A BIRTHDAY PARTY ORG:");
        add(jLabel2);
        jLabel2.setBounds(19, 385, 321, 21);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("SELECT A MEETING ORG:");
        add(jLabel3);
        jLabel3.setBounds(19, 453, 321, 22);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("SELECT A WEDDING ORG:");
        add(jLabel4);
        jLabel4.setBounds(19, 529, 321, 22);

        add(birthdayOrg);
        birthdayOrg.setBounds(391, 386, 202, 23);

        meetingOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meetingOrgActionPerformed(evt);
            }
        });
        add(meetingOrg);
        meetingOrg.setBounds(391, 455, 202, 23);

        weddingOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weddingOrgActionPerformed(evt);
            }
        });
        add(weddingOrg);
        weddingOrg.setBounds(391, 531, 202, 23);

        confirmBtn.setBackground(new java.awt.Color(255, 255, 204));
        confirmBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        confirmBtn.setText("CONFIRM REQUEST");
        confirmBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        add(confirmBtn);
        confirmBtn.setBounds(669, 622, 180, 50);

        denyButton.setBackground(new java.awt.Color(255, 255, 204));
        denyButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        denyButton.setText("DENY REQUEST");
        denyButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        denyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyButtonActionPerformed(evt);
            }
        });
        add(denyButton);
        denyButton.setBounds(669, 684, 180, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/EventManagerRole/N.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5);
        jLabel5.setBounds(0, 0, 880, 770);
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
        for (Service service : booking.getServices()) {
            if (businessEvent.getName().equals(service.getBusinessCatalogue().getName())) {
                eventService = (EventService) service;
                break;
            }
        }

        if (eventService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find business event");
            return;
        }

        if (!eventService.getStatus().equals(Service.Status.PENDING)) {
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
        eventService.setStatus(Service.Status.CONFIRMED);
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
        for (Service service : booking.getServices()) {
            if (businessEvent.getName().equals(service.getBusinessCatalogue().getName())) {
                eventService = (EventService) service;
                break;
            }
        }

        if (eventService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find business event");
            return;
        }

        if (!eventService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be denied.",
                    booking.getId()));
            return;
        }

        eventService.setStatus(Service.Status.REJECTED);
        JOptionPane.showMessageDialog(this, "Denied booking request with id: " + booking.getId());
        populateTable();
    }//GEN-LAST:event_denyButtonActionPerformed

    private void meetingOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meetingOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meetingOrgActionPerformed

    private void weddingOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weddingOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weddingOrgActionPerformed

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        ClientDirectory clientDirectory = Admin.getClientDirectory(); //get all customers
        for (Client customer : clientDirectory.getListOfClientDirectory()) {
            for (HallBooking booking : customer.getHallbookingList()) {      //get booking details each customer
                for (Service service : booking.getServices()) {       //get services under booking

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

        for (Event_BirthdayParty catering : businessEvent.getListOfBirthdayParty()) {
            if (catering != null) {
                birthdayOrg.addItem(catering);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox meetingOrg;
    private javax.swing.JComboBox weddingOrg;
    // End of variables declaration//GEN-END:variables
}
