package Model;
/**
 *
 * @author nishapatil
 */
public class Event_Meetings extends Organization {

    public Event_Meetings(String name, String contact, String city) {
        super(name, contact, city);
    }

    public enum MeetingsType {
        DELUXE(1200, "DELUXE", "Includes decor and standard food for 50 guest"),
        PREMIUM(3000, "PREMIUM", "Includes flower decoration, two cuisines for Food and Projector for 150 guests"),
        ELITE(5500, "ELITE", "Includes decoration,Multi cuisine Food , Projector and customised items for 300 guests");

        private final int rate;
        private final String name;
        private final String description;

        private MeetingsType(int rate, String name, String description) {
            this.rate = rate;
            this.name = name;
            this.description = description;
        }

        public int getRate() {
            return rate;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String toString() {
            return name + "(" + description + ")";
        }
    }

    public void deleteSupervisor(Supervisor supr) {
        listOfSupervisor.remove(supr);
    }

}
