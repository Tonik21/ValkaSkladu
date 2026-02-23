package rooms;

import core_game_mechanics.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StorageRoomTest {
    private StorageRoom storageRoom;
    private List<Item> testItems;

    @BeforeEach
    void setUp(){
        testItems = new ArrayList<>();
        testItems.add(new Item("item1", 10, 4500));
        testItems.add(new Item("item2", 100, 600));
        testItems.add(new Item("item3", 300, 200));
        testItems.add(new Item("item4", 600, 100));
    }
    @Test
    void generatingCreatesCorrectNumOfItems(){
        storageRoom.generateItems(testItems, 1);
        assertEquals(3, storageRoom.getItemsInside().size());
    }
    @Test
    void doesMultWork(){
        StorageRoom room1 = new StorageRoom(121);
        StorageRoom room2 = new StorageRoom(221);
        List<Item> itemToTest= new ArrayList<>();
        itemToTest.add(new Item("Test", 1, 1000));
        room1.generateItems(testItems, 1);
        room2.generateItems(testItems, 2);
        double price1 = room1.getItemsInside().get(0).getBasePrice();
        double price2 = room2.getItemsInside().get(0).getBasePrice();

        assertEquals(1000, price1);
        assertEquals(2000, price2);
    }
}