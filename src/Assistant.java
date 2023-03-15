
import java.util.ArrayList;
import java.util.HashMap;

public class Assistant {

    private final static int nbBookMax = 10;
    private int bookCarried;
    private HashMap<Main.bookSection, ArrayList<Book>> books;

    public void Assistant() {
        this.bookCarried = 0;
        this.books = new HashMap<>();
        for (Main.bookSection type: Main.bookSection.values()){
            this.books.put(type, new ArrayList<>());
        }
    }

    public void pickUp(Book book){
        this.books.get(book.getType()).add(book);
    }

    //public void tidyUp();
}
