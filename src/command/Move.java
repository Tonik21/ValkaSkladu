package command;
import characters.Player;
import rooms.Room;

public class Move implements Command{
    private Player player;

    //Room to Room movement
    @Override
    public String execute(String direction) {
        Room room = player.getLocation();
        room.printOutAvailableLocations();
        switch (direction){

        }
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
