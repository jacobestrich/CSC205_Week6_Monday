import java.awt.*; //can call all of them

import javax.swing.JButton;
//import java.awt.Graphics;
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

    JButton okButton = new JButton("Ok");
    JButton cancelButton = new JButton("Cancel");

    public MyJPanel() 
    {
        super();
        setLayout(new BorderLayout());
        add(okButton, BorderLayout.SOUTH);
        add(cancelButton, BorderLayout.EAST);
    }

}
