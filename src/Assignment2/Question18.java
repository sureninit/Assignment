//18.	Write a program to display the largest number from given three values.
package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Enter num1:");
		num1 = input.nextInt();
		System.out.println("Enter num2:");
		num2 = input.nextInt();
		System.out.println("Enter num3:");
		num3 = input.nextInt();
		
		if(num1>num2 && num2>num3) {
			System.out.println(num1+" num1 is greather than "+ num2 +" and "+ num3);
		}else if(num2>num1 && num1>num3) {
			System.out.println(num2+" num2 is greather than "+ num1 +" and "+ num3);
		}else if(num3>num1 && num3>num2) {
			System.out.println(num3+" num3 is greather than "+ num1 +" and "+ num2);
		}

	}

}
