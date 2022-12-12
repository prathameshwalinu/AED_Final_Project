package ui.ResortManagerRole;
/**
 *
 * @author prathmeshw
 */
import Model.*;
import Model.services.*;

public class ResortMainPanel extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;

    public ResortMainPanel(Admin Admin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
        this.Admin = Admin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblsysadmin = new javax.swing.JLabel();
        orgAdminBtn = new javax.swing.JButton();
        orgBtn = new javax.swing.JButton();
        viewTask = new javax.swing.JButton();
        manageRooms = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        lblsysadmin.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblsysadmin.setForeground(new java.awt.Color(255, 255, 255));
        lblsysadmin.setText("RESORT SUPERVISOR");
        add(lblsysadmin);
        lblsysadmin.setBounds(260, 90, 410, 40);

        orgAdminBtn.setBackground(new java.awt.Color(204, 255, 255));
        orgAdminBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        orgAdminBtn.setText("ORGANIZATION ADMIN");
        orgAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgAdminBtnActionPerformed(evt);
            }
        });
        add(orgAdminBtn);
        orgAdminBtn.setBounds(310, 320, 300, 40);

        orgBtn.setBackground(new java.awt.Color(204, 255, 255));
        orgBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        orgBtn.setText("SUPERVISE ORGANIZATION ");
        orgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgBtnActionPerformed(evt);
            }
        });
        add(orgBtn);
        orgBtn.setBounds(310, 260, 300, 40);

        viewTask.setBackground(new java.awt.Color(204, 255, 255));
        viewTask.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewTask.setText("TASK DASHBOARD");
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });
        add(viewTask);
        viewTask.setBounds(310, 200, 300, 40);

        manageRooms.setBackground(new java.awt.Color(204, 255, 255));
        manageRooms.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        manageRooms.setText("SUPERVISE RESORT");
        manageRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRoomsActionPerformed(evt);
            }
        });
        add(manageRooms);
        manageRooms.setBounds(310, 380, 300, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ResortManagerRole/hotel5.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 730);
    }// </editor-fold>//GEN-END:initComponents

    private void orgAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgAdminBtnActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_orgAdminBtnActionPerformed

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_viewTaskActionPerformed

    private void orgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgBtnActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_orgBtnActionPerformed

    private void manageRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRoomsActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_manageRoomsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JButton manageRooms;
    private javax.swing.JButton orgAdminBtn;
    private javax.swing.JButton orgBtn;
    private javax.swing.JButton viewTask;
    // End of variables declaration//GEN-END:variables
}
