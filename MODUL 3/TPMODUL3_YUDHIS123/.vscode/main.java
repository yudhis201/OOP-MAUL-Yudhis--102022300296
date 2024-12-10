package zeppeliapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
        primaryStage.setTitle("Zeppeli's Listening Bar");
        primaryStage.setScene(new Scene(loader.load(), 600, 400));
        primaryStage.show();
    }
}
