package command;

public class Endgame implements Command{

    //nastavi IsRunning na False
    @Override
    public String execute(String Command) {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
