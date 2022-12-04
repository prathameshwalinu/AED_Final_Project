package Model;

public class Entertainment_Singer {
    private String name;
    private String city;
    private String username;
    private String password;

    public Entertainment_Singer (String name, String city, String username, String password) {
           this.name = name;
           this.city = city;
           this.username = username;
           this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

}