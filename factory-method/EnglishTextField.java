import javax.swing.*;

public class EnglishTextField extends JTextField implements TextFields {

    @Override
    public void render() {
        System.out.println("new English text field");
    }

    @Override
    public void write() {
        setText("English");
    }
}
