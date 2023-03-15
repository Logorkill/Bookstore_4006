import java.util.ArrayList;

public class Section {
    // Attributes
    private Main.bookSection type;
    private ArrayList<Book> books;

    // Constructor
    public Section(Main.bookSection type, ArrayList<Book> books) {
        this.type = type;
        this.books = books;
    }
}
