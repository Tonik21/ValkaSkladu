package command;

import characters.Player;
import core_game_mechanics.Game;
import core_game_mechanics.Item;
import rooms.Room;

/**
 * prikaz pro prodej itemu
 */
public class Sell implements Command {
    private Game game;

    public Sell(Game game) {
        this.game = game;
    }

    /**
     * metoda overi jestli hrac ma zadany item a pak ho 'proda'
     * @param itemName - Jmeno Itemu
     * @return informace o prodanem predmetu
     */
    @Override
    public String execute(String itemName) {
        Player player = game.getPlayer();

        Item item = player.getInventory().findItem(itemName);
        if (item == null) {
            return "You dont have : " + itemName;
        }

        player.getInventory().removeItem(item);
        player.addMoney(item.getBasePrice());

        return "You sold " + item.getNameOfItem() + " for " + item.getBasePrice();
    }
}