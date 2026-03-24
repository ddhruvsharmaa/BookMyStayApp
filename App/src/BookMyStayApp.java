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

    void display() {
        for (Room r : map.values()) {
            System.out.println(r.id + " " + r.type);
        }
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        RoomService rs = new RoomService();
        rs.add(new Room(101, "Single"));
        rs.add(new Room(102, "Double"));

        rs.display();
    }
}