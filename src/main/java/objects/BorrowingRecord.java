package objects;

import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class BorrowingRecord {
    private int id;
    private int userId;
    private int itemId;
    private Date borrowDate;
    private Date dueDate;
    private Date returnDate;

    public BorrowingRecord(int id, int userId, int itemId, Date borrowDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(borrowDate);
        calendar.add(Calendar.MONTH, 1);
        this.id = id;
        this.userId = userId;
        this.itemId = itemId;
        this.borrowDate = borrowDate;
        this.dueDate = calendar.getTime();
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getItemId() {
        return itemId;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public double calculatePenalty() {
        double penalty = calculateDaysOverdue() * 0.5;
        return penalty > 0 ? penalty : 0;
    }

    public boolean isOverdue() {
        return calculateDaysOverdue() > 0;
    }

    private int calculateDaysOverdue() {
        LocalDate firstDay = this.dueDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        LocalDate secondDay = new Date().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

        long differenceInDays = ChronoUnit.DAYS.between(firstDay, secondDay);

        return (int) differenceInDays;
    }

    public static void main(String[] args) {
        BorrowingRecord borrowingRecord = new BorrowingRecord(1, 2, 3, new Date());
        System.out.println("Difference in days: " + borrowingRecord.calculateDaysOverdue());
        System.out.println(borrowingRecord.getBorrowDate());
        System.out.println(borrowingRecord.getDueDate());
        System.out.println(borrowingRecord.calculatePenalty());
    }
}
