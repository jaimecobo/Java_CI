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
        System.out.println();

        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        System.out.println(firstLibrary.getInventory());


        //Print opening hours and the addresses
        System.out.println("Library hours:");
        firstLibrary.printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
//
//        // Try to borrow The Lords of the Rings from both libraries
//        System.out.println("Borrowing The Lord of the Rings:");
//        firstLibrary.borrowBook("The Lord of the Rings");
//        firstLibrary.borrowBook("The Lord of the Rings");
//        secondLibrary.borrowBook("The Lord of the Rings");
//        System.out.println();
//
//        // Print the titles of all available books from both libraries
//        System.out.println("Books available in the first library:");
//        firstLibrary.printAvailableBooks();
//        System.out.println();
//        System.out.println("Books available in the second library:");
//        secondLibrary.printAvailableBooks();
//        System.out.println();
//
//        // Return The Lords of the Rings to the first library
//        System.out.println("Returning The Lord of the Rings:");
//        firstLibrary.returnBook("The Lord of the Rings");
//        System.out.println();
//
//        // Print the titles of available from the first library
//        System.out.println("Books available in the first library:");
//        firstLibrary.printAvailableBooks();

    }



}
