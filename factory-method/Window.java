public abstract class Window {
    public void renderWindow() {
        TextFields textField = createTextField();
        textField.render();
    }

    public abstract TextFields createTextField();
}
