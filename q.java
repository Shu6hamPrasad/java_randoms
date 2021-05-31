import java.util.*;
public class q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a amount: ");
        int amt = sc.nextInt();
        int original = amt;
        int k1 = amt / 1000;
        amt -= k1 * 1000;
        int h5 = amt / 500;
        amt -= h5 * 500;
        int h1 = amt / 100;
        amt -= h1 * 100;
        int f0 = amt / 50;
        amt -= f0 * 50;
        int t0 = amt / 20;
        amt -= t0 * 20;
        int o0 = amt / 10;
        amt -= o0 * 10;
        int f = amt / 5;
        amt -= f * 5;
        int t = amt / 2;
        amt -= t * 2;
        int o = amt / 1;
        if (k1 > 0)
            System.out.println(k1 + " * " + "1000" + " = " + k1 * 1000);
        if (h5 > 0)
            System.out.println(h5 + " * " + "500" + " = " + h5 * 500);
        if (h1 > 0)
            System.out.println(h1 + " * " + "100" + " = " + h1 * 100);
        if (f0 > 0)
            System.out.println(f0 + " * " + "50" + " = " + f0 * 50);
        if (t0 > 0)
            System.out.println(t0 + " * " + "20" + " = " + t0 * 20);
        if (o0 > 0)
            System.out.println(o0 + " * " + "10" + " = " + o0 * 10);
        if (f > 0)
            System.out.println(f + " * " + "5" + " = " + f * 5);
        if (t > 0)
            System.out.println(t + " * " + "2" + " = " + t * 2);
        if (o > 0)
            System.out.println(o + " * " + "1" + " = " + o);
        System.out.println(" = " + original);
    }
}
