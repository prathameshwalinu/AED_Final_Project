package ui.EntertainmentsupervisorRole;


public class EntertainmentSupervisorPanel extends javax.swing.JPanel {

    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;

    public EntertainmentSupervisorPanel() {
        initComponents();
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
       setBackground(new java.awt.Color(255, 208, 56));
        btnDisplayDashboard.setBackground(new java.awt.Color(0, 102, 102));
        btnDisplayDashboard.setOpaque(true);
        btnSuperviseEvent.setBackground(new java.awt.Color(0, 102, 102));
        btnSuperviseEvent.setOpaque(true);
        btnSuperviseEventAdmin.setBackground(new java.awt.Color(0, 102, 102));
        btnSuperviseEventAdmin.setOpaque(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDisplayDashboard = new javax.swing.JButton();
        btnSuperviseEvent = new javax.swing.JButton();
        btnSuperviseEventAdmin = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("ENTERTAINMENT SUPERVISOR PANEL ");

        btnDisplayDashboard.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnDisplayDashboard.setText("DISPLAY DASHBOARD");
        btnDisplayDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayDashboardActionPerformed(evt);
            }
        });

        btnSuperviseEvent.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnSuperviseEvent.setText("SUPERVISE EVENT");
        btnSuperviseEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuperviseEventActionPerformed(evt);
            }
        });

        btnSuperviseEventAdmin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSuperviseEventAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuperviseEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplayDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(btnDisplayDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnSuperviseEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnSuperviseEventAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(348, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisplayDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayDashboardActionPerformed
    }//GEN-LAST:event_btnDisplayDashboardActionPerformed

    private void btnSuperviseEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuperviseEventActionPerformed
    }//GEN-LAST:event_btnSuperviseEventActionPerformed

    private void btnSuperviseEventAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuperviseEventAdminActionPerformed
    }//GEN-LAST:event_btnSuperviseEventAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplayDashboard;
    private javax.swing.JButton btnSuperviseEvent;
    private javax.swing.JButton btnSuperviseEventAdmin;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
