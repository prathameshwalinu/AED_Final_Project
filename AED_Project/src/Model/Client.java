package Model;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private String contact;
    private String address;
    private String city;
    private String password;
    private String userName;
    private List<HallBooking> hallbookingList;

    public Client() {
        hallbookingList = new ArrayList<>();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public List<HallBooking> getHallbookingList() {
        return hallbookingList;
    }

    public void setHallbookingList(List<HallBooking> hallbookingList) {
        this.hallbookingList = hallbookingList;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public HallBooking addBooking(Resort resort, ServiceLocation serviceLocation) {
        HallBooking booking = new HallBooking(resort, serviceLocation);
        hallbookingList.add(booking);
        return booking;
    }

    public String toString() {
        return userName;
    }
}
