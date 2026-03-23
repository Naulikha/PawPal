package pawpall.physics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pawpall.player.Player;
import pawpall.util.Vector2;

public class PhysicsEngineTest {

    @Test
    void testRightScreenBoundary() {
        CollisionDetector detector = new CollisionDetector();
        // Start near the right edge (MAX_X is 750)
        Player cat = new Player(Player.Type.CAT, new Vector2(745, 100));
        
        // Attempt to move to 755 (Past the 750 boundary)
        Vector2 nextPos = new Vector2(755, 100);
        
        assertTrue(detector.isColliding(cat, nextPos), "Should collide with right boundary at 750");
    }

    @Test
    void testLeftScreenBoundary() {
        CollisionDetector detector = new CollisionDetector();
        // Start near the left edge (MIN_X is 10)
        Player dog = new Player(Player.Type.DOG, new Vector2(15, 100));
        
        // Attempt to move to 5 (Past the 10 boundary)
        Vector2 nextPos = new Vector2(5, 100);
        
        assertTrue(detector.isColliding(dog, nextPos), "Should collide with left boundary at 10");
    }
}