package command;

public class Help implements Command{

    //prints out a list of all commands
    @Override
    public String execute(String Command) {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
