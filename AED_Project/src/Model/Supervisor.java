package Model;

public class Supervisor extends Person {

    private String contact;

    public Supervisor(String name,String username, String password) {
        this.name = name;
        this.password = password;
        this.username = username;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

}
