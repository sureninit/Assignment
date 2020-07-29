package Assignment2;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Principle");
		int principle = input.nextInt();
		System.out.println("Enter Time");
		int time = input.nextInt();
		System.out.println("Enter Rate");
		int interestRate = input.nextInt();
		
		int simpleInterest = (principle*time*interestRate)/100;
		System.out.println("Simple Interest is: "+ simpleInterest);

	}

}
