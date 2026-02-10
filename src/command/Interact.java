package command;

import characters.Player;
import core_game_mechanics.Game;
import rooms.StorageRoom;

public class Interact implements Command{
    private Game game;
    @Override
    public String execute(String Command) {
        Player pl1 = game.getPlayer();

        int roomID = Integer.parseInt(Command);
        StorageRoom room = room.getWarehouse().findStorageRoom(roomID);
        room.generateItems(game.getItems());
        return "";
    }



}
