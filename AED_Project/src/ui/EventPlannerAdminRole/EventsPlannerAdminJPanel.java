package ui.EventPlannerAdminRole;

import java.awt.Color;


public class EventsPlannerAdminJPanel extends javax.swing.JPanel {

  
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;

    public EventsPlannerAdminJPanel( Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
      
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
        setBackground(new java.awt.Color(255, 208, 56));

        btnServiceLocations.setBackground(new java.awt.Color(0, 102, 102));
        btnServiceLocations.setOpaque(true);
        btnClients.setBackground(new java.awt.Color(0, 102, 102));
        btnClients.setOpaque(true);
        btnEventSupervisor.setBackground(new java.awt.Color(0, 102, 102));
        btnEventSupervisor.setOpaque(true);
        btnBusinessCatalogue.setBackground(new java.awt.Color(0, 102, 102));
        btnBusinessCatalogue.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnServiceLocations = new javax.swing.JButton();
        btnBusinessCatalogue = new javax.swing.JButton();
        btnClients = new javax.swing.JButton();
        lbleventadmin = new javax.swing.JLabel();
        btnEventSupervisor = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnServiceLocations.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnServiceLocations.setText("SERVICE LOCATIONS");
        btnServiceLocations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceLocationsActionPerformed(evt);
            }
        });

        btnBusinessCatalogue.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnBusinessCatalogue.setText("BUSINESS CATALOGUE");
        btnBusinessCatalogue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusinessCatalogueActionPerformed(evt);
            }
        });

        btnClients.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnClients.setText("CLIENT");
        btnClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientsActionPerformed(evt);
            }
        });

        lbleventadmin.setFont(new java.awt.Font("Academy Engraved LET", 0, 36)); // NOI18N
        lbleventadmin.setText("EVENTS PLAN ADMIN");

        btnEventSupervisor.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnEventSupervisor.setText("BUSINESS SUPERVISOR");
        btnEventSupervisor.setMaximumSize(new java.awt.Dimension(225, 27));
        btnEventSupervisor.setMinimumSize(new java.awt.Dimension(225, 27));
        btnEventSupervisor.setPreferredSize(new java.awt.Dimension(225, 27));
        btnEventSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventSupervisorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbleventadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBusinessCatalogue, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnServiceLocations, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEventSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClients, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(386, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbleventadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnServiceLocations, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnBusinessCatalogue, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnEventSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnClients, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
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
    private javax.swing.JLabel lbleventadmin;
    // End of variables declaration//GEN-END:variables
}
