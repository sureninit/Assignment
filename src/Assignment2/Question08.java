//8.	Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
package Assignment2;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		int number;
		double cel;
		double f;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 for 'Fahrenheit to celsius' or");
		System.out.println("Enter 2 for 'Celsius to Fahrenheit' converter. ");
		System.out.println("Enter:");
		number = input.nextInt();

		switch (number) {
		case 1:
			System.out.println("you selected 1");
			System.out.println("Enter celsius:");
			cel = input.nextDouble();
			System.out.println(cel * 9/5 + 32 + " Fahrenheit");

			break;
		case 2:
			System.out.println("you selected 2");
			System.out.println("Enter Fahernheit:");
			f = input.nextDouble();
			System.out.println((f - 32) * 5/9  + " celsius");
			break;
		default:
			System.out.println("Invalid number");
		}

	}

}
