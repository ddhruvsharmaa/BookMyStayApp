import java.util.*;

class Booking {
    int id;

    Booking(int id) {
        this.id = id;
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        List<Booking> history = new ArrayList<>();
        history.add(new Booking(1));

        System.out.println("History size: " + history.size());
    }
}