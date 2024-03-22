package objects;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import objects.User.UserType;
import userHandling.BorrowingRecordHandling;
import userHandling.PhysicalItemHandling;

public abstract class PhysicalItem {
    private int id;
    private String title;
    private int remainingCopies;
    private String location;
    private boolean canPurchase;
    private boolean canRent;
    private double value;

    public PhysicalItem(int id, String title, String location, int remainingCopies, double value) {
        this.id = id;
        this.title = title;
        this.remainingCopies = remainingCopies;
        this.location = location;
        this.canPurchase = remainingCopies > 0;
        this.canRent = remainingCopies > 0;
        this.value = value;
    }

    public BorrowingRecord borrow(User user) {
        if (user.moreThanThreeOverdueItems() == false && user.getValidationStatus() == true) {
            ArrayList<BorrowingRecord> recordd = user.updateBorrowingRecords();
            if (recordd.size() >= 10) {
                return null; // shouldnt make record if more than 10
            } else {
                if (this.canRent == true && remainingCopies >= 1) {
                    this.remainingCopies = this.remainingCopies - 1;
                    if (this.remainingCopies == 0) {
                        this.canRent = false;
                    }
                    int newRecordId = BorrowingRecordHandling.getLastId() + 1;
                    PhysicalItemHandling.decreaseStockOfItem(this.id);
                    BorrowingRecord record = new BorrowingRecord(newRecordId, user.getId(), this.id, new Date());
                    BorrowingRecordHandling.writeBorrowingRecord(record);
                    user.updateBorrowingRecords();
                    return record;
                }
            }

        }
        return null;// shouldnt make record if more than 3 overdue
    }

    public void returnObject(User user){
        ArrayList<BorrowingRecord> record = user.updateBorrowingRecords();
        BorrowingRecord object = record.get(this.id);
        BorrowingRecordHandling foo = BorrowingRecordHandling.getInstance();
        BorrowingRecordHandling.RemoveBorrowingRecord(object);
        
        
        

    }

    public String toCSVString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.id).append(",");
        if (this instanceof Book) {
            sb.append("BOOK").append(",");
        } else if (this instanceof Magazine) {
            sb.append("MAGAZINE").append(",");
        } else if (this instanceof CD) {
            sb.append("CD").append(",");
        }
        sb.append(this.title).append(",");
        sb.append(this.location).append(",");
        sb.append(this.remainingCopies).append(",");
        sb.append(this.value).append(",");
        if (this instanceof Book) {
            sb.append(((Book) this).getIsbn());
        } else if (this instanceof Magazine) {
            sb.append(((Magazine) this).getEdition());
        } else if (this instanceof CD) {
            sb.append(((CD) this).getArtist());
        }

        return sb.toString();
    }

    public static PhysicalItem fromCSVString(String csvLine) {
        String[] parts = csvLine.split(",");
        int id = Integer.parseInt(parts[0]);
        String itemType = parts[1];
        String title = parts[2];
        String location = parts[3];
        int remainingCopies = Integer.parseInt(parts[4]);
        double value = Double.parseDouble(parts[5]);
        String extraInfo = parts[6];

        switch (itemType) {
            case "BOOK":
                return new Book(id, title, location, remainingCopies, value, extraInfo);
            case "MAGAZINE":
                return new Magazine(id, title, location, remainingCopies, value, extraInfo);
            case "CD":
                return new CD(id, title, location, remainingCopies, value, extraInfo);
            default:
                throw new IllegalArgumentException("Unknown item type: " + itemType);
        }
    }

    public static PhysicalItem fromCSVLine(String csvLine) {
        String[] parts = csvLine.split(",");
        int id = Integer.parseInt(parts[0]);
        String itemType = parts[1];
        String title = parts[2];
        String location = parts[3];
        int remainingCopies = Integer.parseInt(parts[4]);
        double value = Double.parseDouble(parts[5]);
        String extraInfo = parts[6];

        switch (itemType) {
            case "BOOK":
                return new Book(id, title, location, remainingCopies, value, extraInfo);
            case "MAGAZINE":
                return new Magazine(id, title, location, remainingCopies, value, extraInfo);
            case "CD":
                return new CD(id, title, location, remainingCopies, value, extraInfo);
            default:
                throw new IllegalArgumentException("Unknown item type: " + itemType);
        }
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

    public static enum ItemType {
        BOOK, MAGAZINE, CD
    }

    public static void main(String[] args) {
        User user = new Student(2, "asds", "asds", UserType.STUDENT);
        SystemManagerUser user2 = new SystemManagerUser(2, "asds", "asds", UserType.SYSTEM_MANAGER);
        user.setValidationStatus(true);
        PhysicalItem item = PhysicalItemHandling.getPhysicalItemById(3);
        System.out.println("id: " + item.getId());
        item.returnObject(user);
        

    }
}
