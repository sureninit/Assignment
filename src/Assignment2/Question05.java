package Assignment2;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius");
		int radius = input.nextInt();
		final double VALUE_RADIUS = Math.PI;
		double area = VALUE_RADIUS * radius * radius;
		System.out.println("Area of circle:" + area);
		System.out.println("=====================");
		System.out.println("Find Area of Rectangular");
		System.out.println("Enter length");
		int length = input.nextInt();
		System.out.println("Enter width");
		int width = input.nextInt();
		int areaOfRectangular = length * width;
		System.out.println("Area of Rectangular:"+areaOfRectangular);
		System.out.println("=================================");
		System.out.println("Find Area of Triangle");
		System.out.println("Enter base");
		double base =input.nextDouble();
		System.out.println("Enter height");
		double height =input.nextDouble();
		double areaOfTriangle=(base*height)/2;
		System.out.println("Area of Traingle:"+areaOfRectangular);

	}

}
