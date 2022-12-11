package ui.confirm;
/**
 *
 * @author himanshu
 */
import javax.swing.table.DefaultTableModel;
import Model.HallBooking;
import Model.Client;
import Model.ClientDirectory;
import Model.Supervisor;
import Model.Organization;
import Model.Admin;
import Model.services.Service;

public class WorkRequestsForEventPanel extends javax.swing.JPanel {

    private Admin Admin;
    private String user;
    private String type;

    public WorkRequestsForEventPanel(Admin Admin, String user, String type) {
        initComponents();
        this.Admin = Admin;
        this.user = user;
        this.type = type;
        lblbookservices.setText(lblbookservices.getText() + type.toUpperCase() + " ORGANIZATION");
        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbookservices = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        lblbookservices.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblbookservices.setText("ASSIGNED WORK REQUESTS  ");

        jTable1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER ID", "BOOKING ID", "HOTEL NAME", "DATE", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(lblbookservices)))
                .addContainerGap(343, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblbookservices)
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(449, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblbookservices;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        ClientDirectory clientDirectory = Admin.getClientDirectory();
        for (Client client : clientDirectory.getListOfClientDirectory()) {
            for (HallBooking booking : client.getHallbookingList()) {
                for (Service service : booking.getServices()) {
                    for (Organization org : service.getListOfOrganization()) {
                        for (Supervisor man : org.getListOfSupervisor()) {
                            if (man.getUsername().equals(user)) {
                                Object row[] = new Object[5];
                                row[0] = client.getUserName();
                                row[1] = booking.getId();
                                row[2] = booking.getResortService().getBusinessCatalogue().getName();
                                row[3] = service.getDate();
                                row[4] = service.getStatus();

                                model.addRow(row);
                            }

                            System.out.println();
                        }
                    }
                }
            }
        }

    }
}
