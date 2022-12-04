package Model;

import java.util.ArrayList;
import java.util.List;

public abstract class Organization {

    protected String name;
    protected String city;
    protected String contact;
    protected List<Supervisor> listOfSupervisor;

    public Organization(String name, String contact, String city) {
        this.name = name;
        this.city = city;
        this.contact = contact;
        this.listOfSupervisor = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Supervisor> getListOfSupervisor() {
        return listOfSupervisor;
    }

    public void setListOfSupervisor(List<Supervisor> listOfSupervisor) {
        this.listOfSupervisor = listOfSupervisor;
    }
    
    public Supervisor addSupervisor(String name, String city, String user, String password) {
        Supervisor supervisor = new Supervisor(name, user, password);
        listOfSupervisor.add(supervisor);
        return supervisor;
    }
    
    
    public String toString() {
        return name;
    }
}
