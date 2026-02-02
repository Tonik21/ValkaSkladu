package rooms;

import characters.InGameCharacter;
import core_game_mechanics.Item;

import java.util.HashMap;
import java.util.List;


public class StorageRoom extends Room{
    private int roomId;
    private Warehouse warehouse;
    private List<Item> itemsInside;

    public StorageRoom(String nameOfLocation, String characterInside, HashMap<String,String> neighbors) {
        super(nameOfLocation, characterInside, neighbors);
    }

    public void generateItems(){

    }


}
