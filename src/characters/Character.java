package characters;

import rooms.Room;

public class Character {
    private String nameOfCharacter;
    private Room Location;

    public Character(String nameOfCharacter, Room location) {
        this.nameOfCharacter = nameOfCharacter;
        Location = location;
    }

    public Room getLocation() {
        return Location;
    }

    public void setLocation(Room location) {
        Location = location;
    }
}
