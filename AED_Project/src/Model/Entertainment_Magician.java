package Model;

public class Entertainment_Magician extends Person {

    private String city;

    public Entertainment_Magician(String name, String city, String username, String password) {
        this.name = name;
        this.city = city;
        this.username = username;
        this.password = password;
    }

    public String getCity() {
        return city;
    }
}
