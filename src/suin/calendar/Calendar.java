package suin.calendar;
import java.util.*;

public class Calendar {
	
	public void printSampleCalendar(){
		System.out.println("SUN MON TUE WED THU FRI SAT");
		System.out.println("-----------------------------");
		System.out.println(" 1   2   3   4   5   6   7"); 
		System.out.println(" 8   9  10  11  12  13  14"); 
		System.out.println("15  16  17  18  19  20  21");
		System.out.println("22  23  24  25  26  27  28 ");
		}

	public static void main(String[] args) {
		
		// Calculate days in month from user input
		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month to know how many days in the month ");
		int month = sc.nextInt();
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("This month has 31 days");
		}else if(month == 4 || month == 6 || month == 9 || month == 11 ) {
			System.out.println("This month has 30 days");
			
		}else if(month ==2) {
			
			System.out.println("What year is this?");
			int year = sc.nextInt();
			
				if(year % 4 ==0 && year % 4 != 0 && year % 400 ==0) {
					System.out.println("It's leap year, so Febrary has 29 days");
				}else {
					System.out.println("It's not leap year, so Febrary has 28 days");
				}
			
		}
		
		sc.close();
		cal.printSampleCalendar();
		
	}

}
