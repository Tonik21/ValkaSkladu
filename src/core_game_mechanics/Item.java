package core_game_mechanics;
//Itemy se budou scalovat podle toho v jakem Warehousu se StorageRoom nachazi
public class Item {
    private String nameOfItem;
    private double rarity;
    private double quality;
    private double basePrice;


    private double calculateActualPriceOfItem(){
        return basePrice *= rarity + quality;
    }

}
