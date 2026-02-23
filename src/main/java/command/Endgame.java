package command;

import core_game_mechanics.Game;

/**
 * prikaz ukonci gameloop
 */
public class Endgame implements Command{
    private Game game;

    public Endgame(Game game) {
        this.game = game;
    }

    @Override
    public String execute(String Command) {
        game.endGame();
        return "End of Game";
    }


}
