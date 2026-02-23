package characters;

import core_game_mechanics.Inventory;
import rooms.Room;
import rooms.StorageRoom;

/**
 * Toto je třída Player, ukládá aktualní informace o hráčovi
 */
public class Player {
    private Room locationRightNow;
    private StorageRoom roomBiddedOn;
    private int money;
    private Inventory inventory;
    private boolean inAuction;

    public Player() {
        this.inventory = new Inventory();
        this.money = 1000;

    }

    public double addMoney(double amount){
        return money += amount;
    }
    public void removeMoney(int amount){
        money -= amount;
    }


    public int getMoney() {
        return money;
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
