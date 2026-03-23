package pawpall.engine;

import javafx.scene.input.KeyCode;
import pawpall.input.InputHandler;
import pawpall.player.Player;
import pawpall.util.Vector2;

/**
 * The core engine implementation for PawPall.
 * Handles the link between Input, Players, and Movement.
 */
public class GameEngine extends Game {
    private final double MOVE_SPEED = 5.0;

    public GameEngine(InputHandler input, Player cat, Player dog) {
        this.inputHandler = input;
        this.cat = cat;
        this.dog = dog;
    }

    /**
     * Required for TDD GameTest.
     */
//    public GameEngine() {
//        this.cat = new Player(Player.Type.CAT, new Vector2(0, 0));
//        this.dog = new Player(Player.Type.DOG, new Vector2(100, 100));
//    }

    @Override
    public void handleInput() {
        if (inputHandler == null) return;

        // Player 1 (Cat): WASD [cite: 82, 84]
        if (inputHandler.isPressed(KeyCode.W)) cat.move(new Vector2(0, -MOVE_SPEED));
        if (inputHandler.isPressed(KeyCode.S)) cat.move(new Vector2(0, MOVE_SPEED));
        if (inputHandler.isPressed(KeyCode.A)) cat.move(new Vector2(-MOVE_SPEED, 0));
        if (inputHandler.isPressed(KeyCode.D)) cat.move(new Vector2(MOVE_SPEED, 0));

        // Player 2 (Dog): Arrow Keys [cite: 82, 84]
        if (inputHandler.isPressed(KeyCode.UP)) dog.move(new Vector2(0, -MOVE_SPEED));
        if (inputHandler.isPressed(KeyCode.DOWN)) dog.move(new Vector2(0, MOVE_SPEED));
        if (inputHandler.isPressed(KeyCode.LEFT)) dog.move(new Vector2(-MOVE_SPEED, 0));
        if (inputHandler.isPressed(KeyCode.RIGHT)) dog.move(new Vector2(MOVE_SPEED, 0));
    }

    @Override
    public void update() {
        handleInput();
    }
}