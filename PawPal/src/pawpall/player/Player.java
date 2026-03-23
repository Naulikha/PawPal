package pawpall.player;

public class Player {
	
	// Private Variables
	private float x;
	private float y;
	private float velocityX;
    private float velocityY;
    private float speed;
    private float jumpStrength;

    // Player Constructor
    public Player(float x, float y, float speed, float jumpStrength) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.jumpStrength = jumpStrength;
    }
    
    // Getters
    public float getX() { 
    	return x; 
    }
    
    public float getY() { 
    	return y;
    }
    
    public float getVelocityX() { 
    	return velocityX; 
    }
    
    public float getVelocityY() { 
    	return velocityY; 
    }
    
    // Setters
    // So gravity can affect Y later
    public void setY(float y) { 
    	this.y = y; 
    }
    
    // Method to moveRight
    public void moveRight() {
        velocityX = speed;
    }
    
    // Method to moveLeft
    public void moveLeft() {
        velocityX = -speed;
    }
    
    // Method to stop the movement
    public void stop() {
        velocityX = 0;
    }
    
    // Method for jumping
    public void jump() {
        velocityY = jumpStrength;
    }

}
