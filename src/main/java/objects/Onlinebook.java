package objects;

public class Onlinebook extends PhysicalItem {
    private String author;

    public Onlinebook(int id, String title, String location, boolean canPurchase, boolean canRent, double value,
            String author) {
        super(id, title, location, canPurchase, canRent, value);
        this.author = author;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void add() {
        
    }

}
