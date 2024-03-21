package objects;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import userHandling.BorrowingRecordHandling;

public abstract class PhysicalItem {
    private int id;
    private String title;
    private int remainingCopies;
    private String location;
    private boolean canPurchase;
    private boolean canRent;
    private double value;
    private int count = 0;

    public PhysicalItem(int id, String title, String location, boolean canPurchase, boolean canRent, double value) {
        this.id = id;
        this.title = title;
        this.remainingCopies = 20;
        this.location = location;
        this.canPurchase = canPurchase;
        this.canRent = canRent;
        this.value = value;
    }

    public BorrowingRecord borrow(User user) {
        if (user.moreThanThreeOverdueItems() == true) {
            ArrayList<BorrowingRecord> POG = user.updateBorrowingRecords();
            if (POG.size() >= 10) {
                return null; // shouldnt make record if more than 10
            } else {
                if (this.canRent == true && remainingCopies >= 1) {
                    this.remainingCopies = this.remainingCopies - 1;
                    if (this.remainingCopies == 0) {
                        this.canRent = false;
                    }
                    BorrowingRecord record = new BorrowingRecord(count, user.getId(), this.id, new Date());
                    BorrowingRecordHandling.writeBorrowingRecord(record);
                    user.updateBorrowingRecords();
                    return record;
                }
            }

        }
        return null;// shouldnt make record if more than 3 overdue

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
