package org.example.eecs3311project;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class SearchController {

    @FXML
    private ScrollPane itemsScrollPane;

    @FXML
    private VBox searchContainer;

    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    private void initialize() {
        // Create and configure the text field
        TextField searchTextField = new TextField();
        searchTextField.setPromptText("Type here...");
        searchTextField.setStyle("-fx-background-color: white; -fx-prompt-text-fill: gray;");
        searchTextField.prefWidthProperty().bind(searchContainer.widthProperty().subtract(20)); // Adjust width
        searchContainer.getChildren().add(searchTextField); // Add text field to the container

        // Set padding for the search container
        searchContainer.setPadding(new Insets(10));
        searchContainer.setSpacing(10);
    }
}
