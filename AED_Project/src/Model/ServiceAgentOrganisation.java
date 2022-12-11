package Model;
/**
 *
 * @author prathmeshw
 */
import java.util.ArrayList;
import java.util.List;

public class ServiceAgentOrganisation extends Organization{

    private List<ServiceAgent> listOfServiceAgent;

  public ServiceAgentOrganisation(String name, String contact, String city) {
        super(name, contact, city);
        this .listOfServiceAgent = new ArrayList<>();
    }
  
    public List<ServiceAgent> getListOfServiceAgent() {
        return listOfServiceAgent;
    }

    public void setListOfServiceAgent(List<ServiceAgent> listOfServiceAgent) {
        this.listOfServiceAgent = listOfServiceAgent;
    }

    public void addServiceAgent(String name, String city, String user, String password1) {
        ServiceAgent del = new ServiceAgent(name, city, user, password1);
        listOfServiceAgent.add(del);
        System.out.println("Service Agent manager added is " + listOfServiceAgent.size());
    }

    public void deleteServiceAgent(ServiceAgentOrganisation del) {
     listOfServiceAgent.remove(del);
    }

    public void deleteSupervisor(Supervisor supr) {
      listOfSupervisor.remove(supr);
    }

}
