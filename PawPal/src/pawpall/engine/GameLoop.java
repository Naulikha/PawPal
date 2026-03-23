package pawpall.engine;

//using animation timer to sync with monitors refresh rate 
import javafx.animation.AnimationTimer;
import pawpall.rendering.Renderer;

public class GameLoop extends AnimationTimer {
    private Renderer renderer;

    public GameLoop(Renderer renderer) {
        this.renderer = renderer;
    }

    @Override
    public void handle(long now) {
        update();
        render();
    }

    private void update() {
        // Future: Update physics and input here
    }
    
    //error as renderer has not been implemented yet 
    private void render() {
        renderer.draw();
    }
}