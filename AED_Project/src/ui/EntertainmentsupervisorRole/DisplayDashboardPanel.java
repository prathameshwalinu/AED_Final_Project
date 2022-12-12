package ui.EntertainmentsupervisorRole;
/**
 *
 * @author nishapatil
 */

import Model.*;
import Model.services.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DisplayDashboardPanel extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Entertainment entertainment;

    public DisplayDashboardPanel(Admin Admin, Runnable callOnCreateMethod, String user, String type, Entertainment entertainment) {
        initComponents();
        this.Admin = Admin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.entertainment = entertainment;
        populateComboBox();
        populateTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmbsingerORG = new javax.swing.JComboBox();
        cmbmagicianORG = new javax.swing.JComboBox();
        cmbchoreographerORG = new javax.swing.JComboBox();
        btnassignWork = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "NAME", "STATUS", "SINGER", "MAGICIAN", "CHOREOGRAPHER"
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
        jScrollPane1.setBounds(170, 190, 743, 182);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DISPLAY DASHBOARD ");
        add(jLabel1);
        jLabel1.setBounds(320, 110, 434, 48);

        cmbsingerORG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(cmbsingerORG);
        cmbsingerORG.setBounds(480, 390, 218, 28);

        cmbmagicianORG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(cmbmagicianORG);
        cmbmagicianORG.setBounds(480, 430, 218, 28);

        cmbchoreographerORG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbchoreographerORG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbchoreographerORGActionPerformed(evt);
            }
        });
        add(cmbchoreographerORG);
        cmbchoreographerORG.setBounds(480, 490, 218, 28);

        btnassignWork.setBackground(new java.awt.Color(153, 153, 255));
        btnassignWork.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnassignWork.setText("ADD AND CONFIRM");
        btnassignWork.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnassignWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignWorkActionPerformed(evt);
            }
        });
        add(btnassignWork);
        btnassignWork.setBounds(730, 590, 184, 44);

        backButton.setBackground(new java.awt.Color(153, 153, 255));
        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(28, 21, 90, 30);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECT A SINGER");
        add(jLabel2);
        jLabel2.setBounds(170, 390, 238, 24);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SELECT A MAGICIAN");
        add(jLabel3);
        jLabel3.setBounds(170, 440, 230, 22);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SELECT A CHOREOGRAPHER");
        add(jLabel4);
        jLabel4.setBounds(170, 490, 295, 22);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/EntertainmentsupervisorRole/entertainmentfinal.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5);
        jLabel5.setBounds(0, 0, 1150, 790);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void btnassignWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignWorkActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        HallBooking booking = (HallBooking) model.getValueAt(selectedRowIndex, 0);

        EntertainmentService entertainmentService = null;
        for (Service service : booking.getServices()) {
            if (entertainment.getName().equals(service.getBusinessCatalogue().getName())) {
                entertainmentService = (EntertainmentService) service;
                break;
            }
        }

        if (entertainmentService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find Entertainment");
            return;
        }
        if (!entertainmentService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        Entertainment_SingerORG singer = (Entertainment_SingerORG) cmbsingerORG.getSelectedItem();
        Entertainment_MagicianORG magician = (Entertainment_MagicianORG) cmbmagicianORG.getSelectedItem();
        Entertainment_ChoreographerORG choreographer = (Entertainment_ChoreographerORG) cmbchoreographerORG.getSelectedItem();

        List<Organization> organizations = new ArrayList<>();
        for (EntertainmentService.EntertainmentServiceType type : entertainmentService.getEntertainmentServices()) {
            switch (type) {
                case SINGER:
                    if (singer == null) {
                        JOptionPane.showMessageDialog(this, "Please select singer organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(singer);
                    }
                    break;
                case MAGICIAN:
                    if (magician == null) {
                        JOptionPane.showMessageDialog(this, "Please select magician organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(magician);
                    }
                    break;
                case CHOREOGRAPHY:
                    if (choreographer == null) {
                        JOptionPane.showMessageDialog(this, "Please select choreographer organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(choreographer);
                    }
                    break;
            }
        }

        for (Organization organization : organizations) {
            entertainmentService.addOrganization(organization);
        }
        entertainmentService.setStatus(Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all entertainment services to the booking: " + booking.getId());

        return;

    }//GEN-LAST:event_btnassignWorkActionPerformed

    private void cmbchoreographerORGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbchoreographerORGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbchoreographerORGActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnassignWork;
    private javax.swing.JComboBox cmbchoreographerORG;
    private javax.swing.JComboBox cmbmagicianORG;
    private javax.swing.JComboBox cmbsingerORG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        Object row[] = new Object[10];
        ClientDirectory customerDirec = Admin.getClientDirectory(); //get all customers
        for (Client customer : customerDirec.getListOfClientDirectory()) {
            for (HallBooking booking : customer.getHallbookingList()) {      //get booking details each customer
                for (Service service : booking.getServices()) {       //get services under booking

                    if (service.getBusinessCatalogue().getName().equals(entertainment.getName())) {

                        EntertainmentService entertainmentService = (EntertainmentService) service;

                        row[0] = booking;
                        row[1] = customer;
                        row[2] = entertainmentService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";
                        row[5] = "NO";

                        for (EntertainmentService.EntertainmentServiceType type : entertainmentService.getEntertainmentServices()) {
                            switch (type) {
                                case SINGER:
                                    row[3] = "YES";
                                    break;
                                case MAGICIAN:
                                    row[4] = "YES";
                                    break;
                                case CHOREOGRAPHY:
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
        cmbsingerORG.addItem(null);
        cmbmagicianORG.addItem(null);
        cmbchoreographerORG.addItem(null);

        for (Entertainment_SingerORG singer : entertainment.getListOfSingerORG()) {
            if (singer != null) {
                cmbsingerORG.addItem(singer);
            }
        }
        for (Entertainment_MagicianORG magician : entertainment.getListOfMagicianORG()) {
            if (magician != null) {
                cmbmagicianORG.addItem(magician);
            }
        }
        for (Entertainment_ChoreographerORG choreographer : entertainment.getListOfChoreographerORG()) {
            if (choreographer != null) {
                cmbchoreographerORG.addItem(choreographer);
            }
        }
    }

}
