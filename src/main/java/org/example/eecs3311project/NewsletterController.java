package org.example.eecs3311project;

import objects.NewsPageSizeDecorator;
import objects.Newsletter;
import objects.Newsletter.LetterPublisher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class NewsletterController {

    private Main main;

    @FXML
    private ListView<Newsletter> newsletterListView;

    @FXML
    private Text subscriptionStatusText;


    public void setMain(Main main) {
        this.main = main;
    }

        @FXML
    public void initialize() {
        ObservableList<Newsletter> newsletters = FXCollections.observableArrayList(getAllNewsletters());
        newsletterListView.setItems(newsletters);

        newsletterListView.setCellFactory(lv -> new ListCell<Newsletter>() {
            @Override
            protected void updateItem(Newsletter newsletter, boolean empty) {
                super.updateItem(newsletter, empty);
                if (empty || newsletter == null) {
                    setText(null);
                    setGraphic(null);
                } else {
                    Label nameLabel = new Label(newsletter.getName().toString());
                    Button subscribeButton = new Button(newsletter.isSubscribed(main.currentUser) ? "Unsubscribe" : "Subscribe");
                    subscribeButton.setOnAction(e -> {
                        toggleSubscription(newsletter);
                        setText(nameLabel.getText());
                        subscribeButton.setText(newsletter.isSubscribed(main.currentUser) ? "Unsubscribe" : "Subscribe");
                        updateItem(newsletter, false);
                    });
        
                    HBox hBox = new HBox(nameLabel, subscribeButton);
                    hBox.setSpacing(10); 
        
                    if (newsletter.isSubscribed(main.currentUser)) {
                        Button openButton = new Button("Open");
                        openButton.setOnAction(e -> openNewsletterPopup(newsletter.getUrl()));
                        hBox.getChildren().add(openButton);
                    }
        
                    setGraphic(hBox);
                }
            }
        });        
    }

    private void toggleSubscription(Newsletter newsletter) {
        if (newsletter.isSubscribed(main.currentUser)) {
            newsletter.unsubscribe(main.currentUser);
        } else {
            newsletter.subscribe(main.currentUser);
        }
        subscriptionStatusText.setText("Subscription updated for " + newsletter.getName());
        newsletterListView.refresh();
    }

private void openNewsletterPopup(String contentUrl) {
    Stage primaryStage = (Stage) newsletterListView.getScene().getWindow();

    NewsPageSizeDecorator decorator = new NewsPageSizeDecorator();
    decorator.decorateNews(primaryStage, contentUrl);
}
    

    private List<Newsletter> getAllNewsletters() {
        ArrayList<Newsletter> newsletters = new ArrayList<>();
        newsletters.add(new Newsletter(LetterPublisher.NYTIMES, 5.00));
        newsletters.add(new Newsletter(LetterPublisher.WASHINGTONPOST, 3.00));
        newsletters.add(new Newsletter(LetterPublisher.USATODAY, 4.00));
        return newsletters;
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
    private void handleSearchButton() throws IOException {
        main.openSearch();
       
    }
}
