public class Main {
    private static Window window;

    public static void main(String[] args) {
        setWindow();
        showWindow();
    }
    static void setWindow() {
        if (System.getProperty("user.language").equals("zh")) {
            window = new ChineseWindow();
        }
        else {
            window = new EnglishWindow();
        }
    }

    static void showWindow() {
        window.renderWindow();
    }
}