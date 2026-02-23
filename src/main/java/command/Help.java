package command;

import core_game_mechanics.Game;

/**
 * prikaz tiskne vsechny prikazy a co delaji
 */
public class Help implements Command{
    private Game game;

    public Help(Game game) {
        this.game = game;
    }

    @Override
    public String execute(String Command) {
        return "move <direction>\n" +
                "endgame\n" +
                "Interact <StorageRoomId> or to pay a warehouse enterance fee\n" +
                "Talk - invokes dialogue of character\n" +
                "inventory - prints out inventory\n" +
                "status - prints out status\n" +
                "sell <ItemName>\n" +
                "Help\n" +
                "bid <amount>\n" +
                "Take <itemName>\n" +
                "Endgame";

    }


}
