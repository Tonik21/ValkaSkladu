package core_game_mechanics;
import characters.InGameCharacter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import rooms.Room;
import rooms.Warehouse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class DataLoader {
    ObjectMapper parser = new ObjectMapper();
    public void loadItemData(){
        try {
            InputStream input = new FileInputStream("res/items.json");
            List<Item> items = parser.readValue(input, new TypeReference<List<Item>>(){});
            System.out.println("test"+items);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void loadCharacterData(){
        try {
            InputStream input = new FileInputStream("res/characters.json");
            List<InGameCharacter> characters = parser.readValue(input, new TypeReference<List<InGameCharacter>>(){});
            System.out.println("test"+characters);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void loadRoomData(){
        try {
            InputStream input = new FileInputStream("res/rooms.json");
            List<Room> rooms = parser.readValue(input, new TypeReference<List<Room>>(){});
            System.out.println("test"+rooms);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void loadWarehouseData(){
        try {
            InputStream input = new FileInputStream("res/warehouses.json");
            List<Warehouse> warehouses = parser.readValue(input, new TypeReference<List<Warehouse>>(){});
            System.out.println("test"+warehouses);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}

