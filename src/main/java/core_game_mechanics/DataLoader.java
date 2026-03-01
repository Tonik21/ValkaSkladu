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

/**
 * Trida Dataloader Nacita data z resources
 */
public class DataLoader {
    ObjectMapper parser = new ObjectMapper();
    List<Item> items = new ArrayList<>();
    List<InGameCharacter> characters = new ArrayList<>();
    List<Room> rooms = new ArrayList<>();
    List<Warehouse> warehouses = new ArrayList<>();

    /**
     * nacita data o itemech
     * @return List itemu z jsonu
     */
    public List<Item> loadItemData(){
        try {
            InputStream input = DataLoader.class.getClassLoader().getResourceAsStream("items.json");
            items = parser.readValue(input, new TypeReference<List<Item>>(){});
            return items;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * nacita data o NPCckach
     * @return List NPCcek z jsonu
     */
    public List<InGameCharacter> loadCharacterData(){
        try {
            InputStream input = DataLoader.class.getClassLoader().getResourceAsStream("characters.json");
            characters = parser.readValue(input, new TypeReference<List<InGameCharacter>>(){});
            return characters;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * nacita data o Mistnostech
     * @return List Mistnosti z jsonu
     */
    public List<Room> loadRoomData(){
        try {
            InputStream input = DataLoader.class.getClassLoader().getResourceAsStream("rooms.json");
            rooms = parser.readValue(input, new TypeReference<List<Room>>(){});
            return rooms;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * nacita data o Skladistich
     * @return List Skladistich z jsonu
     */
    public List<Warehouse> loadWarehouseData(){
        try {
            InputStream input = DataLoader.class.getClassLoader().getResourceAsStream("warehouses.json");
            warehouses = parser.readValue(input, new TypeReference<List<Warehouse>>(){});
            return warehouses;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public List<InGameCharacter> getCharacters() {
        return characters;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Warehouse> getWarehouses() {
        return warehouses;
    }
}

