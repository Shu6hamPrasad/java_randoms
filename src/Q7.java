import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        String[] arr = new String[len];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.next();

        System.out.println();

        for (String s : arr) {
            String test = s.toUpperCase();
            if (test.charAt(0) == test.charAt(test.length() - 1))
                System.out.println(s);
        }
    }
}
