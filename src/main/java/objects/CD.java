package objects;

public class CD extends PhysicalItem {
    private String artist;

    public CD(int id, String title, String location, int remainingCopies, double value,
            String artist) {
        super(id, title, location, remainingCopies, value);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
