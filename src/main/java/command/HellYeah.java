package command;

import core_game_mechanics.Game;

/**
 * specialni command ve finalni mistnosti hry
 */
public class HellYeah implements Command{
    private Game game;

    public HellYeah(Game game) {
        this.game = game;
    }

    @Override
    public String execute(String Command) {
            game.endGame();
            return "========YOU ARE THE BEST TO EVER DO IT========";
    }
}
