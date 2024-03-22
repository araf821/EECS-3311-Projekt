package org.example.eecs3311project;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import objects.BorrowingRecord;
import objects.PhysicalItem;
import userHandling.AccountHandling;
import userHandling.BorrowingRecordHandling;
import userHandling.PhysicalItemHandling;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class DashboardController {

  private Main main;

  @FXML
  private Text userEmail;
  @FXML
  private ScrollPane itemsScrollPane;

  public void setMain(Main main) {
    this.main = main;
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
  private void initialize() {
    String emailText = (Main.currentUser != null && Main.currentUser.getEmail() != null) ? Main.currentUser.getEmail()
        : "User not recognized";
    userEmail.setText("Welcome back, " + emailText);

    VBox itemsContainer = new VBox(10);
    itemsContainer.setStyle("-fx-background-color: #202020;");
    itemsContainer.setPadding(new Insets(10, 0, 10, 10));

    ArrayList<PhysicalItem> items = new ArrayList<>();
    ArrayList<BorrowingRecord> records = BorrowingRecordHandling.getBorrowingRecordsByUserId(Main.currentUser.getId());

    HBox headerBox = new HBox();
    headerBox.prefWidthProperty().bind(itemsScrollPane.widthProperty());
    headerBox.setPadding(new Insets(10));
    headerBox.setStyle("-fx-background-color: #252525; -fx-background-radius: 5;");

    Text titleHeader = new Text("Item Name");
    titleHeader.setStyle("-fx-fill: white;");
    titleHeader.setFont(Font.font("Arial", FontWeight.BOLD, 14));
    titleHeader.wrappingWidthProperty().bind(itemsScrollPane.widthProperty().subtract(125));

    Text dateHeader = new Text("Due Date");
    dateHeader.setStyle("-fx-fill: white;");
    dateHeader.setFont(Font.font("Arial", FontWeight.BOLD, 14));

    dateHeader.setTextAlignment(TextAlignment.RIGHT);

    HBox.setHgrow(titleHeader, Priority.ALWAYS);

    headerBox.getChildren().addAll(titleHeader, dateHeader);
    itemsContainer.getChildren().add(headerBox);

    for (BorrowingRecord record : records) {
      PhysicalItem item = PhysicalItemHandling.getPhysicalItemById(record.getItemId());
      items.add(item);

      HBox itemBox = new HBox();
      itemBox.prefWidthProperty().bind(itemsScrollPane.widthProperty());
      itemBox.setPadding(new Insets(10));
      itemBox.setStyle("-fx-background-color: #252525; -fx-background-radius: 5;");

      Text titleText = new Text(item.getTitle() != null ? item.getTitle() : "[Missing Title]");
      titleText.setStyle("-fx-fill: white;");
      titleText.wrappingWidthProperty().bind(itemsScrollPane.widthProperty().subtract(125));

      Date date = record.getDueDate();
      LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
      String formattedDate = localDate.format(formatter);

      Text dateText = new Text(formattedDate);
      dateText.setStyle("-fx-fill: white;");
      dateText.setTextAlignment(TextAlignment.RIGHT);

      HBox.setHgrow(titleText, Priority.ALWAYS);

      itemBox.getChildren().addAll(titleText, dateText);
      itemsContainer.getChildren().add(itemBox);
    }

    itemsScrollPane.setContent(itemsContainer);
  }
}
