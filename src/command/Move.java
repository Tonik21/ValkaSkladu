package command;
import characters.Player;
import rooms.Room;

public class Move implements Command{
    private Player player;

    //Room to Room movement
    @Override
    public String execute(String direction) {
//        player.moveNextRoom(direction);
        return "";
    }


}
