package suin.calendar;
import java.util.*; 

public class Sum {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter two integer numbers.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.printf("The sum of %d and %d is %d",num1,num2,num1+num2);
		
	}

}
