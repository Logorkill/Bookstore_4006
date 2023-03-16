import java.util.Random;

public class ServiceCustomer implements Runnable {

    private final Customer customer;

    public ServiceCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {

        int randomInt = new Random().nextInt(Main.bookSection.values().length);
        Main.bookSection randomSection = Main.bookSection.values()[randomInt];
        Book book = Main.bookstore.getSpecificBook(randomSection);
        if (book == null) {
            System.out.println("customer 1 is waiting for a book in " + Main.bookstore.getSections());
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            customer.setBooks(book);
            System.out.println("customer 1 took " + Main.bookstore.getSections());
        }
    }
}
