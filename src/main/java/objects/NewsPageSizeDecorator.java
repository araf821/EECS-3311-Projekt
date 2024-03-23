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
        Stage popupStage = new Stage();
        popupStage.initModality(Modality.APPLICATION_MODAL);
        popupStage.initOwner(primaryStage);

        WebView webView = new WebView();
        webView.getEngine().load(source);

        Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
        double popupWidth = primaryStage.getWidth() * 0.8;
        double popupHeight = (primaryStage.getHeight() * 0.8) - 50;


        popupWidth = Math.min(popupWidth, screenSize.getWidth());
        popupHeight = Math.min(popupHeight, screenSize.getHeight());

        double posX = primaryStage.getX() + (primaryStage.getWidth() - popupWidth) / 2;
        double posY = primaryStage.getY() + (primaryStage.getHeight() - popupHeight) / 2;

        popupStage.setX(posX);
        popupStage.setY(posY);

        VBox vBox = new VBox(webView); // Using VBox as the root node
        Scene popupScene = new Scene(vBox, popupWidth, popupHeight);
        popupStage.setScene(popupScene);

        popupStage.show();
    }
}
