package command;

import core_game_mechanics.Inventory;

public class InventoryPrint implements Command{
    Inventory inventory;
    //print Inventory
    @Override
    public String execute(String Command) {
        inventory.printOutInventory(inventory);
        return "=============Inventory Printed=============";
    }


}
