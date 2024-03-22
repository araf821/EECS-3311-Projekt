package userHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;



import objects.BorrowingRecord;
import objects.SystemManagerUser;

public class BorrowingRecordHandling {
    private static BorrowingRecordHandling handling = new BorrowingRecordHandling();
    private static final String CSV_FILE = "./borrowingrecords.csv";

    private BorrowingRecordHandling() {
    };

    public static BorrowingRecordHandling getInstance() {
        return handling;
    }

    public static void writeBorrowingRecord(BorrowingRecord record) {
        File file = new File(CSV_FILE);
        boolean fileExists = file.exists();

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(CSV_FILE, true)))) {
            if (fileExists) {
                writer.println(record.toCSVString());
            } else {
                file.createNewFile();
                writer.println(record.toCSVString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void RemoveBorrowingRecord(BorrowingRecord record){
        File file = new File(CSV_FILE);
        File file2 = new File("tempfile.txt");
        boolean fileExists = file.exists();
        String Remove = record.toCSVString();
        System.out.println(Remove + "REMOVE");
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
                String line;
                while((line = reader.readLine() )!= null){
                    if(line.equals(Remove)){
                        continue;
                    }
                    writer.write(line + System.lineSeparator());
                }

       
   } catch (IOException e) {
       e.printStackTrace(); 
   }
   
   if (!file.delete()) {
       System.out.println("Could not delete the original file");
       return;
   }

   if (!file2.renameTo(file)) {
       System.out.println("Could not rename the temporary file");
   }

    }


    public static ArrayList<BorrowingRecord> getBorrowingRecordsByUserId(int id) {
        ArrayList<BorrowingRecord> userRecords = new ArrayList<>();

        File file = new File(CSV_FILE);
        if (!file.exists()) {
            // File does not exist, return null
            return userRecords;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                BorrowingRecord record = BorrowingRecord.fromCSVLine(line);
                if (record.getUserId() == id) {
                    userRecords.add(record);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(userRecords.toString());
        return userRecords;
    }

    public static int getLastId() {
        File file = new File(CSV_FILE);
        if (!file.exists()) {
            // File does not exist, return null
            return 0;
        }

        int lastId = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int userId = Integer.parseInt(parts[0]);
                if (userId > lastId) {
                    lastId = userId;
                }
            }
        } catch (IOException | NumberFormatException e) {
            // Handle exceptions
            e.printStackTrace();
        }
        return lastId;
    }
}
