package ui.main;

import Database.DbUtils;
import Model.Admin;
import Model.BusinessCatalogue;
import Model.Catering;
import Model.Client;
import Model.Entertainment;
import Model.Events;
import Model.HallBooking;
import Model.Resort;
import Model.ServiceLocation;
import Model.Supervisor;
import java.util.List;
import javax.swing.JOptionPane;
import ui.CateringManagerRole.AddOrderJPanel;
import ui.CateringManagerRole.CateringMainPanel;
import ui.CateringManagerRole.ManageOrgAdminForCatering;
import ui.CateringManagerRole.ManageOrgPanelForCatering;
import ui.CateringManagerRole.ViewTaskPanelCatering;
import ui.ClientRole.AddServiceJPanel;
import ui.ClientRole.CateringServicePanel;
import ui.ClientRole.ClientJPanel;
import ui.ClientRole.EntertainmentServicesJPanel;
import ui.ClientRole.ManageBooking;
import ui.ClientRole.OtherServicePanel;
import ui.ClientRole.ReportServiceDetailsPanel;
import ui.ClientRole.ResortBookingServicesJPanel;
import ui.ClientRole.ServiceBookEventJPanel;
import ui.EntertainmentsupervisorRole.DisplayDashboardPanel;
import ui.EntertainmentsupervisorRole.EntertainmentSupervisorPanel;
import ui.EntertainmentsupervisorRole.OrganizationAdminPanel;
import ui.EntertainmentsupervisorRole.SuperviseOrganizationPanel;
import ui.EventManagerRole.DisplayEventPanel;
import ui.EventManagerRole.EventSupervisorPanel;
import ui.EventManagerRole.SuperviseAdminEventOrganisation;
import ui.EventManagerRole.SuperviseEventOrg;
import ui.EventPlannerAdminRole.BusinessCatalogueJPanel;
import ui.EventPlannerAdminRole.BusinessCatalogueSupervisorJPanel;
import ui.EventPlannerAdminRole.EventsPlannerAdminJPanel;
import ui.EventPlannerAdminRole.ManageClientJPanel;
import ui.EventPlannerAdminRole.ServiceLocationsJPanel;
import ui.ResortManagerRole.DisplayOrderForResort;
import ui.ResortManagerRole.ResortMainPanel;
import ui.ResortManagerRole.SuperviseAdminOrgForResort;
import ui.ResortManagerRole.SuperviseOrgForResort;
import ui.ResortManagerRole.SuperviseRoomPanel;
import ui.confirm.WorkRequestsForEventPanel;



public class MainJFrame extends javax.swing.JFrame {


    private String userName;
    private String password;
    private Admin Admin;

