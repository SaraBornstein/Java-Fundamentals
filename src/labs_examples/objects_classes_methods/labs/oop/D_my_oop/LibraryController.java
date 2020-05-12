package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Scanner;

public class LibraryController {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add a book? (y/n)");
        while(scanner.next().equalsIgnoreCase("y")){
            library.getBookshelf().add(getNewBookFromUser());
        }

        library.printBookshelf();
        System.out.println("Number of books: " + library.getBookshelf().size());
    }

    public static Book getNewBookFromUser(){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Title: ");
        String enteredTitle = scanner.nextLine();

        System.out.print("Author: ");
        String enteredAuthor = scanner.nextLine();

        System.out.print("Published Date: ");
        int enteredPublishedYear = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Summary: ");
        String enteredSummary = scanner.nextLine();

        System.out.print("Rate the book from 1-5");
        int enteredRating = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Review: ");
        String enteredReview = scanner.nextLine();

        System.out.print("Location: ");
        String enteredLocation = scanner.nextLine();

        Book book = new Book(enteredTitle, enteredAuthor, enteredPublishedYear, enteredSummary, enteredRating, enteredReview, enteredLocation);

        return book;
    }
}

