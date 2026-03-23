package pawpall.physics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pawpall.player.Player;
import pawpall.util.Vector2;

public class PhysicsEngineTest {
    @Test
    void testWallCollision() {
        // We will create a concrete detector to test
        CollisionDetector detector = new CollisionDetector();
        Player cat = new Player(Player.Type.CAT, new Vector2(490, 100));
        
        // Try to move into a wall at x = 500
        Vector2 nextPos = new Vector2(510, 100);
        
        // This should return true (colliding)
        assertTrue(detector.isColliding(cat, nextPos), "Player should collide with the boundary at 500");
    }
}