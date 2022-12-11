
package ui.EntertainmentsupervisorRole;

import Model.Admin;
import Model.Client;
import Model.ClientDirectory;
import Model.Entertainment;
import Model.Entertainment_ChoreographerORG;
import Model.Entertainment_MagicianORG;
import Model.Entertainment_SingerORG;
import Model.HallBooking;
import Model.Organization;
import Model.services.EService;
import Model.services.EntertainmentService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DisplayDashboardPanel extends javax.swing.JPanel {

    private Admin EPAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Entertainment entertainment;

    public DisplayDashboardPanel(Admin EPAdmin, Runnable callOnCreateMethod, String user, String type, Entertainment entertainment) {
     
        initComponents();
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.entertainment = entertainment;
        populateComboBox();
        populateTable();
//        setBackground(new java.awt.Color(255,208,56));
//        bckBtn.setBackground(new java.awt.Color(0, 102, 102));
//        bckBtn.setOpaque(true);
//        btnassignWork.setBackground(new java.awt.Color(0, 102, 102));
//        btnassignWork.setOpaque(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTblDash = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmbSinger = new javax.swing.JComboBox();
        cmbMagician = new javax.swing.JComboBox();
        cmbChoreographer = new javax.swing.JComboBox();
        btnassignWork = new javax.swing.JButton();
        bckBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jTblDash.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTblDash.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTblDash);

        add(jScrollPane1);
        jScrollPane1.setBounds(83, 124, 769, 182);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("DISPLAY DASHBOARD ");
        add(jLabel1);
        jLabel1.setBounds(228, 58, 434, 48);

        cmbSinger.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(cmbSinger);
        cmbSinger.setBounds(513, 386, 218, 28);

        cmbMagician.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(cmbMagician);
        cmbMagician.setBounds(513, 439, 218, 28);

        cmbChoreographer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbChoreographer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChoreographerActionPerformed(evt);
            }
        });
        add(cmbChoreographer);
        cmbChoreographer.setBounds(513, 492, 218, 28);

        btnassignWork.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnassignWork.setText("ADD AND CONFIRM");
        btnassignWork.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnassignWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignWorkActionPerformed(evt);
            }
        });
        add(btnassignWork);
        btnassignWork.setBounds(333, 612, 208, 44);

        bckBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        bckBtn.setText("BACK");
        bckBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckBtnActionPerformed(evt);
            }
        });
        add(bckBtn);
        bckBtn.setBounds(38, 20, 73, 26);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("SELECT A SINGER");
        add(jLabel2);
        jLabel2.setBounds(22, 388, 167, 24);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("SELECT A MAGICIAN");
        add(jLabel3);
        jLabel3.setBounds(22, 442, 230, 22);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("SELECT A CHOREOGRAPHER");
        add(jLabel4);
        jLabel4.setBounds(22, 495, 295, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/nishapatil/Downloads/lights.jpeg")); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6);
        jLabel6.setBounds(0, 0, 1030, 730);
    }// </editor-fold>//GEN-END:initComponents

    private void bckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckBtnActionPerformed
        
        callOnCreateMethod.run();  
        
    }//GEN-LAST:event_bckBtnActionPerformed

    private void btnassignWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignWorkActionPerformed
     
        int selectedRowIndex = jTblDash.getSelectedRow();
     
        if (selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTblDash.getModel();
        HallBooking booking = (HallBooking) model.getValueAt(selectedRowIndex, 0);

        EntertainmentService entertainmentService = null;
        for (EService service : booking.getServices()) 
        {
            if (entertainment.getName().equals(service.getBusinessCatalogue().getName()))
            {
                entertainmentService = (EntertainmentService) service;
                break;
            }
        }

        if (entertainmentService == null) 
        {
            JOptionPane.showMessageDialog(this, "Cannot find Entertainment");
            return;
        }
        if (!entertainmentService.getStatus().equals(EService.Status.PENDING)) 
        {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        Entertainment_SingerORG singer = (Entertainment_SingerORG) cmbSinger.getSelectedItem();
        Entertainment_MagicianORG magician = (Entertainment_MagicianORG) cmbMagician.getSelectedItem();
        Entertainment_ChoreographerORG choreographer = (Entertainment_ChoreographerORG) cmbChoreographer.getSelectedItem();

        List<Organization> organizations = new ArrayList<>();
        for (EntertainmentService.EntertainmentServiceType type : entertainmentService.getEntertainmentServices())
        {
           
            switch (type) 
            {
                case SINGER:
                    if (singer == null) 
                    {
                        JOptionPane.showMessageDialog(this, "Please select singer organization to be assinged for the booking.");
                        return;
                    } else 
                    {
                        organizations.add(singer);
                    }
                    break;
                case MAGICIAN:
                    if (magician == null) 
                    {
                        JOptionPane.showMessageDialog(this, "Please select magician organization to be assinged for the booking.");
                        return;
                    } else 
                    {
                        organizations.add(magician);
                    }
                    break;
                case CHOREOGRAPHY:
                    if (choreographer == null)
                    {
                        JOptionPane.showMessageDialog(this, "Please select choreographer organization to be assinged for the booking.");
                        return;
                    } else 
                    {
                        organizations.add(choreographer);
                    }
                    break;
            }
        }

        for (Organization organization : organizations)
        {
            entertainmentService.addOrganization(organization);
        }
        entertainmentService.setStatus(EService.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all entertainment services to the booking: " + booking.getId());

        return;
        
    }//GEN-LAST:event_btnassignWorkActionPerformed

    private void cmbChoreographerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChoreographerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbChoreographerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bckBtn;
    private javax.swing.JButton btnassignWork;
    private javax.swing.JComboBox cmbChoreographer;
    private javax.swing.JComboBox cmbMagician;
    private javax.swing.JComboBox cmbSinger;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblDash;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

         DefaultTableModel model = (DefaultTableModel) jTblDash.getModel();
        model.setRowCount(0);

        Object row[] = new Object[10];
        ClientDirectory customerDirec = EPAdmin.getClientDirectory(); //get all customers
        for (Client customer : customerDirec.getListOfClientDirectory()) 
        {
            for (HallBooking booking : customer.getHallbookingList())
            {      //get booking details each customer
                for (EService service : booking.getServices()) 
                {       //get services under booking

                    if (service.getBusinessCatalogue().getName().equals(entertainment.getName())) 
                    {

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
        
        cmbSinger.addItem(null);
        cmbMagician.addItem(null);
        cmbChoreographer.addItem(null);

        for (Entertainment_SingerORG singer : entertainment.getListOfSingerORG()) 
        {
            if (singer != null) 
            {
                cmbSinger.addItem(singer);
            }
        }
        for (Entertainment_MagicianORG magician : entertainment.getListOfMagicianORG())
        {
            if (magician != null) 
            {
                cmbMagician.addItem(magician);
            }
        }
        for (Entertainment_ChoreographerORG choreographer : entertainment.getListOfChoreographerORG()) 
        {
            if (choreographer != null) 
            {
                cmbChoreographer.addItem(choreographer);
            }
        }
    }
        
    }


