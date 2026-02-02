package characters;

import command.Inventory;
import rooms.Room;

public class Player extends InGameCharacter {
    private int money;
    private Inventory inventory;


    public Player(String name, String locationId) {
        super(name, locationId);
    }

    public Player() {
    }

    public void addMoney(double amount){
        money += amount;
    }
    public void removeMoney(int amount){
        money -= amount;
    }

}
