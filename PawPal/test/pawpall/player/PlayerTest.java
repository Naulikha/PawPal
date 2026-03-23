//package pawpall.player;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//
//public class PlayerTest {
//	
//	// Test - X should increase by given Speed when moving right
//	@Test
//    public void testMoveRight() {
//        Player player = new Player(0, 0, 5, -15);
//        player.moveRight();
//        assertTrue(player.getVelocityX() > 0);
//    }
//
//	// Test - X should decrease by given Speed when moving left
//	@Test
//	public void testMoveLeft() {
//	    Player player = new Player(0, 0, 5, -15);
//	    player.moveLeft();
//	    assertTrue(player.getVelocityX() < 0);
//	}
//	
//	// Test - VelocityX should be 0 when it stops
//	@Test
//	public void playerStopsMoving() {
//	    Player player = new Player(0, 0, 5, -15);
//	    player.moveRight();
//	    player.stop();
//	    assertEquals(0, player.getVelocityX());
//	}
//	
//
//	// Test - Jumping should set a negative vertical velocity (as negative Y is Up).
//	@Test
//    void testJump() {
//        Player player = new Player(0, 0, 5, -15);
//        player.jump();
//        assertTrue(player.getVelocityY() < 0);
//    }
//	
//}
