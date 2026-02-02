package command;

import core_game_mechanics.Inventory;
import core_game_mechanics.Item;

public class Take implements Command{
    private Item item;
    private Inventory inventory;

    public Take() {
    }

    //put item in room to inventory
    @Override
    public String execute(String Command) {
        inventory.addItem(item);
        return "vzals item";
    }


}
