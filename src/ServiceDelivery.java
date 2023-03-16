import java.awt.*;
import java.util.Random;

public class ServiceDelivery implements Runnable {
    private final Deliverybox deliverybox;
    private int booksStock = 0;
    private int ticks = 0;

    public ServiceDelivery(Deliverybox deliverybox) {
        this.deliverybox = deliverybox;
    }

    @Override
    public void run() {
        System.out.println("assistant 1 took " + Main.bookstore.getSections());

        while (ticks < 20) {
            try {
                Thread.sleep(Main.TIME_TICK_SIZE * 100);
                ticks += 1;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //System.out.println("1 TICK PASSED  |  " + ticks + " / 1000 TICKS");

            // add 10 books
            int rdm = new Random().nextInt(100);

            if (rdm == 1) {
                int cpt;

                Book book;
                for (cpt = 0; cpt < 10; cpt++) {
                    int randomInt = new Random().nextInt(Main.bookSection.values().length);
                    Main.bookSection randomSection = Main.bookSection.values()[randomInt];
                    book = new Book(randomSection);
                    deliverybox.addBook(book);
                    booksStock += 1;
                }
                System.out.println("Delivery of 10 books arrived !");
                // System.out.println(deliverybox.toString());
                System.out.println("Stock count : " + booksStock);
            }
        }
    }
}
