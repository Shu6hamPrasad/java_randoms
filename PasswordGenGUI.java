package px;

import java.util.Random; 
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordGenGUI implements ActionListener {
    private static JLabel userLabel; 
    private static JTextField userText;
    private static JButton loginButton;

    public static void main(String[] args){
        JFrame guilog = new JFrame("Login");
        guilog.setSize(800, 800);
        guilog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guilog.setResizable(false);


        JPanel panel = new JPanel();
        guilog.add(panel);
        placeComponents(panel);
        panel.setBackground(Color.white);

        guilog.setVisible(true);

    }

    public static void placeComponents(JPanel panel) {

        Font  f3  = new Font(Font.DIALOG,  Font.PLAIN, 15);

        

        System.out.println("Random password generator");		
		char[] pwd1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0','A','B','C','D','E','F','G','H','I','J','K','L','M','O','P','Q','R','S','T','U','V','W','X','Y','Z','!','@','#','$','%','^','&','*'};
		int options = 0;
		Scanner sc = new Scanner(System.in);
		options = sc.nextInt();
		int picker = 1;
		System.out.print("Your Password is: ");
		while(picker<=a) {
			System.out.print(pwd1[new Random().nextInt(pwd1.length)]);
			picker++;
		}


    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	
		
    }
}


