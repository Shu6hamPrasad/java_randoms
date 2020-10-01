import java.lang.Math;
import java.util.Random; 
public class two {
	public static void main(String[] args) {
		System.out.println("Random number generator");
		int[] arr = {1,2,3,4,5,6,7,8,9,0};
		System.out.print(+arr[new Random().nextInt(arr.length)]);
		System.out.print(+arr[new Random().nextInt(arr.length)]);
		System.out.print(+arr[new Random().nextInt(arr.length)]);
		System.out.print(+arr[new Random().nextInt(arr.length)]);
	}
}
