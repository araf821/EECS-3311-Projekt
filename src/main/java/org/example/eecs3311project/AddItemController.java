package org.example.eecs3311project;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import objects.Book;
import objects.CD;
import objects.Magazine;
import objects.PhysicalItem;
import objects.PhysicalItem.ItemType;
import userHandling.PhysicalItemHandling;

public class AddItemController {

    @FXML
    private TextField titleTextField;

    @FXML
    private ComboBox<ItemType> typeComboBox;

    @FXML
    private TextField locationTextField;

    @FXML
    private TextField valueTextField;

    @FXML
    private Button backButton;

    @FXML
    private Button createButton;

    @FXML
    private TextField extraInfoTextField;

    @FXML
    private Label extraInfoLabel;

    private Main main;

    @FXML
    private void initialize() {
        typeComboBox.getItems().addAll(ItemType.values());

        // Initially hide all fields
        hideAllFields();
    }

    @FXML
    private void handleBackButton() throws IOException {
        main.openManagerDashboardScreen();
    }

    private void hideAllFields() {
        extraInfoLabel.setVisible(false);
        extraInfoTextField.setVisible(false);
    }

    @FXML
    private void handleComboBoxAction() {
        ItemType selectedType = typeComboBox.getValue();
        // Show/hide additional fields based on selected type
        if (selectedType != null) {
            switch (selectedType) {
                case BOOK:
                    extraInfoLabel.setText("ISBN:");
                    extraInfoLabel.setVisible(true);
                    extraInfoTextField.setPromptText("Enter ISBN");
                    extraInfoTextField.setVisible(true);
                    break;
                case CD:
                    extraInfoLabel.setText("Artist:");
                    extraInfoLabel.setVisible(true);
                    extraInfoTextField.setPromptText("Enter artist");
                    extraInfoTextField.setVisible(true);
                    break;
                case MAGAZINE:
                    extraInfoLabel.setText("Edition:");
                    extraInfoLabel.setVisible(true);
                    extraInfoTextField.setPromptText("Enter edition");
                    extraInfoTextField.setVisible(true);
                    break;
                default:
                    extraInfoLabel.setVisible(false);
                    extraInfoTextField.setVisible(false);
                    break;
            }
        }
    }

    @FXML
    private void handleCreateButton() {

        String title = titleTextField.getText();
        ItemType type = typeComboBox.getValue();
        if (type == null) {
            showAlert("Error", "Please select the item type.", AlertType.ERROR);
            return;
        }
        String extraInfo = extraInfoTextField.getText();
        String location = locationTextField.getText();
        String valueString = valueTextField.getText();
        if (type == ItemType.BOOK) {
            if (extraInfo.isEmpty()) {
                showAlert("Error", "Please enter the ISBN.", AlertType.ERROR);
                return;
            }
        }
        if (type == ItemType.CD) {
            if (extraInfo.isEmpty()) {
                showAlert("Error", "Please enter the artist.", AlertType.ERROR);
                return;
            }
        }
        if (type == ItemType.MAGAZINE) {
            if (extraInfo.isEmpty()) {
                showAlert("Error", "Please enter the edition.", AlertType.ERROR);
                return;
            }
        }
        double value;
        try {
            value = Double.parseDouble(valueString);
        } catch (NumberFormatException e) {
            showAlert("Error", "Please enter a valid decimal number.", AlertType.ERROR);
            return;
        }

        if (title.isEmpty()) {
            showAlert("Error", "Please enter the title.", AlertType.ERROR);
            return;
        }

        if (location.isEmpty()) {
            showAlert("Error", "Please enter the location.", AlertType.ERROR);
            return;
        }
        if (valueString.isEmpty()) {
            showAlert("Error", "Please enter the value.", AlertType.ERROR);
            return;
        }

        switch (type) {
            case BOOK:
                Book book = new Book(PhysicalItemHandling.getLastId() + 1, title, location, 20, value, extraInfo);
                PhysicalItemHandling.writePhysicalItem(book);
                showAlert("Success", "Book added successfully.", AlertType.CONFIRMATION);
                break;
            case MAGAZINE:
                Magazine magazine = new Magazine(PhysicalItemHandling.getLastId() + 1, title, location, 20, value,
                        extraInfo);
                PhysicalItemHandling.writePhysicalItem(magazine);
                showAlert("Success", "Magazine added successfully.", AlertType.CONFIRMATION);
                break;
            case CD:
                CD cd = new CD(PhysicalItemHandling.getLastId() + 1, title, location, 20, value, extraInfo);
                PhysicalItemHandling.writePhysicalItem(cd);
                showAlert("Success", "CD added successfully.", AlertType.CONFIRMATION);
                break;
            default:
                break;
        }
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
