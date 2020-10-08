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
        guilog.setSize(613, 165);
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

        userLabel = new JLabel("How many digits you want? (Between 4 and 24)");
        userLabel.setBounds(10, 10, 450, 25);
        userLabel.setFont(f3);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(330, 10, 260, 25);
        userText.setFont(f3);
        panel.add(userText);

        userLabel = new JLabel("");
        userLabel.setBounds(115, 50, 700, 25);
        userLabel.setFont(f3);
        //I want to convert the input from this JTextField to an integer "int" variable.
        //Please :-}
        //I want to merge Java Swing GUI with my Random Password Generator to create a GUI Password Generator.
        //Link to Password Generator: "https://github.com/Shu6hamPrasad/java_randoms/blob/master/passwordGen2.java"


        loginButton = new JButton("GO!");
        loginButton.setBounds(10, 50, 95, 25);
        loginButton.setFont(f3);
        loginButton.addActionListener(new PasswordGenGUI());
        panel.add(loginButton);
        panel.add(userLabel);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String digits = userText.getText();
        String label;
        try{
            int digit = Integer.parseInt(digits);
            PasswordGen2 passwordGen2 = new PasswordGen2();
            String password = passwordGen2.password(digit);
            label="Your pasword is: "+password;
        }catch (Exception ex) {
            label="Please enter only numeric digits.";
        }
        userLabel.setText(label);
    }
}
