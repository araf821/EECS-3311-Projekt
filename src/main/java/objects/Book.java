package objects;

public class Book extends PhysicalItem {
    private String isbn;

    public Book(int id, String title, String location, boolean canPurchase, boolean canRent, double value,
            String isbn) {
        super(id, title, location, canPurchase, canRent, value);
        this.isbn = isbn;
    }

    public void add() {
        // Some implementation
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
