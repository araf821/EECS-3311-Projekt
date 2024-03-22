package objects;

public class Onlinebook extends PhysicalItem {
    private String author;

    public Onlinebook(int id, String title, String location, int remainingCopies, double value,
            String author) {
        super(id, title, location, remainingCopies, value);
        this.author = author;
    }

}
