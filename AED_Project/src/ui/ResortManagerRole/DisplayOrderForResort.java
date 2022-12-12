package ui.ResortManagerRole;
/**
 *
 * @author prathmeshw
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.*;
import Model.services.*;

public class DisplayOrderForResort extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Resort resort;

    public DisplayOrderForResort(Admin Admin, Runnable callOnCreateMethod, String user, String type, Resort hotel) {
        initComponents();
        this.Admin = Admin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.resort = hotel;
        populateComboBox();
        populateTable();
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
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

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

        add(jScrollPane1);
        jScrollPane1.setBounds(72, 152, 741, 144);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECT A TOUR GUIDE ORG");
        add(jLabel1);
        jLabel1.setBounds(72, 345, 274, 22);

        tourGuideOrg.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tourGuideOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tourGuideOrgActionPerformed(evt);
            }
        });
        add(tourGuideOrg);
        tourGuideOrg.setBounds(408, 346, 268, 23);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECT A CAR SERVICE ORG");
        add(jLabel2);
        jLabel2.setBounds(72, 387, 276, 22);

        add(carServiceOrg);
        carServiceOrg.setBounds(408, 389, 268, 23);

        viewTask.setBackground(new java.awt.Color(204, 255, 255));
        viewTask.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewTask.setText("ASSIGN AND CONFIRM TASK");
        viewTask.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });
        add(viewTask);
        viewTask.setBounds(540, 470, 263, 36);

        backButton.setBackground(new java.awt.Color(204, 255, 255));
        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(31, 27, 115, 26);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DISPLAY ORDER DETAILS FOR RESORT");
        add(jLabel3);
        jLabel3.setBounds(72, 91, 721, 43);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ResortManagerRole/hotel5.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(0, 0, 1130, 750);
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
        for (Service service : booking.getServices()) {
            if (resort.getName().equals(service.getBusinessCatalogue().getName())) {
                resortService = (ResortService) service;
                break;
            }
        }

        if (resortService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find hotel");
            return;
        }

        if (!resortService.getStatus().equals(Service.Status.PENDING)) {
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
        resortService.setStatus(Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all resort services to the booking: " + booking.getId());
        populateTable();
    }//GEN-LAST:event_viewTaskActionPerformed

    private void tourGuideOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tourGuideOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tourGuideOrgActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        ClientDirectory clientDirectory = Admin.getClientDirectory(); //get all customers
        for (Client client : clientDirectory.getListOfClientDirectory()) {
            for (HallBooking booking : client.getHallbookingList()) {      //get booking details each client
                for (Service service : booking.getServices()) {       //get services under booking
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
    private javax.swing.JLabel jLabel4;
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
