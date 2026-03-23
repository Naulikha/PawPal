package pawpall.main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import pawpall.engine.GameLoop;
import pawpall.rendering.Renderer;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("PawPall - Milestone 1");
        
        Group root = new Group();
        Canvas canvas = new Canvas(800, 600);
        root.getChildren().add(canvas);
        
        Renderer renderer = new Renderer(canvas);
        GameLoop gameLoop = new GameLoop(renderer);
        
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        
        gameLoop.start(); // Start the heart of the game
    }

    public static void main(String[] args) {
        launch(args);
    }
}