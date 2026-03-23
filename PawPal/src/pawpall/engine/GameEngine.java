package pawpall.engine;

import javafx.scene.input.KeyCode;
import pawpall.input.InputHandler;
import pawpall.player.Player;
import pawpall.util.Vector2;
import pawpall.physics.CollisionDetector;

/**
 * Concrete implementation of the Game engine for Milestone 1.
 * Integrates Input, Players, and Physics.
 */
public class GameEngine extends Game {
    private final double MOVE_SPEED = 5.0;
    private CollisionDetector collisionDetector;

    public GameEngine(InputHandler input, Player cat, Player dog) {
        this.inputHandler = input;
        this.cat = cat;
        this.dog = dog;
        this.collisionDetector = new CollisionDetector();
    }

    /**
     * Required for TDD GameTest.
     */
    public GameEngine() {
        this.cat = new Player(Player.Type.CAT, new Vector2(100, 100));
        this.dog = new Player(Player.Type.DOG, new Vector2(200, 100));
        this.collisionDetector = new CollisionDetector();
    }

    @Override
    public void handleInput() {
        if (inputHandler == null) return;

        // --- Player 1 (Cat): WASD Controls ---
        if (inputHandler.isPressed(KeyCode.W)) {
            collisionDetector.resolveCollision(cat, new Vector2(0, -MOVE_SPEED));
        }
        if (inputHandler.isPressed(KeyCode.S)) {
            collisionDetector.resolveCollision(cat, new Vector2(0, MOVE_SPEED));
        }
        if (inputHandler.isPressed(KeyCode.A)) {
            collisionDetector.resolveCollision(cat, new Vector2(-MOVE_SPEED, 0));
        }
        if (inputHandler.isPressed(KeyCode.D)) {
            collisionDetector.resolveCollision(cat, new Vector2(MOVE_SPEED, 0));
        }

        // --- Player 2 (Dog): Arrow Key Controls ---
        if (inputHandler.isPressed(KeyCode.UP)) {
            collisionDetector.resolveCollision(dog, new Vector2(0, -MOVE_SPEED));
        }
        if (inputHandler.isPressed(KeyCode.DOWN)) {
            collisionDetector.resolveCollision(dog, new Vector2(0, MOVE_SPEED));
        }
        if (inputHandler.isPressed(KeyCode.LEFT)) {
            collisionDetector.resolveCollision(dog, new Vector2(-MOVE_SPEED, 0));
        }
        if (inputHandler.isPressed(KeyCode.RIGHT)) {
            collisionDetector.resolveCollision(dog, new Vector2(MOVE_SPEED, 0));
        }
    }

    @Override
    public void update() {
        handleInput();
        // Additional world logic (like timers) can be added here for Milestone 2
    }
}