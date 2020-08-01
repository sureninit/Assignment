// 22.	Write a program to print the table of given number.
package Assignment2;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		int total=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number for the table:");
		int num = input.nextInt();
		System.out.println("=================");
		for(int i=1;i<=10;i++) {
			
			System.out.println(num+"*"+i+" = "+num*i);
		}

	}

}
