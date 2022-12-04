package Model;

import java.util.ArrayList;
import java.util.List;

public class Entertainment extends BusinessCatalogue {

    private List<Supervisor> listOfSupervisor;
    private List<Entertainment_MagicianORG> listOfMagicianORG;
    private List<Entertainment_ChoreographerORG> listOfChoreographerORG;
    private List<Entertainment_SingerORG> listOfSingerORG;

    Entertainment(String name, String contact) {
        super(name, contact);
        listOfSupervisor = new ArrayList<>();
        listOfMagicianORG = new ArrayList<>();
        listOfChoreographerORG = new ArrayList<>();
        listOfSingerORG = new ArrayList<>();
    }

    public List<Entertainment_SingerORG> getListOfSingerORG() {
        return listOfSingerORG;
    }

    public void setListOfSingerORG(List<Entertainment_SingerORG> listOfSingerORG) {
        this.listOfSingerORG = listOfSingerORG;
    }

    public List<Entertainment_MagicianORG> getListOfMagicianORG() {
        return listOfMagicianORG;
    }

    public void setListOfMagicianORG(List<Entertainment_MagicianORG> listOfMagicianORG) {
        this.listOfMagicianORG = listOfMagicianORG;
    }

    public List<Entertainment_ChoreographerORG> getListOfChoreographerORG() {
        return listOfChoreographerORG;
    }

    public void setListOfChoreographerORG(List<Entertainment_ChoreographerORG> listOfChoreographerORG) {
        this.listOfChoreographerORG = listOfChoreographerORG;
    }

    public List<Supervisor> getListOfSupervisor() {
        return listOfSupervisor;
    }

    public void setListOfSupervisor(List<Supervisor> listOfSupervisor) {
        this.listOfSupervisor = listOfSupervisor;
    }

    public Supervisor addSupervisor(String name, String username, String password) {
        Supervisor supervisor = new Supervisor(name, username, password);
        listOfSupervisor.add(supervisor);
        System.out.println("size of supervisor in Entertainment is " + listOfSupervisor.size() + " name is " + supervisor.getUsername());
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

    public void addMagicianORG(String name, String contact, String city) {
        Entertainment_MagicianORG magicianORG = new Entertainment_MagicianORG(name, contact, city);
        listOfMagicianORG.add(magicianORG);
    }

    public void addSingerORG(String name, String contact, String city) {
        Entertainment_SingerORG singerORG = new Entertainment_SingerORG(name, contact, city);
        listOfSingerORG.add(singerORG);
    }

    public void addChoreographerORG(String name, String contact, String serviceLocationName) {
        Entertainment_ChoreographerORG choreographerORG = new Entertainment_ChoreographerORG(name, contact, serviceLocationName);
        listOfChoreographerORG.add(choreographerORG);
    }
    
    public String toString() {
        return name;
    }

    public void deleteSupervisor(Supervisor supr) {
        listOfSupervisor.remove(supr);
    }

    public void deleteMagician(Entertainment_MagicianORG magician) {
      listOfMagicianORG.remove(magician);
    }

    public void deleteChoreographer(Entertainment_ChoreographerORG choreographer) {
        listOfChoreographerORG.remove(choreographer);
    }

    public void deleteSinger(Entertainment_SingerORG singer) {
           listOfSingerORG.remove(singer);
    }
}
