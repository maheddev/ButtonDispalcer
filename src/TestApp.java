import javax.swing.*;

public class TestApp {
    public static void main(String[] args) {
        MagicButton magicButton = new MagicButton();
        magicButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        magicButton.setSize(1000,750);
        magicButton.setVisible(true);
    }
}
