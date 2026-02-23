package characters;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player player;
    @BeforeEach
    void setUp(){
        player = new Player();
    }
    @Test
    void addMoneyAddsMoney1000() {
        player.addMoney(1000);
        assertEquals(2000, player.getMoney());
    }
    @Test
    void addMoneyAddsMoney1500(){
        player.addMoney(1500);
        assertEquals(2500, player.getMoney());
    }

    @Test
    void removeMoneyRemoves1000() {
        player.removeMoney(1000);
        assertEquals(0, player.getMoney());
    }
    @Test
    void removeMoneyRemoves1500(){
        player.removeMoney(500);
        assertEquals(500, player.getMoney());
    }
}