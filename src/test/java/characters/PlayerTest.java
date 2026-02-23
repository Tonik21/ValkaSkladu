package characters;
//TODO Vyresit celou souborovou strukturu najit tam org.junit.jupiter.api
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player player;
    @BeforeEach
    void addMoneyAddsMoney1000() {
        player = new Player();
        player.addMoney(1000);
        assertEquals(2000, player.getMoney());
    }
    @Test
    void addMoneyAddsMoney1500(){
        player = new Player();
        player.addMoney(1500);
        assertEquals(2500, player.getMoney());
    }

    @Test
    void removeMoneyRemoves1000() {
        player = new Player();
        player.removeMoney(1000);
        assertEquals(0, player.getMoney());
    }
    @Test
    void removeMoneyRemoves1500(){
        player = new Player();
        player.removeMoney(500);
        assertEquals(500, player.getMoney());
    }
}