import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        String[] arr = new String[len + 1];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextLine();

        System.out.print("Enter a name to find: ");
        String find = sc.nextLine();

        boolean flag = false;

        for (String f : arr) {
            if (f.equals(find)) {
                flag = true;
                break;
            }
        }

        if(flag) System.out.println(find);
        else System.out.println("NO SUCH NAME FOUND");
    }
}
