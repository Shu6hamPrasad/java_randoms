import java.util.Scanner;
public class palindromeString {
    public static boolean PalindromeString(String str) {
        String str2 = "";
        for (int i = (str.length() - 1); i >= 0; i--) {
            str2 += str.charAt(i);
        }
        return str.equalsIgnoreCase(str2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        if (PalindromeString(s))
            System.out.println(s + " is a Palindrome String");
        else
            System.out.println(s + " is not a Palindrome String");
    }
}