    public MainJFrame() {
        initComponents();
        setExtendedState(MainJFrame.MAXIMIZED_BOTH);
        this.Admin = DbUtils.getInstance().retrieveSystem();
        logoutBtn.setEnabled(false);
        //ControlPanel.setBackground(new java.awt.Color(0, 102, 102));
        //WorkArea.setBackground(new java.awt.Color(255, 208, 56));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        ControlPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        WorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlPanel.setPreferredSize(new java.awt.Dimension(160, 813));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel1.setText("USERNAME :");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel2.setText("PASSWORD :");

        loginBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField)
                            .addComponent(passwordField)))
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(loginBtn)
                .addGap(31, 31, 31)
                .addComponent(logoutBtn)
                .addContainerGap(395, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(ControlPanel);

        javax.swing.GroupLayout WorkAreaLayout = new javax.swing.GroupLayout(WorkArea);
        WorkArea.setLayout(WorkAreaLayout);
        WorkAreaLayout.setHorizontalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1199, Short.MAX_VALUE)
        );
        WorkAreaLayout.setVerticalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        this.userName = usernameField.getText();
        this.password = passwordField.getText();

        if (Admin.validateUserNamePassword(userName, password)) {
            String type = Admin.findUserType(userName);

            switch (type) {
                case "admin":
                EventsPlannerAdminJPanel systemAdministration = new EventsPlannerAdminJPanel(Admin, this::renderNetworkPanel, this::renderEnterprisePanel, this::renderManagerPanel, this::renderCustomerPanel);
                jSplitPane.setRightComponent(systemAdministration);
                break;

                case "Client":
                renderClient(userName);
                break;

                case "Entertainment":
                renderEntertainmentManager(userName);
                break;

                case "Catering":
                renderCateringManager(userName);
                break;

                case "Resort":
                resortSupervisorPanel();
                break;

                case "Event":
                eventManagerPanel();
                break;
                case "BirthdayParty":
                WorkRequestForEvent();
                break;
                case "Meeting":
                WorkRequestForEvent();
                break;
                case "Wedding":
                WorkRequestForEvent();
                break;
                case "ServiceAgent":
                WorkRequestForEvent();
                break;
                case "TourGuide":
                WorkRequestForEvent();
                break;
                case "CarService":
                WorkRequestForEvent();
                break;
                case "Magician":
                WorkRequestForEvent();
                break;
                case "Singer":
                WorkRequestForEvent();
                break;
                case "Choreographer":
                WorkRequestForEvent();
                break;
                default:
                JOptionPane.showMessageDialog(this, "Type not supported.");
                return;
            }
            usernameField.setText("");
            passwordField.setText("");
            loginBtn.setEnabled(false);
            logoutBtn.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password");
        }

    }//GEN-LAST:event_loginBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        System.out.println("Logout called.");
