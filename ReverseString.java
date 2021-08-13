import java.util.Scanner;
public class ReverseString {
    public static String StringReverse(String str) {
        String str2 = "";
        for (int i = (str.length() - 1); i >= 0; i--) {
            str2 += str.charAt(i);
        }
        return str2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("The reverse is: " + StringReverse(s));
    }
}
