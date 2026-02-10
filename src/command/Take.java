package command;

import core_game_mechanics.Game;
import characters.Player;
import core_game_mechanics.Item;
import rooms.StorageRoom;

public class Take implements Command{
   private Game game;

    public Take(Game game) {
        this.game = game;
    }

    //put item in room to inventory
    @Override
    public String execute(String itemName) {
        Player player = game.getPlayer();
        StorageRoom storageRoom = player.getRoomBiddedOn();

        if (storageRoom == null) {
            return "Nemáš přístup k žádné StorageRoom! Použij 'access <ID>' nejdřív.";
        }
        Item item = storageRoom.findItem(itemName);

        if (item == null) {
            return "Předmět '" + itemName + "' není v této StorageRoom.";
        }

        if (player.getInventory().getItemsInside().size() >= player.getInventory().getCapacity()) {
            return "inventory is full! ";
        }

        storageRoom.removeItem(item);
        player.getInventory().addItem(item);

        return "Vzal jsi: " + item.getNameOfItem();
    }

}
