package rooms;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Warehouse extends Room {
    private double itemPriceMultiplier;
    private int entranceFee;
    private List<StorageRoom> storageRooms = new ArrayList<>();
    @JsonIgnore
    private Boolean feepaid;

    public Warehouse() {
        this.feepaid = false;
    }

    public Warehouse(String name, String character, HashMap<String, String> directionsToNeighbours, double itemRarityMultiplier, int entranceFee, boolean feepaid) {
        super(name, character, directionsToNeighbours);
        this.itemPriceMultiplier = itemRarityMultiplier;
        this.entranceFee = entranceFee;
        this.storageRooms = new ArrayList<>();
        this.feepaid = false;
    }

    public void addStorageRoom(StorageRoom room) {
        storageRooms.add(room);
    }

    public StorageRoom findStorageRoom(int roomId) {
        for (StorageRoom room : storageRooms) {
            if (room.getRoomId() == roomId) {
                return room;
            }
        }
        return null;
    }

    public List<StorageRoom> getStorageRooms() {
        return storageRooms;
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

    public boolean getFeepaid() {
        return feepaid;
    }

    public void setFeepaid(boolean feepaid) {
        this.feepaid = feepaid;
    }
}
