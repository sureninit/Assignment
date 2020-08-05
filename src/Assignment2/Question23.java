// 23.	Write a Program to sum 1 to nth natural numbers.
package Assignment2;
//dev-suren merge
import java.util.ArrayList;
import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to sum 1 to nth number:");
		int num=input.nextInt();
		int total =0;
	
		for(int i=1;i<=num;i++) {
			total=total+i;
			
		}
		System.out.println("total:"+total);

	}

}
