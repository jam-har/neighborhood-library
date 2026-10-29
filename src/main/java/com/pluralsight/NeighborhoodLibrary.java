package com.pluralsight;
import java.util.*;
public class NeighborhoodLibrary {
    private static int numberOfBooks = 20;
    private static Book[] books = new Book[25];
    Scanner user = new Scanner(System.in);
    public static void main(String[] args) {
        //Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo)
        books[0] = new Book(1234, "9780374279127", "Tree of Smoke", false, "");
        books[1] = new Book(1235, "9780375424106", "How to be Both", false, "");
        books[2] = new Book(1236, "0060188731", "Bel Canto", false, "");
        books[3] = new Book(1237, "1608197654", "Men We Reaped", false, "");
        books[4] = new Book(1238, "9780393285673", "Wayward Lives, Beautiful Experiments", false, "");
        books[5] = new Book(1239, "9780805090031", "Bring Up the Bodies", false, "");
        books[6] = new Book(1230, "1594200637", "On Beauty", false, "");
        books[7] = new Book(1231, "0385353308", "Station Eleven", false, "");
        books[8] = new Book(1232, "1933372001", "The Days of Abandonment", false, "");
        books[9] = new Book(1233, "0618059458", "The Human Stain", false, "");
        books[10] = new Book(4321, "0802123457", "The Sympathizer", false, "");
        books[11] = new Book(4322, "9780812994827", "The Return", false, "");
        books[12] = new Book(4323, "9780374270605", "The Collected Stories of Lydia Davis", false, "");
        books[13] = new Book(4324, "97880593133378", "Detransition, Baby", false, "");
        books[14] = new Book(4325, "9781465903116", "Frederick Douglass", false, "");
        books[15] = new Book(4326, "9781439107959", "Pastoralia", false, "");
        books[16] = new Book(4327, "9781681375663", "When We Cease to Understand the World", false, "");
        books[17] = new Book(4328, "9780811228039", "Hurricane Season", false, "");
        books[18] = new Book(4329, "9780374532901", "Pulphead", false, "");
        books[19] = new Book(4320, "9780374202392", "A Manual for Cleaning Women", false, "");





        /*menu:
        show available books:id, isbn, title- select to check out or exit
            check out: enter name
        show checked out books: id, isbn, title, name of person with book- check in or exit]
            check in: prompt user for book id
        exit: return to menu
         */
        Scanner user = new Scanner(System.in);
        boolean isDone = false;
        while(!isDone) {
            System.out.println("Please select an option below (enter numerical values only): ");
            System.out.println("1 - Show available books");
            System.out.println("2 - Show checked out books");
            System.out.println("3 - Exit");

            int command = user.nextInt();
            switch (command) {
                case 1 -> listAvailableBooks(user);
                case 2 -> listCheckedBooks(user);
                case 3 -> {
                    System.out.println("Goodbye!");
                    isDone = true;
                    }
                default -> System.out.println("Error, please enter a numerical value matching the menu options.");
           }/* could not properly implement try-catch because it gave same message for all methods in the loop
                System.out.println("Error, please enter a numerical value matching the menu options.");*/

    }

}
/*Show Available Books - Displays a list of all books that are not currently checked
out. Display the Id, ISBN and Title of the book.
o Prompt the user to either select a book to check out, or exit to go back to
the home screen
o If the user wants to check out a book, prompt them for their name
o Then check out the book*/
    public static void listAvailableBooks(Scanner user) {
        user.nextLine();
        System.out.println("Available titles (Selection | ID | ISBN | Title) ");
        int i;
        for (i = 0; i < numberOfBooks; i++) {
            if (!books[i].isCheckedOut()) {
                System.out.println(i + " | " + books[i].getId() + " | " + books[i].getIsbn() + " | " + books[i].getTitle());
            }
        }
            System.out.println("Please select a title to check out or press X to return to the main menu.");
            String option = user.nextLine();
            if (option.equalsIgnoreCase("x")) {
                return;
            }
            i = Integer.parseInt(option);
            if (i >= 0 && i < numberOfBooks) {
                System.out.println("Please enter your name");
                String name = user.nextLine();
                books[i].setCheckedOutTo(name);
                books[i].checkOut(name);
                System.out.println("Congratulations, " + name + "! You have now checked out " + books[i].getTitle() + ".");
            } else {
                System.out.println("Error. Book cannot be found, please enter a selection from numbers 1 - " + numberOfBooks + ". (Press enter to retry.)");
                listAvailableBooks(user); // wanted while loop instead of if-else but unsure of how to do that with this
            }
    }
    public static void listCheckedBooks(Scanner user) {
        /*• Show Checked Out Books - This displays a list of all the books that are currently
checked out. Display the Id, ISBN, Title and Name of the person who has the book
checked out. Prompt the user to:
o C - to Check In a book
o X - to go back to the home screen
 Check In a book - Prompt the user for the Id of the book they want to check in.
o Check in the book with the specified Id
o Go back to the home screen*/
        user.nextLine();
        System.out.println("Titles currently checked out (ID | ISBN | Title | Neighbor with book)");
        int i;
        for (i = 0; i < numberOfBooks; i++) {
            if (books[i].isCheckedOut()) {
                System.out.println(books[i].getId() + " | " + books[i].getIsbn() + " | " +
                        books[i].getTitle() + " | " + books[i].getCheckedOutTo());
            }
        }
        System.out.println("Please press C to check in a book or X to return to the main menu.");
        String option = user.nextLine();
        if (option.equalsIgnoreCase("x")) {
           return;
        }
        if (option.equalsIgnoreCase("c")) {
            System.out.println("Please enter book ID");
        } else {
            System.out.println("Error occurred. Please try again. (Press enter to continue).");
            listCheckedBooks(user);
            return;
        }
        int id = user.nextInt();
        for (i = 0; i < numberOfBooks; i++) {
            if (id == books[i].getId()) {
                String name = books[i].getCheckedOutTo();
                books[i].checkIn();
                System.out.println("Thank you for returning your book, " + name + "! We hope you enjoyed it!");


            }
        }

    }
}
