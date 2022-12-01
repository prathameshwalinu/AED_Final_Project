/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import java.util.Map;

/**
 *
 * @author prathamesh
 */
public class Admin {
    
    private Map<String, String> mapType;
    private Map<String, String> userNamePasswordMap;
    
    private Admin(String userName, String password) {
        addUser(userName, password, "admin");
    }
    
    public void addUser(String username, String password, String type) {
        mapType.put(username, type);
        userNamePasswordMap.put(username, password);
    }
    
    public static Admin createSystemAdmin() {
        return new Admin("admin", "admin");
    }

    public boolean validateUserNamePassword(String userName, String password) {
        return userNamePasswordMap.containsKey(userName) && userNamePasswordMap.get(userName).equals(password);
    }

    public String findUserType(String userName) {
    if (mapType.containsKey(userName)) {
            return mapType.get(userName);
        }
        return null;
    }

}
