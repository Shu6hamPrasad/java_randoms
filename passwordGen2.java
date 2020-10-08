import java.util.Random; 
//import java.util.Scanner;
public class PasswordGen2 {
    public String password(int digit) {
        // TODO Auto-generated method stub
        System.out.println("Random password generator");
        char[] pwd = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0','A','B','C','D','E','F','G','H','I','J','K','L','M','O','P','Q','R','S','T','U','V','W','X','Y','Z','!','@','#','$','%','^','&','*'};
        int options = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println();
//        System.out.println("Made by Shubham Prasad under GNU GPL V2.");
//        System.out.println();
//        System.out.print("How many letters you need? ");
//        options = sc.nextInt();
        int picker = 1;
//        System.out.print("Your Password is: ");
        StringBuilder sb = new StringBuilder();
        while(picker<=digit) {
            sb.append(pwd[new Random().nextInt(pwd.length)]);
            picker++;
        }
        return sb.toString();
    }
}
