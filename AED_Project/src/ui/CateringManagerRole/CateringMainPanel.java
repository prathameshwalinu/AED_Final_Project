package ui.CateringManagerRole;



public class CateringMainPanel extends javax.swing.JPanel {

;

    public CateringMainPanel() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewTask = new javax.swing.JButton();
        orgButton = new javax.swing.JButton();
        orgAdminBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addMenu = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        viewTask.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewTask.setText("VIEW ORDERS");
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });

        orgButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        orgButton.setText("MANAGE ORGANIZATION");
        orgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgButtonActionPerformed(evt);
            }
        });

        orgAdminBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        orgAdminBtn.setText("MANAGE ORGANIZATION ADMIN");
        orgAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgAdminBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("RESTAURANT MANAGER PANEL");

        addMenu.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addMenu.setText("ADD MENU ");
        addMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orgButton, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewTask, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orgAdminBtn)
                            .addComponent(addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(260, 260, 260))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addComponent(viewTask)
                .addGap(30, 30, 30)
                .addComponent(orgButton)
                .addGap(26, 26, 26)
                .addComponent(orgAdminBtn)
                .addGap(26, 26, 26)
                .addComponent(addMenu)
                .addContainerGap(308, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskActionPerformed
        
    }//GEN-LAST:event_viewTaskActionPerformed

    private void orgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgButtonActionPerformed
     
    }//GEN-LAST:event_orgButtonActionPerformed

    private void orgAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgAdminBtnActionPerformed
        
    }//GEN-LAST:event_orgAdminBtnActionPerformed

    private void addMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuActionPerformed
       
    }//GEN-LAST:event_addMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton orgAdminBtn;
    private javax.swing.JButton orgButton;
    private javax.swing.JButton viewTask;
    // End of variables declaration//GEN-END:variables
}