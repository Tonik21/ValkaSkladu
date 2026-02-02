package command;

import characters.InGameCharacter;

public class Talk implements Command{
    private InGameCharacter inGameCharacter;
    //interact with Character in room
    @Override
    public String execute(String Command) {
        return inGameCharacter.getDialogue();
    }


}
