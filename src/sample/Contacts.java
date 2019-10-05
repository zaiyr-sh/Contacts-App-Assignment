package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Contacts extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("contacts.fxml"));
        primaryStage.setTitle("Contacts App");
        primaryStage.setScene(new Scene(root, 600, 420));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
