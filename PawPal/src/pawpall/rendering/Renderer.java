package pawpall.rendering;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Handles all drawing logic for Milestone 1.
 * This class translates our game objects into visuals on the Canvas.
 */
public class Renderer {
    private Canvas canvas;
    private GraphicsContext gc;

    public Renderer(Canvas canvas) {
        this.canvas = canvas;
        this.gc = canvas.getGraphicsContext2D();
    }

    /**
     * The draw method called by GameLoop.
     * For Milestone 1, it clears the screen and draws test placeholders.
     */
    public void draw() {
        // 1. Clear the screen (Background)
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        // 2. Draw Player 1 (Cat) - Orange Placeholder
        gc.setFill(Color.ORANGE);
        gc.fillRect(100, 100, 32, 32); 

        // 3. Draw Player 2 (Dog) - Brown Placeholder
        gc.setFill(Color.BROWN);
        gc.fillRect(200, 100, 40, 40); // Dog is slightly larger as per research
        
        // Logic Note: Using hardcoded values for Milestone 1 
        // to verify the GameLoop and JavaFX Stage are linked correctly.
    }
}