import javax.swing.JFrame;
import javax.swing.JPanel;

//This is a class that makes the jframe. Another way to make this compared to initializing it in the main method file.

public class TestJFrame extends JFrame
{
    JPanel panel; //variable declaration. Accessible to the entire class. 


    public TestJFrame() 
    {
        super("TicTacToe Game");

        panel = new JPanel();
        
        setContentPane(panel);

        setSize(500, 500);
        setLocation(1000, 300);
        setVisible(true);
    }    
}
