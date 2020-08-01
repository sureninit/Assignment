package Assignment2;

import java.util.Scanner;

public class Question10b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter s:");
		int s=input.nextInt();
		System.out.println("Enter a:");
		int a=input.nextInt();
		System.out.println("Enter b:");
		int b=input.nextInt();
		System.out.println("Enter c:");
		int c=input.nextInt();
		
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("area:"+area);
	}

}
