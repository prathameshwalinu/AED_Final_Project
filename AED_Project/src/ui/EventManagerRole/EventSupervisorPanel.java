package ui.EventManagerRole;

import Model.Admin;

public class EventSupervisorPanel extends javax.swing.JPanel {

    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Admin systemAdmin;
    
    public EventSupervisorPanel( Admin systemAdmin,Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3) {
        initComponents();
        
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
//        setBackground(new java.awt.Color(255, 208, 56));
//        viewTask.setBackground(new java.awt.Color(0, 102, 102));
//        viewTask.setOpaque(true);
//        orgBtn.setBackground(new java.awt.Color(0, 102, 102));
//        orgBtn.setOpaque(true);
//        orgadmin.setBackground(new java.awt.Color(0, 102, 102));
//        orgadmin.setOpaque(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orgBtn = new javax.swing.JButton();
        viewTask = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        orgadmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        orgBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        orgBtn.setText("MANAGE ORGANISATION");
        orgBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        orgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgBtnActionPerformed(evt);
            }
        });
        add(orgBtn);
        orgBtn.setBounds(295, 269, 302, 40);

        viewTask.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewTask.setText("DISPLAY");
        viewTask.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });
        add(viewTask);
        viewTask.setBounds(295, 194, 302, 39);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("EVENT SUPERVISOR PANEL ");
        add(jLabel1);
        jLabel1.setBounds(203, 110, 508, 43);

        orgadmin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        orgadmin.setText("MANAGE ORGANISATION ADMIN");
        orgadmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        orgadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgadminActionPerformed(evt);
            }
        });
        add(orgadmin);
        orgadmin.setBounds(295, 348, 302, 41);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/nishapatil/Downloads/N.jpeg")); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 880, 570);
    }// </editor-fold>//GEN-END:initComponents

    private void orgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgBtnActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_orgBtnActionPerformed

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_viewTaskActionPerformed

    private void orgadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgadminActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_orgadminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton orgBtn;
    private javax.swing.JButton orgadmin;
    private javax.swing.JButton viewTask;
    // End of variables declaration//GEN-END:variables
}
