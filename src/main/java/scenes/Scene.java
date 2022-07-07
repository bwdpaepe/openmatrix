package scenes;

import org.joml.Vector2f;
import renderer.Camera;

public abstract class Scene {

    protected Camera camera;

    public Scene() {
        this.camera = new Camera(new Vector2f(0.0f, 0.0f));
    }

    public void init(){};

    public abstract void update(float dt);
}
