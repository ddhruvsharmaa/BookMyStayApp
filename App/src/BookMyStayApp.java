import java.util.*;

class Room {
    int id;
    String type;
    boolean available = true;

    Room(int id, String type) {
        this.id = id;
        this.type = type;
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {

        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(101, "Single"));
        rooms.add(new Room(102, "Double"));

        for(Room r : rooms) {
            System.out.println(r.id + " " + r.type + " Available: " + r.available);
        }
    }
}