import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our Library Management System!");
        System.out.println();
        System.out.println("To browse our library press 1");
        System.out.println("To checkout a book press 2 to enter book title");
        System.out.println("To checkout a book with ISBN, press 3 and enter ISBN");
        System.out.println("To return a book press 4 and enter the title!");
        System.out.println("To return a book with ISBN, press 5 and enter ISBN");
        System.out.println("Press 6 to enter name of book and see details");
        System.out.print("Choose your destiny: ");
        int choice = scanner.nextInt();

        while (true) {
            if (choice == 1) {
                mindset.printName();
            } else {
                return;
            } /* else if (choice == 2) {
                // changes isCheckedOut to true if book is available and congratulates user
                System.out.print("Enter title: ");
                String title = scanner.nextLine();
                if (library.contains(title) && isCheckedOut == false) {
                    title.isCheckedOut == true;
                    System.out.println("Congratulations, you have checked out " + title + "!");
                    return;
                } else {
                    System.out.println("Sorry, this book is not in our library!");
                    return;
                }
            } else if (choice == 3) {
                // changes isCheckedOut to true if book is available and congratulates user
                System.out.print("Enter ISBN number: ");
                int ISBN = scanner.nextInt();
                if (library.contains(ISBN) && isCheckedOut == false) {
                    title.isCheckedOut == true;
                    System.out.println("Congratulations, you have checked out " + this.isbn + "!");
                    return;
                } else {
                    System.out.println("Sorry, this book is not in our library!");
                    return;
                }
            } else if (choice == 4) {
                // returns isCheckedOut to false
                String title = scanner.nextLine();
                if (title.isCheckedOut) {
                    title.isCheckedOut = false;
                    System.out.println("Thank you for returning " + title.name + "!");
                    return;
                } else {
                    System.out.println("This book is not checked out! Would you like to check it out?");
                    return;
                }
            } else if (choice == 5) {
                // returns isCheckedOut to false
                int ISBN = scanner.nextInt();
                if (ISBN.isCheckedOut) {
                    ISBN.isCheckedOut = false;
                    System.out.println("Thank you for returning " + ISBN.name + "!");
                    return;
                } else {
                    System.out.println("This book is not checked out! Would you like to check it out?");
                    return;
                }
            } else if (choice == 6) {
                // prints details of book and its availability
                System.out.print("Enter title: ");
                String title = scanner.nextLine();
                printBook(title);
            } else {
                System.out.println("Invalid choice!");
                return;
            } */
        }
    }
}