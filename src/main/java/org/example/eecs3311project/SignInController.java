package org.example.eecs3311project;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import objects.User;
import objects.User.UserType;
import userHandling.AccountHandling;

public class SignInController {

  @FXML
  private TextField usernameField;

  @FXML
  private PasswordField passwordField;

  @FXML
  private GridPane signInPane;

  private Main main;

  public void setMain(Main main) {
    this.main = main;
  }

  @FXML
  private void initialize() {
    // Set padding for the GridPane
    signInPane.setPadding(new Insets(20)); // Set 20px padding
  }

  @FXML
  private void signInButtonClicked() throws IOException {
    String email = usernameField.getText();
    String password = passwordField.getText();

    if (email.isEmpty() || password.isEmpty()) {
      showAlert("Error", "Please enter your email and password.");
      return;
    }

    if (!AccountHandling.validateEmail(email)) {
      showAlert("Error", "Invalid email address.");
      return;
    }

    if (!AccountHandling.validatePassword(password)) {
      showAlert("Error", "Invalid Password.");
      return;
    }

    Main.currentUser = AccountHandling.signIn(email, password);

    if (Main.currentUser == null) {
      showAlert("Error", "Invalid email or password.");
      return;
    }

    // Implement sign-in logic here
    // Check credentials, validate, etc.

    // For demonstration purposes, assume sign-in is successful
    System.out.println(
        "Sign-in successful for:\nUser: " +
            email +
            "\nPassword: " +
            password +
            "\n");
    System.out.println(Main.currentUser.updateBorrowingRecords());
    System.out.println(Main.currentUser.getUserType());
    System.out.println(Main.currentUser.getValidationStatus());

    // Navigate to another page or perform other actions as needed
    if (Main.currentUser.getUserType() == UserType.SYSTEM_MANAGER)
      main.openManagerDashboardScreen();
    else {
      main.openDashboardScreen();
    }
  }

  @FXML
  private void createAccountButtonClicked() throws IOException {
    // Switch to the create account page
    main.switchToCreateAccountPage();
  }

  @FXML
  private void createManagerAccountButtonClicked() throws IOException {
    // Switch to the create account page
    main.switchToCreateManagerAccountPage();
  }

  private void showAlert(String title, String message) {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.showAndWait();
  }
}
