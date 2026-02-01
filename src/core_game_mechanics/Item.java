package core_game_mechanics;
public class Item {
    private String nameOfItem;
    private double rarity;
    private double basePrice;

    public Item(String nameOfItem, double rarity, double basePrice) {
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

    public double getRarity() {
        return rarity;
    }

    public void setRarity(double rarity) {
        this.rarity = rarity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
