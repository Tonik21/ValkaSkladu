import command.*;
import core_game_mechanics.Game;

import java.util.HashMap;
import java.util.Scanner;

public class UserInterface {
    private Game game;
    private HashMap<String, Command> commands;
    private Scanner sc;

    public UserInterface(Game game, HashMap<String, Command> commands) {
        this.game = game;
        this.commands = commands;
    }

    public void loadCommands(){
        commands.put("bid", new Bid());
        commands.put("endgame", new Endgame(game));
        commands.put("help", new Help());
        commands.put("interact", new Interact());
        commands.put("inventory", new InventoryPrint());
        commands.put("move", new Move());
        commands.put("status", new Status());
        commands.put("take", new Take());
        commands.put("talk", new Talk());
    }
    public void recogniseCommand(String input){
        String[] commandSplit = input.split(" ");
        String commandKeyword = commandSplit[0];
        String commandParameter = commandSplit[1];

        if (!commands.containsKey(input)){
            System.out.println("Command does not exist");
        } else {
            String commandExecutionData = commands.get(commandKeyword).execute(commandParameter);
            System.out.println(commandExecutionData);
        }

    }
}
