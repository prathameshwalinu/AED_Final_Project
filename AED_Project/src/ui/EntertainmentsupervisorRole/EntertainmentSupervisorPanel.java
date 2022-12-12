package ui.EntertainmentsupervisorRole;

/**
 *
 * @author nishapatil
 */

import Model.*;
import Model.services.*;

public class EntertainmentSupervisorPanel extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;

    public EntertainmentSupervisorPanel(Admin Admin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3) {
        initComponents();
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDisplayDashboard = new javax.swing.JButton();
        btnSuperviseEvent = new javax.swing.JButton();
        btnSuperviseEventAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTERTAINMENT SUPERVISOR PANEL ");
        add(jLabel1);
        jLabel1.setBounds(67, 116, 708, 43);

        btnDisplayDashboard.setBackground(new java.awt.Color(153, 153, 255));
        btnDisplayDashboard.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnDisplayDashboard.setText("DISPLAY DASHBOARD");
        btnDisplayDashboard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDisplayDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayDashboardActionPerformed(evt);
            }
        });
        add(btnDisplayDashboard);
        btnDisplayDashboard.setBounds(264, 299, 301, 42);

        btnSuperviseEvent.setBackground(new java.awt.Color(153, 153, 255));
        btnSuperviseEvent.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnSuperviseEvent.setText("SUPERVISE EVENT");
        btnSuperviseEvent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuperviseEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuperviseEventActionPerformed(evt);
            }
        });
        add(btnSuperviseEvent);
        btnSuperviseEvent.setBounds(264, 359, 301, 45);

        btnSuperviseEventAdmin.setBackground(new java.awt.Color(153, 153, 255));
        btnSuperviseEventAdmin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnSuperviseEventAdmin.setText("SUPERVISE EVENT ADMIN");
        btnSuperviseEventAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuperviseEventAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuperviseEventAdminActionPerformed(evt);
            }
        });
        add(btnSuperviseEventAdmin);
        btnSuperviseEventAdmin.setBounds(264, 422, 301, 44);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/EntertainmentsupervisorRole/entertainmentfinal.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 860, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisplayDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayDashboardActionPerformed
                 callOnCreateMethod1.run();
    }//GEN-LAST:event_btnDisplayDashboardActionPerformed

    private void btnSuperviseEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuperviseEventActionPerformed
         callOnCreateMethod2.run();
    }//GEN-LAST:event_btnSuperviseEventActionPerformed

    private void btnSuperviseEventAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuperviseEventAdminActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_btnSuperviseEventAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplayDashboard;
    private javax.swing.JButton btnSuperviseEvent;
    private javax.swing.JButton btnSuperviseEventAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
