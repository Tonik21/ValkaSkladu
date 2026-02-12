package command;

import characters.Player;
import core_game_mechanics.Game;

public class Status implements Command{
    private Game game;
    //print out status(money)

    public Status(Game game) {
        this.game = game;
    }

    @Override
    public String execute(String Command) {
        Player player = game.getPlayer();
        return "you are currently worth: " + player.getMoney()+ " $  "+ player.getLocationRightNow();
    }


}
