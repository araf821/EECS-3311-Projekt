package org.example.eecs3311project;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import objects.User;

public class Main extends Application {

  public static User currentUser;
  private Stage primaryStage;
  private Scene signInScene;
  private SignInController signInController;
  private CreateAccountController createAccountController;
  private CreateManagerAccountController createManagerAccountController;

  @Override
  public void start(Stage primaryStage) throws Exception {
    this.primaryStage = primaryStage;

    // Load the sign-in page initially
    FXMLLoader signInLoader = new FXMLLoader(
      getClass().getResource("fxml/sign-in.fxml")
    );
    Parent signInRoot = signInLoader.load();
    signInController = signInLoader.getController();
    signInController.setMain(this); // Pass a reference to the main application to the controller

    // Create the scene for the sign-in page
    signInScene = new Scene(signInRoot, 400, 400);
    signInScene
      .getStylesheets()
      .add(
        getClass()
          .getResource("/org/example/eecs3311project/styles.css")
          .toExternalForm()
      );

    // Set the scene and show the stage
    primaryStage.setScene(signInScene);
    primaryStage.setTitle("Sign In");
    primaryStage.show();
  }

  // Method to switch to the create account page
  public void switchToCreateAccountPage() throws IOException {
    FXMLLoader createAccountLoader = new FXMLLoader(
      getClass().getResource("fxml/create-account.fxml")
    );
    Parent createAccountRoot = createAccountLoader.load();
    createAccountController = createAccountLoader.getController();
    createAccountController.setMain(this); // Pass a reference to the main application to the controller

    // Create the scene for the create account page
    Scene createAccountScene = new Scene(createAccountRoot, 400, 400);
    createAccountScene
      .getStylesheets()
      .add(
        getClass()
          .getResource("/org/example/eecs3311project/styles.css")
          .toExternalForm()
      );

    // Set the scene on the stage
    primaryStage.setScene(createAccountScene);
    primaryStage.setTitle("Create Account");
  }

  // Method to switch back to the sign-in page
  public void switchToSignInPage() {
    primaryStage.setScene(signInScene);
    primaryStage.setTitle("Sign In");
  }

  public void switchToCreateManagerAccountPage() throws IOException {
    FXMLLoader createManagerAccountLoader = new FXMLLoader(
      getClass().getResource("fxml/create-manager-account.fxml")
    );
    Parent createManagerAccountRoot = createManagerAccountLoader.load();
    createManagerAccountController = createManagerAccountLoader.getController();
    createManagerAccountController.setMain(this); // Pass a reference to the main application to the controller

    // Create the scene for the create account page
    Scene createManagerAccountScene = new Scene(
      createManagerAccountRoot,
      400,
      400
    );
    createManagerAccountScene
      .getStylesheets()
      .add(
        getClass()
          .getResource("/org/example/eecs3311project/styles.css")
          .toExternalForm()
      );

    // Set the scene on the stage
    primaryStage.setScene(createManagerAccountScene);
    primaryStage.setTitle("Create Manager Account");
  }

  public static void main(String[] args) {
    launch();
  }
}
