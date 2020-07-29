//7. Write a program that reads the radius and length of a cylinder and computes volume.
package Assignment2;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		double radius;
		double length;
		double volume;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius");
		radius = input.nextDouble();
		System.out.println("Enter length");
		length = input.nextDouble();
		volume = radius*radius*3.1415*length;
		System.out.println("Volume of cylinder:"+volume);
		

	}
}
