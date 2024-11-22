public class Member {
    String name;
    int id;
    String[] borrowedBooks;

    public Member(String name, int id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new String[5];
    }

}
