import java.util.Scanner;
public class roots {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        System.out.print("Enter c: ");
        c = sc.nextInt();
        double o = Math.pow(b,2);
        double r = 4*(a*c);
        double res = o-r;
        System.out.println("Discriminant= "+res);
        if (res > 0){
            System.out.println("Roots are unequal and real");
            double checkpoint = Math.sqrt(res);
            int checker = (int) checkpoint;
            double tripleCheck = checker;
            if(checkpoint == tripleCheck)
                System.out.println("Roots are Rational");
            else
                System.out.println("Irrational");
        }
        else if (res == 0)
            System.out.println("Roots are equal.");
        else
            System.out.println("Roots are imaginary.");
    }
}
