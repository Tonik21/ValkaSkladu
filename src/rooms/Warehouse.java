package rooms;

import characters.Character;

import java.util.List;

public class Warehouse extends Room {
    private double itemRarityMultiplier;
    private int entranceFee;

    public Warehouse(String name, Character character, List<Room> sisterLocations, double itemRarityMultiplier, int entranceFee) {
        super(name, character, sisterLocations);
        this.itemRarityMultiplier = itemRarityMultiplier;
        this.entranceFee = entranceFee;
    }

    public double getItemRarityMultiplier() {
        return itemRarityMultiplier;
    }

    public void setItemRarityMultiplier(double itemRarityMultiplier) {
        this.itemRarityMultiplier = itemRarityMultiplier;
    }

    public int getEntranceFee() {
        return entranceFee;
    }

    public void setEntranceFee(int entranceFee) {
        this.entranceFee = entranceFee;
    }
}
