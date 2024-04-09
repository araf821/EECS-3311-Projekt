package UsermadeTests.Borrowingrecordtest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import objects.BorrowingRecord;
import userHandling.BorrowingRecordHandling;

import java.util.Date;

public class borrowingrecordhandlingtest {
    private BorrowingRecordHandling borrowingRecordHandling;
    private BorrowingRecord record;

    @Before
    public void setUp() {
        borrowingRecordHandling = BorrowingRecordHandling.getInstance();
        Date borrowDate = new Date();
        record = new BorrowingRecord(1, 101, 201, borrowDate);
    }

    @Test
    public void testWriteBorrowingRecord() {
        borrowingRecordHandling.writeBorrowingRecord(record);
        assertEquals(2, BorrowingRecordHandling.getLastId());
    }

    @Test
    public void testRemoveBorrowingRecord() {
        borrowingRecordHandling.writeBorrowingRecord(record);
        borrowingRecordHandling.RemoveBorrowingRecord(record);
        assertEquals(29, BorrowingRecordHandling.getLastId());
    }

    @Test
    public void testGetBorrowingRecordsByUserId() {
        borrowingRecordHandling.writeBorrowingRecord(record);
        assertEquals(29, borrowingRecordHandling.getBorrowingRecordsByUserId(101).size());
    }
}
