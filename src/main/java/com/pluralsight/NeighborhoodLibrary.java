package com.pluralsight;
import java.util.*;
public class NeighborhoodLibrary {
    private int numberOfBooks;
    private static Book[] books = new Book[25];
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
                case 1 -> listAllBooks();
                case 2 -> listCheckedBooks();
                case 3 -> System.out.println("Goodbye!"); isDone = true;
                default -> System.out.println("Error, please enter a numerical value matching the menu options.");
            }


            /*            // Each option is its own method, so the loop stays short and easy to read.
            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByMakeModel(scanner);
                    break;
                case 3:
                    findVehiclesByPrice(scanner);
                    break;
                case 4:
                    findVehiclesByColor(scanner);
                    break;
                case 5:
                    addVehicle(scanner);
                    break;
                case 6:
                    // Display a message to the user and exit the program.
                    System.out.println("Goodbye!");
                    isDone = true;
                    break;
                default:
                    // Display an error message if the user inputs an invalid command.
                    System.out.println("Invalid command.");
                    break;
            }*/


        }

    }

    public static void listAllBooks() {
        System.out.println("Library Inventory: ");
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(books[i]);
        }

    }
}
