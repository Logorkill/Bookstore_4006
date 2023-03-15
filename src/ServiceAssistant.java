public class ServiceAssistant implements Runnable {

    private final Assistant assistant;

    public ServiceAssistant(Assistant assistant) {
        this.assistant = assistant;
    }

    @Override
    public void run() {
        System.out.println("assistant 1 look " + Main.bookstore.getSections());
    }
}
