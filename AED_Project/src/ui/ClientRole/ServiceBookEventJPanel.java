package ui.ClientRole;

import Model.Admin;
import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;


import ui.main.DateUtils;

public class ServiceBookEventJPanel extends javax.swing.JPanel {

    private Admin systems;


    public ServiceBookEventJPanel(Admin systems) {
        initComponents();
        this.systems = systems;


        orgComboBox.addItem(null);

        setBackground(new java.awt.Color(255, 208, 56));
        backBtn.setBackground(new java.awt.Color(0, 102, 102));
        backBtn.setOpaque(true);
        totalPrice.setBackground(new java.awt.Color(0, 102, 102));
        totalPrice.setOpaque(true);
        bookEventBtn.setBackground(new java.awt.Color(0, 102, 102));
        bookEventBtn.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        backBtn = new javax.swing.JButton();
        lblbookservices = new javax.swing.JLabel();
        radioWedding = new javax.swing.JRadioButton();
        radioBirthdayParty = new javax.swing.JRadioButton();
        bookEventBtn = new javax.swing.JButton();
        cmbMeeting = new javax.swing.JComboBox();
        cmbWedding = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbBirthdayParty = new javax.swing.JComboBox();
        radioMeeting = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        orgComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        backBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        backBtn.setText("< BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        lblbookservices.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblbookservices.setText("BOOK EVENTS");

        radioWedding.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        radioWedding.setText("WEDDING");
        radioWedding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioWeddingActionPerformed(evt);
            }
        });

        radioBirthdayParty.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        radioBirthdayParty.setText("BIRTHDAY PARTY");
        radioBirthdayParty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBirthdayPartyActionPerformed(evt);
            }
        });

        bookEventBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        bookEventBtn.setText("BOOK EVENT");
        bookEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookEventBtnActionPerformed(evt);
            }
        });

        cmbMeeting.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        cmbWedding.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel5.setText("TYPE OF PACKAGE ");

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel1.setText("TYPE OF PACKAGE");

        cmbBirthdayParty.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbBirthdayParty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBirthdayPartyActionPerformed(evt);
            }
        });

        radioMeeting.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        radioMeeting.setText("MEETINGS");
        radioMeeting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMeetingActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel6.setText("TYPE OF PACKAGE");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setText("DATE ");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel4.setText("EVENT");

        totalPrice.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        totalPrice.setText("TOTAL PRICE");
        totalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(185, 185, 185)
                                .addComponent(orgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblbookservices, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(198, 226, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(radioBirthdayParty)
                                .addComponent(radioWedding)
                                .addComponent(radioMeeting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbWedding, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbBirthdayParty, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbMeeting, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(totalPrice)
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookEventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(205, 205, 205))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backBtn)
                .addGap(16, 16, 16)
                .addComponent(lblbookservices)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(orgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(radioWedding)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbWedding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(radioBirthdayParty)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbBirthdayParty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(radioMeeting)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMeeting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPrice))
                .addGap(52, 52, 52)
                .addComponent(bookEventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioWeddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioWeddingActionPerformed

    }//GEN-LAST:event_radioWeddingActionPerformed

    private void bookEventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookEventBtnActionPerformed

      
    }//GEN-LAST:event_bookEventBtnActionPerformed

    private void cmbBirthdayPartyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBirthdayPartyActionPerformed

    }//GEN-LAST:event_cmbBirthdayPartyActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
  
    }//GEN-LAST:event_backBtnActionPerformed

    private void radioBirthdayPartyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBirthdayPartyActionPerformed

    }//GEN-LAST:event_radioBirthdayPartyActionPerformed

    private void radioMeetingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMeetingActionPerformed

    }//GEN-LAST:event_radioMeetingActionPerformed

    private void totalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceActionPerformed

        
    }//GEN-LAST:event_totalPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookEventBtn;
    private javax.swing.JComboBox cmbBirthdayParty;
    private javax.swing.JComboBox cmbMeeting;
    private javax.swing.JComboBox cmbWedding;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JComboBox orgComboBox;
    private javax.swing.JTextField priceField;
    private javax.swing.JRadioButton radioBirthdayParty;
    private javax.swing.JRadioButton radioMeeting;
    private javax.swing.JRadioButton radioWedding;
    private javax.swing.JButton totalPrice;
    // End of variables declaration//GEN-END:variables
}
