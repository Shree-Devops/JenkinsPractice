package package1;

import java.util.Scanner;

public class Base {
	
	public static void main(String[] args) {
		//1. Create code which displays in console “Hello, NAME”, where NAME is taken from Command line (1 mark) 
		//2. Create "calculator" which takes two numbers and an operation from the command line and outputs the result 
		//of the operation to the console. Add addition, subtraction, multiplication and division. (4 marks) 
		//Extra task : provide option for reminder, calcualte percentage (2 marks)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number - ");
		int num1 = sc.nextInt();
		System.out.println("Enter secound number - ");
		int num2 = sc.nextInt();
		System.out.println("Enter operation - ");
		String operation = sc.next();
		
		Base calc = new Base();
		
		switch (operation) {
		case "addition" : 
			calc.addition(num1, num2); 
			break;
		case "subtraction" : 
			calc.subtraction(num1, num2); 
			break;
		case "multiplication" :
			calc.multiplication(num1, num2); 
			break;
		case "division" : 
			calc.division(num1, num2);
			break;
		default : System.out.println("Invalid entry.");
		}
		System.out.println("Do you want to calculate percentage of the numbers? Enter Y or N");
		if(sc.next().equalsIgnoreCase("Y"))
			calc.percentage(num1, num2);
		if(sc.next().equalsIgnoreCase("N"));
		else
			System.out.println("Invalid entry.");
}
	public int addition(int a, int b)
	{
		int result=a+b;
		System.out.println("result - " + result);
		return result;
	}
	public int subtraction(int a, int b)
	{
		int result=a-b;
		System.out.println("result - " + result);
		return result;
	}
	public int multiplication(int a, int b)
	{
		int result=a*b;
		System.out.println("result - " + result);
		return result;
	}
	public double division(int a, int b)
	{
		int result=a/b;
		System.out.println("result - " + result);
		return result;
	}
	public double percentage(int a, int b)
	{
		double result=a*100/b;
		System.out.println("result - " + result + "%");
		return result;
	}

}
