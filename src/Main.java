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
            System.out.println("3. Checkout a book by title");
            System.out.println("4. Checkout a book with ISBN");
            System.out.println("5. Return your book by title");
            System.out.println("6. Return your book with ISBN");
            System.out.println("Type \"exit\" to exit program");
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
            } else if (choice == 3) {
                System.out.println();
                System.out.print("Enter book to checkout: ");
                String title = scanner.nextLine();
                library.titleCheckout(title);
            } else if (choice == 4) {
                System.out.println();
                System.out.print("Enter ISBN of book to checkout: ");
                int num = scanner.nextInt();
                library.isbnCheckout(num);
            } else if (choice == 5) {
                System.out.println();
                System.out.print("Enter title of book you're returning: ");
                String title = scanner.nextLine();
                library.titleReturn(title);
            } else if (choice == 6) {
                System.out.println();
                System.out.print("Enter ISBN of book you're returning: ");
                int num = scanner.nextInt();
                library.isbnReturn(num);
            } else {
                System.out.println("Invalid choice!");
                System.out.println("Choose a number between 1 - 6");
            }

        }
    }
}