package command;
import core_game_mechanics.Game;

public class Move implements Command{
    private Game game;

    public Move(Game game) {
        this.game = game;
    }

    @Override
    public String execute(String direction) {
        return game.getPlayer().move(
                direction,
                game.getDataLoader().getRooms()
        );
    }


}
