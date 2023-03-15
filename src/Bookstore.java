import java.util.HashMap;

public final class Bookstore{
    // Attributes
    private static Bookstore instance;
    private static Deliverybox deliveryBox;
    private HashMap<Main.bookSection, Section> sections;


    // Methods
    public static Bookstore getInstance() {
        if (instance == null) {
            instance = new Bookstore ();
            deliveryBox = new Deliverybox();
        }
        return instance;
    }
    public void setSection(HashMap<Main.bookSection,Section> section) {
        this.sections = section;
    }

    public HashMap<Main.bookSection, Section> getSections() {
        return sections;
    }
}
