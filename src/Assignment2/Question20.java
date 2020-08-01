/* 20.	Write a program to create the equivalent of a four-function
calculator. The program to enter two integer’s numbers and an operator. 
It then carries out the specified arithmetic operator operation: addition, subtraction, 
multiplication or division of the two numbers. 
Finally, it displays the result. */
package Assignment2;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number:");
		int num1 = input.nextInt();
		System.out.println("Please enter second number:");
		int num2 = input.nextInt();
		System.out.println("Please enter any one + , * , - , and /");
		
		String choose=input.next();
		switch (choose) {
		case "+":
			int sum=num1+num2;
			System.out.println("Result: "+sum);
			break;
		case "-":
			int sub=num1-num2;
			System.out.println("Result: "+sub);
			break;
		case "*":
			int mul=num1*num2;
			System.out.println("Result: "+mul);
			break;
		case "/":
			int div= num1/num2;
			System.out.println("Result: "+div);
			break;
		default:
			System.out.println("Invalid");
		}
	

}
	}
