import java.util.Scanner;

public class BookKeepingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookOperation bookOperation = new BookOperation();
        
        System.out.println("Enter at least 3 categories:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Category " + (i + 1) + ": ");
            String category = scanner.nextLine();
            bookOperation.addCategory(category);
        }
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    bookOperation.addBook(category, title, author, isbn);
                    break;
                case 2:
                    System.out.print("Enter ISBN of the book to update: ");
                    String updateIsbn = scanner.nextLine();
                    System.out.print("Enter new Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new Author: ");
                    String newAuthor = scanner.nextLine();
                    bookOperation.updateBook(updateIsbn, newTitle, newAuthor);
                    break;
                case 3:
                    System.out.print("Enter ISBN of the book to delete: ");
                    String deleteIsbn = scanner.nextLine();
                    bookOperation.deleteBook(deleteIsbn);
                    break;
                case 4:
                    bookOperation.displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
