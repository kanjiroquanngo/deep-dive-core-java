import java.lang.*;
import java.util.*;

public class ReadKeyBoard{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int numberOne, numberTwo, sum;
		System.out.println("Enter two numbers: ");
		numberOne = scanner.nextInt();
		numberTwo = scanner.nextInt();

		sum = numberOne + numberTwo;
        System.out.println("Sum of two numbers: " + sum);
	}	
}