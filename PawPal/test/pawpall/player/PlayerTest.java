package pawpall.player;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pawpall.util.Vector2;

public class PlayerTest {
    @Test
    void testPlayerMovement() {
        Player cat = new Player(Player.Type.CAT, new Vector2(0, 0));
        Vector2 velocity = new Vector2(5, 10);
        
        // We want to test a move method we haven't written yet
        cat.move(velocity); 
        
        assertEquals(5.0, cat.getPosition().x, 0.001);
        assertEquals(10.0, cat.getPosition().y, 0.001);
    }

    @Test
    void testDogCanPushAndCatCannot() {
        Player dog = new Player(Player.Type.DOG, new Vector2(0, 0));
        Player cat = new Player(Player.Type.CAT, new Vector2(0, 0));
        
        assertTrue(dog.canPushObjects(), "Dog should be able to push boulders ");
        assertFalse(cat.canPushObjects(), "Cat should not be able to push boulders ");
    }
}