import java.util.Scanner;
import java.util.Random;

public class passwordGen {
	public static void main(String[] args) {
		System.out.println("Random password generator");		
		char[] pwd = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0','A','B','C','D','E','F','G','H','I','J','K','L','M','O','P','Q','R','S','T','U','V','W','X','Y','Z'};	
		
		int option=0 ;
		Scanner op = new Scanner(System.in);
		System.out.println("1 for 4-Digit password");
		System.out.println("2 for 8-Digit password");
		System.out.println("3 for 10-Digit password");
		System.out.println("4 for 12-Digit password");
		System.out.println("5 for 15-Digit password");
		System.out.println("6 for 24-Digit password");
		option = op.nextInt();
		switch(option) {
		  case 1:
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
		    break;
		  case 2:
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
		    break;
		  case 3:
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			    break;
		  case 4:
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  
			    break;
		  case 5:
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);		  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			    break;
		  case 6:
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			  System.out.print(pwd[new Random().nextInt(pwd.length)]);
			    break;
		  default:
		   System.out.println("you entered an incorrect option.");
		}
	}
}
