import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordGenGUI implements ActionListener {
    private static JLabel userLabel;
    private static JButton loginButton;
    private static JTextField userText;
    public static void main(String[] args){
        JFrame guilog = new JFrame("Credential Maker");
        guilog.setSize(385, 165);
        guilog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guilog.setResizable(false);


        JPanel panel = new JPanel();
        guilog.add(panel);
        placeComponents(panel);
        panel.setBackground(Color.white);

        guilog.setVisible(true);

    }
	private static void placeComponents(JPanel panel) {
		// TODO Auto-generated method stub
        Font  f3  = new Font(Font.DIALOG,  Font.PLAIN, 15);
        panel.setLayout(null);
        
        userLabel = new JLabel("How many digits you want?");
        userLabel.setBounds(10, 10, 190, 25);
        userLabel.setFont(f3);
        panel.add(userLabel);
        
        userText = new JTextField(20);
        userText.setBounds(200, 10, 160, 25);
        userText.setFont(f3);
        panel.add(userText); //I want to convert the input from this JTextField to an integer "int" variable.
			     //Please :-}
        
        
        loginButton = new JButton("GO!");
        loginButton.setBounds(10, 50, 95, 25);
        loginButton.setFont(f3);
        loginButton.addActionListener(new PasswordGenGUI());
        panel.add(loginButton);
        
        
        
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
