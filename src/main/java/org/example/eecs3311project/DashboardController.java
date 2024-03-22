package org.example.eecs3311project;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import objects.BorrowingRecord;
import objects.PhysicalItem;
import userHandling.AccountHandling;
import userHandling.BorrowingRecordHandling;
import userHandling.PhysicalItemHandling;

import java.util.ArrayList;

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
  private void initialize() {
    String emailText = (Main.currentUser != null && Main.currentUser.getEmail() != null) ? Main.currentUser.getEmail() : "User not recognized";
    userEmail.setText("Welcome back, " + emailText);

    VBox itemsContainer = new VBox(10); // 10 is the spacing between elements
    itemsContainer.setPadding(new Insets(10, 0, 0, 10)); // Optional padding

    ArrayList<PhysicalItem> items = new ArrayList<>();
    ArrayList<BorrowingRecord> records = BorrowingRecordHandling.getBorrowingRecordsByUserId(1);

    for (BorrowingRecord record : records) {
      PhysicalItem item = PhysicalItemHandling.getPhysicalItemById(record.getItemId());
      items.add(item);

      HBox itemBox = new HBox(10); // 10 is the spacing between elements in the HBox
      Text titleText = new Text(item.getTitle());
      Text dateText = new Text(record.getDueDate().toString()); // Adjust based on how you store/access dates

      itemBox.getChildren().addAll(titleText, dateText);
      itemsContainer.getChildren().add(itemBox);
    }

    itemsScrollPane.setContent(itemsContainer);
  }
}
