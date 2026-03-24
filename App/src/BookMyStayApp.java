public class BookMyStayApp {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println(Thread.currentThread().getName());

        new Thread(r).start();
        new Thread(r).start();
    }
}