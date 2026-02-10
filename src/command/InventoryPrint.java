package command;

import core_game_mechanics.Game;
import core_game_mechanics.Inventory;

public class InventoryPrint implements Command{
    Game game;

    public InventoryPrint(Game game) {
        this.game = game;
    }

    //print Inventory
    @Override
    public String execute(String Command) {
        Inventory inventory = game.getPlayer().getInventory();
        if (inventory.getItemsInside().isEmpty()){
            return "empty";
        }
        inventory.printOutInventory();
        return "=============Inventory Printed=============";
    }


}
