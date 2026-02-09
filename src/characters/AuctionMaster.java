package characters;

import rooms.Room;
import rooms.StorageRoom;

public class AuctionMaster extends InGameCharacter {
    public AuctionMaster(String name, String locationId, String dialogue) {
        super(name, locationId, dialogue);
    }





    public void endAuction(Player pl1){
        pl1.setInAuction(false);
    }

}
