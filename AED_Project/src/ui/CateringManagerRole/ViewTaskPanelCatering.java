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
        setBackground(new java.awt.Color(255, 208, 56));
        acceptBtn.setBackground(new java.awt.Color(0, 102, 102));
        acceptBtn.setOpaque(true);
        denyBtn.setBackground(new java.awt.Color(0, 102, 102));
        denyBtn.setOpaque(true);
        backBtn.setBackground(new java.awt.Color(0, 102, 102));
        backBtn.setOpaque(true);
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

        deliveryOrg.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("SELECT AN ORGANIZATION FOR SERVICE AGENT:");

        acceptBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        acceptBtn.setText("ACCEPT ORDER");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        denyBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        denyBtn.setText("DENY ORDER");
        denyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setText("VIEW ORDER DETAILS FOR CATERING");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(acceptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(denyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(462, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(deliveryOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(deliveryOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(denyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );
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
