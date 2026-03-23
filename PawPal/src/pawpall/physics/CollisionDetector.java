package pawpall.physics;

import pawpall.player.Player;
import pawpall.util.Vector2;

public class CollisionDetector extends PhysicsEngine {
    // Screen boundaries
    private final double MAX_X = 750.0;
    private final double MIN_X = 10.0;
    
    // The specific wall from your test [cite: 41, 46]
//    private final double TEST_WALL_X = 500.0; 

    @Override
    public boolean isColliding(Player player, Vector2 nextPosition) {
        // 1. Check screen boundaries
        if (nextPosition.x > MAX_X || nextPosition.x < MIN_X) {
            return true;
        }
        
        // 2. Check the specific wall at 500 (as required by PhysicsEngineTest)
        // If we move from left (less than 500) to right (more than 500), trigger collision
//        if (player.getPosition().x < TEST_WALL_X && nextPosition.x >= TEST_WALL_X) {
//            return true;
//        }
        
        return false;
    }

    @Override
    public void resolveCollision(Player player, Vector2 velocity) {
        Vector2 nextPos = player.getPosition().add(velocity);
        if (!isColliding(player, nextPos)) {
            player.move(velocity);
        }
    }
}