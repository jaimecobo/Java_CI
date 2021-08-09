import java.util.List;

public class Library extends Book{
    // Add the missing implementation to this class
    private String name;
    private String address;
    private List<Book> inventory;
    final private String officeHours = "9:00 AM to 5:00 PM";

    public Library() {
    }

    public Library(String address) {
        this.name = "Library at " + address;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOfficeHours() {
        return officeHours;
    }


}
