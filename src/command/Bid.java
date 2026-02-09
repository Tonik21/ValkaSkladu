package command;

import characters.Player;
import core_game_mechanics.Game;
import rooms.StorageRoom;

public class Bid implements Command {
    private Game game;

    @Override
    public String execute(String parameter) {
        Player p = game.getPlayer();
        if (!p.isInAuction()) {
            return "Zrovna neprobíhá žádná aukce!";
        }
        int amount = Integer.parseInt(parameter);
        StorageRoom room = p.getRoomBiddedOn();
        if (amount > p.getMoney()) {
            return "Nemáš dost peněz!";
        }
        if (amount <= room.getCurrentHighestBid()) {
            return "Musíš přihodit víc než " + room.getCurrentHighestBid();
        }
        room.setCurrentHighestBid(amount);
        return "Bid " + amount + " on storage with id " + room.getRoomId();
    }
}
