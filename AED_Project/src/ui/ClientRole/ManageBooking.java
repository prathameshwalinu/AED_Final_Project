package ui.ClientRole;
/**
 *
 * @author prathmeshw
 */

import Model.*;
import Model.services.*;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ManageBooking extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod1;
    private Consumer<HallBooking> callOnAddServiceMethod;
    private Consumer<HallBooking> callOnViewServiceMethod;
    private String username;

    public ManageBooking(Admin Admin, Runnable callOnCreateMethod1, Consumer<HallBooking> callOnCreateMethod2, Consumer<HallBooking> callOnViewServiceMethod, String username) {
        initComponents();
        this.Admin = Admin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnAddServiceMethod = callOnCreateMethod2;
        this.callOnViewServiceMethod = callOnViewServiceMethod;
        this.username = username;

        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addServiceBtn = new javax.swing.JButton();
        viewOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BOOKING DETAILS");
        add(jLabel1);
        jLabel1.setBounds(370, 90, 357, 35);

        backBtn.setBackground(new java.awt.Color(204, 255, 255));
        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(30, 20, 80, 36);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RESORT NAME", "BOOKING ID", "PRICE", "STATUS", "CHECK_IN", "CHECK OUT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2);
        jScrollPane2.setBounds(130, 160, 810, 229);

        addServiceBtn.setBackground(new java.awt.Color(204, 255, 255));
        addServiceBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addServiceBtn.setText("ADD SERVICES");
        addServiceBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServiceBtnActionPerformed(evt);
            }
        });
        add(addServiceBtn);
        addServiceBtn.setBounds(680, 440, 258, 53);

        viewOrder.setBackground(new java.awt.Color(204, 255, 255));
        viewOrder.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewOrder.setText("VIEW SERVICE DETAILS");
        viewOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderActionPerformed(evt);
            }
        });
        add(viewOrder);
        viewOrder.setBounds(680, 520, 258, 53);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ClientRole/client.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1110, 750);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void addServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addServiceBtnActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to add services.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String bookingId = (String) model.getValueAt(selectedRowIndex, 1);

        System.out.println(bookingId + " is selected");

        ClientDirectory clientDirectory = Admin.getClientDirectory();
        Client client = clientDirectory.findClientUsername(username);

        List<HallBooking> list = client.getHallbookingList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(bookingId)) {
                callOnAddServiceMethod.accept(list.get(i));
                return;
            }
        }
    }//GEN-LAST:event_addServiceBtnActionPerformed

    private void viewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to view its details.");
            return;
        }
        String bookingId = (String) model.getValueAt(selectedRowIndex, 1);

        System.out.println(bookingId + " is selected");

        ClientDirectory clientDirectory = Admin.getClientDirectory();
        Client client = clientDirectory.findClientUsername(username);

        List<HallBooking> list = client.getHallbookingList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(bookingId)) {
                callOnViewServiceMethod.accept(list.get(i));
                return;
            }
        }
    }//GEN-LAST:event_viewOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addServiceBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton viewOrder;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        ClientDirectory clientDirectory = Admin.getClientDirectory();
        Client client = clientDirectory.findClientUsername(username);
        System.out.println("customer found is " + client.getName() + " username is " + username);
        for (HallBooking bookingList : client.getHallbookingList()) {
            row[0] = bookingList.getResortService().getBusinessCatalogue();
            row[1] = bookingList.getId();
            row[2] = bookingList.getTotalCost();
            row[3] = bookingList.getStatus();
            row[4] = bookingList.getCheckin();
            row[5] = bookingList.getCheckout();
            model.addRow(row);
        }

    }
}
