package rooms;

import characters.Character;

import java.util.List;

public abstract class Room {
    private String nameOfLocation;
    private Character characterInside;
    private List<Room> sisterLocations;

    public Room(String nameOfLocation, Character characterInside, List<Room> sisterLocations) {
        this.nameOfLocation = nameOfLocation;
        this.characterInside = characterInside;
        this.sisterLocations = sisterLocations;
    }

    public String getNameOfLocation() {
        return nameOfLocation;
    }

    public void setNameOfLocation(String nameOfLocation) {
        this.nameOfLocation = nameOfLocation;
    }

    public Character getCharacterInside() {
        return characterInside;
    }

    public void setCharacterInside(Character characterInside) {
        this.characterInside = characterInside;
    }

    public List<Room> getSisterLocations() {
        return sisterLocations;
    }

    public void setSisterLocations(List<Room> sisterLocations) {
        this.sisterLocations = sisterLocations;
    }
}
