package command;

import characters.Player;
import core_game_mechanics.Game;
import rooms.Room;
import rooms.StorageRoom;
import rooms.Warehouse;

/**
 * prikaz Interact pro manipulaci s prvkama ve Warehouse
 */
public class Interact implements Command{
    private Game game;

    public Interact(Game game) {
        this.game = game;
    }

    /**
     * metoda overuje zda lze otevrit Sklad a otevira sklady
     * @param Command prikaz
     * @return info o pruchodu prikazu
     */
    @Override
    public String execute(String Command) {
        Player pl1 = game.getPlayer();
        Warehouse warehouse = (Warehouse) game.getPlayer().getLocationRightNow();
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
            return "use the format: interact <ID StorageRoom>(1-10)";
        }

        int roomID = Integer.parseInt(Command);
        StorageRoom roomAccessed = warehouse.findStorageRoom(roomID);
        if (roomAccessed == null){
            return "this storage room does not exist";
        }
        if (roomAccessed.isLocked()){
            return "The room you are trying to access is Locked. To unlock it participate in the Auction";
        }
        pl1.setRoomBiddedOn(roomAccessed);
        return "StorageRoom opened there lie "+roomAccessed.getItemsInside();
    }



}
