import java.util.*;

class Booking {
    int roomId;
    List<String> services = new ArrayList<>();

    Booking(int id) {
        roomId = id;
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        Booking b = new Booking(101);
        b.services.add("WiFi");

        System.out.println(b.services);
    }
}