import java.util.HashMap;
import java.util.Map;

/**
 * Use Case 3: Centralized Room Inventory Management
 *
 * This program demonstrates centralized room availability
 * management using HashMap.
 *
 * @author Madhuri
 * @version 3.1
 */
class RoomInventory {
    private HashMap<String, Integer> inventory;

    /**
     * Constructor initializes the inventory
     * with default availability values.
     */
    public RoomInventory() {
        inventory = new HashMap<>();
        initializeInventory();
    }

    /**
     * Initializes room availability data.
     */
    private void initializeInventory() {
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
    }

    /**
     * Returns current availability for a room type.
     */
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    /**
     * Updates availability in a controlled manner.
     */
    public void updateAvailability(String roomType, int count) {
        inventory.put(roomType, count);
    }

    /**
     * Displays complete inventory.
     */
    public void displayInventory() {
        System.out.println("===== Current Room Inventory =====");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

/**
 * Main application class
 */
public class HotelBookingApp {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("   Welcome to Book My Stay App");
        System.out.println("   Version: 3.1");
        System.out.println("====================================");

        RoomInventory roomInventory = new RoomInventory();

        roomInventory.displayInventory();

        System.out.println("\nAfter booking 1 Single Room:");
        roomInventory.updateAvailability(
                "Single Room",
                roomInventory.getAvailability("Single Room") - 1
        );

        roomInventory.displayInventory();
    }
}