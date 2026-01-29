package rooms;

import characters.Character;
import core_game_mechanics.Item;

import java.util.List;

public class StorageRoom extends Room{
    private int roomId;
    private Warehouse warehouse;
    private List<Item> itemsInside;

    public StorageRoom(String nameOfLocation, Character characterInside, List<Room> sisterLocations) {
        super(nameOfLocation, characterInside, sisterLocations);
    }

    public void generateItems(){

    }


}
