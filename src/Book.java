public class Book {
    private String name;
    private String author;
    private int isbn;
    private boolean isCheckedOut = true;

    public Book(String name, String author, int isbn, boolean isCheckedOut) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
    }
    /*
    public void printName() {
        System.out.println(this.name);
    }

    public void bookCheckOut() {
        if (isCheckedOut) {
            System.out.println("This book is already checked out!");
            return;
        } else {
            System.out.println("Congratulations, you have checked out: " + this.name);
            System.out.println("By author: " + this.author);
        }
        this.isCheckedOut = true;

    }

    public void bookReturn() {
        if (isCheckedOut) {
            System.out.println("Thank you for returning your book!");
            this.isCheckedOut = false;
        } else {
            System.out.println("This book is not checked out!");
            return;
        }
    }

    public void returnName() {
        String message = "The title of this book is: " + this.name;
        System.out.println(message);
    }

    public void availableBook() {
        if (this.isCheckedOut) {
            System.out.println("This book is available for checkout!");
        } else {
            System.out.println("This book is not available for checkout!");
        }
    }

    // prints entire library and its availability
    public void printLibrary() {
        for (Book book : library) {
            System.out.println(book);
            book.availableBook();
        }
    }
*/
}
