package ShpLibraries;
import java.util.Random;
import java.util.Scanner;
public class NumberGuesser {
    private static int inter;
    private static int TestArray[] = new int[100];
    private static int input;
    public static void initialize(){
        int seed = (int) (Math.random()*10), i;
        for ( i = 1 ; i < 100 ; i++){
            TestArray[i] = ++seed;
        }
        inter = TestArray[new Random().nextInt(TestArray.length)];
        input();
    }
    public static void input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        input = sc.nextInt();
        checker();
    }
    public static void checker(){
        if (input > inter) {
            System.out.println("The number is less than " + input + ", Please try again!");
            input();
        }
        else if (input < inter) {
            System.out.println("The number is more than " + input + ", Please try again!");
            input();
        }
        else
            System.out.println("Hooray! you won!");
    }
    public static void main(String[] args){
        System.out.println("Guess the number");
        initialize();
    }
}
