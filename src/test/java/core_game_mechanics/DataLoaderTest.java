package core_game_mechanics;

import characters.InGameCharacter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rooms.Room;
import rooms.Warehouse;

import javax.xml.crypto.Data;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataLoaderTest {
    private DataLoader dl;
    @BeforeEach
    void setUp(){
        dl = new DataLoader();
    }
    @Test
    void loadItemDataSuccessful() {
        List<Item>items = dl.loadItemData();
        assertFalse(items.isEmpty());
        List<Item>items2 = dl.loadItemData();
        assertEquals(items2.size(), items.size());
    }

    @Test
    void loadCharacterDataSuccessful() {
        List<InGameCharacter> characters = dl.loadCharacterData();
        assertFalse(characters.isEmpty());
        List<InGameCharacter> characters2 = dl.loadCharacterData();
        assertEquals(characters2.size(), characters.size());
    }

    @Test
    void loadRoomData() {
        List<Room> rooms = dl.loadRoomData();
        assertFalse(rooms.isEmpty());
        List<Room> rooms2 = dl.loadRoomData();
        assertEquals(rooms2.size(), rooms.size());
    }

    @Test
    void loadWarehouseData() {
        List<Warehouse> warehouses = dl.loadWarehouseData();
        assertFalse(warehouses.isEmpty());
        List<Warehouse>warehouses2 = dl.loadWarehouseData();
        assertEquals(warehouses2.size(), warehouses.size());
    }
}