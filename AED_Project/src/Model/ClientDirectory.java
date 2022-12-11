package Model;
/**
 *
 * @author prathmeshw
 */
import java.util.ArrayList;
import java.util.List;

public class ClientDirectory {

    private List<Client> listOfClient;

    public ClientDirectory() {
        listOfClient = new ArrayList<>();
    }

    public List<Client> getListOfClientDirectory() {
        return listOfClient;
    }

    public void setListOfClient(List<Client> listOfClient) {
        this.listOfClient = listOfClient;
    }

    public Client addCustomer() {
        Client client = new Client();
        listOfClient.add(client);
        return client;
    }

    public Client findClientUsername(String username) {
        for (int i = 0; i < listOfClient.size(); i++) {
            if (listOfClient.get(i).getUserName().equals(username)) {
                return listOfClient.get(i);
            }
        }
        return null;
    }

}
