package rooms;

import characters.InGameCharacter;

import java.util.HashMap;

public class Warehouse extends Room {
    private double itemRarityMultiplier;
    private int entranceFee;
    public Warehouse(){}
    public Warehouse(String name, String character, HashMap<String,String> directionsToNeighbours, double itemRarityMultiplier, int entranceFee) {
        super(name, character, directionsToNeighbours);
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
