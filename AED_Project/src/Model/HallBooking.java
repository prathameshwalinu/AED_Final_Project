package Model;
/**
 *
 * @author himanshu
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import Model.services.ResortService;
import Model.services.Service;
import ui.main.DateUtils;

public class HallBooking {

    private static final String TAB = "      ";

    private Date checkin;
    private Date checkout;
    private String status;
    private int cost;
    private ServiceLocation serviceLocation;

    private List<Service> services;
    private String id;

    public HallBooking() {
        
    }
    
    public HallBooking(Resort resort, ServiceLocation serviceLocation) {
        this.services = new ArrayList<>();
        this.services.add(new ResortService(resort));
        this.serviceLocation = serviceLocation;
        this.id = UUID.randomUUID().toString();
    }

    public int getTotalCost() {
        int totalCost = this.cost;
        for (Service service : services) {
            totalCost += service.getTotalCost();
        }
        return totalCost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public void addService(Service service) {
        this.services.add(service);
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = DateUtils.formatDate(checkin);
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = DateUtils.formatDate(checkout);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServiceLocation getServiceLocation() {
        return serviceLocation;
    }

    public void setServiceLocation(ServiceLocation serviceLocation) {
        this.serviceLocation = serviceLocation;
    }

    public ResortService getResortService() {
        for (Service service : services) {
            if (service instanceof ResortService) {
                return (ResortService) service;
            }
        }

        throw new RuntimeException("Booking should always have an resort service");
    }

    public String prettyPrint() {
        StringBuilder sb = new StringBuilder("Below are your booking details -\n");
        sb.append("\n").append("RESORT BOOKING: ");
        sb.append("\n").append(TAB).append("City: ").append(serviceLocation.getName());
        sb.append("\n").append(TAB).append("Checkin date: ").append(checkin);
        sb.append("\n").append(TAB).append("Checkout date: ").append(checkout);
        
        List<HallType> listOfHalls = getResortService().getHallroomlist().getListOfHallRoom();
        int roomCost = 0;
        sb.append("\n").append(TAB).append(String.format("Below are the details of the %d Hall booked:", listOfHalls.size()));
        for (HallType room : listOfHalls) {
            roomCost += room.getHallRoomType().getRate();
            sb.append("\n").append(TAB).append(TAB).append("HallorRoom number: ")
                    .append(room.getRoomorHallNo()).append(",Hall type: ").append(room.getHallRoomType());
        }
        sb.append("\n").append(TAB).append("Total cost for your stay or Hall: $").append(roomCost);
        
        int totalCost = roomCost;
        for (Service service : services) {
            totalCost += service.getTotalCost();
            sb.append("\n").append(service).append("\n");
        }
        
        sb.append("\nTotal cost of the booking including all services: $").append(getTotalCost()).append("\n");
     
        return sb.toString();
    }

    public String toString() {
        return id;
    }
}
