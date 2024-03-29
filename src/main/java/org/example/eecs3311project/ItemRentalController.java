package org.example.eecs3311project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import objects.BorrowingRecord;
import objects.PhysicalItem;
import userHandling.BorrowingRecordHandling;
import userHandling.PhysicalItemHandling;

public class ItemRentalController {

    private Main main;

    @FXML
    private Text userEmail;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    private FlowPane itemsFlowPane;

    @FXML
    private void initialize() {
        String emailText = (Main.currentUser != null && Main.currentUser.getEmail() != null)
                ? Main.currentUser.getEmail()
                : "User not recognized";
        userEmail.setText(
                "Currently logged in as @" + emailText.split("@")[0] + ".");

        displayItems();
    }

    @FXML
    private void handleClickDashboard() throws IOException {
        main.openDashboardScreen();
    }

    @FXML
    private void handleClickSearch() throws IOException {
        main.openSearch();
    }

    public void displayItems() {
        List<String> items = readItemsFromCsv();
        itemsFlowPane.getChildren().clear();
        itemsFlowPane.setPadding(new Insets(12));
        itemsFlowPane.setVgap(10);
        itemsFlowPane.setHgap(10);

        for (String item : items) {
            String[] details = item.split(",");
            if (details.length < 7)
                continue;

            Label titleLabel = new Label(details[2]);
            titleLabel.setStyle(
                    "-fx-font-size: 15px; -fx-text-fill: white; -fx-font-weight: bold;");

            Label stockLabel = new Label("In Stock: " + details[4]);
            stockLabel.setStyle("-fx-text-fill: #a3a3a3;");

            Label typeLabel = new Label("Type: " + details[1]);
            typeLabel.setStyle("-fx-text-fill: #a3a3a3;");

            Label locationLabel = new Label("Location: " + details[3]);
            locationLabel.setStyle("-fx-text-fill: #a3a3a3;");

            Button rentButton = new Button("Rent");
            rentButton.setStyle(
                    "-fx-background-color: #3b82f6; -fx-text-fill: white;");
            rentButton.setMaxWidth(Double.MAX_VALUE);
            rentButton.setOnAction(e -> handleRentButtonClick(item));

            VBox itemCard = new VBox(
                    5,
                    titleLabel,
                    stockLabel,
                    typeLabel,
                    locationLabel,
                    rentButton);
            itemCard.setStyle(
                    "-fx-background-color: #222; -fx-background-radius: 8; -fx-padding: 16;");

            itemsFlowPane.getChildren().add(itemCard);
        }
    }

    private void handleRentButtonClick(String item) {
        PhysicalItem itemObj = PhysicalItem.fromCSVString(item);
        BorrowingRecord record = itemObj.borrow(Main.currentUser);

        if (record == null) {
            showAlert("Error", "Failed to rent item.", AlertType.ERROR);
        } else {
            showAlert("Success", "Item rented successfully.", AlertType.INFORMATION);
            displayItems();
        }
    }

    public List<String> readItemsFromCsv() {
        List<String> itemDetails = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Path.of("items.csv"));
            itemDetails.addAll(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return itemDetails;
    }

    private void showAlert(String title, String message, AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
