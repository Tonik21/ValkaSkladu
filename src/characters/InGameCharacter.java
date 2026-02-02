package characters;


public class InGameCharacter {
    private String nameOfCharacter;
    private String locationId;
    private String dialogue;

    public InGameCharacter() {
    }

    public InGameCharacter(String nameOfCharacter, String location, String dialogue) {
        this.nameOfCharacter = nameOfCharacter;
        this.locationId = location;
        this.dialogue = dialogue;
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

    public String getDialogue() {
        return dialogue;
    }

    public void setDialogue(String dialogue) {
        this.dialogue = dialogue;
    }
}
