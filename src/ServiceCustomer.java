public class ServiceCustomer implements Runnable {

    private final Customer customer;

    public ServiceCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
        System.out.println("customer 1 look " + Main.bookstore.getSections());
    }
}
