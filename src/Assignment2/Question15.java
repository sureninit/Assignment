//15.	Write a program that receives an ASCII code (between 0 – 128) 
//and display its character [example: 97 (input) ->a(output)].
package Assignment2;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = input.nextInt();
		if(number>=0 && number<=128) {
			char c1=(char)number;
			System.out.println("ASCII is:"+c1);
		}
		
		
	

		input.close();

	}

}
