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

    @Override
    public String execute(String itemName) {
        Player player = game.getPlayer();
        StorageRoom storageRoom = player.getRoomBiddedOn();

        if (storageRoom == null) {
            return "you did not open a storage room! use 'interact <ID>'";
        }
        Item item = storageRoom.findItem(itemName);

        if (item == null) {
            return "Item '" + itemName + "' Is not in the StorageRoom";
        }

        if (player.getInventory().getItemsInside().size() >= player.getInventory().getCapacity()) {
            return "inventory is full! ";
        }

        storageRoom.removeItem(item);
        player.getInventory().addItem(item);

        return "you took: " + item.getNameOfItem();
    }

}
