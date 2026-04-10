abstract class Room {
    private int beds;
    private int size;
    private double price;
    public Room(int beds, int size, double price) {
        this.beds = beds;
        this.size = size;
        this.price = price;
    }
    public int getBeds() {
        return beds;
    }
    public int getSize() {
        return size;
    }
    public double getPrice() {
        return price;
    }
    public abstract String getRoomType();
    public void displayDetails() {
        System.out.println("Room Type : " + getRoomType());
        System.out.println("Beds      : " + beds);
        System.out.println("Size      : " + size + " sq.ft");
        System.out.println("Price     : Rs." + price);
    }
}
class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 120, 1500.0);
    }
    public String getRoomType() {
        return "Single Room";
    }
}
class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 200, 2500.0);
    }
    public String getRoomType() {
        return "Double Room";
    }
}
class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 350, 5000.0);
    }

    public String getRoomType() {
        return "Suite Room";
    }
}
public class HotelBookingApp {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("   Welcome to Book My Stay App");
        System.out.println("   Version: 2.1");
        System.out.println("====================================");

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;
        single.displayDetails();
        System.out.println("Available : " + singleAvailable);
        System.out.println();
        doubleRoom.displayDetails();
        System.out.println("Available : " + doubleAvailable);
        System.out.println();
        suite.displayDetails();
        System.out.println("Available : " + suiteAvailable);
    }
}