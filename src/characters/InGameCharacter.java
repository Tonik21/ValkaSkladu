package characters;

import rooms.Room;

public class InGameCharacter {
    private String nameOfCharacter;
    private String locationId;

    public InGameCharacter() {
    }

    public InGameCharacter(String nameOfCharacter, String location) {
        this.nameOfCharacter = nameOfCharacter;
        this.locationId = location;
    }

    public String getNameOfCharacter() {
        return nameOfCharacter;
    }

    public void setNameOfCharacter(String nameOfCharacter) {
        this.nameOfCharacter = nameOfCharacter;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }
}
