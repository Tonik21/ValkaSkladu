package characters;

import core_game_mechanics.Inventory;
import core_game_mechanics.Item;
import rooms.Room;

public class Vendor extends Character {
    public Vendor(String nameOfCharacter, Room location) {
        super(nameOfCharacter, location);
    }

    public void sell(Item item, Player pl1, Inventory inv1){
        pl1.addMoney(item.getBasePrice());
        inv1.itemsInside.remove(item);
    }
}
