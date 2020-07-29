//9.	Write a program that converts pounds into kg. The program prompts the user to enter a number of pounds, 
//converts it to kg and displays the result [1 pound is 0.454 kg].
package Assignment2;

import java.util.Scanner;

public class Question09 {
	

	public static void main(String[] args) {
		double pound;
		Scanner input = new Scanner(System.in);
		System.out.println("Change pound to kg, Enter pound:");
		pound = input.nextDouble();
		System.out.println(pound + "pound"+" = "+pound/2.205+" kg ");

	}

}
