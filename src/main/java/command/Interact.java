package command;

import characters.Player;
import core_game_mechanics.Game;
import rooms.Room;
import rooms.StorageRoom;
import rooms.Warehouse;

public class Interact implements Command{
    private Game game;

    public Interact(Game game) {
        this.game = game;
    }

    @Override
    public String execute(String Command) {
        Player pl1 = game.getPlayer();
        Warehouse warehouse = (Warehouse) game.getPlayer().getLocationRightNow();
        Room room = game.getPlayer().getLocationRightNow();
        if (room.getNameOfLocation().equals("Gateway")){
        }
        if (!warehouse.getFeepaid()){
            int fee = warehouse.getEntranceFee();
            if (pl1.getMoney()<fee){
                return "no money to enter";
            }
            pl1.removeMoney(fee);
            warehouse.setFeepaid(true);
            return "you payed the entrance fee";
        }
        if (Command.isEmpty()) {
            return "use the format: interact <ID StorageRoom>";
        }

        int roomID = Integer.parseInt(Command);
        StorageRoom roomAccessed = warehouse.findStorageRoom(roomID );
        if (roomAccessed == null) {
            roomAccessed = new StorageRoom(roomID);
            warehouse.addStorageRoom(roomAccessed);
        }
        roomAccessed.generateItems(game.getItems());
        return "StorageRoom opened there lie "+roomAccessed.getItemsInside();
    }



}
