package ui.EventPlannerAdminRole;

import Model.Admin;
import java.awt.Color;


public class EventsPlannerAdminJPanel extends javax.swing.JPanel {

  
    Admin systems;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;

    public EventsPlannerAdminJPanel(Admin systems, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
      
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
//        setBackground(new java.awt.Color(255, 208, 56));
//
//        btnServiceLocations.setBackground(new java.awt.Color(0, 102, 102));
//        btnServiceLocations.setOpaque(true);
//        btnClients.setBackground(new java.awt.Color(0, 102, 102));
//        btnClients.setOpaque(true);
//        btnEventSupervisor.setBackground(new java.awt.Color(0, 102, 102));
//        btnEventSupervisor.setOpaque(true);
//        btnBusinessCatalogue.setBackground(new java.awt.Color(0, 102, 102));
//        btnBusinessCatalogue.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnServiceLocations = new javax.swing.JButton();
        btnBusinessCatalogue = new javax.swing.JButton();
        btnClients = new javax.swing.JButton();
        lbleventadmin = new javax.swing.JLabel();
        btnEventSupervisor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnServiceLocations.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnServiceLocations.setText("SERVICE LOCATIONS");
        btnServiceLocations.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnServiceLocations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceLocationsActionPerformed(evt);
            }
        });
        add(btnServiceLocations);
        btnServiceLocations.setBounds(280, 280, 247, 42);

        btnBusinessCatalogue.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBusinessCatalogue.setText("BUSINESS CATALOGUE");
        btnBusinessCatalogue.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBusinessCatalogue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusinessCatalogueActionPerformed(evt);
            }
        });
        add(btnBusinessCatalogue);
        btnBusinessCatalogue.setBounds(280, 360, 247, 48);

        btnClients.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnClients.setText("CLIENT");
        btnClients.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientsActionPerformed(evt);
            }
        });
        add(btnClients);
        btnClients.setBounds(280, 530, 247, 43);

        lbleventadmin.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lbleventadmin.setText("EVENTS PLAN ADMIN");
        add(lbleventadmin);
        lbleventadmin.setBounds(200, 190, 425, 53);

        btnEventSupervisor.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnEventSupervisor.setText("BUSINESS SUPERVISOR");
        btnEventSupervisor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEventSupervisor.setMaximumSize(new java.awt.Dimension(225, 27));
        btnEventSupervisor.setMinimumSize(new java.awt.Dimension(225, 27));
        btnEventSupervisor.setPreferredSize(new java.awt.Dimension(225, 27));
        btnEventSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventSupervisorActionPerformed(evt);
            }
        });
        add(btnEventSupervisor);
        btnEventSupervisor.setBounds(280, 450, 247, 42);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/nishapatil/Downloads/N.jpeg")); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBusinessCatalogueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusinessCatalogueActionPerformed
        callOnCreateMethod2.run();

    }//GEN-LAST:event_btnBusinessCatalogueActionPerformed

    private void btnServiceLocationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceLocationsActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnServiceLocationsActionPerformed

    private void btnClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientsActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_btnClientsActionPerformed

    private void btnEventSupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventSupervisorActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_btnEventSupervisorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusinessCatalogue;
    private javax.swing.JButton btnClients;
    private javax.swing.JButton btnEventSupervisor;
    private javax.swing.JButton btnServiceLocations;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbleventadmin;
    // End of variables declaration//GEN-END:variables
}
