import javax.swing.JFrame;

//This is a class that makes the jframe. Another way to make this compared to initializing it in the main method file.

public class TestJFrame extends JFrame
{
    public TestJFrame() 
    {
        super("Gui Test - TestJFrame file");
        setContentPane(new MyJPanel());
        setSize(500, 500);
        setLocation(1000, 300);
        setVisible(true);
    }
}
