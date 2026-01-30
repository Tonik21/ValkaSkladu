package rooms;

import characters.Character;

import java.util.List;
//TODO UDELAT HASHMAP NA SEVER VYCHOD ZAPAD, I NA JSONU
public abstract class Room {
    private String nameOfLocation;
    private Character characterInside;
    private List<Room> neighbors;


    public Room(String nameOfLocation, Character characterInside, List<Room> sisterLocations) {
        this.nameOfLocation = nameOfLocation;
        this.characterInside = characterInside;
        this.neighbors = sisterLocations;
    }

    public String getNameOfLocation() {
        return nameOfLocation;
    }

    public void setNameOfLocation(String nameOfLocation) {
        this.nameOfLocation = nameOfLocation;
    }
    //TODO dodelat na Hashmapu exitu
    public void printOutAvailableLocations(){
        System.out.println(" Adjacent Locations ");
        for (Room room : neighbors){
            int index = 0;
            System.out.println(++index + " " + room.getNameOfLocation());
        }
    }
    public Character getCharacterInside() {
        return characterInside;
    }

    public void setCharacterInside(Character characterInside) {
        this.characterInside = characterInside;
    }

    public List<Room> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Room> neighbors) {
        this.neighbors = neighbors;
    }
}
