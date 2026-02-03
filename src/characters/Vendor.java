package characters;

import core_game_mechanics.Inventory;
import core_game_mechanics.Item;
import rooms.Room;

public class Vendor extends InGameCharacter {
    public Vendor(String nameOfCharacter, String locationId,String dialogue) {
        super(nameOfCharacter, locationId, dialogue);
    }

    public void vendorsSell(Item item, Player pl1, Inventory inv1){
        pl1.addMoney(item.getBasePrice());
        inv1.removeItem(item);
    }
}
