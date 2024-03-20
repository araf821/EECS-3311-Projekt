package objects;

import java.util.ArrayList;

public abstract class User {
    private int id;
    private String email;
    private String password;
    private UserType userType;
    private ArrayList<BorrowingRecord> borrowingRecords;

    // Constructor
    public User(int id, String email, String password, UserType userType) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.borrowingRecords = new ArrayList<BorrowingRecord>();
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public UserType getUserType() {
        return userType;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<BorrowingRecord> getBorrowingRecords() {
        return borrowingRecords;
    }
    // Other getters and setters...

    public boolean moreThanThreeOverdueItems() {
        int count = 0;
        for (BorrowingRecord record : borrowingRecords) {
            if (record.isOverdue()) {
                count++;
            }
        }
        return count > 3;
    }
    
    public int sendRequest(Book book, boolean teaching) 
    {
    	Request req = new Request(book,this,teaching);
    	return req.getPriority();
    }

    // Enum for user types
    public enum UserType {
        STUDENT, FACULTY, NON_FACULTY_STAFF, VISITOR
    }
}
