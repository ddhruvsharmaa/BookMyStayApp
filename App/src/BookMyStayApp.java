import java.util.*;

class Room {
    int id;
    boolean available = true;

    Room(int id) {
        this.id = id;
    }
}

class BookingRequest {
    String name;

    BookingRequest(String name) {
        this.name = name;
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {

        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(101));

        Queue<BookingRequest> q = new LinkedList<>();
        q.add(new BookingRequest("Dhruv"));

        BookingRequest req = q.poll();

        for (Room r : rooms) {
            if (r.available) {
                r.available = false;
                System.out.println("Booked for " + req.name);
            }
        }
    }
}