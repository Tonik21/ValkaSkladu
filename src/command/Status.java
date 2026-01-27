package command;

public class Status implements Command{

    //print out status
    @Override
    public String execute(String Command) {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
