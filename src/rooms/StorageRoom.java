package rooms;

import core_game_mechanics.Game;
import core_game_mechanics.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class StorageRoom {
    private int roomId;
    private Warehouse warehouse;
    private int startingPrice;
    private int sizeOfArraylist = 3;
    private List<Item> itemsInside = new ArrayList<>();
    private int currentHighestBid;

    public StorageRoom() {}

    public StorageRoom(int roomId) {
        this.roomId = roomId;
    }

    public void generateItems(List<Item> availableItems) {
        for (int i = 0; i < sizeOfArraylist; i++) {
            itemsInside.add(generateItem(availableItems));
            System.out.println(itemsInside.get(i));
        }
    }

    public Item generateItem(List<Item> availableItems) {
        Random rnd1 = new Random();
        int sumOfRarities = 0;
        for (Item item : availableItems){
            sumOfRarities += item.getRarity();
        }
        int roll = rnd1.nextInt(0, sumOfRarities);
        for (Item item : availableItems){
            if (roll <= item.getRarity()){
                return item;
            }
            roll -= item.getRarity();
        }
        return null;
    }

    public Item findItem(String name) {
        for (Item item : itemsInside) {
            if (item.getNameOfItem().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public void removeItem(Item item) {
        itemsInside.remove(item);
    }

    public List<Item> getItemsInside() {
        return itemsInside;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(int startingPrice) {
        this.startingPrice = startingPrice;
    }

    public int getCurrentHighestBid() {
        return currentHighestBid;
    }

    public void setCurrentHighestBid(int currentHighestBid) {
        this.currentHighestBid = currentHighestBid;
    }
}
