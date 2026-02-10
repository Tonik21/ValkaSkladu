package rooms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Warehouse extends Room {
    private double itemPriceMultiplier;
    private int entranceFee;
    private List<StorageRoom> storageRooms;

    public Warehouse(){}

    public Warehouse(String name, String character, HashMap<String,String> directionsToNeighbours,
                     double itemRarityMultiplier, int entranceFee) {
        super(name, character, directionsToNeighbours);
        this.itemPriceMultiplier = itemRarityMultiplier;
        this.entranceFee = entranceFee;
        this.storageRooms = new ArrayList<>();
    }
    public void addStorageRoom(StorageRoom room) {
        storageRooms.add(room);
    }

    public List<StorageRoom> getStorageRoom() {
        return storageRooms;
    }
    public StorageRoom findStorageRoom(int roomId) {
        for (StorageRoom room : storageRooms) {
            if (room.getRoomId() == roomId) {
                return room;
            }
        }
        return null;
    }
    public double getItemPriceMultiplier() {
        return itemPriceMultiplier;
    }

    public void setItemPriceMultiplier(double itemPriceMultiplier) {
        this.itemPriceMultiplier = itemPriceMultiplier;
    }

    public int getEntranceFee() {
        return entranceFee;
    }

    public void setEntranceFee(int entranceFee) {
        this.entranceFee = entranceFee;
    }
}
