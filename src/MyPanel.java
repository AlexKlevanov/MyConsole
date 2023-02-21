import javax.swing.*;
import java.awt.*;
public class MyPanel extends JPanel{
    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public  Dimension getPreferredSize() {
        return new Dimension(1560, 700);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 0;
        int y = 0;
        int width = 100;
        int height = 100;
        g.drawLine(x, y, width, height);
    }
}
