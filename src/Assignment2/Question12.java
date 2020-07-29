//12.	Write a program to accept the roll, name,
//and nationality of the person and display those values in good format.
package Assignment2;

import java.awt.Robot;
import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		int rollNumber;
		String name;
		String nationality;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter rollNumber:");
		rollNumber = input.nextInt();
		System.out.println("Enter name:");
		name = input.next();
		System.out.println("Enter nationality:");
		nationality = input.next();
		System.out.println("===================");
		System.out.println("Roll number:" + rollNumber);
		System.out.println("Name:" + name);
		System.out.println("Nationality:" + nationality);

	}

}
