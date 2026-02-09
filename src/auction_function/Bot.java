package auction_function;

public class Bot {
    private int money;
    private int aggression;

    private int bid(int amount, int amountBefore){
        if ((amount+amountBefore)<money){
            return amount;
        }
        return 0;
    }
}
