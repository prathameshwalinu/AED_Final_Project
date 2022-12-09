package ui.EventPlannerAdminRole;

import Model.Admin;
import Model.ServiceLocation;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ServiceLocationsJPanel extends javax.swing.JPanel {

    private Admin EPAdmin;
    private Runnable callOnCreateMethod;

    public ServiceLocationsJPanel( Admin EPAdmin, Runnable callOnCreateMethod) {
      
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        initComponents();
        
        populateTable();
        
        setBackground(new java.awt.Color(255, 208, 56));
         btnBack.setBackground(new java.awt.Color(0, 102, 102));
         btnBack.setOpaque(true);
         btnAdd.setBackground(new java.awt.Color(0, 102, 102));
         btnAdd.setOpaque(true);
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

        setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblLocation.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        tblLocation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SERVICE LOCATION NAME"
            }
        ));
        jScrollPane1.setViewportView(tblLocation);

        btnAdd.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblServiceLocation.setFont(new java.awt.Font("Academy Engraved LET", 0, 36)); // NOI18N
        lblServiceLocation.setText("SERVICE LOCATIONS");

        lblLocation.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        lblLocation.setText("SERVICE LOCATION:");

        txtlocation.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtlocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlocationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnBack)
                        .addGap(147, 147, 147)
                        .addComponent(lblServiceLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(263, 310, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblServiceLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );
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
            EPAdmin.addLocation(name);
            JOptionPane.showMessageDialog(this, "Location added successfully");
            txtlocation.setText("");
            populateTable();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtlocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlocationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
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
        for (ServiceLocation location : EPAdmin.getListOfServiceLocation()) {        //populate location
            row[0] = location.getName();
            model.addRow(row);
        }
    }
}
