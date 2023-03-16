import java.util.ArrayDeque;
public class Deliverybox {
    // Attributes
    private static ArrayDeque<Book> booklist = new ArrayDeque<>();

    // Methods
    public void addBook(Book book) {
        this.booklist.push(book);
    }
    public Book removeBook() {
        return this.booklist.pop();
    }

    @Override
    public String toString() {
        return booklist.toString();
    }
}
