package org.example.eecs3311project;

import java.io.IOException;
import java.util.ArrayList;

import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import objects.BorrowingRecord;
import objects.PhysicalItem;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import userHandling.BorrowingRecordHandling;

public class ManagerDashboardController {
    private Main main;

    @FXML
    private Text userEmail;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    private void handleAddItemButton() throws IOException {
        main.switchToAddItemPage();
    }

    @FXML
    private void initialize() {
        String emailText = (Main.currentUser != null && Main.currentUser.getEmail() != null)
                ? Main.currentUser.getEmail()
                : "User not recognized";
        userEmail.setText("Welcome back, " + emailText);

        VBox itemsContainer = new VBox(10);
        itemsContainer.setStyle("-fx-background-color: #202020;");
        itemsContainer.setPadding(new Insets(10, 0, 10, 10));

        HBox headerBox = new HBox();
        headerBox.prefWidthProperty();
        headerBox.setPadding(new Insets(10));
        headerBox.setStyle("-fx-background-color: #252525; -fx-background-radius: 5;");

    }

}
