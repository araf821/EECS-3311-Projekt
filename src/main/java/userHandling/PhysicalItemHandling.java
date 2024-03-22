package userHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import objects.PhysicalItem;

public class PhysicalItemHandling {
    // fields: id, title, itemType, location, remainingCopies, value

    private static final String CSV_FILE = "./items.csv";

    public static void writePhysicalItem(PhysicalItem item) {
        // write to csv file
        File file = new File(CSV_FILE);
        boolean fileExists = file.exists();

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(CSV_FILE, true)))) {
            if (fileExists) {
                writer.println(item.toCSVString());
            } else {
                file.createNewFile();
                writer.println(item.toCSVString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PhysicalItem getPhysicalItemById(int id) {
        File file = new File(CSV_FILE);
        if (!file.exists()) {
            // File does not exist, return null
            return null;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                PhysicalItem item = PhysicalItem.fromCSVLine(line);
                if (item.getId() == id) {
                    return item;
                }
            }
            throw new IllegalArgumentException("Item not found in the inventory.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void decreaseStockOfItem(int itemId) {
        // Open the CSV file
        String fileName = "items.csv";
        File file = new File(fileName);

        // Read the contents of the file and update the line for this item
        List<String> lines = new ArrayList<>();
        boolean itemFound = false;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                String[] parts = line.split(",");
                if (Integer.parseInt(parts[0]) == (itemId)) {
                    int newRemainingCopies = Integer.parseInt(parts[4]) - 1;
                    if (newRemainingCopies < 0) {
                        System.out.println("No copies available to borrow.");
                        return;
                    }
                    parts[4] = String.valueOf(newRemainingCopies);
                    line = String.join(",", parts);
                    itemFound = true;
                }
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return;
        }

        if (!itemFound) {
            System.out.println("Item not found in the inventory.");
            return;
        }

        // Write the updated contents back to the file
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                writer.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + fileName);
        }
    }

    public static void increaseStockOfItem(int itemId) {
        // Open the CSV file
        String fileName = "items.csv";
        File file = new File(fileName);

        // Read the contents of the file and update the line for this item
        List<String> lines = new ArrayList<>();
        boolean itemFound = false;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                String[] parts = line.split(",");
                if (Integer.parseInt(parts[0]) == (itemId)) {
                    int newRemainingCopies = Integer.parseInt(parts[4]) + 1;
                    parts[4] = String.valueOf(newRemainingCopies);
                    line = String.join(",", parts);
                    itemFound = true;
                }
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return;
        }

        if (!itemFound) {
            System.out.println("Item not found in the inventory.");
            return;
        }

        // Write the updated contents back to the file
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                writer.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + fileName);
        }
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