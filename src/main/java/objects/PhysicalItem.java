package objects;

import java.util.Date;

public abstract class PhysicalItem {
    private int id;
    private String title;
    private int remainingCopies;
    private String location;
    private boolean canPurchase;
    private boolean canRent;
    private double value;

    public PhysicalItem(int id, String title, String location, boolean canPurchase, boolean canRent, double value) {
        this.id = id;
        this.title = title;
        this.remainingCopies = 20;
        this.location = location;
        this.canPurchase = canPurchase;
        this.canRent = canRent;
        this.value = value;
    }

    public BorrowingRecord borrow(int userId) {
        // Some implementation
        return new BorrowingRecord(0, userId, this.id, new Date());
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getRemainingCopies() {
        return this.remainingCopies;
    }

    public void setRemainingCopies(int remainingCopies) {
        this.remainingCopies = remainingCopies;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isCanPurchase() {
        return this.canPurchase;
    }

    public void setCanPurchase(boolean canPurchase) {
        this.canPurchase = canPurchase;
    }

    public boolean isCanRent() {
        return this.canRent;
    }

    public void setCanRent(boolean canRent) {
        this.canRent = canRent;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
