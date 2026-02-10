package command;

import characters.InGameCharacter;
import characters.Player;
import core_game_mechanics.Game;
import rooms.Room;
import rooms.StorageRoom;

import java.util.ArrayList;
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

                if (response.equalsIgnoreCase("ano") || response.equalsIgnoreCase("yes")) {
                    Random random = new Random();
                    int roomId = random.nextInt(1000);
                    int startingPrice = 300 + random.nextInt(700);

                    StorageRoom room = new StorageRoom(roomId);
                    room.setStartingPrice(startingPrice);
                    room.generateItems(game.getItems());

                    game.getAuction().startAuction(room, game.getPlayer());

                    return "Auction started for Storage Room #" + roomId;
                } else {
                    return "ok, comeback anytime!";
                }

        }
        return "you are talking to " + character.getNameOfCharacter() + " " + character.getDialogue();
    }


}
