package core_game_mechanics;
import characters.InGameCharacter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import rooms.Room;
import rooms.Warehouse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    ObjectMapper parser = new ObjectMapper();
    List<Item> items = new ArrayList<>();
    public List<Item> loadItemData(){
        try {
            InputStream input = new FileInputStream("res/items.json");
            items = parser.readValue(input, new TypeReference<List<Item>>(){});
            return items;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<InGameCharacter> loadCharacterData(){
        try {
            InputStream input = new FileInputStream("res/characters.json");
            return parser.readValue(input, new TypeReference<List<InGameCharacter>>(){});

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<Room> loadRoomData(){
        try {
            InputStream input = new FileInputStream("res/rooms.json");
            return parser.readValue(input, new TypeReference<List<Room>>(){});

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

