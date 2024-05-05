package MusicLandscape.entities;

public class Artist {
    private String name;


    // Constructor with a default name
    public Artist() {
        this.name = null;
    }

    public Artist(String name) {
        this.name = name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = null;
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }
}
