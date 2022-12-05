/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author prathamesh
 */
public class Admin {

    private List<ServiceLocation> listOfServiceLocation;
    private ClientDirectory clientDirectory;
    private Map<String, String> mapType;
    private Map<String, String> userNamePasswordMap;

    public Admin(String userName, String password) {
        listOfServiceLocation = new ArrayList<>();
        listOfServiceLocation.add(new ServiceLocation("NewYork"));
        listOfServiceLocation.add(new ServiceLocation("Texas"));
        clientDirectory = new ClientDirectory();
        mapType = new HashMap<>();
        userNamePasswordMap = new HashMap<>();
        userNamePasswordMap.put(userName, password);
        addUser(userName, password, "admin");
    }

    public Map<String, String> getUserNamePasswordMap() {
        return userNamePasswordMap;
    }

    public void setUserNamePasswordMap(Map<String, String> userNamePasswordMap) {
        this.userNamePasswordMap = userNamePasswordMap;
    }

    public Map<String, String> getMapType() {
        return mapType;
    }

    public void setMapType(Map<String, String> mapType) {
        this.mapType = mapType;
    }

    public List<ServiceLocation> getListOfServiceLocation() {
        return listOfServiceLocation;
    }

    public void setListOfServiceLocation(List<ServiceLocation> listOfServiceLocation) {
        this.listOfServiceLocation = listOfServiceLocation;
    }

    public ClientDirectory getClientDirectory() {
        return clientDirectory;
    }

    public void setClientDirectory(ClientDirectory clientDirectory) {
        this.clientDirectory = clientDirectory;
    }

    public void addLocation(String name) {
        ServiceLocation serviceLocation = new ServiceLocation(name);
        listOfServiceLocation.add(serviceLocation);
    }

    public ServiceLocation findServiceLocation(String serviceLocationName) {
        for (ServiceLocation serviceLocation : listOfServiceLocation) {
            if (listOfServiceLocation != null && serviceLocation.getName().equals(serviceLocationName)) {
                return serviceLocation;
            }
        }
        return null;
    }

    public void addUser(String username, String password, String type) {
        mapType.put(username, type);
        userNamePasswordMap.put(username, password);
    }

    public String findUserType(String username) {
        if (mapType.containsKey(username)) {
            return mapType.get(username);
        }
        return null;
    }

    public boolean userExistsInSystem(String username) {
        return mapType.containsKey(username);
    }

    public boolean validateUserNamePassword(String userName, String password) {
        return userNamePasswordMap.containsKey(userName) && userNamePasswordMap.get(userName).equals(password);
    }

    public static Admin createSystemAdmin() {
        return new Admin("admin", "admin");
    }

    public void deleteCustomer(Client customer) {
        clientDirectory.getListOfClientDirectory().remove(customer);
        mapType.remove(customer.getUserName());
    }

    public void updateUser(String username, String password) {
        if (userNamePasswordMap.containsKey(username)) {
            userNamePasswordMap.put(username, password);
        }
    }

    public Client findCustomer(String user) {
        for (Client custom : clientDirectory.getListOfClientDirectory()) {
            if (custom.getUserName().equals(user)) {
                return custom;
            }
        }
        return null;
    }
}
