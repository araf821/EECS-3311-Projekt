package org.example.eecs3311project;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import objects.User.UserType;
import userHandling.AccountHandling;

public class CreateAccountController {

  @FXML
  private TextField emailField;

  @FXML
  private PasswordField passwordField;

  @FXML
  private ComboBox<UserType> userTypeComboBox;

  @FXML
  private GridPane createAccountPane;

  private Main main;

  @FXML
  private void initialize() {
    // Initialize user type combo box
    createAccountPane.setPadding(new Insets(20));
    userTypeComboBox.getItems().addAll(UserType.values());
  }

  @FXML
  private void handleCreateAccountButton() {
    String email = emailField.getText();
    String password = passwordField.getText();
    UserType userType = userTypeComboBox.getValue();

    // Call createAccount method with the provided data
    createAccount(email, password, userType);
  }

  @FXML
  private void handleBackButton() {
    main.switchToSignInPage();
  }

  public void setMain(Main main) {
    this.main = main;
  }

  // Method to create account
  private void createAccount(String email, String password, UserType userType) {
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
      showAlert(
        "Error",
        "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one digit, and one symbol."
      );
      return;
    }

    if (userType == null) {
      showAlert("Error", "Please select a user type.");
      return;
    }

    AccountHandling.createAccount(email, password, userType);

    System.out.println("Creating account with:");
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
    System.out.println("User Type: " + userType);
  }

  private void showAlert(String title, String message) {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.showAndWait();
  }
}
