package ui.CateringManagerRole;

import Model.Admin;
import Model.Catering;
import Model.Client;
import Model.ClientDirectory;
import Model.HallBooking;
import Model.ServiceAgentOrganisation;
import Model.services.CateringService;
import Model.services.EService;
import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewTaskPanelCatering extends javax.swing.JPanel {


    private Admin EPAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Catering catering;


    public ViewTaskPanelCatering(Admin EPAdmin, Runnable callOnCreateMethod, String user, String type, Catering catering) {
        initComponents();
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.catering = catering;
        populateComboBox();
        populateTable();
        //setBackground(new java.awt.Color(255, 208, 56));
        //acceptBtn.setBackground(new java.awt.Color(0, 102, 102));
        //acceptBtn.setOpaque(true);
        //denyBtn.setBackground(new java.awt.Color(0, 102, 102));
        //denyBtn.setOpaque(true);
        //backBtn.setBackground(new java.awt.Color(0, 102, 102));
        //backBtn.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deliveryOrg = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        acceptBtn = new javax.swing.JButton();
        denyBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "CUSTOMER NAME", "ORDER DETAIL", "ADDRESS", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(64, 169, 744, 168);

        deliveryOrg.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(deliveryOrg);
        deliveryOrg.setBounds(547, 355, 261, 34);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("SELECT AN ORGANIZATION FOR SERVICE AGENT:");
        add(jLabel1);
        jLabel1.setBounds(66, 360, 463, 22);

        acceptBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        acceptBtn.setText("ACCEPT ORDER");
        acceptBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });
        add(acceptBtn);
        acceptBtn.setBounds(222, 454, 184, 42);

        denyBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        denyBtn.setText("DENY ORDER");
        denyBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        denyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyBtnActionPerformed(evt);
            }
        });
        add(denyBtn);
        denyBtn.setBounds(222, 514, 184, 42);

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(22, 22, 54, 26);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setText("VIEW ORDER DETAILS FOR CATERING");
        add(jLabel2);
        jLabel2.setBounds(90, 113, 718, 43);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        int selectRowIndex = jTable1.getSelectedRow();
        if (selectRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign request.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        HallBooking booking = (HallBooking) model.getValueAt(selectRowIndex, 0);

       CateringService resService = null;
        for (EService service : booking.getServices()) {
            if (catering.getName().equals(service.getBusinessCatalogue().getName())) {
                resService = (CateringService) service;
                break;
            }
        }

        if (resService == null) {
            throw new RuntimeException("Restaurant service not found, something went wrong.");
        }

        if (!resService.getStatus().equals(EService.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        ServiceAgentOrganisation delivery = (ServiceAgentOrganisation) deliveryOrg.getSelectedItem();
        if (delivery == null) {
            JOptionPane.showMessageDialog(this, "Please select delivery organization to be assinged.");
            return;
        }

        resService.addOrganization(delivery);
        resService.setStatus(EService.Status.CONFIRMED);

        JOptionPane.showMessageDialog(this, String.format("Booking %s is assigned to delivery ord '%s'",
                booking.getId(), delivery));

        populateTable();


    }//GEN-LAST:event_acceptBtnActionPerformed

    private void denyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denyBtnActionPerformed
        int selectRowIndex = jTable1.getSelectedRow();
        if (selectRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to deny request.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        HallBooking booking = (HallBooking) model.getValueAt(selectRowIndex, 0);

        CateringService resService = null;
        for (EService service : booking.getServices()) {
            if (service instanceof CateringService) {
                resService = (CateringService) service;
                break;
            }
        }

        if (resService == null) {
            throw new RuntimeException("Restaurant service not found, something went wrong.");
        }
        if (!resService.getStatus().equals(EService.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        resService.setStatus(EService.Status.REJECTED);
        JOptionPane.showMessageDialog(this, String.format("Booking '%s' is denied.", booking.getId()));
        populateTable();

 
    }//GEN-LAST:event_denyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox deliveryOrg;
    private javax.swing.JButton denyBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        Object row[] = new Object[10];
        ClientDirectory clientDirectory = EPAdmin.getClientDirectory(); //get all customers
        for (Client customer : clientDirectory.getListOfClientDirectory()) {
            for (HallBooking booking : customer.getHallbookingList()) {      //get booking details each customer
                for (EService service : booking.getServices()) {       //get services under booking
                    if (service.getBusinessCatalogue().getName().equals(catering.getName())) {
                        CateringService cateringService = (CateringService) service;
                        row[0] = booking;
                        row[1] = customer;
                        row[2] = booking.getStatus();
                        row[3] = customer.getAddress();
                        row[4] = cateringService.getStatus();
                        model.addRow(row);
                    }
                }
            }
        }
    }

    private void populateComboBox() {
        deliveryOrg.addItem(null);
        for (ServiceAgentOrganisation delivery : catering.getListOfServiceAgentOrganisation()) {
            if (delivery != null) {
                deliveryOrg.addItem(delivery);
            }
        }
    }
}
