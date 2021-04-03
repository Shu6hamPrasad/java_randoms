import java.util.Scanner;
public class roots {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //initialisation of scanner class
        double a,b,c;
        System.out.print("Enter a: ");
        a = sc.nextInt(); //inputting coefficient A
        System.out.print("Enter b: ");
        b = sc.nextInt(); //inputting coefficient B
        System.out.print("Enter c: ");
        c = sc.nextInt(); //inputting coefficient C
        double o = Math.pow(b,2); //calculating B raised to power of 2
        double r = 4*(a*c); //calculating 4(AC)
        double res = o-r; //using the discriminant formula: b^2-4(ac)
        System.out.println("Discriminant= "+res); //printing the discriminant
        if (res > 0){
            System.out.println("Roots are unequal and real");
            //the following lines with "//." indicate that they are used for checking wheter a number is Rational/Irrational.
            double checkpoint = Math.sqrt(res); //.
            int checker = (int) checkpoint; //.
            double tripleCheck = checker; //.
            if(checkpoint == tripleCheck)  //.
                System.out.println("Roots are Rational"); //.
            else
                System.out.println("Irrational"); //.
        }
        else if (res == 0)
            System.out.println("Roots are equal.");
        else
            System.out.println("Roots are imaginary.");
    }
}
