public class Book {
    public String name;
    public String author;
    public int isbn;
    public boolean isCheckedOut = true;

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

    public String nameToString() {
        return this.name;
    }

    public String authorToString() {
        return this.author;
    }
}
