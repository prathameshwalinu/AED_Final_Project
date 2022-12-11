package ui.EventPlannerAdminRole;
 /**
 *
 * @author prathmeshw
 */

import Model.*;
import Model.services.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ServiceLocationsJPanel extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod;

    public ServiceLocationsJPanel(Admin Admin, Runnable callOnCreateMethod) {
        this.callOnCreateMethod = callOnCreateMethod;
        this.Admin = Admin;
        initComponents();
        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLocation = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        lblServiceLocation = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        txtlocation = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(40, 22, 98, 38);

        tblLocation.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblLocation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SERVICE LOCATION NAME"
            }
        ));
        jScrollPane1.setViewportView(tblLocation);

        add(jScrollPane1);
        jScrollPane1.setBounds(233, 308, 397, 162);

        btnAdd.setBackground(new java.awt.Color(204, 255, 255));
        btnAdd.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(385, 219, 99, 39);

        lblServiceLocation.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblServiceLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblServiceLocation.setText("SERVICE LOCATIONS");
        add(lblServiceLocation);
        lblServiceLocation.setBounds(233, 79, 409, 43);

        lblLocation.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblLocation.setText("SERVICE LOCATION:");
        add(lblLocation);
        lblLocation.setBounds(233, 164, 211, 22);

        txtlocation.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(txtlocation);
        txtlocation.setBounds(450, 165, 180, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/EventPlannerAdminRole/client.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 830, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed
    public boolean validateName() {
        if (txtlocation.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input: name should contain only alphabets");
            return false;
        }
    }


    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name = txtlocation.getText();
        if (validateName()) {
            Admin.addLocation(name);
            JOptionPane.showMessageDialog(this, "Location added successfully");
            txtlocation.setText("");
            populateTable();
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblServiceLocation;
    private javax.swing.JTable tblLocation;
    private javax.swing.JTextField txtlocation;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblLocation.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        for (ServiceLocation location : Admin.getListOfServiceLocation()) {        //populate location
            row[0] = location.getName();
            model.addRow(row);
        }
    }
}
