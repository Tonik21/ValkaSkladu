package auction_function;

import java.util.Random;

public class Bot {
    private int money = 10000;
    private int bidCount = 0;


    public int bidAmountCalc(int currentBid){
        bidCount++;
        if (bidCount>2){
            return 0;
        }
        int raise = (int) (currentBid * 0.1);
        int newBid = currentBid+raise;
        if (newBid>money){
            return 0;
        }
        return newBid;

    }

    public void setBidCount(int bidCount) {
        this.bidCount = bidCount;
    }
}
