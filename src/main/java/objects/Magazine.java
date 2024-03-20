package objects;

public class Magazine extends PhysicalItem {
    private String edition;

    public Magazine(int id, String title, String location, boolean canPurchase, boolean canRent, double value,
            String edition) {
        super(id, title, location, canPurchase, canRent, value);
        this.edition = edition;
    }

    public void add() {
        // Some implementation
    }

    public String getEdition() {
        return edition;
    }
}
