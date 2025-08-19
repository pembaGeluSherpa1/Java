import java.util.ArrayList;

class Category {
    String name;
    ArrayList<Book> books;
    
    public Category(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        return name;
    }
}