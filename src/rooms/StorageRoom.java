package rooms;

import core_game_mechanics.Game;
import core_game_mechanics.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class StorageRoom{
    private int roomId;
    private Warehouse warehouse;
    private int startingPrice;
    private int sizeOfArraylist = 3;
    private List<Item> itemsInside = new ArrayList<>();;
    private Game game;

    public StorageRoom(int roomId, Game game) {
        this.roomId = roomId;
        this.game = game;
    }

    public void generateItems() {
        for (int i = 0; i < sizeOfArraylist; i++) {
            itemsInside.add(i, generateItem());
            System.out.println(itemsInside.get(i));
        }

    }

    public Item generateItem() {
        Random rnd1 = new Random();
        int sumOfRarities = 0;
        for (Item item : game.getItems()){
            sumOfRarities+=item.getRarity();
        }
        int roll = rnd1.nextInt(0, sumOfRarities);
        for (Item item : game.getItems()){
            if (roll<=item.getRarity()){
                return item;
            }
            roll -= item.getRarity();
        }
        return  null;
    }
    public void interactItem(Item item){
        System.out.println(item.getNameOfItem() + " " + item.getBasePrice() + " " + item.getRarity());
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
}
