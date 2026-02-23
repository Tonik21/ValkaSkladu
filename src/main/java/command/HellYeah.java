package command;

import core_game_mechanics.Game;

public class HellYeah implements Command{
    private Game game;

    public HellYeah(Game game) {
        this.game = game;
    }

    @Override
    public String execute(String Command) {
        String currentLocation = game.getPlayer().getLocationRightNow().getNameOfLocation();
        if (currentLocation.equals("Richards Office")){
            game.endGame();
            return "========YOU ARE THE BEST TO EVER DO IT========";
        }
        return "You are not located in richards office";
    }
}
