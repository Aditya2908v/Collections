package MapExample;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();
        inventorySystem.addToInventory("Apples", 10);
        inventorySystem.addToInventory("Bananas", 15);
        inventorySystem.addToInventory("Oranges", 20);


        inventorySystem.displayInventory();
        inventorySystem.removeFromInventory("Bananas", 5);
        inventorySystem.displayInventory();
    }
}

class InventorySystem{
    private Map<String, Integer> inventory;

    public InventorySystem(){
        inventory = new HashMap<>();
    }

    public void addToInventory(String item, int quantity){
        if(inventory.containsKey(item)) {
            int currentQuantity = inventory.get(item);
            inventory.put(item, currentQuantity + quantity);
        }else {
            inventory.put(item, quantity);
        }
    }

    public void removeFromInventory(String item, int quantity){
        if(inventory.containsKey(item)) {
            int currentQuantity = inventory.get(item);
            if (currentQuantity <= quantity) {
                inventory.remove(item);
            } else {
                inventory.put(item, currentQuantity - quantity);
            }
        }
    }

    public void displayInventory(){
        System.out.println("Inventory: ");
        /*
        * the entrySet() method in Java returns a 'Set' of all the key-value pairs
        * contained in the map.
        * The entrySet() method is used to iterate through each key-value pair in
        * the inventory.
        * This approach is commonly used to iterate through and process all the entries in
        * a Map as it provides access to both keys and values without needing separate key
        * and value iteration mechanisms.
        */

        for(Map.Entry<String, Integer> entry: inventory.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}