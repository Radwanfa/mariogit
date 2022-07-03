package package1;

import org.lwjgl.Version;
import org.lwjgl.glfw.GLFWErrorCallback;

import static org.lwjgl.glfw.GLFW.*;

public class Window {
    private int width, height;
    private String title;

    private static Window window = null;

    private Window() {
        this.height = 1920;
        this.width = 1080;
        this.title = "marioWindow";
    }

    public static Window get() {
        if (Window.window == null) {
            Window.window = new Window();
        }

        return Window.window;
    }

    public void run() {
        System.out.println("hello Lwjgl " + Version.getVersion() + "!");

        init();
        loop();
    }

    public void init() {
        // setup error callback
        GLFWErrorCallback.createPrint(System.err).set();

        //initzialize GLFW
        if (!glfwInit()) {
            throw new IllegalStateException("unable to initzialize glfw");
        }

        // configure GLFW
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_MAXIMIZED, GLFW_TRUE);

        // create window
    }

    public void loop() {

    }
}
