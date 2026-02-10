package core_game_mechanics;

import auction_function.Auction;
import characters.InGameCharacter;
import characters.Player;
import rooms.Room;
import rooms.StorageRoom;
import rooms.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private boolean isRunning;
    private DataLoader dataLoader = new DataLoader();
    private List<Item> items = new ArrayList<>();
    private List<InGameCharacter> characters = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();
    private Player player = new Player();
    private Auction auction = new Auction();

    public void setup(){
        items = dataLoader.loadItemData();
        characters = dataLoader.loadCharacterData();
        rooms.addAll(dataLoader.loadWarehouseData());
        rooms.addAll(dataLoader.loadRoomData());
        for (Warehouse warehouse : dataLoader.getWarehouses()) {
            for (int i = 1; i <= 10; i++) {
                warehouse.addStorageRoom(new StorageRoom(i));
            }
        }
        player.setLocationRightNow(dataLoader.getWarehouses().get(0));
        player.setInventory(new Inventory());
        isRunning = true;

    }
    public void endGame(){
        isRunning = false;
    }
    public String intro(){
        return "==========================================================================\n" +
                "                     V Í T E J  V  A U K Č N Í M  S V Ě T Ě\n" +
                "==========================================================================\n" +
                "\n" +
                "Procitáš v chladném stínu Startovního skladu. Vzduch je cítit prachem a \n" +
                "starým dřevem. V kapse tě tíží poslední hrst mincí a v ruce tiskneš \n" +
                "dopis od Richarda Hangara.\n" +
                "\n" +
                "Tvůj úkol je jasný: Probojovat se skrze sklady, obchodovat s rozmanitými \n" +
                "prodejci a ovládnout místní Aukční dům. Ale pozor – cesta do HardWarehousu \n" +
                "není pro každého a AuctionMaster nebere ohledy na slabé hráče.\n" +
                "\n" +
                "Tvůj příběh začíná právě teď...\n" +
                "==========================================================================";
    }
    public List<Item> getItems() {
        return items;
    }
    public DataLoader getDataLoader() {
        return dataLoader;
    }

    public Player getPlayer() {
        return player;
    }


    public boolean isRunning() {
        return isRunning;
    }

    public List<InGameCharacter> getCharacters() {
        return characters;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public Auction getAuction() {
        return auction;
    }
}

