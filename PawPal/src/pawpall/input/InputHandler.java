package pawpall.input;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import java.util.HashSet;
import java.util.Set;

/**
 * Captures keyboard input for Local Co-op.
 * Player 1: WASD | Player 2: Arrow Keys
 */
public class InputHandler {
    // A Set to track multiple keys pressed at once (Diagonal movement)
    private Set<KeyCode> activeKeys = new HashSet<>();

    public InputHandler(Scene scene) {
        scene.setOnKeyPressed(e -> activeKeys.add(e.getCode()));
        scene.setOnKeyReleased(e -> activeKeys.remove(e.getCode()));
    }

    public boolean isPressed(KeyCode code) {
        return activeKeys.contains(code);
    }
}