package com.pluralsight;
import java.util.*;
public class NeighborhoodLibrary {
    private int numberOfBooks;
    private static Book[] books = new Book[25];
    public static void main(String[] args) {
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
