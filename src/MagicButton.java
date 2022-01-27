import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.*;

public class MagicButton extends JFrame {
    private final JButton magicButton;

    public MagicButton(){
        super("Magic Button");
        setLayout(new FlowLayout());

        magicButton = new JButton("Touch me!");
        add(magicButton);

        magicButton.addMouseListener(
            new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    Random r1 = new Random();
                    magicButton.setLocation(r1.nextInt(900), r1.nextInt(650));
                }

                @Override
                public void mouseClicked(MouseEvent e) {
                    JOptionPane.showMessageDialog(null,"Phar Kita");
                }
            }
        );
    }
}