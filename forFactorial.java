import java.util.Scanner;

public class forFactorial {
    public static int f(int input) {
        int f = 1;
        if (input == 1) return f;
        else if (input > 1) {
            for (int i = input; i > 0; i--)  f = f * i;
        } else return 0;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int k = sc.nextInt();
        System.out.println(f(k));
    }
}
