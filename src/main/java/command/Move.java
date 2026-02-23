package command;
import core_game_mechanics.Game;
import rooms.Room;

public class Move implements Command{
    private Game game;

    public Move(Game game) {
        this.game = game;
    }

    @Override
    public String execute(String direction) {

            if (game.getPlayer().getLocationRightNow().getNameOfLocation().equals("Gateway") && direction.equals("north")) {
                if (game.getPlayer().getMoney() < 10000) {
                    return "Gateway has a lock with a moneysign on it there says need to get at least 10000";
                }
            }
            String targetId = game.getPlayer().getLocationRightNow().getDirectionsToNeighbours().get(direction.toLowerCase());

            if (targetId == null) {
                return "You can't go that way.";
            }
            for (Room room : game.getRooms()) {
                if (room.getNameOfLocation().equals(targetId)) {
                    game.getPlayer().setLocationRightNow(room);
                    return "You moved to " + room.getNameOfLocation();
                }
            }
            return "Target location not found.";
    }


}
