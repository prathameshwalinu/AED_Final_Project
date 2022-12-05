package Model;

import java.util.ArrayList;
import java.util.List;

public class CarServiceORG extends Organization {

    private List<CarService> listOfCarService;

    public CarServiceORG(String name, String contact, String city) {
        super(name, contact, city);
        listOfCarService = new ArrayList<>();
    }

    public List<CarService> getListOfCarService() {
        return listOfCarService;
    }

    public void setListOfCarService(List<CarService> listOfCarService) {
        this.listOfCarService = listOfCarService;
    }

    public void addCarServiceman(String name, String city, String user, String password1) {
        CarService carService = new CarService(name, city, user, password1);
        listOfCarService.add(carService);
        System.out.println("Service Agent manager added is " + listOfCarService.size());
    }

    public void deleteSupervisor(Supervisor supr) {
       listOfSupervisor.remove(supr);
    }
}
