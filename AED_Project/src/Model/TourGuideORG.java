package Model;

import java.util.ArrayList;
import java.util.List;

public class TourGuideORG extends Organization {

    private List<TourGuideService> listOfTourGuideAgent;

    public TourGuideORG(String name, String contact, String city) {
        super(name, contact, city);
        listOfTourGuideAgent = new ArrayList<>();
    }

    public List<TourGuideService> getListOfTourGuideAgent() {
        return listOfTourGuideAgent;
    }

    public void setListOfTourGuideAgent(List<TourGuideService> listOfTourGuideAgent) {
        this.listOfTourGuideAgent = listOfTourGuideAgent;
    }

    public void addTourGuide(String name, String city, String user, String password1) {
        TourGuideService TourGuideStaff = new TourGuideService(name, city, user, password1);
        listOfTourGuideAgent.add(TourGuideStaff);
        System.out.println("ToutGuideAgent manager added is " + listOfTourGuideAgent.size());
    }

    public void deleteManager(Supervisor supr) {
       listOfSupervisor.remove(supr);
    }

}
