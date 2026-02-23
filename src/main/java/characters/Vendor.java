package characters;


import rooms.Warehouse;


public class Vendor extends InGameCharacter {
    Warehouse warehouse = new Warehouse();
    public Vendor(String nameOfCharacter, String locationId,String dialogue) {
        super(nameOfCharacter, locationId, dialogue);
    }

}
