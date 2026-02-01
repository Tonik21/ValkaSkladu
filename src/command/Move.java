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
            case "north":
                player.setLocation(room.directionsToNeighbours.get(direction));
            case "south":
                player.setLocation(room.directionsToNeighbours.get(direction));
            case "west":
                player.setLocation(room.directionsToNeighbours.get(direction));
            case "east":
                player.setLocation(room.directionsToNeighbours.get(direction));

        }
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
