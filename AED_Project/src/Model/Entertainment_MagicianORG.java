package Model;

import java.util.ArrayList;
import java.util.List;

public class Entertainment_MagicianORG extends Organization {

    List<Entertainment_Magician> listOfMagician;

    public Entertainment_MagicianORG(String name, String contact, String city) {
        super(name, contact, city);
        listOfMagician = new ArrayList<>();
    }

    public List<Entertainment_Magician> getListOfMagician() {
        return listOfMagician;
    }

    public void setListOfMagician(List<Entertainment_Magician> listOfMagician) {
        this.listOfMagician = listOfMagician;
    }

    public void addMagician(String name, String city, String user, String password1) {
        Entertainment_Magician magician = new Entertainment_Magician(name, city, user, password1);
        listOfMagician.add(magician);
        System.out.println("Magician's manager added is " + listOfMagician.size());
    }

    public void deleteSupervisor(Supervisor supr) {
        listOfSupervisor.remove(supr);
    }

}
