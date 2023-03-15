import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import static java.lang.Thread.sleep;

public class Main {
    public static Bookstore bookstore = Bookstore.getInstance();
    public final static int assistantCapacity = 5;
    public final static int customerCapacity = 1;
    public enum bookSection {
        FICTION, HORROR, ROMANCE, FANTASY, POETRY, HISTORY
    }
    public static void main(String[] args) {
        buildLibrary(bookstore);

        ArrayList<Assistant> assistants = new ArrayList<>();
        employAssistant(assistants);
        ArrayList<Customer> customers = new ArrayList<>();
        attractCustomer(customers);

        for(Assistant assistant: assistants){
            new ServiceAssistant(assistant).run();
        }
        for(Customer customer : customers){
            new ServiceCustomer(customer).run();
        }

        System.out.println(bookstore.getSections());
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void buildLibrary(Bookstore bookstore){
            //create section for books
            HashMap< bookSection, ArrayList<Book>> books = new HashMap<>();
            for (Main.bookSection type: Main.bookSection.values()){
                books.put(type, new ArrayList<>());
            }

            //create books
            int cpt;
            for(cpt=0;cpt<10;cpt++){
                int randomInt = new Random().nextInt(bookSection.values().length);
                bookSection randomSection = bookSection.values()[randomInt];
                books.get(randomSection).add(new Book(randomSection));
            }
            //create sections
            HashMap<Main.bookSection, Section>  sections = new HashMap<>();
            for (bookSection type: bookSection.values()){
                sections.put(type,(new Section(type, books.get(type))));
            }
            bookstore.setSection(sections);
        }
        public static void employAssistant(ArrayList<Assistant> assistants){
            for(int cpt=0;cpt<assistantCapacity;cpt++){
                assistants.add(new Assistant());
            }
        }
        public static void attractCustomer(ArrayList<Customer> customers){
            for(int cpt=0;cpt<customerCapacity;cpt++){
                customers.add(new Customer());
            }
        }
    }

