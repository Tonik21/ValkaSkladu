package core_game_mechanics;
public class Item {
    private String nameOfItem;
    private int rarity;
    private double basePrice;

    public Item(String nameOfItem, int rarity, double basePrice) {
        this.nameOfItem = nameOfItem;
        this.rarity = rarity;
        this.basePrice = basePrice;
    }

    public Item() {
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return "+" +
                "nameOfItem='" + nameOfItem + '\'' +
                ", rarity=" + rarity +
                ", basePrice=" + basePrice +
                '}';
    }
}
