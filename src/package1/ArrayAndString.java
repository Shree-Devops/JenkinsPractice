package package1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ArrayAndString{
	public static void main(String[] args) {
		ArrayAndString ar = new ArrayAndString();
		int [] arr = {1,2,3,5,6,7,8,9,10};
		
//		ar.findMissingNumber(arr);
//		ar.findBiggestAndSmallestNumber(arr);
		
		String str = "shree mohini baghel";
//		ar.printDuplicateCharactersFromString(str);
		String str2 = "hini baghelshree mo";
//		ar.checkIfStringRotaion(str, str2);
		ar.arrayList();
	}	
	public void findMissingNumber(int[] arr){
		int n=arr.length+1 ;
		int sumOfNumbers = n*(n+1)/2;
		int arraySum = 0;
		for (int i=0; i<arr.length; i++)
		{
			arraySum = arraySum + arr[i];
		}
		int missingNumber = sumOfNumbers-arraySum;
		System.out.println("Missing number in array: " + missingNumber);
	}
	public void findBiggestAndSmallestNumber(int[] arr){
		int biggestNum=arr[0];
		int smallestNum=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>biggestNum)
			{
				biggestNum=arr[i];
			}
			if(arr[i]<smallestNum)
			{
				smallestNum=arr[i];
			}
		}
		System.out.println("Biggest Number in array: " + biggestNum);
		System.out.println("Smallest Number in array: " + smallestNum);
	}
	public void printDuplicateCharactersFromString(String str) {
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for (int i=0; i<str.length(); i++)
		{
			int count=1;
			if(hmap.keySet().contains(str.charAt(i)))
			{	
				count = hmap.get(str.charAt(i))+1;
			}
			hmap.put(str.charAt(i), count);	
		}
		System.out.println(hmap);
		System.out.println("Duplicate characters: ");
		for(Character key: hmap.keySet())
		{
			if(hmap.get(key)>1)
				System.out.println(key);
		}
	}
	public void checkIfStringRotaion(String str1, String str2){
		boolean queuesAreEqual=false;
		if(str1.length()==str2.length())
		{
			Queue<Character> queue1 = new LinkedList<Character>();
			Queue<Character> queue2 = new LinkedList<Character>();
	
			for (int i=0; i<str1.length(); i++)
			{
				queue1.add(str1.charAt(i)); 
			}
			for (int i=0; i<str2.length(); i++)
			{
				queue2.add(str2.charAt(i)); 
			}
			int i=0;
			while(i<queue1.size())
			{
				char c= queue1.peek();
				queue1.remove();
				queue1.add(c);
				if(queue1.equals(queue2))
				{
					queuesAreEqual=true;
					break;
				}
				i=i+1;
			}
		}
		if(queuesAreEqual)	
			System.out.println(str1 + " and " + str2 + " strings are rotations of each other.");
		else
			System.out.println(str1 + " and " + str2 + " strings are not rotations of each other.");
	}
	public void arrayList(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter line count: ");
		int lineCount = sc.nextInt();
		if(1<=lineCount && lineCount<=20000)
		{
			ArrayList<ArrayList<Integer>> outerlist = new ArrayList<ArrayList<Integer>>(lineCount);
			int i=0;
			do{
				System.out.println("Enter line " +(i+1) + ": ");
				int j=0;
				ArrayList<Integer> innerlist = new ArrayList<Integer>();
				do{
					int digitCountInRow = sc.nextInt();
					if(0<=digitCountInRow && digitCountInRow<=50000)
					{
						innerlist.add(digitCountInRow);
						j=j+1;
					}
					else
						System.exit(1);
				}
				while(j<=innerlist.get(0));
				
				outerlist.add(innerlist);
				i=i+1;
			}
			while(i<lineCount);
			System.out.println(outerlist);
			System.out.println("Enter query count: ");
			int querycount=sc.nextInt();
			if(1<=querycount && querycount<=1000)
			{
				System.out.println("Enter row number and integer position to find the integer: ");
				ArrayList<ArrayList<Integer>> queryouterlist = new ArrayList<ArrayList<Integer>>(querycount);
				int p=0;
				do{
					System.out.println("Enter query " +(p+1) + " : ");
					ArrayList<Integer> queryinnerlist = new ArrayList<Integer>(2);
					
					int rownumber = sc.nextInt();
					int integerPosition = sc.nextInt();
					if(1<=rownumber && rownumber<=lineCount)
					{
						queryinnerlist.add(rownumber);
						queryinnerlist.add(integerPosition);
						queryouterlist.add(queryinnerlist);
						p=p+1;
						System.out.println("P: " + p);
					}
					else 
						System.exit(1);
				}
				while(p<querycount);
				System.out.println("query list: " + queryouterlist);
				System.out.println("Output: ");
				for(int k=0; k<querycount; k++)
				{
					int rownumber = queryouterlist.get(k).get(0);
					int integerPosition = queryouterlist.get(k).get(1);
					if(outerlist.get(rownumber-1).size()>integerPosition)
						System.out.println(outerlist.get(rownumber-1).get(integerPosition));
					else
						System.out.println("ERROR!");
				}
			}
		}
	}
}
