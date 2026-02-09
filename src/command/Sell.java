package command;

import characters.Vendor;
import core_game_mechanics.Game;

public class Sell implements Command {
    private Game game;

    public Sell(Game game) {
        this.game = game;
    }

    @Override
    public String execute(String itemName) {
        Vendor vendor = (Vendor) game.getDataLoader().getCharacters().get(0);
        return "";
    }
}