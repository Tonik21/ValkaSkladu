package core_game_mechanics;

import java.util.ArrayList;
import java.util.List;

public class Game {
    boolean isRunning;
    private List<Item> items = new ArrayList<>();
    public void setup(){
        DataLoader dataLoader = new DataLoader();
        items = dataLoader.loadItemData();
        dataLoader.loadCharacterData();
        dataLoader.loadRoomData();
        dataLoader.loadWarehouseData();
    }

    public void startGame(){

    }
    public void endGame(){
        isRunning = false;
    }

    public List<Item> getItems() {
        return items;
    }

}
