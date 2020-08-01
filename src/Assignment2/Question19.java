//19.	Write a Program to accept three sides of a triangle and 
//display which kind of triangle is formed.
package Assignment2;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please,Enter size of length A of Tringle");
	int a = input.nextInt();
	System.out.println("Please,Enter size of length B of Tringle");
	int b = input.nextInt();
	System.out.println("Please,Enter size of length C of Tringle");
	int c = input.nextInt();
	
	if(a==b && a==c) {
		System.out.println("This is Equilateral Triangle");
	}else if(a==b || a==c){
		System.out.println("This is Isosceles Triangle");
	}else if(a!=b && a!=c) {
		System.out.println("This is Scalene Triangle");
	}

	}

}
