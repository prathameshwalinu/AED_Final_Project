package ui.ResortManagerRole;
/**
 *
 * @author prathmeshw
 */
import Model.*;
import Model.HallType.RoomType;
import Model.services.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SuperviseRoomPanel extends javax.swing.JPanel {

    private Admin Admin;
    private Runnable callOnCreateMethod;
    private ServiceLocation location;
    private String user;

    public SuperviseRoomPanel(Admin systemAdmin, Runnable callOnCreateMethod, ServiceLocation location, String user) {
        initComponents();

        this.user = user;
        this.Admin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.location = location;

        ServiceLocation location1 = systemAdmin.findServiceLocation(location.getName());
        List<Resort> list = location1.getBusinessCatalogueDirectory().getListOfResort();

        for (RoomType type : RoomType.values()) {
            roomTypeComboBox.addItem(type);
        }
        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        roomTypeComboBox = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Room cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(104, 137, 688, 203);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ROOM TYPE");
        add(jLabel1);
        jLabel1.setBounds(104, 413, 122, 22);

        roomTypeComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        roomTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeComboBoxActionPerformed(evt);
            }
        });
        add(roomTypeComboBox);
        roomTypeComboBox.setBounds(266, 414, 231, 23);

        backButton.setBackground(new java.awt.Color(204, 255, 255));
        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(27, 23, 124, 26);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MANAGE ROOMS");
        add(jLabel2);
        jLabel2.setBounds(274, 76, 404, 43);

        addButton.setBackground(new java.awt.Color(204, 255, 255));
        addButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(692, 411, 100, 26);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ResortManagerRole/hotel5.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, 0, 840, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        RoomType selectedItem = (RoomType) roomTypeComboBox.getSelectedItem();
        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        List<Resort> list = businessCatalogueDirectory.getListOfResort();

        for (int i = 0; i < list.size(); i++) {
            List<Supervisor> manager = list.get(i).getListOfSupervisor();
            for (int j = 0; j < manager.size(); j++) {
                if (manager.get(j).getUsername().equals(user)) {
                    HallRoomList roomList = list.get(i).getHallRoomListDirectory();
                    roomList.createHallRoom(selectedItem);
                    JOptionPane.showMessageDialog(this, "Room added successfully");

                    populateTable();
                    return;
                }
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void roomTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomTypeComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<RoomType> roomTypeComboBox;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        for (Resort resort : businessCatalogueDirectory.getListOfResort()) {
            for (Supervisor supr : resort.getListOfSupervisor()) {
                if (supr.getUsername().equals(user)) {
                    HallRoomList roomDirec = resort.getHallRoomListDirectory();
                    for (HallType room : roomDirec.getListOfHallRoom()) {
                        Object row[] = new Object[10];
                        row[0] = room.getRoomorHallNo();
                        row[1] = room.getHallRoomType().getName();
                        row[2] = room.getHallRoomType().getRate();
                        model.addRow(row);
                    }
                }
            }
        }
    }
}
