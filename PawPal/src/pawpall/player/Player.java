package pawpall.player;

//importing vector 2 for math 
import pawpall.util.Vector2;

//initial distinction between cat and dog 
public class Player {
    public enum Type { CAT, DOG }
    
    private Vector2 position;
    private Type type;
    private boolean isAlive = true;

    public Player(Type type, Vector2 startPos) {
        this.type = type;
        this.position = startPos;
    }

    // Logic for Milestone 1: Dog can push, Cat is agile.
    public boolean canPushObjects() {
        return this.type == Type.DOG;
    }
    //getter and setter for position 
    public Vector2 getPosition() { return position; }
    public void setPosition(Vector2 pos) { this.position = pos; }
    
    //getter for type 
    public Type getType() { return type; }
    
    //method for movement linked to testPlayerMovement
    public void move(Vector2 velocity) {
        this.position = this.position.add(velocity);
    }
}