package org.example.eecs3311project;

import java.util.Arrays;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import objects.User;
import objects.User.UserType;
import userHandling.AccountHandling;

public class CreateManagerAccountController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField secretKeyField;

    @FXML
    private GridPane createManagerAccountPane;

    private Main main;

    private final String SECRET_KEY = "Admin12345";

    @FXML
    private void initialize() {
        // Initialize user type combo box
        createManagerAccountPane.setPadding(new Insets(20));
    }

    @FXML
    private void handleCreateManagerAccountButton() {
        String email = emailField.getText();
        String password = passwordField.getText();
        String secretKey = secretKeyField.getText();

        // Call createAccount method with the provided data
        createManagerAccount(email, password, secretKey);
    }

    @FXML
    private void handleBackButton() {
        main.switchToSignInPage();
    }

    public void setMain(Main main) {
        this.main = main;
    }

    // Method to create account
    private void createManagerAccount(String email, String password, String secretKey) {

        if (email.isEmpty() || password.isEmpty()) {
            showAlert("Error", "Please enter your email and password.");
            return;
        }

        if (!AccountHandling.validateEmail(email)) {
            showAlert("Error", "Invalid email address.");
            return;
        }

        if (AccountHandling.isEmailTaken(email)) {
            showAlert("Error", "Email is already taken.");
            return;
        }

        if (!AccountHandling.validatePassword(password)) {
            showAlert("Error",
                    "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one digit, and one symbol.");
            return;
        }

        if (!secretKey.equals(SECRET_KEY)) {
            showAlert("Error", "Incorrect secrey key. Please try again or ask for one from a current system admin.");
            return;
        }

        AccountHandling.createAccount(email, password, UserType.SYSTEM_MANAGER);

        System.out.println(UserType.SYSTEM_MANAGER);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
