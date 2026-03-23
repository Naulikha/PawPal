package pawpall.engine;

//using animation timer to sync with monitors refresh rate 
import javafx.animation.AnimationTimer;
import pawpall.rendering.Renderer;

public class GameLoop extends AnimationTimer {
    private Renderer renderer;
    private GameEngine engine;

    public GameLoop(Renderer renderer, GameEngine engine) {
        this.renderer = renderer;
        this.engine = engine;
    }

    @Override
    public void handle(long now) {
        engine.update(); // 1. Calculate new positions
        renderer.draw(engine.cat, engine.dog); // 2. Draw them at those positions
    }
//
//    private void update() {
//        // Future: Update physics and input here
//    }
//    
//    //error as renderer has not been implemented yet 
//    private void render() {
//        renderer.draw();
//    }
}