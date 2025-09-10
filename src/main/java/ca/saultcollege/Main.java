package ca.saultcollege;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        int userChoice;
        do {
            System.out.println("\n-----------------");
            System.out.println("    1. Add Book");
            System.out.println("    2. Edit Book");
            System.out.println("    3. Delete Book");
            System.out.println("    4. List Books");
            System.out.println("    99. Exit");
            System.out.println("-----------------");
            System.out.print("Enter your choice: ");
            userChoice = Integer.parseInt(in.nextLine());

            switch (userChoice) {
                case 1 -> addBook();
                case 2 -> editBook();
                case 3 -> deleteBook();
                case 4 -> listBooks();
                case 99 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");

            }
        } while (userChoice != 99);

    }

    public static void addBook() {
        System.out.print("Enter title: ");
        String title = in.nextLine();
        System.out.print("Enter author: ");
        String author = in.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = in.nextLine();
        int pageCount;
        while (true) {
            System.out.print("Enter page count: ");
            String input = in.nextLine();
            try {
                pageCount = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number for page count.");
            }
        }
        books.add(new Book(title, author, isbn, pageCount));

    }

    private static void editBook() {
        if (books.isEmpty()) {
            System.out.println("No books found");
            return;
        }
        listBooks();
    }

    private static void deleteBook() {
        if (books.isEmpty()) {
            System.out.println("No books to delete.");
            return;
        }
        listBooks();
    }

    private static void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books added yet.");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }
}