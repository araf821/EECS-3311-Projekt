package userHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import objects.Newsletter;
import objects.PaymentOption;
import objects.PaymentType;
import objects.Student;
import objects.Subscription;
import objects.Newsletter.LetterPublisher;
import objects.User.UserType;

//fields: subscriptionId, userId, LetterPublisher, cost, payment type
public class SubscriptionHandling {
    private static final String CSV_FILE = "./subscriptions.csv";

    public static void writeSubscription(Subscription subscription) {
        // write to csv file
        File file = new File(CSV_FILE);
        boolean fileExists = file.exists();

        String lineToCheck = subscription.getUser().getId() + "," + subscription.getNewsletter().getName();
        String currentLine;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE));

            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.contains(lineToCheck)) {
                    System.out.println("User is already subscribed to this newsletter.");
                    reader.close();
                    return;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(CSV_FILE, true)))) {
            if (fileExists) {
                writer.println(subscription.toCSVString());
            } else {
                file.createNewFile();
                writer.println(subscription.toCSVString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cancelSubscription(int userId, LetterPublisher newsletterName) {
        try {
            File inputFile = new File(CSV_FILE);
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            StringBuilder sb = new StringBuilder();
            String lineToRemove = userId + "," + newsletterName;
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                // Check if the line contains the user ID and newsletter name
                if (!currentLine.contains(lineToRemove)) {
                    sb.append(currentLine).append("\n");
                }
            }
            reader.close();

            // Write the modified contents back to the original file
            FileWriter writer = new FileWriter(inputFile);
            writer.write(sb.toString());
            writer.close();

            System.out.println("Subscription canceled successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while canceling subscription: " + e.getMessage());
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
                int subscriptionId = Integer.parseInt(parts[0]);
                if (subscriptionId > lastId) {
                    lastId = subscriptionId;
                }
            }
        } catch (IOException | NumberFormatException e) {
            // Handle exceptions
            e.printStackTrace();
        }
        return lastId;
    }

    public static void main(String[] args) {
        Student user = new Student(1, "John", "Doe", UserType.STUDENT);
        Newsletter newsletter = new Newsletter(LetterPublisher.NYTIMES, 10.0);
        PaymentOption paymentOption = new PaymentOption(1, 100.0, PaymentType.CREDIT);
        Subscription subscription = new Subscription(user, newsletter, paymentOption);
        writeSubscription(subscription);
        cancelSubscription(user.getId(), newsletter.getName());
    }
}