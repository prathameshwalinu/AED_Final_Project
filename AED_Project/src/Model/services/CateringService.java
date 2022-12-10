/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.services;

/**
 *
 * @author prathamesh
 */
import java.util.Date;
import Model.Admin;

public class AdminService extends EService {

    private String menuItem;

    public AdminService(Admin res, Date eventDate, String menuItem, int cost) {
        super(res, EService.ServiceType.Admin, eventDate);
        this.menuItem = menuItem;
        super.totalCost = cost;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nAdmin order details:");
        sb.append("\n").append(TAB).append("Caterers name: ").append(businessCatalogue);
        sb.append("\n").append(TAB).append("Order item: ").append(menuItem);
        sb.append("\n").append(TAB).append("Total cost for Order: $").append(totalCost);
        sb.append("\n").append(TAB).append("Date of order: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());
        return sb.toString();
    }
}

