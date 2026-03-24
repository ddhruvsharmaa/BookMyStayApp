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

class RoomService {
    Map<Integer, Room> map = new HashMap<>();

    void add(Room r) {
        map.put(r.id, r);
    }

    void searchAvailable() {
        for (Room r : map.values()) {
            if (r.available) {
                System.out.println("Available: " + r.id);
            }
        }
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        RoomService rs = new RoomService();
        rs.add(new Room(101, "Single"));

        rs.searchAvailable();
    }
}