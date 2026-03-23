package pawpall.engine;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import javafx.scene.input.KeyCode;
import pawpall.player.Player;
import pawpall.util.Vector2;

public class GameTest {
    
    @Test
    void testCatMovesRightOnDKey() {
        // This is a "Mock-like" setup for TDD
        // We will implement a concrete version of Game to test it
        Game testGame = new GameImplementation(); 
        
        double initialX = testGame.cat.getPosition().x;
        
        // Simulate 'D' key being pressed (this requires implementation logic)
        // For now, this test will fail because handleInput() is empty
        testGame.handleInput(); 
        
        // We expect X to increase if 'D' is pressed
        assertTrue(testGame.cat.getPosition().x > initialX, "Cat should move right");
    }
}