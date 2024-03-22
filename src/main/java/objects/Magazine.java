package objects;

public class Magazine extends PhysicalItem implements CompositeItem {
    private String edition;

    public Magazine(int id, String title, String location, int remainingCopies, double value,
            String edition) {
        super(id, title, location, remainingCopies, value);
        this.edition = edition;
    }

    public String getEdition() {
        return edition;
    }
}
