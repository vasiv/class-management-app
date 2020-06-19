import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class HelloFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Application");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.resizableProperty().setValue(false);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}