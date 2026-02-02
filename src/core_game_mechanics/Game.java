package core_game_mechanics;

public class Game {

    public void setup(){
        DataLoader dataLoader = new DataLoader();
        dataLoader.loadItemData();
        dataLoader.loadCharacterData();
        dataLoader.loadRoomData();
        dataLoader.loadWarehouseData();
    }
}
