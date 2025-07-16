import java.util.ArrayList;

public class Book {
    private String title;

    // No public constructor - only Library can create Books
    Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(new Book(title));
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book b : books) {
            System.out.println(b.getTitle());
        }
    }
}
