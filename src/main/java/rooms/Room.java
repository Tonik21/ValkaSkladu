package rooms;


import java.util.HashMap;


public class Room {
    private String nameOfLocation;
    private String characterInside;
    public HashMap<String, String> directionsToNeighbours;
    private String[] availableCommands;
    public Room(){}

    public Room(String nameOfLocation, String characterInside, String[] availableCommands, HashMap<String, String> directionsToNeighbours) {
        this.nameOfLocation = nameOfLocation;
        this.characterInside = characterInside;
        this.availableCommands = availableCommands;
        this.directionsToNeighbours = directionsToNeighbours;
    }

    public String[] getAvailableCommands() {
        return availableCommands;
    }

    public String getNameOfLocation() {
        return nameOfLocation;
    }

    public void setNameOfLocation(String nameOfLocation) {
        this.nameOfLocation = nameOfLocation;
    }

    public String getCharacterInside() {
        return characterInside;
    }

    public void setCharacterInside(String characterInside) {
        this.characterInside = characterInside;
    }

    public HashMap<String, String> getDirectionsToNeighbours() {
        return directionsToNeighbours;
    }

    public void setDirectionsToNeighbours(HashMap<String, String> directionsToNeighbours) {
        this.directionsToNeighbours = directionsToNeighbours;
    }

    @Override
    public String toString() {
        return "You are in " + nameOfLocation;
    }
}