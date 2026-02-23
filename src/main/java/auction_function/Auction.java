package auction_function;

import characters.Player;
import rooms.StorageRoom;

public class Auction {
    private Player pl1 ;
    private StorageRoom currentRoom;
    private Bot bot = new Bot();
    public void startAuction(StorageRoom room, Player pl1){
        this.pl1 = pl1;
        this.currentRoom=room;
        pl1.setInAuction(true);
        pl1.setRoomBiddedOn(room);
        bot.setBidCount(0);
        int startingBid = room.getStartingPrice();
        room.setCurrentHighestBid(startingBid);
        System.out.println("=====Auction Is Starting=====");
        System.out.println("starting price " + startingBid);
        System.out.println("use bid <amount>");
        System.out.println("to end bid 0");
    }
    //TODO bot bidding
    public String botBidRealization(){
        if (currentRoom==null){
            return "";
        }
        int botBid = bot.bidAmountCalc(currentRoom.getCurrentHighestBid());
        if (botBid>0){
            currentRoom.setCurrentHighestBid(botBid);
            return "bot bids" + botBid;
        }
        return "bot doesnt bid";
    }
    public String endAuction(){
        if (!pl1.isInAuction()){
            return "no Auction going on";
        }
        pl1.setInAuction(false);
        if (currentRoom.getCurrentHighestBid() <= pl1.getMoney()) {
            pl1.removeMoney(currentRoom.getCurrentHighestBid());

            return "you won the auciton for " + currentRoom.getCurrentHighestBid();

        } else {
            pl1.setRoomBiddedOn(null);
            return "lost the auction.";
        }
    }
}
