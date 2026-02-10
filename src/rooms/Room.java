package rooms;


import java.util.HashMap;


public class Room {
    private String nameOfLocation;
    private String characterInside;
    public HashMap<String, String> directionsToNeighbours;

    public Room(){}
    public Room(String nameOfLocation, String characterInside, HashMap<String, String> directionsToNeighbours) {
        this.nameOfLocation = nameOfLocation;
        this.characterInside = characterInside;
        this.directionsToNeighbours = directionsToNeighbours;
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
        return "Room{" +
                "nameOfLocation='" + nameOfLocation + '\'' +
                ", characterInside='" + characterInside + '\'' +
                ", directionsToNeighbours=" + directionsToNeighbours +
                '}';
    }
}