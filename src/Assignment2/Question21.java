/* 21.	Program to input the number of (1...7) and 
translate to its equivalent name of the day of the week. */
package Assignment2;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number 1 to 7");
	int num=input.nextInt();
	
		switch (num) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thrusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
		default:
			System.out.println("Invalid number enter 1 to 7 only !!!");
			
		}
		
	}

}
