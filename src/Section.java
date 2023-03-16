import java.util.ArrayList;
import java.util.Random;

public class Section {
    // Attributes
    private Main.bookSection type;
    private ArrayList<Book> books;

    // Constructor
    public Section(Main.bookSection type, ArrayList<Book> books) {
        this.type = type;
        this.books = books;
    }

    public Book getBook() {
        int randomInt = new Random().nextInt(books.size());
        if (books.size() == 0)
            return null;
        return this.books.get(randomInt);
    }
}
