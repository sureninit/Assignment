package Assignment2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Question03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//System.out.println("Enter num1");
//		int a = input.nextInt();
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter number1:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter number2"));
		
		//System.out.println("Enter num2");
		//int b = input.nextInt();
		
		int sum = a+b;
		int average = (a+b)/2;
		//System.out.println("sum of "+a+" "+" and "+b+" is: "+sum);
		//System.out.println("Average of "+a+" "+" and "+b+" is: "+average);
		JOptionPane.showMessageDialog(null,"sum"+sum);
		input.close();
	}

}
