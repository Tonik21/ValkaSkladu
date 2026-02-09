package rooms;

import core_game_mechanics.Game;

import java.util.HashMap;

public class Warehouse extends Room {
    private double itemPriceMultiplier;
    private int entranceFee;
    private StorageRoom storageRoom;
    private Game game;
    public Warehouse(){}
    public Warehouse(String name, String character, HashMap<String,String> directionsToNeighbours, double itemRarityMultiplier, int entranceFee) {
        super(name, character, directionsToNeighbours);
        this.itemPriceMultiplier = itemRarityMultiplier;
        this.entranceFee = entranceFee;
        this.game = new Game();
        this.storageRoom = new StorageRoom(1, game);
    }


    public void accessStorageRoom(int roomId){
        if(roomId == storageRoom.getRoomId()){
            System.out.println("items generated");
            storageRoom.generateItems();
        }else {
            System.out.println("Id unaivable");
        };
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
