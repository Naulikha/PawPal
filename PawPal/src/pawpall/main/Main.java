package pawpall.main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import pawpall.engine.GameEngine;
import pawpall.engine.GameLoop;
import pawpall.input.InputHandler;
import pawpall.player.Player;
import pawpall.rendering.Renderer;
import pawpall.util.Vector2;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600);
        Canvas canvas = new Canvas(800, 600);
        root.getChildren().add(canvas);

        // 1. Initialize Objects
        InputHandler input = new InputHandler(scene);
        Player cat = new Player(Player.Type.CAT, new Vector2(100, 100));
        Player dog = new Player(Player.Type.DOG, new Vector2(200, 100));
        
        // 2. Initialize Engine & Renderer
        GameEngine engine = new GameEngine(input, cat, dog);
        Renderer renderer = new Renderer(canvas);
        
        // 3. Start Loop
        GameLoop gameLoop = new GameLoop(renderer, engine);
        gameLoop.start();

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}