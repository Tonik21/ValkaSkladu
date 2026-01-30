package characters;

import command.Inventory;
import rooms.Room;

public class Player extends Character{
    private int money;
    private Inventory inventory;


    public Player(String name, Room location) {
        super(name, location);
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
