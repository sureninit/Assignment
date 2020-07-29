/*11.	Write a program to swap two numbers
a) using temp variable
b) without temp variable
*/
package Assignment2;

public class Question11 {
//main method
	public static void main(String[] args) {
	//Indentify
		int a=10;
		int b=20;
		int temp;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("========");
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("with out temp");
        int x = 10; 
        int y = 5; 
        x = x + y; 
        y = x - y; 
        x = x - y; 
        System.out.println("After swaping:"
                           + " x = " + x + ", y = " + y); 

	}

}
