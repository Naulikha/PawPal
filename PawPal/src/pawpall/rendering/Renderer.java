package pawpall.rendering;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import pawpall.player.Player;

public class Renderer {
    private Canvas canvas;
    private GraphicsContext gc;

    public Renderer(Canvas canvas) {
        this.canvas = canvas;
        this.gc = canvas.getGraphicsContext2D();
    }

    public void draw(Player cat, Player dog) {
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        // Draw Cat
        gc.setFill(Color.ORANGE);
        gc.fillRect(cat.getPosition().x, cat.getPosition().y, 32, 32);

        // Draw Dog
        gc.setFill(Color.BROWN);
        gc.fillRect(dog.getPosition().x, dog.getPosition().y, 40, 40);
    }
}