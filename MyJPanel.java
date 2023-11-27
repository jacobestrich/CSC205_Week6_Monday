import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyJPanel extends JPanel
{
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        g.setColor(Color.DARK_GRAY);
        g.drawOval(50, 50, 50, 50);
        g.drawString("Hello World!", 20, 30);
    }
}
