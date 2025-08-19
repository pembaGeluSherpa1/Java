import java.util.ArrayList;

class BookOperation {
    ArrayList<Category> categories;
    
    public BookOperation() {
        categories = new ArrayList<>();
    }
    
    public void addCategory(String name) {
        categories.add(new Category(name));
    }
    
    public void addBook(String categoryName, String title, String author, String isbn) {
        for (Category category : categories) {
            if (category.name.equalsIgnoreCase(categoryName)) {
                category.books.add(new Book(title, author, isbn));
                System.out.println("Book added successfully!");
                return;
            }
        }
        System.out.println("Category not found!");
    }
    
    public void updateBook(String isbn, String newTitle, String newAuthor) {
        for (Category category : categories) {
            for (Book book : category.books) {
                if (book.isbn.equals(isbn)) {
                    book.title = newTitle;
                    book.author = newAuthor;
                    System.out.println("Book updated successfully!");
                    return;
                }
            }
        }
        System.out.println("Book not found!");
    }
    
    public void deleteBook(String isbn) {
        for (Category category : categories) {
            for (Book book : category.books) {
                if (book.isbn.equals(isbn)) {
                    category.books.remove(book);
                    System.out.println("Book deleted successfully!");
                    return;
                }
            }
        }
        System.out.println("Book not found!");
    }
    
    public void displayBooks() {
        for (Category category : categories) {
            System.out.println("Category: " + category.name);
            for (Book book : category.books) {
                System.out.println(book);
            }
        }
    }
}