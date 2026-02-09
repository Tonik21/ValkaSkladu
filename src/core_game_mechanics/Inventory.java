package core_game_mechanics;

import java.util.ArrayList;

public class Inventory {
    private int capacity = 3;
    public ArrayList<Item> itemsInside;

    public Inventory(int capacity, ArrayList<Item> itemsInside) {
        this.itemsInside = itemsInside;
        this.capacity = capacity;
    }

    public void addItem(Item item) {
        if (itemsInside.size() < capacity) {
            itemsInside.add(item);
        }
    }

    public void removeItem(Item item) {
        itemsInside.remove(item);
    }

    public void printOutInventory(Inventory inventory){
        for (int i = 0; i < inventory.capacity; i++) {
            System.out.println( inventory.getItemsInside().get(i));
        }

    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Item> getItemsInside() {
        return itemsInside;
    }

    public void setItemsInside(ArrayList<Item> itemsInside) {
        this.itemsInside = itemsInside;
    }
}
