package Model;

import java.util.ArrayList;
import java.util.List;
import Model.HallType.RoomType;

public class HallRoomList {

    private List<HallType> listOfHalls;
    private int nextRoomorHallNumber = 1;

    public HallRoomList() {
        listOfHalls = new ArrayList<>();
    }

    public int getNextRoomorHallNumber() {
        return nextRoomorHallNumber;
    }

    public void setNextRoomorHallNumber(int nextRoomorHallNumber) {
        this.nextRoomorHallNumber = nextRoomorHallNumber;
    }

    public List<HallType> getListOfHallRoom() {
        return listOfHalls;
    }

    public void setListOfHalls(List<HallType> listOfHalls) {
        this.listOfHalls = listOfHalls;
        if (listOfHalls != null && listOfHalls.size() > 0) {
            nextRoomorHallNumber = listOfHalls.get(listOfHalls.size() - 1).getRoomorHallNo() + 1;
        }
    }

    public void createHallRoom(RoomType type) {
        HallType room = new HallType(type, nextRoomorHallNumber);
        nextRoomorHallNumber++;
        listOfHalls.add(room);
    }

    public String toString() {
        return listOfHalls.toString();
    }
}
