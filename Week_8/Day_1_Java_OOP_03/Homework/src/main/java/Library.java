import java.util.ArrayList;
import java.util.List;

public class Library extends Book{
    // Add the missing implementation to this class
    private String name;
    private String address;
    private List<Book> inventory = new ArrayList<Book>();
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

    public List<Book> getInventory() {
        return inventory;
    }

    public void setInventory(List<Book> inventory) {
        this.inventory = inventory;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void addBook(Book book){
        this.inventory.add(book);
    }

    public void printOpeningHours(){
        System.out.println("Libraries are open daily from " + this.officeHours);
    }

    public void printAddress(){
        System.out.println(this.address);
    }

    public void borrowBook(String title){
        boolean inStock = false;
        for (Book book : this.inventory) {
            if(book.title.equals(title)){
                inStock = true;
                if(!book.borrowed){
                    System.out.println("You successfully borrowed " + title);
                    book.borrowed = true;
                }
                else System.out.println("Sorry, this book is already borrowed.");
            }
        }
        if(!inStock){
            System.out.println("Sorry, this book is not in our catalog.");
        }
    }

    public void printAvailableBooks(){
        if(this.inventory.isEmpty()) {
            System.out.println("No book in catalog.");
        }else{
            for (Book book : this.inventory) {
                if(!book.borrowed){
                    System.out.println(book.title);
                }
            }
        }
    }

    public void returnBook(String title){
        for (Book book : this.inventory) {
            if(book.title.equals(title)){
                book.borrowed = false;
                System.out.println("You successfully returned " + title);
                }
            }
        }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", inventory=" + inventory +
                ", officeHours='" + officeHours + '\'' +
                '}';
    }
}
