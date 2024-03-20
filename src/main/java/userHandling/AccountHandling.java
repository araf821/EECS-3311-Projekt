package userHandling;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import objects.Faculty;
import objects.NonFacultyStaff;
import objects.Student;
import objects.User;
import objects.Visitor;
import objects.User.UserType;

public class AccountHandling {

    private static final String CSV_FILE = "./users.csv";

    public static boolean validatePassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        // Check if the password contains at least one uppercase letter
        Pattern uppercasePattern = Pattern.compile("[A-Z]");
        Matcher uppercaseMatcher = uppercasePattern.matcher(password);
        if (!uppercaseMatcher.find()) {
            return false;
        }

        // Check if the password contains at least one lowercase letter
        Pattern lowercasePattern = Pattern.compile("[a-z]");
        Matcher lowercaseMatcher = lowercasePattern.matcher(password);
        if (!lowercaseMatcher.find()) {
            return false;
        }

        // Check if the password contains at least one digit
        Pattern digitPattern = Pattern.compile("\\d");
        Matcher digitMatcher = digitPattern.matcher(password);
        if (!digitMatcher.find()) {
            return false;
        }

        // Check if the password contains at least one symbol
        Pattern symbolPattern = Pattern.compile("[!@#$%^&*()\\-+=_{}|\\[\\]:;<>,.?/~]");
        Matcher symbolMatcher = symbolPattern.matcher(password);
        if (!symbolMatcher.find()) {
            return false;
        }

        return true; // Password meets all criteria

    }

    public static void createAccount(String email, String password, UserType userType) {
        int id = getLastId() + 1;
        String line = id + "," + email + "," + password + "," + userType;

        // Check if the file exists
        File file = new File(CSV_FILE);
        boolean fileExists = file.exists();

        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            // If the file exists, just append the new account information
            if (fileExists) {
                writer.println(line);
            } else { // If the file doesn't exist, create it and write to it
                file.createNewFile();
                writer.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static User signIn(String email, String password) {
        File file = new File(CSV_FILE);
        if (!file.exists()) {
            // File does not exist, return null
            return null;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[1].equals(email) && parts[2].equals(password)) {
                    UserType userType = UserType.valueOf(parts[3]);
                    switch (userType) {
                        case STUDENT:
                            return new Student(Integer.parseInt(parts[0]), parts[1], parts[2], userType, false);
                        case FACULTY:
                            return new Faculty(Integer.parseInt(parts[0]), parts[1], parts[2], userType, false);
                        case NON_FACULTY_STAFF:
                            return new NonFacultyStaff(Integer.parseInt(parts[0]), parts[1], parts[2], userType, false);
                        case VISITOR:
                            return new Visitor(Integer.parseInt(parts[0]), parts[1], parts[2], userType);
                        default:
                            // Handle unknown user types
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static int getLastId() {
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

    public static boolean isEmailTaken(String email) {
        File file = new File(CSV_FILE);
        if (!file.exists()) {
            // File does not exist, return false
            return false;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[1].equals(email)) {
                    return true;
                }
            }
        } catch (IOException e) {
            // Handle exceptions
            e.printStackTrace();
        }
        return false;
    }

    public static boolean validateEmail(String email) {
        // Regular expression for email validation
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
