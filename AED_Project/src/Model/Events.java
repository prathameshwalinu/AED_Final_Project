package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Events extends BusinessCatalogue {

    private Date date;
    private List<Supervisor> listOfSupervisor;
    private List<Event_BirthdayParty> listOfBirthdayParty;
    private List<Event_Wedding> listOfWeddingServices;
    private List<Event_Meetings> listOfMeetings;

    public Events(String name, String contact) {
        super(name, contact);
        listOfSupervisor = new ArrayList<>();
        listOfBirthdayParty = new ArrayList<>();
        listOfWeddingServices = new ArrayList<>();
        listOfMeetings = new ArrayList<>();

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Supervisor> getListOfSupervisor() {
        return listOfSupervisor;
    }

    public void setListOfSupervisor(List<Supervisor> listOfSupervisor) {
        this.listOfSupervisor = listOfSupervisor;
    }

    public List<Event_BirthdayParty> getListOfBirthdayParty() {
        return listOfBirthdayParty;
    }

    public void setListOfBirthdayParty(List<Event_BirthdayParty> listOfBirthdayParty) {
        this.listOfBirthdayParty = listOfBirthdayParty;
    }

    public List<Event_Wedding> getListOfWeddingServices() {
        return listOfWeddingServices;
    }

    public void setListOfWeddingServices(List<Event_Wedding> listOfWeddingServices) {
        this.listOfWeddingServices = listOfWeddingServices;
    }

    public List<Event_Meetings> getListOfMeetings() {
        return listOfMeetings;
    }

    public void setListOfMeetings(List<Event_Meetings> listOfMeetings) {
        this.listOfMeetings = listOfMeetings;
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

    public void addBirthdayParty(String name, String contact, String city) {
        Event_BirthdayParty bp = new Event_BirthdayParty(name, contact, city);
        System.out.println(name);
        listOfBirthdayParty.add(bp);
        System.out.println("BirthDay Party size is " + listOfBirthdayParty.size() + " name is " + listOfBirthdayParty.get(0).getName());

    }

    public void addWeddingServices(String name, String contact, String city) {
        Event_Wedding wed = new Event_Wedding(name, contact, city);
        listOfWeddingServices.add(wed);

    }

    public void addMeetings(String name, String contact, String city) {
        Event_Meetings met = new Event_Meetings(name, contact, city);
        listOfMeetings.add(met);
    }

    public void deleteSupervisor(Supervisor supr) {
        listOfSupervisor.remove(supr);
    }

    public void deleteBirthdayParty(Event_BirthdayParty birthdayParty) {
        listOfBirthdayParty.remove(birthdayParty);
    }

    public void deleteWeddingServices(Event_Wedding wed) {
        listOfWeddingServices.remove(wed);
    }

    public void deleteMeetings(Event_Meetings met) {
        listOfMeetings.remove(met);
    }

}
