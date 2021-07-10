import java.util.Scanner;
public class fib {
    public static void main(String[] args){
        int n = 1, o = 0, res;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Range: ");
        int r = sc.nextInt();
        System.out.println(0);
        while(r > 0){
            System.out.println(n);
            res = n;
            n += o;
            o = res;
            r--;
        }
    }
}
