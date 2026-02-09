package auction_function;

import characters.Player;
import rooms.StorageRoom;

public class Auction {
    Player pl1 = new Player();
    Bot bot = new Bot();
    public void startAuction(StorageRoom room, Player pl1){
        pl1.setInAuction(true);
        pl1.setRoomBiddedOn(room);

        int startingBid = room.getStartingPrice();
        while(pl1.isInAuction()){
            System.out.println("place your bids");

        }
    }

}
