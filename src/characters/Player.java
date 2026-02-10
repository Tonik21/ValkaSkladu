package characters;

import command.InventoryPrint;
import core_game_mechanics.Inventory;
import rooms.Room;
import rooms.StorageRoom;

import java.util.List;

public class Player {
    private String nameOfCharacter;
    private Room locationRightNow;
    private StorageRoom roomBiddedOn;
    private int money;
    private Inventory inventory;
    private boolean inAuction;


    public Player() {
        this.inventory = new Inventory();
        this.money = 500;

    }

    public void addMoney(double amount){
        money += amount;
    }
    public void removeMoney(int amount){
        money -= amount;
    }
    public String move(String direction, List<Room> allRooms) {
        if (locationRightNow.getNameOfLocation().equals("Gateway") && direction.equalsIgnoreCase("north")) {
            if (this.money < 10000) {
                return "Gateway has a lock with a moneysign on it there says need to get 10000";
            }
        }
        String targetId = locationRightNow.getDirectionsToNeighbours().get(direction.toLowerCase());

        if (targetId == null) {
            return "You can't go that way.";
        }
        for (Room room : allRooms) {
            if (room.getNameOfLocation().equalsIgnoreCase(targetId)) {
                setLocationRightNow(room);
                return "You moved to " + room.getNameOfLocation();
            }
        }
        return "Target location not found.";
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

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public StorageRoom getRoomBiddedOn() {
        return roomBiddedOn;
    }

    public void setRoomBiddedOn(StorageRoom roomBiddedOn) {
        this.roomBiddedOn = roomBiddedOn;
    }

    public boolean isInAuction() {
        return inAuction;
    }

    public void setInAuction(boolean inAuction) {
        this.inAuction = inAuction;
    }
}
