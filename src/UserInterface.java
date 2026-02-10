import command.*;
import core_game_mechanics.Game;
import core_game_mechanics.Item;


import java.util.HashMap;
import java.util.Scanner;

public class UserInterface {
    private Game game;
    private HashMap<String, Command> commands;
    private Scanner sc;


    public UserInterface() {
        this.game = new Game();
        this.commands = new HashMap<>();
        this.sc = new Scanner(System.in);
    }


    public void startGame(){
        game.setup();
        loadCommands();
        System.out.println(game.intro());
        printOutAvailableLocations();
        game.getPlayer().getInventory().addItem(new Item("GoldenRing", 100, 750));
        while(game.isRunning()){
            String input = sc.nextLine();
            if (input.equals("move")){
                printOutAvailableLocations();
            }
            recogniseCommand(input);

        }
    }


    public void loadCommands(){
        commands.put("bid", new Bid(game));
        commands.put("endgame", new Endgame(game));
        commands.put("help", new Help());
        commands.put("interact", new Interact(game));
        commands.put("inventory", new InventoryPrint(game));
        commands.put("move", new Move(game));
        commands.put("status", new Status(game));
        commands.put("take", new Take(game));
        commands.put("talk", new Talk(game, sc));
        commands.put("sell", new Sell(game));
        commands.put("hellyeah", new HellYeah(game));
    }

    public void recogniseCommand(String input){
        String[] commandSplit = input.split(" ");
        String commandKeyword = commandSplit[0];
        if (!commands.containsKey(commandKeyword)){
            System.out.println("Command does not exist");
            return;}
        if (commandSplit.length>1) {
            String commandParameter = commandSplit[1];
            String commandExecutionData = commands.get(commandKeyword).execute(commandParameter);
            System.out.println(commandExecutionData);
        }else{
            String commandExecutionData = commands.get(commandKeyword).execute("");
            System.out.println(commandExecutionData);
        }

    }
    public void printStatus(){
        System.out.println("\n\nTvoje penize"+game.getPlayer().getMoney()+"\n\n=============");
    }
    public void printOutAvailableLocations() {
        System.out.println("================ Adjacent Locations ===============");
        System.out.println("north "+game.getPlayer().getLocationRightNow().getDirectionsToNeighbours().get("north"));
        System.out.println("east "+game.getPlayer().getLocationRightNow().getDirectionsToNeighbours().get("east"));
        System.out.println("west "+game.getPlayer().getLocationRightNow().getDirectionsToNeighbours().get("west"));
        System.out.println("south "+game.getPlayer().getLocationRightNow().getDirectionsToNeighbours().get("south"));
    }
}