//        DbUtils.getInstance().storeSystem(Admin);
        jSplitPane.setRightComponent(WorkArea);
        loginBtn.setEnabled(true);
        logoutBtn.setEnabled(false);
        usernameField.setText("");
        passwordField.setText("");
        System.out.println("Logout success.");
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void renderNetworkPanel() {
        ServiceLocationsJPanel network1 = new ServiceLocationsJPanel(Admin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(network1);
    }

    private void renderEnterprisePanel() {
        BusinessCatalogueJPanel enterprise = new BusinessCatalogueJPanel(Admin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(enterprise);
    }

    private void renderCustomerPanel() {
        ManageClientJPanel customer = new ManageClientJPanel(Admin, this ::renderSystemAdminPanel);
        jSplitPane.setRightComponent(customer);
    }

    private void renderManagerPanel() {
        BusinessCatalogueSupervisorJPanel manager = new BusinessCatalogueSupervisorJPanel(Admin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(manager);
    }

    private void renderSystemAdminPanel() {
        jSplitPane.setRightComponent(new EventsPlannerAdminJPanel(Admin, this::renderNetworkPanel, this::renderEnterprisePanel, this::renderManagerPanel, this::renderCustomerPanel));
    }

    private void renderClient(String username) {
        Client client = Admin.getClientDirectory().findClientUsername(username);
        ClientJPanel clientPanel = new ClientJPanel(Admin, this::renderBookHallRoomPanel, this::manageBooking);
        jSplitPane.setRightComponent(clientPanel);
    }

    private void renderBookHallRoomPanel() {
        ResortBookingServicesJPanel bookrhalloomPanel = new ResortBookingServicesJPanel(Admin, this::manageClientPanel, userName);
        jSplitPane.setRightComponent(bookrhalloomPanel);
    }

    private void manageBooking() {
        ManageBooking manageBookingPanel = new ManageBooking(Admin, this::manageClientPanel, this::addServices, this::viewService, userName);
        jSplitPane.setRightComponent(manageBookingPanel);
    }

    private void manageClientPanel() {
        jSplitPane.setRightComponent(new ClientJPanel(Admin, this::renderBookHallRoomPanel, this::manageBooking));
    }

    private void addServices(HallBooking booking) {
        AddServiceJPanel service = new AddServiceJPanel(Admin, this::bookEvent, this::placeOrder, this::healthPanel,
                this::resortService, this::manageBooking, userName, booking);
        jSplitPane.setRightComponent(service);
    }

    private void bookEvent(HallBooking booking) {
        ServiceBookEventJPanel event = new ServiceBookEventJPanel(Admin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(event);
    }

    private void placeOrder(HallBooking booking) {           //customer order from catering
        CateringServicePanel order = new CateringServicePanel(Admin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(order);
    }

    private void healthPanel(HallBooking booking) {             // healthclub panel for client
        EntertainmentServicesJPanel healthClub = new EntertainmentServicesJPanel(Admin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(healthClub);
    }

    private void resortService(HallBooking booking) {    //laundary and transport service panel fpr client
        OtherServicePanel resortPanel = new OtherServicePanel(Admin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(resortPanel);
    }

    private void viewService(HallBooking booking) {
        ReportServiceDetailsPanel viewService = new ReportServiceDetailsPanel(Admin, this::manageBooking, userName, booking);
        jSplitPane.setRightComponent(viewService);
    }

    private void renderEntertainmentManager(String username) {
        List<ServiceLocation> location = Admin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<Entertainment> entertainment = location.get(i).getBusinessCatalogueDirectory().getListOfEntertainment();
            for (int j = 0; j < entertainment.size(); j++) {
                List<Supervisor> supervisor = entertainment.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(username)) {
                        EntertainmentSupervisorPanel entertainmentSupervisorPanel = new EntertainmentSupervisorPanel(Admin, this::viewTaskPanel, this::createOrganization,this::organizationAdminPanel);                                          
                                jSplitPane.setRightComponent(entertainmentSupervisorPanel);

                    }
                }
            }
        }
    }

    private ServiceLocation findUserNetworkForHealthClub() {
        List<ServiceLocation> location = Admin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<Entertainment> entertainment = location.get(i).getBusinessCatalogueDirectory().getListOfEntertainment();
            for (int j = 0; j < entertainment.size(); j++) {
                List<Supervisor> supervisor = entertainment.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        return location.get(i);

                    }
                }
            }
        }
        return null;
    }

    private BusinessCatalogue findUserHealthClub() {
        List<ServiceLocation> location = Admin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<Entertainment> entertainment = location.get(i).getBusinessCatalogueDirectory().getListOfEntertainment();
            for (int j = 0; j < entertainment.size(); j++) {
                List<Supervisor> supervisor = entertainment.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        return entertainment.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void viewTaskPanel() {   //view task for entertainment club
        String type = Admin.findUserType(userName);
        Entertainment entertainment = (Entertainment) findUserHealthClub();
        DisplayDashboardPanel displayDashboard = new DisplayDashboardPanel(Admin, this::healthClubManagerPanel, userName, type, entertainment
        );
        jSplitPane.setRightComponent(displayDashboard);
    }

    private void createOrganization() {
        ServiceLocation location = findUserNetworkForHealthClub();
        SuperviseOrganizationPanel org = new SuperviseOrganizationPanel(Admin, this::healthClubManagerPanel, userName, location);
        jSplitPane.setRightComponent(org);
    }

    private void organizationAdminPanel() {   //create org admin for entertainment club
        String type = Admin.findUserType(userName);
        ServiceLocation location = findUserNetworkForHealthClub();
        OrganizationAdminPanel orgAdmin = new OrganizationAdminPanel(Admin, this::healthClubManagerPanel, userName, type, location);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void healthClubManagerPanel() {   //go back to healthclub
        jSplitPane.setRightComponent(new EntertainmentSupervisorPanel(Admin, this::viewTaskPanel, this::createOrganization, this::organizationAdminPanel));
    }

    private void renderCateringManager(String username) {
        List<ServiceLocation> location = Admin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<Catering> catering = location.get(i).getBusinessCatalogueDirectory().getListOfCatering();
            for (int j = 0; j < catering.size(); j++) {
                List<Supervisor> supervisor = catering.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(username)) {
                        CateringMainPanel cateringAssign = new CateringMainPanel(Admin, this::renderViewTask1, this::renderCateringOrg, this::renderCateringAdmin, this::addOrderPanel);
                        jSplitPane.setRightComponent(cateringAssign);
                    }
                }
            }
        }
    }

    private ServiceLocation findUserLocationForCatering() {
        List<ServiceLocation> location = Admin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<Catering> catering = location.get(i).getBusinessCatalogueDirectory().getListOfCatering();
            for (int j = 0; j < catering.size(); j++) {
                List<Supervisor> supervisor = catering.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        return location.get(i);

                    }
                }
            }
        }
        return null;
    }

    private BusinessCatalogue findUserCatering() {
        List<ServiceLocation> location = Admin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<Catering> catering = location.get(i).getBusinessCatalogueDirectory().getListOfCatering();
            for (int j = 0; j < catering.size(); j++) {
                List<Supervisor> supervisor = catering.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        return catering.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask1() {
        String type = Admin.findUserType(userName);
        Catering catering = (Catering) findUserCatering();
        ViewTaskPanelCatering resMan = new ViewTaskPanelCatering(Admin, this::cateringManagerPanel, userName, type, catering);
        jSplitPane.setRightComponent(resMan);
    }

    private void renderCateringOrg() {
        String type = Admin.findUserType(userName);
        ServiceLocation location = findUserLocationForCatering();
        ManageOrgPanelForCatering org = new ManageOrgPanelForCatering(Admin, this::cateringManagerPanel, userName, type, location
        );
        jSplitPane.setRightComponent(org);
    }

    private void renderCateringAdmin() { //create organisation admin under restauarant
        String type = Admin.findUserType(userName);
        ServiceLocation location = findUserLocationForCatering();
        ManageOrgAdminForCatering orgAdmin = new ManageOrgAdminForCatering(Admin, this::cateringManagerPanel, userName, type, location);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void addOrderPanel() {
        String type = Admin.findUserType(userName);
        ServiceLocation location = findUserLocationForCatering();
        AddOrderJPanel order = new AddOrderJPanel(Admin, this::cateringManagerPanel, userName, type, location);
        jSplitPane.setRightComponent(order);
    }

    private void cateringManagerPanel() {
        jSplitPane.setRightComponent(new CateringMainPanel(Admin, this::renderViewTask1, this::renderCateringOrg,
                this::renderCateringAdmin, this::addOrderPanel));
    }

    private void renderResortManager(String username) {   //hotel panel
        List<ServiceLocation> location = Admin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<Resort> hotel = location.get(i).getBusinessCatalogueDirectory().getListOfResort();
            for (int j = 0; j < hotel.size(); j++) {
                List<Supervisor> supervisor = hotel.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(username)) {
                        ResortMainPanel resortPanel = new ResortMainPanel(Admin, this::renderViewTask2, this::renderResortOrg,
                                this::renderResortAdmin, this::renderRoomPanel);
                        jSplitPane.setRightComponent(resortPanel);

                    }
                }
            }
        }
    }

    private ServiceLocation findUserLocationForResort() {
        List<ServiceLocation> location = Admin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<Resort> resort = location.get(i).getBusinessCatalogueDirectory().getListOfResort();
            for (int j = 0; j < resort.size(); j++) {
                List<Supervisor> supervisor = resort.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        System.out.println("manager found is " + supervisor.get(k).getUsername() + " and city is " + location.get(i));
                        return location.get(i);
                    }
                }
            }
        }
        return null;
    }

    private BusinessCatalogue findManagerHotel() {
        List<ServiceLocation> location = Admin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<Resort> resort = location.get(i).getBusinessCatalogueDirectory().getListOfResort();
            for (int j = 0; j < resort.size(); j++) {
                List<Supervisor> supervisor = resort.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        return resort.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask2() {
        String type = Admin.findUserType(userName);
        Resort resort = (Resort) findManagerHotel();
        DisplayOrderForResort resortPanel = new DisplayOrderForResort(Admin, this::resortSupervisorPanel, userName, type, resort);
        jSplitPane.setRightComponent(resortPanel);
    }

    private void renderResortOrg() {
        String type = Admin.findUserType(userName);
        ServiceLocation location1 = findUserLocationForResort();
        SuperviseOrgForResort org = new SuperviseOrgForResort(Admin, this::resortSupervisorPanel, userName, type, location1);
        jSplitPane.setRightComponent(org);
    }

    private void renderResortAdmin() {
        String type = Admin.findUserType(userName);
        ServiceLocation location1 = findUserLocationForResort();

        SuperviseAdminOrgForResort orgAdmin = new SuperviseAdminOrgForResort(Admin, this::resortSupervisorPanel, userName, type, location1);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void renderRoomPanel() {
        ServiceLocation location = findUserLocationForResort();
        SuperviseRoomPanel room = new SuperviseRoomPanel(Admin, this::resortSupervisorPanel, location, userName);
        jSplitPane.setRightComponent(room);
    }

    private void resortSupervisorPanel() {
        jSplitPane.setRightComponent(new ResortMainPanel(Admin, this::renderViewTask2, this::renderResortOrg, this::renderResortAdmin, this::renderRoomPanel));
    }

    private void renderEventManager(String username) {
        List<ServiceLocation> location = Admin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<Events> event = location.get(i).getBusinessCatalogueDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Supervisor> supervisor = event.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(username)) {
                        EventSupervisorPanel eventPanel = new EventSupervisorPanel(Admin, this::renderViewTask3, this::renderEventOrg,
                                this::renderEventAdmin);
                        jSplitPane.setRightComponent(eventPanel);

                    }
                }
            }
        }
    }

    private ServiceLocation findUserlocationForEvents() {
        List<ServiceLocation> location = Admin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<Events> event = location.get(i).getBusinessCatalogueDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Supervisor> supervisor = event.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        return location.get(i);

                    }
                }
            }
        }
        return null;
    }

    private BusinessCatalogue findUserEnterprise() {
        List<ServiceLocation> location = Admin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<Events> event = location.get(i).getBusinessCatalogueDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Supervisor> supervisor = event.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        return event.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void WorkRequestForEvent() {
        List<ServiceLocation> location = Admin.getListOfServiceLocation();
        String type = Admin.findUserType(userName);
        for (int i = 0; i < location.size(); i++) {
            WorkRequestsForEventPanel workRequest = new WorkRequestsForEventPanel(Admin, userName, type);
            jSplitPane.setRightComponent(workRequest);
        }
    }

    private void renderViewTask3() {     // view Business Event supervisor panel
        String type = Admin.findUserType(userName);
        Events event = (Events) findUserEnterprise();
        DisplayEventPanel eventPanel = new DisplayEventPanel(Admin, this::eventManagerPanel, userName, type, event);
        jSplitPane.setRightComponent(eventPanel);
    }

    private void renderEventOrg() {     // add an organisation for event
        String type = Admin.findUserType(userName);
        ServiceLocation location = findUserlocationForEvents();
        SuperviseEventOrg org = new SuperviseEventOrg(Admin, this::eventManagerPanel, userName, type, location);
        jSplitPane.setRightComponent(org);
    }

    private void renderEventAdmin() { //create organisation admin under event
        String type = Admin.findUserType(userName);
        ServiceLocation location = findUserlocationForEvents();
        SuperviseAdminEventOrganisation orgAdmin = new SuperviseAdminEventOrganisation(Admin, this::eventManagerPanel, userName, type, location);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void eventManagerPanel() {    //go back to event supervisor panel
        jSplitPane.setRightComponent(new EventSupervisorPanel(Admin, this::renderViewTask3, this::renderEventOrg, this::renderEventAdmin));
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

   
}

