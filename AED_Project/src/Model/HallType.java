package Model;
/**
 *
 * @author himanshu
 */
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import ui.main.DateUtils;

public class HallType {

    public enum RoomType {
        BALLROOM(500, "BALLROOM"),
        ELITE(1500, "ELITE"),
        ONLY_ROOM(250, "ONLY_ROOM");

        private final int rate;
        private final String name;

        private RoomType(int rate, String name) {
            this.rate = rate;
            this.name = name;
        }

        public int getRate() {
            return rate;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return getName() + " (" + rate + "$ per night)";
        }
    }

    private Set<Date> bookings;
    public RoomType hallroomType;
    private int hallroomNo;


    public HallType(RoomType hallroomType, int hallroomNumber) {
        this.hallroomType = hallroomType;
        this.hallroomNo = hallroomNumber;
        this.bookings = new HashSet<>();
    }


    
    
    public Set<Date> getBookings() {
        return bookings;
    }

    public void setBookings(Set<Date> bookings) {
        this.bookings = bookings;
    }
    
    public RoomType getHallRoomType() {
        return hallroomType;
    }

    public void setHallroomType(RoomType hallroomType) {
        this.hallroomType = hallroomType;
    }
    
    public void setHallroomNo(int no) {
        this.hallroomNo = no;
    }

    public int getRoomorHallNo() {
        return hallroomNo;
    }

    public boolean isAvailable(Date startDate, Date endDate) {
        Set<Date> bookingDates = daysBetween(startDate, endDate);
        for (Date date : bookingDates) {
            if (bookings.contains(date)) {
                return false;
            }
        }
        return true;
    }

    public void book(Date startDate, Date endDate) {
        if (isAvailable(startDate, endDate)) {
            bookings.addAll(daysBetween(startDate, endDate));
        } else {
            throw new IllegalArgumentException("Room not available");
        }
    }

    private Set<Date> daysBetween(Date startDate, Date endDate) {
        startDate = DateUtils.formatDate(startDate);
        endDate = DateUtils.formatDate(endDate);

        Set<Date> days = new HashSet<>();
        do {
            days.add(startDate);

            Calendar cal = Calendar.getInstance();
            cal.setTime(startDate);
            cal.add(Calendar.DATE, 1);
            startDate = cal.getTime();
        } while (startDate.getTime() <= endDate.getTime());

        return days;
    }

    public String toString() {
        return "HallorRoom:{" + hallroomNo + ", Bookings " + bookings + "}";
    }
}
