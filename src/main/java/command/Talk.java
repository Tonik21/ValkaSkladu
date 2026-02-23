package command;

import characters.InGameCharacter;
import characters.Player;
import core_game_mechanics.Game;
import rooms.Room;
import rooms.StorageRoom;
import rooms.Warehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Talk implements Command{
    private Game game;
    Scanner scanner;
    //interact with Character in room

    public Talk(Game game, Scanner scanner) {
        this.game = game;
        this.scanner = scanner;
    }

    @Override
    public String execute(String characterName) {
        Player player = game.getPlayer();
        Room currentRoom = player.getLocationRightNow();
        ArrayList<InGameCharacter> charactersHere = new ArrayList<>();

        for (InGameCharacter character : game.getDataLoader().getCharacters()) {
            if (character.getLocationId().equals(currentRoom.getNameOfLocation())) {
                charactersHere.add(character);
            }
        }
        if (charactersHere.isEmpty()) {
            return "the rooms empty";
        }
        InGameCharacter character = charactersHere.get(0);
        if (character.getNameOfCharacter().equals("AuctionMaster")) {

                System.out.println("Talking to " + character.getNameOfCharacter() + ":");
                System.out.println(character.getDialogue());
                System.out.println("start the auction? (yes/no)");

                String response = scanner.nextLine();

                if (response.equalsIgnoreCase("yes")) {
                    Random random = new Random();
                    Warehouse availableWarehouse = null;
                    for (Warehouse warehouse : game.getDataLoader().getWarehouses()) {
                        if (warehouse.getFeepaid()) {
                            availableWarehouse = warehouse;
                            break;
                        }
                    }
                    List<StorageRoom> storageRooms = availableWarehouse.getStorageRooms();
                    StorageRoom room = storageRooms.get(random.nextInt(storageRooms.size()));
                    game.getAuction().startAuction(room, game.getPlayer());

                    return "Auction started for Storage Room #" + room.getRoomId();
                } else {
                    return "ok, comeback anytime!";
                }

        }
        return "you are talking to " + character.getNameOfCharacter() + " " + character.getDialogue();
    }


}
