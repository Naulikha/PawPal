package pawpall.main;

import javafx.application.Application;
import javafx.stage.Stage;
import pawpall.engine.Game;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
/*
 Entry point of the PawPall application.

 This class launches JavaFX and starts the main game engine.
*/

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello JavaFX!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.setTitle("JavaFX Setup in Eclipse");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}