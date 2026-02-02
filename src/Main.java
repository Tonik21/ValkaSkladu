import core_game_mechanics.Game;
import rooms.Room;
import rooms.StorageRoom;

public class Main{
public static void main(String[] args){
    Game game = new Game();
    game.setup();
    StorageRoom room = new StorageRoom(12, game);
    room.generateItems();


}
}