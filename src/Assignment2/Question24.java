// 24.	Write a program to print the factorial number of given numbers.

package Assignment2;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number to print the factorial of the number.");
	
		int number=input.nextInt();
		for(int i=1;i<=number;i++) {
			System.out.println(i);
		}
		System.out.println("=========================");
	}

}
