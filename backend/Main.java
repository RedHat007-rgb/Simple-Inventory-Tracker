
public class Main {
    public static void main(String[] args) {
        System.out.println("Simple-Inventory-Tracker");
        InventoryManager newInventory=new InventoryManager(10);
        System.err.println(newInventory.addItem());

    }
}
