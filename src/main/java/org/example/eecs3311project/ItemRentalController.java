package org.example.eecs3311project;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.io.IOException;

public class ItemRentalController {

    private Main main;

    @FXML
    private Text userEmail;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    private void initialize() {
        String emailText = (Main.currentUser != null && Main.currentUser.getEmail() != null) ? Main.currentUser.getEmail() : "User not recognized";
        userEmail.setText("Welcome back, " + emailText);
    }

    @FXML
    private void handleClickDashboard() throws IOException {
        main.openDashboardScreen();
    }
    @FXML
    private void handleClickItemRental() throws IOException {
        main.openItemRentalScreen();
    }
    @FXML
    private void handleClickSearch() throws IOException {
        main.openSearch();
    }
}
