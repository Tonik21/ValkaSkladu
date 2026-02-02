package command;

import characters.Player;

public class Status implements Command{
    private Player player;
    //print out status(money)
    @Override
    public String execute(String Command) {
        System.out.println(player.getMoney()+ " "+ player.getLocationRightNow());
        return "";
    }


}
