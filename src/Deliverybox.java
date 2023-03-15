import java.util.ArrayDeque;
import java.util.Deque;
public class Deliverybox {
    // Attributes
    private Deque<Book> Booklist;

    // Constructor
    public void Deliverybox() {
        this.Booklist = new ArrayDeque<>();
    }

    // Methods
    public void addBook(ArrayDeque<Book> delivery) {
        for (Book book : delivery) {
            this.Booklist.push(book);
        }
    }
    public Book removeBook() {
        return this.Booklist.pop();
    }
}
