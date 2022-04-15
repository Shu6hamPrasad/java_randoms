import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String x = sc.nextLine();
        int iterator  = 0;

        System.out.println("The unique words are: ");

        for (int i = 0 ; i < x.length(); i++) {
            if (x.charAt(i) == 32 || i + 1 == x.length()) {
                String f = x.substring(iterator, i + 1);
                iterator = i;
                f = f.trim();
                if(isUnique(f)) System.out.println(f);
            }
        }
    }

    public static boolean isUnique(String x) {
        boolean flag = true;
        String y = x.toUpperCase();

        for (int i = 0; i < y.length(); i++) {
            for (int j = i + 1; j < y.length(); j++) {
                if (y.charAt(i) == y.charAt(j)) {
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }
}
