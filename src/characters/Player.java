package characters;

import command.InventoryPrint;
import rooms.Room;

public class Player {
    private String nameOfCharacter;
    private Room locationRightNow;
    private int money;
    private InventoryPrint inventory;


    public Player() {
    }

    public void addMoney(double amount){
        money += amount;
    }
    public void removeMoney(int amount){
        money -= amount;
    }
    public void moveNextRoom(String direction){
    Room room = locationRightNow;
        room.printOutAvailableLocations();
        switch (direction){
        case "north":

        case "south":

        case "west":

        case "east":
}

    }


    public String getNameOfCharacter() {
        return nameOfCharacter;
    }

    public void setNameOfCharacter(String nameOfCharacter) {
        this.nameOfCharacter = nameOfCharacter;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Room getLocationRightNow() {
        return locationRightNow;
    }

    public void setLocationRightNow(Room locationRightNow) {
        this.locationRightNow = locationRightNow;
    }

    public InventoryPrint getInventory() {
        return inventory;
    }

    public void setInventory(InventoryPrint inventory) {
        this.inventory = inventory;
    }
}
