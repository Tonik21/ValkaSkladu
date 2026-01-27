package command;

import rooms.Room;

public class Move implements Command{
    private Room toRoom;

    //Room to Room movement
    @Override
    public String execute(String Command) {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
