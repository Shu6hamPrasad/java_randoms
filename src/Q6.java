import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array - 1: ");
        int l1 = sc.nextInt();

        System.out.println("Enter the elements of array - 1: ");
        int[] a = new int[l1];

        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();

        System.out.print("Enter the length of array - 2: ");
        int l2 = sc.nextInt();

        System.out.println("Enter the elements of array - 2: ");
        int[] b = new int[l2];

        for (int i = 0; i < b.length; i++) b[i] = sc.nextInt();

        for (int j : a) {
            for (int k : b) {
                if (j == k)
                    System.out.println(j + " " + k);
            }
        }
    }
}
