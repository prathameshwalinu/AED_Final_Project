package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.HallType.RoomType;

public class Resort extends BusinessCatalogue {

    private HallRoomList hallRoomListDirectory;
    private List<Supervisor> listOfSupervisor;
    private List<TourGuideORG> tourGuideORG;
    private List<CarServiceORG> carServiceORGList;

    public Resort() {

    }

    public Resort(String name, String contact) {
        super(name, contact);
        listOfSupervisor = new ArrayList<>();
        hallRoomListDirectory = new HallRoomList();
        carServiceORGList = new ArrayList<>();
        tourGuideORG = new ArrayList<>();
    }

    public List<TourGuideORG> getTourGuideORG() {
        return tourGuideORG;
    }

    public void setTourGuideORG(List<TourGuideORG> tourGuideList) {
        this.tourGuideORG = tourGuideList;
    }

    public List<CarServiceORG> getCarServiceORGList() {
        return carServiceORGList;
    }

    public void setCarServiceORGList(List<CarServiceORG> carServiceList) {
        this.carServiceORGList = carServiceList;
    }

    public HallRoomList getHallRoomListDirectory() {
        return hallRoomListDirectory;
    }

    public void setHallRoomListDirectory(HallRoomList roomList) {
        this.hallRoomListDirectory = roomList;
    }

    public List<HallType> availableRooms(Date startDate, Date endDate, RoomType roomType) {
        List<HallType> availableRooms = new ArrayList<>();
        for (HallType hall : hallRoomListDirectory.getListOfHallRoom()) {
            if (hall.getHallRoomType().equals(roomType) && hall.isAvailable(startDate, endDate)) {
                availableRooms.add(hall);
            }
        }
        return availableRooms;
    }

    public List<HallType> bookRooms(Date startDate, Date endDate, int count, RoomType roomType) {
        List<HallType> availableRooms = availableRooms(startDate, endDate, roomType);
        if (availableRooms.size() < count) {
            throw new IllegalArgumentException("Hall is not available for the specified date.");
        }

        for (int i = 0; i < count; i++) {
            availableRooms.get(i).book(startDate, endDate);
        }

        // return booked hall list
        return availableRooms.subList(0, count);
    }

    public List<Supervisor> getListOfSupervisor() {
        return listOfSupervisor;
    }

    public void setListOfSupervisor(List<Supervisor> listOfSupervisor) {
        this.listOfSupervisor = listOfSupervisor;
    }

    public Supervisor addSupervisor(String name, String username, String password) {
        Supervisor supervisor = new Supervisor(name, username, password);
        listOfSupervisor.add(supervisor);
        return supervisor;
    }

    public Supervisor findSupervisor(String username) {
        for (Supervisor supr : listOfSupervisor) {
            if (supr.getUsername().equals(username)) {
                return supr;
            }
        }
        return null;
    }

    public void addTourGuideORG(String name, String contact, String city) {
        TourGuideORG tourGuideORG1 = new TourGuideORG(name, contact, city);
        tourGuideORG.add(tourGuideORG1);
    }

    public void addCarServiceORG(String name, String contact, String serviceLocationName) {
        CarServiceORG to = new CarServiceORG(name, contact, serviceLocationName);
        carServiceORGList.add(to);
    }

    public void deleteSupervisor(Supervisor supr) {
        listOfSupervisor.remove(supr);
    }

    public void deleteTourGuide(TourGuideORG tourGuide) {
        tourGuideORG.remove(tourGuide);
    }

    public void deleteCarService(CarServiceORG carService) {
        carServiceORGList.remove(carService);
    }

}
