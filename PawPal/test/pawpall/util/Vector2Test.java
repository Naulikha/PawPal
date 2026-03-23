package pawpall.util;

//imports 
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//every movement for cat and dog depends on coordinate math 

public class Vector2Test {
    @Test
    void testVectorAddition() {
        Vector2 v1 = new Vector2(10, 20);
        Vector2 v2 = new Vector2(5, 5);
        Vector2 result = v1.add(v2);
        // We use a delta of 0.001 for floating point precision
        assertEquals(15.0, result.x, 0.001);
        assertEquals(25.0, result.y, 0.001);
    }
}