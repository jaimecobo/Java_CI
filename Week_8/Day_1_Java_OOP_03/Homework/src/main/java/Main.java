public class Main {


    public static void main(String[] arguments) {
        // Small test of the Book class
        Book book_1 = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + book_1.getTitle());
        System.out.println("Borrowed? (should be false): " + book_1.isBorrowed());
        book_1.borrow_method();
        System.out.println("Borrowed? (should be true): " + book_1.isBorrowed());
        book_1.returned();
        System.out.println("Borrowed? (should be false): " + book_1.isBorrowed());



    }



}
