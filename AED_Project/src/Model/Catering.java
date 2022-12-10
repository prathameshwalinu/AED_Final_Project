package Model;

import java.util.ArrayList;
import java.util.List;

public class Admin extends BusinessCatalogue {

    private List<Supervisor> listOfSupervisor;
    private List<Admin_Order> listOfAdminOrder;
    private List<Admin_Menu> listOfMenuItem;
    private List<ServiceAgentOrganisation> listOfServiceAgentOrganisation;

    public Admin(String name, String contact) {
        super(name, contact);
        listOfSupervisor = new ArrayList<>();
        listOfAdminOrder = new ArrayList<>();
        listOfMenuItem = new ArrayList<>();
        listOfServiceAgentOrganisation = new ArrayList<>();
    }

    public List<Admin_Menu> getListOfMenuItem() {
        return listOfMenuItem;
    }

    public void setListOfMenuItem(List<Admin_Menu> ListOfMenuItem) {
        this.listOfMenuItem = ListOfMenuItem;
    }

    public List<Supervisor> getListOfSupervisor() {
        return listOfSupervisor;
    }

    public void setListOfSupervisor(List<Supervisor> listOfSupervisor) {
        this.listOfSupervisor = listOfSupervisor;
    }

    public List<Admin_Order> getListOfAdminOrder() {
        return listOfAdminOrder;
    }

    public void setListOfAdminOrder(List<Admin_Order> listOfAdminOrder) {
        this.listOfAdminOrder = listOfAdminOrder;
    }

    public List<ServiceAgentOrganisation> getListOfServiceAgentOrganisation() {
        return listOfServiceAgentOrganisation;
    }

    public void setListOfServiceAgentOrganisation(List<ServiceAgentOrganisation> listOfServiceAgentOrganisation) {
        this.listOfServiceAgentOrganisation = listOfServiceAgentOrganisation;
    }

    public Supervisor addSupervisor(String name, String username, String password) {
        Supervisor supervisor = new Supervisor(name, username, password);
        listOfSupervisor.add(supervisor);
        return supervisor;
    }

    public Supervisor findSupervisor(String username) {
        for (Supervisor supr : listOfSupervisor) {
            if (supr.getUsername().equals(username)) {
                return supr;
            }
        }
        return null;
    }

    public void addServiceAgentOrganisation(String name, String contact, String ServiceLocationName) {
        ServiceAgentOrganisation del = new ServiceAgentOrganisation(name, contact, ServiceLocationName);
        listOfServiceAgentOrganisation.add(del);
    }

    public void addMenuItem(String item, int price) {
        listOfMenuItem.add(new Admin_Menu(item, price));
    }

    public void deleteSupervisor(Supervisor supr) {
        listOfSupervisor.remove(supr);
    }
}
