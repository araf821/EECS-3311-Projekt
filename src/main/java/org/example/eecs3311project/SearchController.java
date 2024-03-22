package org.example.eecs3311project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import objects.BorrowingRecord;
import objects.PhysicalItem;
import userHandling.AccountHandling;
import userHandling.BorrowingRecordHandling;
import userHandling.PhysicalItemHandling;

public class SearchController {

    private Main main;
    @FXML
    private VBox itemsContainer;

    @FXML
    private ScrollPane itemsScrollPane;

    @FXML
    private VBox searchContainer;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    public void initialize() {
        displayAllBooks();
       
    }
     private void displayAllBooks() {
        itemsContainer.getChildren().clear(); // Clear previous items
        ArrayList<BorrowingRecord> records = BorrowingRecordHandling.getBorrowingRecordsByUserId(Main.currentUser.getId());
        for (BorrowingRecord record : records) {
            PhysicalItem item = PhysicalItemHandling.getPhysicalItemById(record.getItemId());
            displayBookItem(item, record);
        }
    }
    private void filterBooks(String query) {
        itemsContainer.getChildren().clear(); // Clear previous items
        ArrayList<BorrowingRecord> records = BorrowingRecordHandling.getBorrowingRecordsByUserId(Main.currentUser.getId());
        List<PhysicalItem> filteredBooks = records.stream()
                .map(record -> PhysicalItemHandling.getPhysicalItemById(record.getItemId()))
                .filter(item -> item.getTitle().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
        for (PhysicalItem item : filteredBooks) {
            displayBookItem(item, null);
        }
    }

    private void displayBookItem(PhysicalItem item, BorrowingRecord record) {
        Label titleLabel = new Label(item.getTitle());
    titleLabel.setStyle("-fx-text-fill: white;");
    titleLabel.setWrapText(true); // Allow wrapping text if it's too long
    titleLabel.setMaxWidth(300); // Limit the width of the label to avoid stretching

    // Create an HBox to hold the book title
    HBox itemBox = new HBox(titleLabel);
    itemBox.setStyle("-fx-background-color: #252525; -fx-background-radius: 5;");
    itemBox.setPadding(new Insets(10));
    itemBox.setSpacing(10);

    // Add the HBox to the itemsContainer
    itemsContainer.getChildren().add(itemBox);
    }

    
    @FXML
    private void handleSearchButton() {
        try {
            main.openSearch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleBackButtonfromSearch() throws IOException {
        main.openDashboardScreen();
      }
}
