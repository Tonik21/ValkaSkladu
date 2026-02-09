import command.*;
import core_game_mechanics.Game;


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
        game.getRoom().printOutAvailableLocations();
        while(game.isRunning()){
            String input = sc.nextLine();
            recogniseCommand(input);
        }
    }


    public void loadCommands(){
        commands.put("bid", new Bid());
        commands.put("endgame", new Endgame(game));
        commands.put("help", new Help());
        commands.put("interact", new Interact());
        commands.put("inventory", new InventoryPrint());
        commands.put("move", new Move(game));
        commands.put("status", new Status());
        commands.put("take", new Take());
        commands.put("talk", new Talk());
    }
    //TODO vyresit jednoslovny commandy
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
        }

    }
}
