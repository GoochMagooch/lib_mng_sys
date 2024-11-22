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
            if (book.name.equals(title)) {
                System.out.println(book.toString());
            }
        }
    }
}
