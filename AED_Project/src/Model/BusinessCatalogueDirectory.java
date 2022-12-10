package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BusinessCatalogueDirectory {

    private List<Resort> listOfResort;
    private List<Events> listOfEvents;
    private List<Entertainment> listOfEntertainment;
    private List<Admin> listOfAdmin;

    public BusinessCatalogueDirectory() {
        listOfResort = new ArrayList<>();
        listOfEvents = new ArrayList<>();
        listOfEntertainment = new ArrayList<>();
        listOfAdmin = new ArrayList<>();
    }

    public List<Resort> getListOfResort() {
        return listOfResort;
    }

    public void setListOfResort(List<Resort> listOfResort) {
        this.listOfResort = listOfResort;
    }

    public List<Events> getListOfEvents() {
        return listOfEvents;
    }

    public void setListOfEvents(List<Events> listOfEvents) {
        this.listOfEvents = listOfEvents;
    }

    public List<Entertainment> getListOfEntertainment() {
        return listOfEntertainment;
    }

    public void setListOfEntertainment(List<Entertainment> listOfEntertainment) {
        this.listOfEntertainment = listOfEntertainment;
    }

    public List<Admin> getListOfAdmin() {
        return listOfAdmin;
    }

    public void setListOfAdmin(List<Admin> listOfAdmin) {
        this.listOfAdmin = listOfAdmin;
    }

    public void addEntertainment(String name, String contact) {
        Entertainment entertainment = new Entertainment(name, contact);
        listOfEntertainment.add(entertainment);
    }

    public void addAdmin(String name, String contact) {
        Admin Admin = new Admin(name, contact);
        listOfAdmin.add(Admin);
    }

    public void addEvents(String name, String contact) {
        Events event = new Events(name, contact);
        listOfEvents.add(event);
    }

    public void addResort(String name, String contact) {
        Resort resort = new Resort(name, contact);
        listOfResort.add(resort);
    }

    public Resort findResort(String resortName) {
        for (Resort resort : listOfResort) {
            if (resort.getName().equals(resortName)) {
                return resort;
            }
        }
        return null;
    }

    public Entertainment findEntertainment(String entertainmentName) {
        for (Entertainment entr : listOfEntertainment) {
            if (entr.getName().equals(entertainmentName)) {
                return entr;
            }
        }
        return null;
    }

    public Admin findAdmin(String name) {
        for (Admin entertainment : listOfAdmin) {
            if (entertainment.getName().equals(name)) {
                return entertainment;
            }
        }
        return null;
    }

    public Events findEvents(String name) {
        for (Events event : listOfEvents) {
            if (event.getName().equals(name)) {
                return event;
            }
        }
        return null;
    }

    public void deleteBusinessCatalogueEvents(Events event) {
        listOfEvents.remove(event);
    }

    public void deleteBusinessCatalogueEntertainment(Entertainment Entertainment) {
        listOfEntertainment.remove(Entertainment);
    }

    public void deleteBusinessCatalogueAdmin(Admin cater) {
        listOfAdmin.remove(cater);
    }

    public void deleteBusinessCatalogueResort(Resort resort) {
        listOfResort.remove(resort);
    }
}
