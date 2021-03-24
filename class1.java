import java.util.Scanner;
public class class1 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int input;
        System.out.print("Enter a number: ");
        input = sc.nextInt();
        int res = prime(input);
        if (res == 1)
            reverse(input);
        else
            System.out.println("Not a Twisted Prime");
    }
    public static int prime (int value){
        int counter,temp = 0;
        for (counter = 2; counter<=value-1; counter++){
            if (value%counter==0){
                temp = 0;
                break;
            }
            else{
                temp = 1;
            }
        }
        if (temp == 0){
            System.out.println("Not Prime");
        }
        if (temp == 1){
            System.out.println("Prime");
        }
        return temp;
    }
    public static void reverse(int inputValue){
        while(inputValue!=0){
            int reversed = 0;
            while(inputValue != 0) {
                int digit = inputValue % 10;
                reversed = reversed * 10 + digit;
                inputValue /= 10;
            }
            System.out.println("Reversed Number: " + reversed);
            int result = prime(reversed);
            if(result == 1)
               System.out.println("Twisted Prime Number!");
            else
                System.out.println("Not a Twisted Prime");
        }
    }
}
//Great Success
