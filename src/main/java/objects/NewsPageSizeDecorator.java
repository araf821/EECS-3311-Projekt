package objects;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class NewsPageSizeDecorator {
	public int decoratedX;
	public int decoratedY;
	
    public void decorateNews(Stage primaryStage, String source) {
        // Create a new stage for the popup window
        Stage popupStage = new Stage();
        popupStage.initModality(Modality.APPLICATION_MODAL);
        popupStage.initOwner(primaryStage);

        // Create WebView and load the URL
        WebView webView = new WebView();
        webView.getEngine().load(source);

        // Set the size of the popup to 50% of the owner stage size
        Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
        double popupWidth = primaryStage.getWidth() * 0.8;
        double popupHeight = (primaryStage.getHeight() * 0.8) - 50;


        // Ensure the popup is not larger than the screen bounds
        popupWidth = Math.min(popupWidth, screenSize.getWidth());
        popupHeight = Math.min(popupHeight, screenSize.getHeight());

        // Set the position to center the popup over the primary stage
        double posX = primaryStage.getX() + (primaryStage.getWidth() - popupWidth) / 2;
        double posY = primaryStage.getY() + (primaryStage.getHeight() - popupHeight) / 2;

        popupStage.setX(posX);
        popupStage.setY(posY);

        // Set the Scene of the popup Stage
        VBox vBox = new VBox(webView); // Using VBox as the root node
        Scene popupScene = new Scene(vBox, popupWidth, popupHeight);
        popupStage.setScene(popupScene);

        // Show the popup stage
        popupStage.show();
    }
}
