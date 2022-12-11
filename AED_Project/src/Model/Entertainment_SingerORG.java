package Model;
/**
 *
 * @author himanshu
 */
import java.util.ArrayList;
import java.util.List;

public class Entertainment_SingerORG extends Organization {

    private List<Entertainment_Singer> listOfSinger;

    public Entertainment_SingerORG(String name, String contact, String city) {
        super(name, contact, city);
        listOfSinger = new ArrayList<>();
    }

    public List<Entertainment_Singer> getListOfSinger() {
        return listOfSinger;
    }

    public void setListOfSinger(List<Entertainment_Singer> listOfSinger) {
        this.listOfSinger = listOfSinger;
    }

    public void addSinger(String name, String city, String user, String password1) {
        Entertainment_Singer singer = new Entertainment_Singer(name, city, user, password1);
        listOfSinger.add(singer);
    }

    public void deleteSupervisor(Supervisor supr) {
        listOfSupervisor.remove(supr);
    }

}
