package pawpall.util;

/**
 * Basic 2D Vector class for positioning and velocity.
 * Part of Milestone 1: Basic design and functionalities.
 */
public class Vector2 {
    public double x, y;

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2 add(Vector2 other) {
        return new Vector2(this.x + other.x, this.y + other.y);
    }
}