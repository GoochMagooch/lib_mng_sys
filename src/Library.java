import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library () {
        books = new Book[] {
            new Book("Sleep Tight", "J.H Markhert", 0, false);
            new Book("Salem's Lot", "Stephen King", 1, false);
            new Book("Company of One", "Paul Jarvis", 2, false);
            new Book("Mindset", "Carol Dweck", 3, false);
            new Book("Quiet", "Susan Cain", 4, false);
        }
    }
/*
    // prints details of book entry
    public void printBook(Book book) {
        if (library.contains(book)) {
            System.out.println("The details of this book are: ");
            System.out.println("Title: " + this.name);
            System.out.println("Author: " + this.author);
            System.out.println("Isbn: " + this.isbn);
            if (this.isCheckedOut) {
                System.out.println("-- This book is unavailable --");
            } else {
                System.out.println("-- This book is available --");
            }
        }
    }*/

    public static void main(String[] args) {
        

    }
}
