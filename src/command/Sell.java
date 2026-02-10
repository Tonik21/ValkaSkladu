package command;

import characters.InGameCharacter;
import characters.Player;
import characters.Vendor;
import core_game_mechanics.Game;
import core_game_mechanics.Item;
import rooms.Room;

public class Sell implements Command {
    private Game game;

    public Sell(Game game) {
        this.game = game;
    }

    @Override
    public String execute(String itemName) {
        Player player = game.getPlayer();
        Room currentRoom = player.getLocationRightNow();

        if (!currentRoom.getNameOfLocation().equals("VendorsHome")) {
            return "Nejsi u vendora";
        }
        Item item = player.getInventory().findItem(itemName);
        if (item == null) {
            return "Nemáš předmět: " + itemName;
        }

        player.getInventory().removeItem(item);
        player.addMoney(item.getBasePrice());

        return "Prodal jsi " + item.getNameOfItem() + " za " + item.getBasePrice() + " Kč";
    }
}