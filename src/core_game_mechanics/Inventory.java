package core_game_mechanics;

import java.util.ArrayList;

public class Inventory {
    private int capacity;
    public ArrayList<Item> itemsInside;

    public Inventory(){
        this.capacity = 3;
        this.itemsInside = new ArrayList<>();
    }
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

    public void printOutInventory(){
        for (Item item: itemsInside) {
            System.out.println("-> "+item.getNameOfItem());
        }
    }
    public Item findItem(String name){
        for (Item item : itemsInside){
            if(item.getNameOfItem().equalsIgnoreCase(name)){
                return item;
            }
        }
        return null;
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
