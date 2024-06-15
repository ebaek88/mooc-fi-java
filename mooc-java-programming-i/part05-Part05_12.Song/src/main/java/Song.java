
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    // overrides the existing equals method
    public boolean equals(Object compared) {
        // first if the two variables have the same reference, they are equal
        if(this == compared) {
            return true;
        }

        // if the compared is of the type different from Song, it is false
        if(!(compared instanceof Song)) {
            return false;
        }

        // convert the Object compared to the Song type
        Song comparedSong = (Song)compared;

        // compare the contents
        if(this.artist.equals(comparedSong.artist) 
            && this.name.equals(comparedSong.name) 
            && this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }

        return false;
    }


}
