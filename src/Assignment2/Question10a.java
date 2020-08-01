package Assignment2;

import java.util.Scanner;

public class Question10a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double u, t;
		double a;
		System.out.println("Enter u:");
		u = input.nextInt();
		System.out.println("Enter t:");
		t = input.nextInt();
		double s = u * t + a * Math.pow(u, 2);
		System.out.println("result:"+s);
	}

}
