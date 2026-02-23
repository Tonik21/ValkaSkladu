import command.*;
import core_game_mechanics.Game;
import rooms.Room;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Trida UserInterface, Dela gameLoop, loaduje a zpracovava commandy
 *
 */
public class UserInterface {

    public Game game;
    private HashMap<String, Command> commands;
    private Scanner sc;


    public UserInterface() {
        this.game = new Game();
        this.commands = new HashMap<>();
        this.sc = new Scanner(System.in);
    }

    /**
     * main game loop, kontroluje zda lze command pouzit
     */
    public void startGame() {
        game.setup();
        loadCommands();
        System.out.println(game.intro());
        printOutAvailableLocations();
        while (game.isRunning()) {
            String input = sc.nextLine();
            Room currentRoom = game.getPlayer().getLocationRightNow();
            String commandKeyword = input.split(" ")[0];
            boolean isAvailable = false;
            for (int i = 0; i < currentRoom.getAvailableCommands().length; i++) {
                if (commandKeyword.equals(currentRoom.getAvailableCommands()[i])) {
                    isAvailable = true;
                }
            }
            if (isAvailable) {
                recogniseCommand(input);
            } else {
                System.out.println("Command currently unavailable\n" + "available commands: ");
                System.out.println(Arrays.toString(currentRoom.getAvailableCommands()));
            }
        }
    }

    /**
     * spojuje keywordy commandu a instance jejich tridy
     */
    public void loadCommands() {
        commands.put("bid", new Bid(game));
        commands.put("endgame", new Endgame(game));
        commands.put("help", new Help(game));
        commands.put("interact", new Interact(game));
        commands.put("inventory", new InventoryPrint(game));
        commands.put("move", new Move(game));
        commands.put("status", new Status(game));
        commands.put("take", new Take(game));
        commands.put("talk", new Talk(game, sc));
        commands.put("sell", new Sell(game));
        commands.put("hellyeah", new HellYeah(game));
    }

    /**
     * zpracovava prikaz napsan uzivatelem
     * @param input od uzivatele
     */
    public void recogniseCommand(String input) {
        String[] commandSplit = input.split(" ");
        String commandKeyword = commandSplit[0];
        if (!commands.containsKey(commandKeyword)) {
            System.out.println("Command does not exist");
            return;
        }
        if (commandSplit.length > 1) {
            String commandParameter = commandSplit[1];
            String commandExecutionData = commands.get(commandKeyword).execute(commandParameter);
            System.out.println(commandExecutionData);
        } else {
            String commandExecutionData = commands.get(commandKeyword).execute("");
            System.out.println(commandExecutionData);
        }

    }

    public void printOutAvailableLocations() {
        System.out.println("================ Adjacent Locations ===============");
        System.out.println("north " + game.getPlayer().getLocationRightNow().getDirectionsToNeighbours().get("north"));
        System.out.println("east " + game.getPlayer().getLocationRightNow().getDirectionsToNeighbours().get("east"));
        System.out.println("west " + game.getPlayer().getLocationRightNow().getDirectionsToNeighbours().get("west"));
        System.out.println("south " + game.getPlayer().getLocationRightNow().getDirectionsToNeighbours().get("south"));
    }
}
