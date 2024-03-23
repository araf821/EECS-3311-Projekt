package org.example.eecs3311project;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import userHandling.AccountHandling;
import userHandling.AccountHandling.ValidationStatus;

public class EmailValidationController {

    @FXML
    private GridPane emailValidationPane;

    @FXML
    private TextField emailTextField;

    @FXML
    private Button validateButton;

    @FXML
    private Button backButton;

    private Main main;

    @FXML
    private void initialize() {
        // Set padding for the GridPane
        emailValidationPane.setPadding(new Insets(20)); // Set 20px padding
    }

    @FXML
    private void handleValidateButton() {
        String email = emailTextField.getText();

        if (email.isEmpty()) {
            showAlert("Error", "Please enter your email.", AlertType.ERROR);
            return;
        }

        ValidationStatus status = AccountHandling.updateValidation(email);

        switch (status) {
            case SUCCESS:
                showAlert("Success", "Email validated successfully.", AlertType.INFORMATION);
                break;
            case FAILURE:
                showAlert("Error", "Invalid email address.", AlertType.ERROR);
                break;
            default:
                break;
        }
    }

    @FXML
    private void handleBackButton() throws IOException {
        // Add your logic for navigating back to the previous page
        main.openManagerDashboardScreen();
    }

    public void setMain(Main main) {
        this.main = main;
    }

    private void showAlert(String title, String message, AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}