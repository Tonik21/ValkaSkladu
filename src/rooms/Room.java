package rooms;

import characters.Character;

import java.util.HashMap;


public abstract class Room {
    private String nameOfLocation;
    private Character characterInside;
    public HashMap<String, Room> directionsToNeighbours;


    public Room(String nameOfLocation, Character characterInside, HashMap<String, Room> directionsToNeighbours) {
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


    public void printOutAvailableLocations() {
        System.out.println(" Adjacent Locations ");
        System.out.println("       "+directionsToNeighbours.get("north"));
        System.out.println(""+directionsToNeighbours.get("east"));
        System.out.print("              "+directionsToNeighbours.get("west"));
        System.out.println("       "+directionsToNeighbours.get("south"));
    }
    public Character getCharacterInside() {
        return characterInside;
    }

    public void setCharacterInside(Character characterInside) {
        this.characterInside = characterInside;
    }

    public HashMap<String, Room> getDirectionsToNeighbours() {
        return directionsToNeighbours;
    }

    public void setDirectionsToNeighbours(HashMap<String, Room> directionsToNeighbours) {
        this.directionsToNeighbours = directionsToNeighbours;
    }
}