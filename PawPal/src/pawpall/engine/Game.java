package pawpall.engine;

import pawpall.input.InputHandler;
import pawpall.player.Player;

/**
 * High-level engine logic. 
 * Defined first as per TDD Step 1.
 */
public abstract class Game {
    protected Player cat;
    protected Player dog;
    protected InputHandler inputHandler;

    // Abstract method to be implemented after testing
    public abstract void handleInput();
    public abstract void update();
}