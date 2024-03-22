package objects;

public class Book extends PhysicalItem {
    private String isbn;

    public Book(int id, String title, String location, int remainingCopies, double value,
            String isbn) {
        super(id, title, location, remainingCopies, value);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
