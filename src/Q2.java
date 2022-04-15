import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit 1: ");
        int min = sc.nextInt();

        System.out.print("Enter limit 2: ");
        int max = sc.nextInt();

        int length = (max - min) + 1;

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = min;
            min++;
        }

        for (int i = 0; i < arr.length - 2; i++) {
            if(isPrime(arr[i]) && isPrime(arr[i + 2]))
                System.out.println(arr[i] + ", " + arr[i+2]);
        }
    }

    public static boolean isPrime(int x) {
        int flag = 0;
        for (int i = 1; i < x; i++)
            if (x % i == 0) flag++;
        return flag == 1;
    }
}
