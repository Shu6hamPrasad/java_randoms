package BBCAjava.practical;
import java.util.Scanner;
public class calculator {
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    public static double sub(double num1, double num2){
        return num1 - num2;
    }
    public static double mul(double num1, double num2){
        return num1 * num2;
    }
    public static double divr(double num1, double num2){
        return num1 % num2;
    }
    public static double divq(double num1, double num2) {
        return num1 / num2;
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the values to be calculated: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Please select a choice: ");
        System.out.println("Press 1 for Addition. ");
        System.out.println("Press 2 for Subtraction. ");
        System.out.println("Press 3 for Multiplication. ");
        System.out.println("Press 4 for Division[Remainder]. ");
        System.out.println("Press 5 for Division[Quotient]. ");
        System.out.print("Enter a choice: ");
        byte choice = sc.nextByte();
        switch (choice){
            case 1:
                System.out.println("You've selected addition....");
                System.out.println("The sum of the given numbers is: "+ add(num1,num2));
                break;
            case 2:
                System.out.println("You've selected subtraction....");
                System.out.println("The difference of the given numbers is: "+ sub(num1,num2));
                break;
            case 3:
                System.out.println("You've selected multiplication....");
                System.out.println("The product of the given numbers is: "+ mul(num1,num2));
                break;
            case 4:
                System.out.println("You've selected division[remainder]....");
                System.out.println("The remainder of the given numbers is: "+ divq(num1,num2));
                break;
            case 5:
                System.out.println("You've selected division[quotient]....");
                System.out.println("The quotient of the given numbers is: "+ divr(num1,num2));
                break;
            default:
                System.out.println("Wrong Input!");
        }
        System.out.print("Do you want to try again? (y/n): ");
        String Choice = sc.next();
        if (Choice.equalsIgnoreCase("y")){
            menu();
        }
        else {
            sc.close();
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        System.out.println("Calculator V0.0.1");
        System.out.println("Menu");
        menu();
    }
}
