import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library () {
        books = new Book[] {
            new Book("Sleep Tight", "J.H Markhert", 0, false),
            new Book("Salem's Lot", "Stephen King", 1, false),
            new Book("Company of One", "Paul Jarvis", 2, false),
            new Book("Mindset", "Carol Dweck", 3, false),
            new Book("Quiet", "Susan Cain", 4, false)
        };
    }

    // displays entire library
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    // displays details of selected book
    public void bookDetails(String title) {
        for (Book book : books) {
            if (book.name.equalsIgnoreCase(title)) {
                System.out.println(book.toString());
                return;
            }
        }
    }

    // Checks out selected book by title
    public void titleCheckout(String title) {
        for (Book book : books) {
            if (book.name.equalsIgnoreCase(title)) {
                if (book.isCheckedOut) {
                    System.out.println("This book is already checked out!");
                    return;
                } else {
                    System.out.println("Congratulations, you have checked out: ");
                    System.out.println(book.nameToString() + " by author: " + book.authorToString());
                    book.isCheckedOut = true;
                    return;
                }
            }
        }
    }

    // Returns selected book by title
    public void titleReturn(String title) {
        for (Book book : books) {
            if (book.name.equalsIgnoreCase(title) && book.isCheckedOut) {
                book.isCheckedOut = false;
                System.out.println("Thank you for returning " + book.nameToString() + " by " + book.authorToString() + "!");
            } else if (book.name.equals(title) && book.isCheckedOut == false){
                System.out.println("This book is not checked out!");
            }
        }
    }

    // Checks out selected book by ISBN
    public void isbnCheckout(int num) {
        for (Book book : books) {
            if (book.isbn == num) {
                if (book.isCheckedOut) {
                    System.out.println("This book is already checked out!");
                    return;
                } else {
                    System.out.println("Congratulations, you have checked out: ");
                    System.out.println(book.nameToString() + " by author: " + book.authorToString());
                    book.isCheckedOut = true;
                    return;
                }
            }
        }
    }

    // Returns selected book by ISBN
    public void isbnReturn(int num) {
        for (Book book : books) {
            if (book.isbn == num && book.isCheckedOut) {
                book.isCheckedOut = false;
                System.out.println("Thank you for returning " + book.nameToString() + " by " + book.authorToString() + "!");
            } else if (book.isbn == num && book.isCheckedOut == false){
                System.out.println("This book is not checked out!");
            }
        }
    }
}
