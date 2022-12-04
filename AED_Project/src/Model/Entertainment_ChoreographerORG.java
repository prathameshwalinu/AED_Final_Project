package Model;

import java.util.ArrayList;
import java.util.List;

public class Entertainment_ChoreographerORG extends Organization {

    private List<Entertainment_Choreographer> listOfChoreographer;

    public Entertainment_ChoreographerORG(String name, String contact, String city) {
        super(name, contact, city);
        listOfChoreographer = new ArrayList<>();
    }
    
    public void addChoreographer(String name, String city, String user, String password1) {
        Entertainment_Choreographer choreographer = new Entertainment_Choreographer(name, city, user, password1);
        listOfChoreographer.add(choreographer);
    }
      public void deleteSupervisor(Supervisor supr) {
     listOfSupervisor.remove(supr);
    }
  
}
