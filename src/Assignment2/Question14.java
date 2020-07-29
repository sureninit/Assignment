//14.	Write a program to relate two integers entered by the user using = =or > or < sign.
package Assignment2;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner input = new Scanner(System.in);
		System.out.println("Num1:");
		num1=input.nextInt();
		System.out.println("Num2");
		num2=input.nextInt();
		if(num1==num2) {
			System.out.println(num1+" is equal to "+num2);
		}else if(num1<num2) {
			System.out.println(num1+" is less than "+num2);
		}else if(num1>num2) {
			System.out.println(num1+" is greather than "+num2);
		}
		
	}

}
