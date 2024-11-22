public class Book {
    public String name;
    private String author;
    private int isbn;
    private boolean isCheckedOut = true;

    public Book(String name, String author, int isbn, boolean isCheckedOut) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
    }

    @Override
    public String toString() {
        if (this.isCheckedOut == false) {
            return this.name + " by " + this.author + " - ISBN: " + this.isbn + " - " + "Availability: In Stock";
        } else {
            return this.name + " by " + this.author + " - ISBN: " + this.isbn + " - " + "Availability: Checked out";
        }
    }

    /*
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
    }*/
}
