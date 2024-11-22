import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our Library Management System!");
        
        while (true) {
            System.out.println();
            System.out.println("1. Browse our library");
            System.out.println("2. Recieve details of a particular book");
            System.out.println("3. Return your book by title");
            System.out.println("4. Checkout a book with ISBN");
            System.out.println("5. Checkout a book with title");
            System.out.println("6. Return your book by ISBN");
            System.out.print("Choose your destiny: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
        

            if (choice == 1) {
                System.out.println();
                System.out.println("Please browse our library for a book that suits your interests!");
                System.out.println();
                library.displayBooks();
            } else if (choice == 2) {
                System.out.println();
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                library.bookDetails(title);
            }
        }
    }
}