import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Library library = new Library();
        ReadFile data = new ReadFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our Library Management System!");
        
        while (true) {
        
            System.out.println();
            System.out.println("\"info\" to bring up the menu...");
            System.out.println("\"exit\" to exit the program...");
            System.out.print("Choose your destiny: ");
        
            String input = scanner.nextLine();

            System.out.println();
            switch(input.toLowerCase()) {
            case "exit":
                System.out.println("Exiting program...");
                System.out.println("Have a great day, super awesome chad coder!");
                System.exit(0);
                break;
            case "info":
                System.out.println("1. Browse our library");
                System.out.println("2. Recieve details of a particular book");
                System.out.println("3. Checkout a book by title");
                System.out.println("4. Checkout a book with ISBN");
                System.out.println("5. Return your book by title");
                System.out.println("6. Return your book with ISBN");
                break;
            case "back":
                break;
            default:
                try {
                    switch (Integer.parseInt(input)) {
                    case 1: 
                        System.out.println("Please browse our library for a book that suits your interests!");
                        System.out.println();
                        data.getLibrary();
                        break;
                    case 2:
                        System.out.print("Enter book title: ");
                        String title = scanner.nextLine();
                        library.bookDetails(title);
                        break;
                    case 3:
                        System.out.print("Enter book to checkout: ");
                        String titleCheckout = scanner.nextLine();
                        library.titleCheckout(titleCheckout);
                        break;
                    case 4:
                        System.out.print("Enter ISBN of book to checkout: ");
                        int numCheckout = scanner.nextInt();
                        scanner.nextLine();
                        library.isbnCheckout(numCheckout);
                        break;
                    case 5:
                        System.out.print("Enter title of book you're returning: ");
                        String titleReturn = scanner.nextLine();
                        library.titleReturn(titleReturn);
                        break;
                    case 6:
                        System.out.print("Enter ISBN of book you're returning: ");
                        int numReturn = scanner.nextInt();
                        scanner.nextLine();
                        library.isbnReturn(numReturn);
                        break;
                    default:
                        System.out.print("Invalid input: Enter a number between 1 and 6");
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input: Enter a number between 1 and 6");
                }
            }
        }
    }
}
