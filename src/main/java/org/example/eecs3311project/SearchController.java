package org.example.eecs3311project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import objects.BorrowingRecord;
import objects.PhysicalItem;
import userHandling.AccountHandling;
import userHandling.BorrowingRecordHandling;
import userHandling.PhysicalItemHandling;

public class SearchController {

    private Main main;
    @FXML
    private FlowPane flowPaneItems;

    @FXML
    private ScrollPane itemsScrollPane;

    @FXML
    private VBox searchContainer;
    @FXML
    private TextField searchTextField;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    public void initialize() {
       
        displayItems();
       
    }
     public void displayItems() {
        List<String> items = readItemsFromCsv();
        flowPaneItems.getChildren().clear();
        flowPaneItems.setPadding(new Insets(12));

        for (String itemDetails : items) {
            Label itemLabel = new Label(itemDetails);
            itemLabel.setWrapText(true);
            itemLabel.setMaxWidth(200);
            itemLabel.setStyle("-fx-background-color: #222; -fx-background-radius: 8; -fx-padding: 16; -fx-text-fill: white;");

            VBox itemCard = new VBox(itemLabel);

            flowPaneItems.getChildren().add(itemCard);
        }
    }
    public void displayItems(List<String> items) {
        flowPaneItems.getChildren().clear();
        flowPaneItems.setPadding(new Insets(12));

        for (String itemDetails : items) {
            Label itemLabel = new Label(itemDetails);
            itemLabel.setWrapText(true);
            itemLabel.setMaxWidth(200);
            itemLabel.setStyle("-fx-background-color: #222; -fx-background-radius: 8; -fx-padding: 16; -fx-text-fill: white;");

            VBox itemCard = new VBox(itemLabel);

            flowPaneItems.getChildren().add(itemCard);
        }
    }


    public List<String> readItemsFromCsv() {
        List<String> itemDetails = new ArrayList<>();
        String filePath = "items.csv";
    
        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            for (String line : lines) {
                String[] tokens = line.split(",");
                if (tokens.length >= 3) {
                    itemDetails.add(tokens[2].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading items from CSV: " + e.getMessage());
            e.printStackTrace();
        }
    
        return itemDetails;
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
    private void handleClickDashboard() throws IOException {
        main.openDashboardScreen();
      }
      @FXML
      private void handleClickItemRental() throws IOException {
          main.openItemRentalScreen();
        }

    @FXML
    private void handleSearchByEnter(){
            String searchText = searchTextField.getText();
            System.out.println(searchText);
            List<String> items = readItemsFromCsv();
            List<String> pog = new ArrayList<>();
            for(String item: items){
            if(item.contains(searchText)){
                pog.add(item);
            }
        }
            displayItems(pog);
           
    }
      
}
