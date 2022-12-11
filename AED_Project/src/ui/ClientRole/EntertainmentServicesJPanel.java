package ui.ClientRole;
/**
 *
 * @author prathmeshw
 */

import Model.*;
import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import Model.services.*;
import ui.main.DateUtils;

public class EntertainmentServicesJPanel extends javax.swing.JPanel {

    private Admin systems;
    private Consumer<HallBooking> callOnCreateMethod1;
    private String username;
    private HallBooking booking;

    public EntertainmentServicesJPanel(Admin systems, Consumer<HallBooking> callOnCreateMethod1, String username, HallBooking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;

        for (Entertainment entertain : booking.getServiceLocation().getBusinessCatalogueDirectory().getListOfEntertainment()) {
            cmbEntertainment.addItem(entertain);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbookservices = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        btnDance = new javax.swing.JCheckBox();
        btnMusic = new javax.swing.JCheckBox();
        btnShow = new javax.swing.JCheckBox();
        addServiceBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbEntertainment = new javax.swing.JComboBox();
        dateField = new org.netbeans.modules.form.InvalidComponent();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        lblbookservices.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblbookservices.setForeground(new java.awt.Color(255, 255, 255));
        lblbookservices.setText("ENTERTAINMENT SERVICES");
        add(lblbookservices);
        lblbookservices.setBounds(214, 115, 531, 44);

        backBtn.setBackground(new java.awt.Color(153, 153, 255));
        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(31, 27, 108, 36);

        btnDance.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnDance.setForeground(new java.awt.Color(255, 255, 255));
        btnDance.setText("DANCE ($100)");
        btnDance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanceActionPerformed(evt);
            }
        });
        add(btnDance);
        btnDance.setBounds(241, 353, 156, 26);

        btnMusic.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnMusic.setForeground(new java.awt.Color(255, 255, 255));
        btnMusic.setText("MUSIC ($150)");
        btnMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicActionPerformed(evt);
            }
        });
        add(btnMusic);
        btnMusic.setBounds(241, 419, 149, 26);

        btnShow.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnShow.setForeground(new java.awt.Color(255, 255, 255));
        btnShow.setText("SHOWS  ($300)");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });
        add(btnShow);
        btnShow.setBounds(241, 483, 162, 26);

        addServiceBtn.setBackground(new java.awt.Color(153, 153, 255));
        addServiceBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addServiceBtn.setText("ADD SERVICE");
        addServiceBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServiceBtnActionPerformed(evt);
            }
        });
        add(addServiceBtn);
        addServiceBtn.setBounds(708, 665, 136, 43);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("(MONDAY-SUNDAY) 7A.M - 9A.M");
        add(jLabel3);
        jLabel3.setBounds(483, 359, 227, 17);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("(MONDAY-SUNDAY) 4P.M-5:30P.M ");
        add(jLabel5);
        jLabel5.setBounds(483, 425, 241, 17);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(MONDAY - SUNDAY) 12P.M-4P.M ");
        add(jLabel6);
        jLabel6.setBounds(483, 490, 205, 17);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SELECT A DATE :");
        add(jLabel7);
        jLabel7.setBounds(241, 224, 152, 22);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ENTERTAINMENT:");
        add(jLabel4);
        jLabel4.setBounds(241, 276, 182, 27);

        cmbEntertainment.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(cmbEntertainment);
        cmbEntertainment.setBounds(483, 279, 241, 23);
        add(dateField);
        dateField.setBounds(483, 224, 211, 19);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ClientRole/entertainmentfinal.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowActionPerformed

    private void addServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addServiceBtnActionPerformed

        Entertainment entertain = (Entertainment) cmbEntertainment.getSelectedItem();
        if (entertain == null) {
            JOptionPane.showMessageDialog(this, "Please select a Entertainment menu from the dropdown.");
            return;
        }
        Date date = DateUtils.formatDate(dateField.getDate());
        Date checkin = booking.getCheckin();
        Date checkout = booking.getCheckout();

        if (date.compareTo(checkin) < 0 || date.compareTo(checkout) > 0) {
            JOptionPane.showMessageDialog(this, "Selected date should be within check-in date (" + checkin
                    + ") and checkout date (" + checkout + ")");
            return;
        }

        boolean danceBtnSelected = btnDance.isSelected();
        boolean musicRadioBtnSelected = btnMusic.isSelected();
        boolean showRadioBtnSelected = btnShow.isSelected();

        if (!danceBtnSelected && !musicRadioBtnSelected && !showRadioBtnSelected) {
            JOptionPane.showMessageDialog(this, "Please select at least one service for Health Club.");
            return;
        }

        EntertainmentService entertainmentService = new EntertainmentService(entertain, date);
        if (danceBtnSelected) {
            entertainmentService.addService(EntertainmentService.EntertainmentServiceType.CHOREOGRAPHY);
        }

        if (musicRadioBtnSelected) {
            entertainmentService.addService(EntertainmentService.EntertainmentServiceType.SINGER);
        }

        if (showRadioBtnSelected) {
            entertainmentService.addService(EntertainmentService.EntertainmentServiceType.MAGICIAN);
        }

        booking.addService(entertainmentService);
        JOptionPane.showMessageDialog(this, "Your Entertainment appointment is booked for " + date);
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_addServiceBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnDanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanceActionPerformed

    }//GEN-LAST:event_btnDanceActionPerformed

    private void btnMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMusicActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addServiceBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JCheckBox btnDance;
    private javax.swing.JCheckBox btnMusic;
    private javax.swing.JCheckBox btnShow;
    private javax.swing.JComboBox cmbEntertainment;
    private org.netbeans.modules.form.InvalidComponent dateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblbookservices;
    // End of variables declaration//GEN-END:variables
}
