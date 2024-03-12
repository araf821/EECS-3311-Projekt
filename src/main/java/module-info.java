module org.example.eecs3311project {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.eecs3311project to javafx.fxml;
    exports org.example.eecs3311project;
}