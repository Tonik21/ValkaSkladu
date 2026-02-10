package command;

import characters.Player;
import core_game_mechanics.Game;
import rooms.StorageRoom;

public class Bid implements Command {
    private Game game;

    public Bid(Game game) {
        this.game = game;
    }

    @Override
    public String execute(String parameter) {
        Player p = game.getPlayer();
        if (!p.isInAuction()) {
            return "Zrovna neprobíhá žádná aukce!";
        }
        int amount = Integer.parseInt(parameter);

        if (amount == 0){
            return game.getAuction().endAuction();
        }
        StorageRoom room = p.getRoomBiddedOn();
        if (amount > p.getMoney()) {
            return "no money!";
        }
        if (amount <= room.getCurrentHighestBid()) {
            return "you must bid higher than " + room.getCurrentHighestBid();
        }
        room.setCurrentHighestBid(amount);
        String botBid = game.getAuction().botBidRealization();
        return "Bid " + amount + " on storage with id " + room.getRoomId() + "  "+ botBid;
    }
}
