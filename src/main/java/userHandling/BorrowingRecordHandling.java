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
