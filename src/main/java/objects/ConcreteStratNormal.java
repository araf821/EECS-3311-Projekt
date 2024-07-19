package objects;

import java.util.ArrayList;

import userHandling.BorrowingRecordHandling;

public class ConcreteStratNormal implements Strategy {

    @Override
    public void execute(User user, PhysicalItem item) {
        ArrayList<BorrowingRecord> record = user.updateBorrowingRecords();
        BorrowingRecord object = record.get(item.getId());
        BorrowingRecordHandling foo = BorrowingRecordHandling.getInstance();
        BorrowingRecordHandling.RemoveBorrowingRecord(object);
       
    }
    
}
