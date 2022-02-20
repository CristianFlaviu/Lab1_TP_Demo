import javax.swing.*;
import java.awt.event.ActionListener;

public class MyGUI extends JFrame {

    private JLabel myLabel;
    private JButton myButton;

    public MyGUI() {
        //define size of the main window
        this.setBounds(100, 100, 600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        myLabel = new JLabel("Hello");
        myLabel.setBounds(265, 30, 200, 56);
        getContentPane().add(myLabel);

        myButton = new JButton("My Button");
        myButton.setBounds(250,100,100,30);
        getContentPane().add(myButton);
    }

    public void setMyButtonActionListener(final ActionListener actionListener)
    {
        myButton.addActionListener(actionListener);
    }

    public void setMyLabelValue(String text)
    {
        myLabel.setText(text);
    }

}
