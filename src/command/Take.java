package command;

import core_game_mechanics.Game;
import core_game_mechanics.Inventory;
import core_game_mechanics.Item;

public class Take implements Command{
   private Game game;

    public Take(Game game) {
        this.game = game;
    }

    //put item in room to inventory
    @Override
    public String execute(String Command) {
        game.getPlayer().getInventory().addItem(game.ge);
        return "vzals item";
    }


}
