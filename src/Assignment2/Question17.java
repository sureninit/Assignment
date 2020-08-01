//17.	Write a program to calculate leap year.
package Assignment2;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = input.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is leap year");
				} else
					System.out.println(year + " is not leap year");
			} else
				System.out.println(year + " is leap year");

		} else
			System.out.println(year + " is not leap year");

	}

}
