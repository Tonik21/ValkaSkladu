package core_game_mechanics;
//Itemy se budou scalovat podle toho v jakem Warehousu se StorageRoom nachazi
public class Item {
    private String nameOfItem;
    private double rarity;
    private double basePrice;

    public Item(String nameOfItem, double rarity, double basePrice) {
        this.nameOfItem = nameOfItem;
        this.rarity = rarity;
        this.basePrice = basePrice;
    }


}
