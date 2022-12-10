package Model;

import java.util.ArrayList;
import java.util.List;

public class Catering extends BusinessCatalogue {

    private List<Supervisor> listOfSupervisor;
    private List<Catering_Order> listOfCateringOrder;
    private List<Catering_Menu> listOfMenuItem;
    private List<ServiceAgentOrganisation> listOfServiceAgentOrganisation;

    public Catering(String name, String contact) {
        super(name, contact);
        listOfSupervisor = new ArrayList<>();
        listOfCateringOrder = new ArrayList<>();
        listOfMenuItem = new ArrayList<>();
        listOfServiceAgentOrganisation = new ArrayList<>();
    }

    public List<Catering_Menu> getListOfMenuItem() {
        return listOfMenuItem;
    }

    public void setListOfMenuItem(List<Catering_Menu> ListOfMenuItem) {
        this.listOfMenuItem = ListOfMenuItem;
    }

    public List<Supervisor> getListOfSupervisor() {
        return listOfSupervisor;
    }

    public void setListOfSupervisor(List<Supervisor> listOfSupervisor) {
        this.listOfSupervisor = listOfSupervisor;
    }

    public List<Catering_Order> getListOfCateringOrder() {
        return listOfCateringOrder;
    }

    public void setListOfCateringOrder(List<Catering_Order> listOfCateringOrder) {
        this.listOfCateringOrder = listOfCateringOrder;
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
        listOfMenuItem.add(new Catering_Menu(item, price));
    }

    public void deleteSupervisor(Supervisor supr) {
        listOfSupervisor.remove(supr);
    }
}