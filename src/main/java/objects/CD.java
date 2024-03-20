package objects;

public class CD extends PhysicalItem {
    private String artist;

    public CD(int id, String title, String location, boolean canPurchase, boolean canRent, double value,
            String artist) {
        super(id, title, location, canPurchase, canRent, value);
        this.artist = artist;
    }

    public void add() {
        // Some implementation
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
