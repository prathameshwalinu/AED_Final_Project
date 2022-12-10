package Model;

import java.util.ArrayList;
import java.util.List;

public class ServiceAgent extends Person {

    private String city;
    List<Admin_Order> list = new ArrayList<>();

    public ServiceAgent(String name, String city, String username, String password) {
        this.name = name;
        this.password = password;
        this.username = username;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Admin_Order> getList() {
        return list;
    }

    public void setList(List<Admin_Order> list) {
        this.list = list;
    }

    public void addOrder(Admin_Order order) {
        list.add(order);
    }

    public Admin_Order findOrder(String orderId) {
        for (int i = 0; i < list.size(); i++) {
            if (orderId.equals(list.get(i).getId())) {
                return list.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }

}
