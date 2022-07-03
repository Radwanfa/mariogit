package package1;

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

    
}
