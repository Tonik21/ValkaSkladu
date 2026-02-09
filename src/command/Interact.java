package command;

import core_game_mechanics.Game;

public class Interact implements Command{
    private Game game;
    //since there's not a movement between rooms and storage rooms just interact with Storage room (appraise items/take them)
    @Override
    public String execute(String Command) {
        return "";
    }



}
