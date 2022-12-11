package Model.services;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author prathmeshw
 */

import java.util.ArrayList;
import java.util.List;
import Model.Resort;
import Model.HallRoomList;
import ui.main.DateUtils;

public class ResortService extends Service {

    public static enum ResortServiceType {
        TOURGUIDE(10),
        CARSERVICE(20);

        private final int price;

        private ResortServiceType(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    private HallRoomList hallroomlist;
    private List<ResortServiceType> ResortServices;

    public ResortService(Resort resort) {
        super(resort, Service.ServiceType.RESORT, DateUtils.now());
        this.ResortServices = new ArrayList<>();
        this.hallroomlist = new HallRoomList();
    }

    public List<ResortServiceType> getResortServices() {
        return ResortServices;
    }

    public void setResortServices(List<ResortServiceType> ResortServices) {
        this.ResortServices = ResortServices;
    }

    public HallRoomList getHallroomlist() {
        return hallroomlist;
    }

    public void setHallroomlist(HallRoomList hallroomlist) {
        this.hallroomlist = hallroomlist;
    }

    public void addService(ResortService.ResortServiceType type) {
        ResortServices.add(type);
        totalCost += type.price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nResort service details:");
        sb.append("\n").append(TAB).append("Resort: ").append(businessCatalogue);
        sb.append("\n").append(TAB).append("Date of appointment: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());

        if (ResortServices == null || ResortServices.isEmpty()) {
            sb.append("\n").append(TAB).append("No services selected for this booking.");
        } else {
            sb.append("\n").append(TAB).append("Below are the details of services included for your booking:");
            for (ResortService.ResortServiceType service : ResortServices) {
                sb.append("\n").append(TAB).append(TAB)
                        .append(String.format("Service type: %s, Cost: $%d", service.toString(), service.getPrice()));
            }
            sb.append("\n").append(TAB).append("Total cost for hotel: $").append(totalCost);
        }
        return sb.toString();
    }

}
