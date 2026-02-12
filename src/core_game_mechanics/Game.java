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
                "Procitáš v chladném stínu Startovního skladu. Vzduch je nasycen prachem\n" +
                "a starým dřevem. V kapse tě tíží poslední hrst mincí a v ruce tiskneš\n" +
                "pomačkaný dopis od legendárního obchodníka Richarda Hangara.\n" +
                "\n" +
                "Jeho slova stále zní v tvé hlavě: \"Pokud chceš uspět v tomto světě,\n" +
                "musíš ovládnout umění obchodu. Sklady skrývají poklady, aukce přinášejí\n" +
                "příležitosti a vendoři čekají na ty, kteří mají odvahu.\"\n" +
                "\n" +
                "Tvůj cíl je jasný – probojovat se přes Startovní, Střední a Těžký sklad,\n" +
                "vydělat dost peněz a najít cestu k Richardovi. Ale pozor: cesta do\n" +
                "Gateway vyžaduje 10 000 Kč a AuctionMaster nebere ohledy na chudáky.\n" +
                "\n" +
                "==========================================================================\n" +
                "                            D O S T U P N É  P Ř Í K A Z Y\n" +
                "==========================================================================\n" +
                "\n" +
                "POHYB & NAVIGACE:\n" +
                "  move <směr>       - Pohyb do sousední lokace (north/south/east/west)\n" +
                "  status            - Zobrazí tvé aktuální peníze a lokaci\n" +
                "\n" +
                "INVENTÁŘ & PŘEDMĚTY:\n" +
                "  inventory         - Zobrazí obsah tvého inventáře\n" +
                "  take <předmět>    - Sebere předmět ze StorageRoom\n" +
                "  sell <předmět>    - Prodá předmět vendorovi (musíš být u vendora)\n" +
                "\n" +
                "INTERAKCE S POSTAVAMI:\n" +
                "  talk              - Promluv s postavou v místnosti\n" +
                "  interact          - Zaplať vstupné do warehouse / přístup ke StorageRoom\n" +
                "\n" +
                "AUKCE:\n" +
                "  bid <částka>      - Přihod v probíhající aukci\n" +
                "  bid 0             - Ukonči aukci a zjisti, jestli jsi vyhrál\n" +
                "\n" +
                "SYSTÉM:\n" +
                "  help              - Zobrazí nápovědu\n" +
                "  hellyeah          - Ukonči hru (pouze u Richarda Hangara)\n" +
                "  endgame           - Okamžitě ukonči hru\n" +
                "\n" +
                "==========================================================================\n" +
                "                      T V Ů J  P Ř Í B Ě H  Z A Č Í N Á . . .\n" +
                "==========================================================================\n";
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

