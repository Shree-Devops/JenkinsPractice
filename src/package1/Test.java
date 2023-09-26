package package1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		System.out.println("Enter X:");
		int x=sc.nextInt();

		System.out.println("Enter loop name:");
		String loopName = sc.next();
		
		Test t = new Test();
		
		switch (loopName.toLowerCase())
		{
		case "while":
			t.usingWhileLoop(num, x);
		case "dowhile":
			t.usingDoWhileLoop(num, x);
		case "for":
			t.usingForLoop(num, x);
		}
	}
	public void usingDoWhileLoop(int num, int x)
	{
		int temp =-x;
		int i=0;
		do{
			int j=0;
			while(j<=i)
			{
				temp=temp+x;
				System.out.print(temp);
				System.out.print(" ");
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
		while(i<num);
	}
	public void usingWhileLoop(int num, int x)
	{
		int temp =-x;
		
		int i=0;
		while(i<num)
		{
			int j=0;
			while(j<=i)
			{
				temp=temp+x;
				System.out.print(temp);
				System.out.print(" ");
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}
	public void usingForLoop(int num, int x)
	{
		int temp =-x;
		for(int i=0; i<num; i++) 
		{	
			for(int j=0; j<=i; j++)
			{	
				temp=temp+x;
				System.out.print(temp);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
