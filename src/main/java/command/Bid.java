package command;

import characters.Player;
import core_game_mechanics.Game;
import rooms.StorageRoom;

/**
 * prikaz prihazuje do aukce
 */
public class Bid implements Command {
    private Game game;

    public Bid(Game game) {
        this.game = game;
    }

    /**
     * Provadi prikaz na prihozeni k aukci
     * @param parameter prevede se na int a je to pocet penez, ktere se prihazuji
     * @return informace o prubehu commandu
     */
    @Override
    public String execute(String parameter) {
        Player p = game.getPlayer();
        int amount = Integer.parseInt(parameter);
        StorageRoom room = p.getRoomBiddedOn();
        if (amount == 0){
            if (room.getCurrentHighestBid() == room.getStartingPrice()){
                return "Cant end the Auction, you did not Bid a dime";
            }
            return game.getAuction().endAuction();
        }

        if (amount > p.getMoney()) {
            return "no money!";
        }
        if (amount <= room.getCurrentHighestBid()) {
            return "you must bid higher than " + room.getCurrentHighestBid();
        }
        room.setCurrentHighestBid(amount);
        String botBid = game.getAuction().botBidRealization();


        return "Bid " + amount + " on storage with id " + room.getRoomId() + "\n " + botBid;
    }
}
