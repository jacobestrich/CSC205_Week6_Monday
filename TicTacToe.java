import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;




public class TicTacToe extends TestJFrame
{
    ArrayList<JButton> buttons_array = new ArrayList<JButton>(); //array list called buttons
    String currentPlayer;



    public TicTacToe() 
    {
        super();

        panel.setLayout(new GridLayout(3, 3));

        for(int i = 0; i < 9; i++)
        {
            JButton button = new JButton();
            button.addActionListener(e -> ButtonClicked(e));

            panel.add(button); //add button to the panel
            buttons_array.add(button); //add these buttons to the buttons array list
        }
        setContentPane(panel); //have to set the content pane after every modification

    }

    private void ButtonClicked(ActionEvent e)
    {
        switchPlayer();
        JButton button = (JButton)e.getSource();
        button.setText(currentPlayer);
        button.setEnabled(false);
    }

    private void switchPlayer()
    {
        if(currentPlayer == "X")
        {
            currentPlayer = "O";
        }
        else 
        {
            currentPlayer = "X";
        }
    }










}
