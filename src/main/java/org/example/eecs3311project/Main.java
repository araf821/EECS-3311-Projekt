package org.example.eecs3311project;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import objects.User;
import objects.User.UserType;

public class Main extends Application {

  public static User currentUser;
  private Stage primaryStage;
  private Scene signInScene;
  private SignInController signInController;
  private CreateAccountController createAccountController;
  private CreateManagerAccountController createManagerAccountController;
  private DashboardController dashboardController;
  private SearchController searchController;
  private AddItemController addItemController;

  @Override
  public void start(Stage primaryStage) throws Exception {
    this.primaryStage = primaryStage;

    // Load the sign-in page initially
    FXMLLoader signInLoader = new FXMLLoader(
        getClass().getResource("fxml/sign-in.fxml"));
    Parent signInRoot = signInLoader.load();
    signInController = signInLoader.getController();
    signInController.setMain(this); // Pass a reference to the main application to the controller

    // Create the scene for the sign-in page
    signInScene = new Scene(signInRoot, 400, 400);
    signInScene
        .getStylesheets()
        .add(
            getClass()
                .getResource("/org/example/eecs3311project/globals.css")
                .toExternalForm());

    // Set the scene and show the stage
    primaryStage.setScene(signInScene);
    primaryStage.setTitle("Sign In");
    primaryStage.show();
  }

  // Method to switch to the create account page
  public void switchToCreateAccountPage() throws IOException {
    FXMLLoader createAccountLoader = new FXMLLoader(
        getClass().getResource("fxml/create-account.fxml"));
    Parent createAccountRoot = createAccountLoader.load();
    createAccountController = createAccountLoader.getController();
    createAccountController.setMain(this); // Pass a reference to the main application to the controller

    // Create the scene for the create account page
    Scene createAccountScene = new Scene(createAccountRoot, 400, 400);
    createAccountScene
        .getStylesheets()
        .add(
            getClass()
                .getResource("/org/example/eecs3311project/globals.css")
                .toExternalForm());

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
        getClass().getResource("fxml/create-manager-account.fxml"));
    Parent createManagerAccountRoot = createManagerAccountLoader.load();
    createManagerAccountController = createManagerAccountLoader.getController();
    createManagerAccountController.setMain(this); // Pass a reference to the main application to the controller

    // Create the scene for the create account page
    Scene createManagerAccountScene = new Scene(
        createManagerAccountRoot,
        400,
        400);
    createManagerAccountScene
        .getStylesheets()
        .add(
            getClass()
                .getResource("/org/example/eecs3311project/globals.css")
                .toExternalForm());

    // Set the scene on the stage
    primaryStage.setScene(createManagerAccountScene);
    primaryStage.setTitle("Create Manager Account");
  }

  public void switchToAddItemPage() throws IOException {
    FXMLLoader addItemLoader = new FXMLLoader(
        getClass().getResource("fxml/add-item.fxml"));
    Parent addItemRoot = addItemLoader.load();
    addItemController = addItemLoader.getController();
    addItemController.setMain(this); // Pass a reference

    // Create the scene for the create account page
    Scene addItemScene = new Scene(addItemRoot, 400, 500);
    addItemScene
        .getStylesheets()
        .add(
            getClass()
                .getResource("/org/example/eecs3311project/globals.css")
                .toExternalForm());
    primaryStage.setScene(addItemScene);
    primaryStage.setTitle("Add Item");
  }

  public void openDashboardScreen() throws IOException {
    FXMLLoader dashboardLoader = new FXMLLoader(
        getClass().getResource("fxml/dashboard.fxml"));
    Parent dashboardRoot = dashboardLoader.load();
    dashboardController = dashboardLoader.getController();
    dashboardController.setMain(this); // Pass a reference to the main application to the controller

    // Create the scene for the create account page
    Scene dashboardScene = new Scene(dashboardRoot, 800, 450);
    dashboardScene
        .getStylesheets()
        .add(
            getClass()
                .getResource("/org/example/eecs3311project/globals.css")
                .toExternalForm());

    // Set the scene on the stage
    primaryStage.setScene(dashboardScene);
    primaryStage.setTitle("Dashboard");
  }

  public void openManagerDashboardScreen() throws IOException {
    FXMLLoader managerDashboardLoader = new FXMLLoader(
        getClass().getResource("fxml/manager-dashboard.fxml"));
    Parent managerDashboardRoot = managerDashboardLoader.load();
    ManagerDashboardController managerDashboardController = managerDashboardLoader.getController();
    managerDashboardController.setMain(this); // Pass a reference to the main application to the controller

    // Create the scene for the create account page
    Scene managerDashboardScene = new Scene(managerDashboardRoot, 800, 450);
    managerDashboardScene
        .getStylesheets()
        .add(
            getClass()
                .getResource("/org/example/eecs3311project/globals.css")
                .toExternalForm());

    // Set the scene on the stage
    primaryStage.setScene(managerDashboardScene);
    primaryStage.setTitle("Manager Dashboard");
  }

  public void openSearch() throws IOException {

    FXMLLoader searchloader = new FXMLLoader(
        getClass().getResource("fxml/searchpage.fxml"));
    Parent searchRoot = searchloader.load();
    searchController = searchloader.getController();
    searchController.setMain(this);
    searchController.initialize();

    Scene searchscene = new Scene(searchRoot, 800, 450);
    searchscene
        .getStylesheets()
        .add(
            getClass()
                .getResource("/org/example/eecs3311project/globals.css")
                .toExternalForm());
    primaryStage.setScene(searchscene);
    primaryStage.setTitle("Search");

  }

  public static void main(String[] args) {
    launch();
  }
}
