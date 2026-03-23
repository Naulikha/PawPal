package pawpall.physics;

import pawpall.player.Player;
import pawpall.util.Vector2;

/**
 * Abstract Physics Engine structure.
 * Milestone 1: Basic solid-wall collision.
 */
public abstract class PhysicsEngine {
    // TDD Step 1: Define the method we need
    public abstract boolean isColliding(Player player, Vector2 nextPosition);
    public abstract void resolveCollision(Player player, Vector2 velocity);
}