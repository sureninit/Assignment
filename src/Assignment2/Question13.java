/*13.	Write a program to print the number entered by 
the user only if the number entered is negative. */
package Assignment2;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter Number:");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		if(n<0) {
			System.out.println("You entered:"+n);
		}

	}

}
