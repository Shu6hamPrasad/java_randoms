import java.util.Scanner;
public class thumbsup {
    public static void main(String[] args) {
        System.out.print("Enter a number divisible by 3: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i < (4 * r / 3 + 1); i++){
            for (int j = 1; j <= r + 1; j++) {
                if (i <= r / 3 && j > (r / 3 + 1) && j <= 2 * r / 3 + 1) {
                    if (j <= ((2 * r / 3) + 1 - i))
                        System.out.print("" + " ");
                    else
                        System.out.print("*" + " ");
                }
                else if (i <= r / 3)
                    System.out.print("" + " ");
                else if (j == r / 3 + 1)
                    System.out.print("" + " ");
                else
                    System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
