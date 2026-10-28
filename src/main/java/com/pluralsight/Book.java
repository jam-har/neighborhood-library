package com.pluralsight;

public class Book {
    //id: int
    //- isbn: String
    //- title: String
    //- isCheckedOut: boolean
    //- checkedOutTo: String
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    @Override
    public String toString() {
        return id + " | " +  isbn + " | " + title + " | " + isCheckedOut + " | " + checkedOutTo;
    }

    //Methods
    //- void checkOut(String name)
    //- void checkIn()
    //• Use an array to hold an inventory of at least 20 books of your choice
    //• Each book must have a unique id
    //• When a book is checked out
    //o the book's checkedOutTo variable should be set to the name provided
    //o the isCheckedOut variable should be set to true
    //• When a book is checked in
    //o the book's checkedOutTo variable should be set to ""
    //o the isCheckedOut variable should be set to false
//  public void work(int hours) {
//      this.energy -= (hours * 10);
    public void checkOut(String name) {
        this.checkedOutTo = name;
        this.isCheckedOut = true;
    }
    public void checkIn() {
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }

}
