import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rooms.Room;

import static org.junit.jupiter.api.Assertions.*;

class UserInterfaceTest {
    UserInterface userInterface;
    @BeforeEach
    void setUp(){
       userInterface  = new UserInterface();
       userInterface.game.setup();
    }

    @Test
    void recogniseCommandMoveNorth() {

        userInterface.loadCommands();
        String expectedRoomName = userInterface.game.getPlayer().getLocationRightNow().getDirectionsToNeighbours().get("north");
        userInterface.recogniseCommand("move north");
        assertEquals(expectedRoomName, userInterface.game.getPlayer().getLocationRightNow().getNameOfLocation());
    }
}