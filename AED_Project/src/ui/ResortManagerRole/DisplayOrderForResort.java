package ui.ResortManagerRole;

import Model.Admin;
import Model.CarServiceORG;
import Model.Client;
import Model.ClientDirectory;
import Model.HallBooking;
import Model.Organization;
import Model.Resort;
import Model.TourGuideORG;
import Model.services.EService;
import Model.services.ResortService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DisplayOrderForResort extends javax.swing.JPanel {

    private Admin EPAdmin;
    private Resort resort;
    
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    

    public DisplayOrderForResort(Admin EPAdmin, Runnable callOnCreateMethod, String user, String type, Resort hotel) {
        initComponents();
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.resort = hotel;
        populateComboBox();
        populateTable();
        setBackground(new java.awt.Color(255, 208, 56));
        viewTask.setBackground(new java.awt.Color(0, 102, 102));
        viewTask.setOpaque(true);
        backButton.setBackground(new java.awt.Color(0, 102, 102));
        backButton.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tourGuideOrg = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        carServiceOrg = new javax.swing.JComboBox();
        viewTask = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "CUSTOMER NAME", "STATUS", "TOUR GUIDE", "CAR SERVICES"
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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("SELECT A TOUR GUIDE ORG");

        tourGuideOrg.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tourGuideOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tourGuideOrgActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("SELECT A CAR SERVICE ORG");

        viewTask.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewTask.setText("ASSIGN AND CONFIRM TASK");
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel3.setText("DISPLAY ORDER DETAILS FOR RESORT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(687, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tourGuideOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carServiceOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(viewTask)
                        .addGap(226, 226, 226))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backButton)
                .addGap(87, 87, 87)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tourGuideOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(carServiceOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(viewTask, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskActionPerformed
         int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        HallBooking booking = (HallBooking) model.getValueAt(selectedRowIndex, 0);

        ResortService resortService = null;
        for (EService service : booking.getServices()) {
            if (resort.getName().equals(service.getBusinessCatalogue().getName())) {
                resortService = (ResortService) service;
                break;
            }
        }

        if (resortService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find hotel");
            return;
        }

        if (!resortService.getStatus().equals(EService.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        TourGuideORG tourGuide = (TourGuideORG) tourGuideOrg.getSelectedItem();
        CarServiceORG carServices = (CarServiceORG) carServiceOrg.getSelectedItem();

        List<Organization> organizations = new ArrayList<>();
        for (ResortService.ResortServiceType type : resortService.getResortServices()) {
            switch (type) {
                case TOURGUIDE:
                    if (tourGuide == null) {
                        JOptionPane.showMessageDialog(this, "Please select tour guide organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(tourGuide);
                    }
                    break;
                case CARSERVICE:
                    if (carServices == null) {
                        JOptionPane.showMessageDialog(this, "Please select car services organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(carServices);
                    }
                    break;
            }
        }

        for (Organization organization : organizations) {
            resortService.addOrganization(organization);
        }
        resortService.setStatus(EService.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all resort services to the booking: " + booking.getId());
        populateTable();       
                    
    }//GEN-LAST:event_viewTaskActionPerformed

    private void tourGuideOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tourGuideOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tourGuideOrgActionPerformed

    private void populateTable() {
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        ClientDirectory clientDirectory = EPAdmin.getClientDirectory(); //get all customers
        for (Client client : clientDirectory.getListOfClientDirectory()) {
            for (HallBooking booking : client.getHallbookingList()) {      //get booking details each client
                for (EService service : booking.getServices()) {       //get services under booking
                    System.out.println("Enterprise : " + service.getBusinessCatalogue());
                    if (resort.getName().equals(service.getBusinessCatalogue().getName())) {
                        ResortService resortService = (ResortService) service;

                        Object row[] = new Object[10];
                        row[0] = booking;
                        row[1] = client;
                        row[2] = resortService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";

                        for (ResortService.ResortServiceType type : resortService.getResortServices()) {
                            switch (type) {
                                case TOURGUIDE:
                                    row[3] = "YES";
                                    break;
                                case CARSERVICE:
                                    row[4] = "YES";
                                    break;
                            }
                        }
                        model.addRow(row);
                    }
                }
            }
        }       
    }
       


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox carServiceOrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox tourGuideOrg;
    private javax.swing.JButton viewTask;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
                tourGuideOrg.addItem(null);
        carServiceOrg.addItem(null);

        for (TourGuideORG tourGuide : resort.getTourGuideORG()) {
            if (tourGuide != null) {
                tourGuideOrg.addItem(tourGuide);
            }
        }
        for (CarServiceORG carServices : resort.getCarServiceORGList()) {
            if (carServices != null) {
                carServiceOrg.addItem(carServices);
            }
        }
    }
}
