package objects;

import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.text.SimpleDateFormat;

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
        if (isOverdue()) {
        	LatePenaltyStrategy late = new LatePenaltyStrategy();
        	return late.calculate(this.dueDate, this.returnDate);
        }
        OnTimePenaltyStrategy onTime = new OnTimePenaltyStrategy();
        return onTime.calculate(this.dueDate, this.returnDate);
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

    public String toCSVString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        StringBuilder sb = new StringBuilder();
        sb.append(id).append(",");
        sb.append(userId).append(",");
        sb.append(itemId).append(",");
        sb.append(dateFormat.format(borrowDate)).append(",");
        sb.append(dateFormat.format(dueDate)).append(",");
        if (returnDate != null) {
            sb.append(dateFormat.format(returnDate));
        }
        return sb.toString();
    }

    public static BorrowingRecord fromCSVString(String csvString) {
        String[] parts = csvString.split(",");
        int id = Integer.parseInt(parts[0]);
        int userId = Integer.parseInt(parts[1]);
        int itemId = Integer.parseInt(parts[2]);
        Date borrowDate = parseDate(parts[3]);
        Date returnDate = null;
        if (parts.length > 5 && !parts[5].isEmpty()) {
            returnDate = parseDate(parts[5]);
        }

        BorrowingRecord record = new BorrowingRecord(id, userId, itemId, borrowDate);
        record.returnDate = returnDate;
        return record;
    }

    public static BorrowingRecord fromCSVLine(String line) {
        String[] parts = line.split(",");
        int id = Integer.parseInt(parts[0]);
        int userId = Integer.parseInt(parts[1]);
        int itemId = Integer.parseInt(parts[2]);
        Date borrowDate = parseDate(parts[3]);
        Date dueDate = parseDate(parts[4]);
        Date returnDate = null;
        if (parts.length > 5 && !parts[5].isEmpty()) {
            returnDate = parseDate(parts[5]);
        }

        return new BorrowingRecord(id, userId, itemId, borrowDate);
    }

    private static Date parseDate(String dateString) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.parse(dateString);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
