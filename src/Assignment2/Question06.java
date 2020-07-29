package Assignment2;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Find parimeter of circle");
		int radius = input.nextInt();
		final double VALUE_RADIUS = 3.14;
		double p = 2 * VALUE_RADIUS * radius;
		System.out.println("Perimeter of circle:" + p);
		System.out.println("=====================");
		System.out.println("Find Perimeter of Rectangular");
		System.out.println("Enter length");
		int length = input.nextInt();
		System.out.println("Enter width");
		int width = input.nextInt();
		int perimeterOfRectangular = (length * 2) + (width * 2);
		System.out.println("Area of Rectangular:" + perimeterOfRectangular);
		System.out.println("=================================");
		System.out.println("Find Perimeter of Triangle");
		System.out.println("Enter side1 length");
		double side1 = input.nextDouble();
		System.out.println("Enter side2 length");
		double side2 = input.nextDouble();
		System.out.println("Enter side3 length");
		double  side3 = input.nextDouble();
		double perimeterOfTriangle = side1+side2+side3;
		System.out.println("Area of Traingle:" + perimeterOfRectangular);
	}

}
