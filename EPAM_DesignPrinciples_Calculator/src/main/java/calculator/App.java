package calculator;

import java.util.Scanner;
public class App 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	    Calculator cal = new Calculator();
		System.out.println("-----Simple Calculator-----");
		String arr[] = {"Addition","Subtraction","Multiplication","Division"};
		while(true)
		{
			System.out.println("---- MENU----\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
		    System.out.print("Enter your choice:");
		    int ch = sc.nextInt();
		    if(ch<1 || ch>4)
		    {
		    	System.out.println("Invalid Choice!!");
		    	return;
		    }
		    else
		    {
		    	System.out.print("Enter first number:");
		    	double num1 = sc.nextInt();
		    	System.out.print("Enter second number:");
		    	double num2 = sc.nextInt();
		    	if(ch==1)
		    		cal.addition(num1, num2);
		    	else if(ch==2)
		    		cal.subtraction(num1, num2);
		    	else if(ch==3)
		    		cal.multiplication(num1,num2);
		    	else if(ch==4)
		    			cal.division(num1, num2);
		    	if(num2==0 && ch==4)
		    		System.out.println("Denominator cannot be zero!!");
		    	else
		    		System.out.println(arr[ch-1]+" of "+num1+" and "+num2+" is "+cal.displayResult());
	        }
		}		
	}

}
