import javax.swing.JFrame;

public class Main 
{
    public static void main(String[] args) 
    {
        
        //Initialize the JFrame. 
        JFrame window = new JFrame("GUI Test1 - Main file");
        window.setSize(500,500);
        window.setLocation(1000, 300);
        window.setVisible(true);        

        //Call the TestJFrame class to make the frame. Another way to do what was done above.
        TestJFrame window2 = new TestJFrame();
    }    
}