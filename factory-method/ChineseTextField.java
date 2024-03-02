import javax.swing.*;

public class ChineseTextField extends JTextField implements TextFields {
    @Override
    public void render() {
        System.out.println("new Chinese text field");
    }

    @Override
    public void write() {
        setText("中文");
    }
}
