package rooms;

import java.util.HashMap;

public class Warehouse extends Room {
    private double itemPriceMultiplier;
    private int entranceFee;
    public Warehouse(){}
    public Warehouse(String name, String character, HashMap<String,String> directionsToNeighbours, double itemRarityMultiplier, int entranceFee) {
        super(name, character, directionsToNeighbours);
        this.itemPriceMultiplier = itemRarityMultiplier;
        this.entranceFee = entranceFee;
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
