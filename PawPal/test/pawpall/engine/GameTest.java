package pawpall.engine;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pawpall.player.Player;
import pawpall.util.Vector2;

public class GameTest {
    @Test
    void testUpdateMovesPlayer() {
        Player cat = new Player(Player.Type.CAT, new Vector2(0, 0));
        // We simulate a move manually since we can't easily "press" a key in a unit test without Mocks
        cat.move(new Vector2(5, 0)); 
        assertEquals(5.0, cat.getPosition().x, 0.001);
    }
}