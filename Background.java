import javax.swing.*;
import java.awt.*;

public class Background extends JPanel {
    private JFrame component;

    public Background(JFrame component) {
        this.component = component;
    }

    public void changeBackground() {
        Color[] colors = new Color[]{Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN};
        for (int i = 0; i < colors.length; i++) {
            Color c = colors[i];
            component.setBackground(c);
            try {
                component.repaint();
                Thread.sleep(17);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
