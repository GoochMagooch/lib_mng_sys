public class Member {
    public String memberName;
    public int id;
    public String[] borrowedBooks;

    public Member(String name, int id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new String[5];
    }

}
