package command;

import characters.InGameCharacter;
import characters.Player;
import core_game_mechanics.Game;
import rooms.Room;

import java.util.ArrayList;

public class Talk implements Command{
    private Game game;
    //interact with Character in room

    public Talk(Game game) {
        this.game = game;
    }

    @Override
    public String execute(String characterName) {
        Player player = game.getPlayer();
        Room currentRoom = player.getLocationRightNow();
        ArrayList<InGameCharacter> charactersHere = new ArrayList<>();

        for (InGameCharacter character : game.getDataLoader().getCharacters()) {
            if (character.getLocationId().equals(currentRoom.getNameOfLocation())) {
                charactersHere.add(character);
            }
        }
        if (charactersHere.isEmpty()) {
            return "V místnosti nikdo není.";
        }
        InGameCharacter character = charactersHere.get(0);
        return "Mluvíš s " + character.getNameOfCharacter() + ": " + character.getDialogue();
    }


}
