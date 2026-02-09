package characters;


import core_game_mechanics.Inventory;
import core_game_mechanics.Item;
import rooms.Warehouse;


public class Vendor extends InGameCharacter {
    Warehouse warehouse = new Warehouse();
    public Vendor(String nameOfCharacter, String locationId,String dialogue) {
        super(nameOfCharacter, locationId, dialogue);
    }


    public void buyItemFromPlayer(Item item, Player player) {
        Inventory inv = player.getInventory();
        if (inv.getItemsInside().contains(item)) {
            player.addMoney(item.getBasePrice());
            inv.removeItem(item);
            System.out.println("[" + getNameOfCharacter() + "]: Here you go "
                    + item.getBasePrice() + " coins.");
        } else {
            System.out.println("[" + getNameOfCharacter() + "]: Not in inventory!");
        }
}
}
