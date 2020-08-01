//16.	Write a program to find the given number is even or odd.
package Assignment2;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = input.nextInt();
		if(number%2==0) {
			System.out.println(number +" is even number");
		}else {
			System.out.println(number +" is odd number");
		}

	}

}
