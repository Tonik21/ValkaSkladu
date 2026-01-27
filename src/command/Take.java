package command;

public class Take implements Command{
    private String itemName;

    //put item in room to inventory
    @Override
    public String execute(String Command) {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
