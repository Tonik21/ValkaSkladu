package auction_function;

import java.util.Random;

public class Bot {
    private int money;
    private int bidCount = 0;


    public int bidAmountCalc(int currentBid){
        bidCount++;
        if (bidCount>2){
            return 0;
        }
        int raise = (int) (currentBid * 0.1);
        if (currentBid+raise>money){
            return 0;
        }
        return bid(currentBid+raise);

    }
    public int bid(int amount){
        return amount;
    }

    public void setBidCount(int bidCount) {
        this.bidCount = bidCount;
    }
}
