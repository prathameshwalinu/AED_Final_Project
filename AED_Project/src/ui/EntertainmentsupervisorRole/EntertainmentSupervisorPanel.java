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

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        jLabel1.setText("ENTERTAINMENT SUPERVISOR PANEL ");

        btnDisplayDashboard.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnDisplayDashboard.setText("DISPLAY DASHBOARD");
        btnDisplayDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayDashboardActionPerformed(evt);
            }
        });

        btnSuperviseEvent.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnSuperviseEvent.setText("SUPERVISE EVENT");
        btnSuperviseEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuperviseEventActionPerformed(evt);
            }
        });

        btnSuperviseEventAdmin.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnSuperviseEventAdmin.setText("SUPERVISE EVENT ADMIN");
        btnSuperviseEventAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuperviseEventAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addComponent(btnSuperviseEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSuperviseEventAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDisplayDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(btnDisplayDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnSuperviseEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnSuperviseEventAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );
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
    // End of variables declaration//GEN-END:variables
}
