package package1;

public class Homework5{

	public static void main(String[] args) {
		Homework5 hm = new Homework5();
//		hm.checkGreatNumber(2, 4);
//		hm.checkHowWasTheParty(3,8);
//		hm.withoutString("This is a FISH", "IS");
//		hm.sumOfNumbersInAString("aa11b33");
		int[] arr = {1, 2, 1, 1, 3};
//		hm.canBalance(arr);
//		hm.countRepititivePairs(arr);
//		hm.maxMirror(arr);
		hm.maxSpan(arr);
	}
	public boolean checkGreatNumber(int a, int b){
		boolean isGreatNumber= false;
		if((a==6 || b==6)
				|| ((a+b)==6)
				|| ((a-b)==6)
				|| ((b-a)==6))
			isGreatNumber=true;
		System.out.println(a+ ", " + b + ": " +isGreatNumber);
		return isGreatNumber;
	}
	public int checkHowWasTheParty(int tea, int candy){
		
		int howWasTheParty =0;
		
		if (tea<5 || candy < 5)
		{
			howWasTheParty=0;
		}
		else if(tea >= 2*candy || candy >= 2*tea)
		{
			howWasTheParty=2;
		}
		else if(tea>=5 && candy >=5)
		{
			howWasTheParty=1;
		}
		System.out.println(howWasTheParty);
		return howWasTheParty;
	}
	public int blueTicket(int a, int b, int c) {
		int result=0;
		  
		if((a+b)==10 || (b+c)==10 || (a+c)==10)
			result=10;
		else if((a+b)==(b+c+10) || (a+b)==(a+c+10))
			result = 5;
		else 
			result=0;
		return result;
	}
	public String withoutString(String base, String remove) {
		StringBuffer baseBuffer = new StringBuffer(base);
		StringBuffer baseBuffer_lowercase = new StringBuffer(base.toLowerCase());
		
		  while(base.toLowerCase().contains(remove.toLowerCase()))
		  {
			  int indexOfRemoveString = baseBuffer_lowercase.indexOf(remove.toLowerCase());
			  baseBuffer=baseBuffer.delete(indexOfRemoveString, indexOfRemoveString+remove.length());
			  baseBuffer_lowercase=baseBuffer_lowercase.delete(indexOfRemoveString, indexOfRemoveString+remove.length());
			  base = baseBuffer.toString();
			  System.out.println("baseBuffer_lowercase: " + baseBuffer_lowercase);
			  System.out.println("baseBuffer: " + baseBuffer);
			  System.out.println("base: " + base);
		  }
		  System.out.println("base: " + base);
		  return base;
		}
	public int lengthOfLargestBlock(String str) {
		  int lengthOfLargestBlock =0;
				
				for(int i=0; i<str.length()-1; i++)
				{
					int count =	1;
					while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
					{
						count=count+1;
						i=i+1;
					}
					if(count>lengthOfLargestBlock)
						lengthOfLargestBlock=count;
				}
				return lengthOfLargestBlock;
		}
	public int sumOfNumbersInAString(String str) {
		int sumOfNumbers=0;
		
		for(int i=0; i<str.length(); i++)
		{
			int number=0;
			boolean flag=false;
			String numString="";
			while(i<str.length() && Character.isDigit(str.charAt(i)))
			{
				numString = numString + str.charAt(i);
				System.out.println("numString: " + numString);
				number = Integer.parseInt(numString);
				flag=true;
				i=i+1;
			}
			if(flag)
			{
				sumOfNumbers = sumOfNumbers + number;
				i=i-1;
			}
			System.out.println("sumOfNumbers: " + sumOfNumbers);		
		}
		return sumOfNumbers;
	}
	public boolean canBalance(int[] nums) {
		boolean canBalance=false;
		int forwardSum=0;
		for(int i=0; i<nums.length; i++)
		{
			int backwardSum=0;
			forwardSum=forwardSum+nums[i];
			for(int j=i+1; j<nums.length; j++)
			{
				backwardSum=backwardSum+nums[j];
			}
			if(forwardSum==backwardSum)
			{
				canBalance=true;
				System.out.println(canBalance);
				return canBalance; 
			}
		}
		System.out.println(canBalance);
		return canBalance; 
	}
	public int countRepititivePairs(int[] nums) {
		 int countOfRepititivePairs=0;
		 boolean flag=false;
			  for(int i=1; i<nums.length; i++)
			  {
				  if(nums[i]==nums[i-1])
				  {  
				    if(flag==false){
		  			  countOfRepititivePairs =countOfRepititivePairs+1;
		  			  flag=true;
				    }
				  }
				  else
					  flag=false;
			  }
				  return countOfRepititivePairs;
		}
	public int maxMirror(int[] nums) {
		//{21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}
		int maxcount=0;
		for(int i=0; i<nums.length; i++)
		{
			int temp=i;
			int count =0;
			for(int j=nums.length-1; j>=0; j--)
			{
				if(i< nums.length && nums[j]==nums[i])
				{
					count=count+1;
					i=i+1;
				}
				else if (count>0)
				{
					i=temp;
					j=j+1;
					count=0;
				}
				if(count>maxcount)
					maxcount=count;
			}
			i=temp;
			System.out.println("count -" + count);
			System.out.println("maxcount -" + maxcount);
		}
		return maxcount;
	}//i-0 1 1 2
	public boolean linearIn(int[] sortedOuter, int[] sortedInner) {

		int j=0;
		  if(sortedInner.length==0)
		  {return true;}
				for(int i=0; i<sortedOuter.length; i++)
				{
					if(sortedInner[j]==sortedOuter[i]){
						j=j+1;
					}
					else if(sortedInner[j]<sortedOuter[i]){
						return false;
					}
					if(j==sortedInner.length)
					  return true;
				}	
				
				return false;  
	}
	public int maxSpan(int[] nums) {
		int maxspan=0;
		for(int i=0; i<nums.length; i++)
		{
			int span=1;
			for(int j=nums.length-1; j>i; j--)
			{
				if(nums[i]==nums[j])
				{
					span=j-i+1;
					break;
				}
			}
			if(span>maxspan)
				maxspan=span;
		}
		return maxspan;  
	}
}