import java.util.*;

class BookingRequest {
    String name;

    BookingRequest(String name) {
        this.name = name;
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        Queue<BookingRequest> q = new LinkedList<>();

        q.add(new BookingRequest("Dhruv"));
        q.add(new BookingRequest("Aman"));

        System.out.println("Queue size: " + q.size());
    }
}