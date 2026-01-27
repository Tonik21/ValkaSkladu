package command;

import rooms.StorageRoom;

public class Interact implements Command{
    private StorageRoom targetRoom;
    //since there's not a movement between rooms and storage rooms just interact with Storage room (appraise items/take them)
    @Override
    public String execute(String Command) {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
