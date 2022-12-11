/**
 *
 * @author Himanshu
 */

package ui.EntertainmentsupervisorRole;

import Model.Admin;

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
        
//        setBackground(new java.awt.Color(255, 208, 56));
//        btnDisplayDash.setBackground(new java.awt.Color(0, 102, 102));
//        btnDisplayDash.setOpaque(true);
//        btnSuperviseEvent.setBackground(new java.awt.Color(0, 102, 102));
//        btnSuperviseEvent.setOpaque(true);
//        btnSuperviseEventAdmin.setBackground(new java.awt.Color(0, 102, 102));
//        btnSuperviseEventAdmin.setOpaque(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDisplayDash = new javax.swing.JButton();
        btnSuperviseEvent = new javax.swing.JButton();
        btnSuperviseEventAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("ENTERTAINMENT SUPERVISOR PANEL ");
        add(jLabel1);
        jLabel1.setBounds(76, 114, 708, 43);

        btnDisplayDash.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnDisplayDash.setText("DISPLAY DASHBOARD");
        btnDisplayDash.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDisplayDash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayDashActionPerformed(evt);
            }
        });
        add(btnDisplayDash);
        btnDisplayDash.setBounds(301, 220, 301, 42);

        btnSuperviseEvent.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnSuperviseEvent.setText("SUPERVISE EVENT");
        btnSuperviseEvent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuperviseEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuperviseEventActionPerformed(evt);
            }
        });
        add(btnSuperviseEvent);
        btnSuperviseEvent.setBounds(301, 303, 301, 45);

        btnSuperviseEventAdmin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnSuperviseEventAdmin.setText("SUPERVISE EVENT ADMIN");
        btnSuperviseEventAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuperviseEventAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuperviseEventAdminActionPerformed(evt);
            }
        });
        add(btnSuperviseEventAdmin);
        btnSuperviseEventAdmin.setBounds(301, 387, 301, 44);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/nishapatil/Downloads/lights.jpeg")); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 860, 580);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisplayDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayDashActionPerformed
 
            callOnCreateMethod1.run();
            
    }//GEN-LAST:event_btnDisplayDashActionPerformed

    private void btnSuperviseEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuperviseEventActionPerformed
           
        callOnCreateMethod2.run();

    }//GEN-LAST:event_btnSuperviseEventActionPerformed

    private void btnSuperviseEventAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuperviseEventAdminActionPerformed
 
        callOnCreateMethod3.run();
    }//GEN-LAST:event_btnSuperviseEventAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplayDash;
    private javax.swing.JButton btnSuperviseEvent;
    private javax.swing.JButton btnSuperviseEventAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
