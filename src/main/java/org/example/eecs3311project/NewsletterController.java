package org.example.eecs3311project;

import objects.Newsletter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class NewsletterController {

    private Main main;

    @FXML
    private ListView<Newsletter> newsletterListView; // Assuming Newsletter is your model class

    @FXML
    private Text subscriptionStatusText;


    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    public void initialize() {
        // Initialize your ListView with newsletters
        newsletterListView.setCellFactory(param -> new ListCell<Newsletter>() {
            @Override
            protected void updateItem(Newsletter item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                    setGraphic(null);
                } else {
                    setText(item.getName().toString()); // Assuming getName() returns the newsletter's name
                    Button subscribeButton = new Button("Subscribe");
                    subscribeButton.setOnAction(e -> subscribeToNewsletter(item));
                    Button visitButton = new Button("Visit Website");
                    visitButton.setOnAction(e -> openWebsite(item.getUrl())); // Assuming getUrl() returns the newsletter's website URL
                    HBox hBox = new HBox(subscribeButton, visitButton);
                    setGraphic(hBox);
                }
            }
        });
    }

    private void subscribeToNewsletter(Newsletter newsletter) {
        // Implement subscription logic here
        subscriptionStatusText.setText("Subscribed to " + newsletter.getName());
    }

    private void openWebsite(String url) {
        WebView webView = new WebView();
        webView.getEngine().load(url);
        Stage stage = new Stage();
        stage.setScene(new Scene(webView));
        stage.show();
    }
}
