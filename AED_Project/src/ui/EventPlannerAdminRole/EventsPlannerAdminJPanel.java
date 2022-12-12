package ui.EventPlannerAdminRole;
/**
 *
 * @author himanshu
 */

import Model.*;
import Model.services.*;
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

        btnServiceLocations.setBackground(new java.awt.Color(255, 255, 204));
        btnServiceLocations.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnServiceLocations.setText("MANAGE LOCATIONS");
        btnServiceLocations.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnServiceLocations.setOpaque(true);
        btnServiceLocations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceLocationsActionPerformed(evt);
            }
        });
        add(btnServiceLocations);
        btnServiceLocations.setBounds(400, 290, 247, 42);

        btnBusinessCatalogue.setBackground(new java.awt.Color(255, 255, 204));
        btnBusinessCatalogue.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBusinessCatalogue.setText("ENTERPRISE CATALOGUE");
        btnBusinessCatalogue.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBusinessCatalogue.setOpaque(true);
        btnBusinessCatalogue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusinessCatalogueActionPerformed(evt);
            }
        });
        add(btnBusinessCatalogue);
        btnBusinessCatalogue.setBounds(400, 370, 247, 48);

        btnClients.setBackground(new java.awt.Color(255, 255, 204));
        btnClients.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnClients.setText("CLIENT ADMIN");
        btnClients.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClients.setOpaque(true);
        btnClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientsActionPerformed(evt);
            }
        });
        add(btnClients);
        btnClients.setBounds(400, 560, 247, 43);

        lbleventadmin.setBackground(new java.awt.Color(255, 255, 255));
        lbleventadmin.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lbleventadmin.setForeground(new java.awt.Color(255, 255, 204));
        lbleventadmin.setText("EVENT PLANNER ADMIN");
        add(lbleventadmin);
        lbleventadmin.setBounds(230, 130, 486, 53);

        btnEventSupervisor.setBackground(new java.awt.Color(255, 255, 204));
        btnEventSupervisor.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnEventSupervisor.setText("ENTERPRISE ADMIN");
        btnEventSupervisor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEventSupervisor.setMaximumSize(new java.awt.Dimension(225, 27));
        btnEventSupervisor.setMinimumSize(new java.awt.Dimension(225, 27));
        btnEventSupervisor.setOpaque(true);
        btnEventSupervisor.setPreferredSize(new java.awt.Dimension(225, 27));
        btnEventSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventSupervisorActionPerformed(evt);
            }
        });
        add(btnEventSupervisor);
        btnEventSupervisor.setBounds(400, 470, 247, 42);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/EventPlannerAdminRole/N.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1110, 790);
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
