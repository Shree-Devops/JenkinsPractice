package package1;

import java.util.HashMap;
import java.util.Scanner;

public class Map {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(1<=n && n<=100000)
		{
			System.out.println("Enter Phone book entries");
			HashMap<String, Integer> hmap = new HashMap<String, Integer>(n);
			for(int i=0; i<n; i++)
			{
				System.out.println("Enter Phone book entry: " + i);
				hmap.put(sc.next(),sc.nextInt());
			}
			System.out.println("Enter queries");
			String [] queries = null ;
			int i=0;
			while(sc.hasNext() && 1<=queries.length && queries.length<=100000)
			{
				queries[i]=sc.next();
				i=i+1;
			}
			System.out.println("Output: ");
			for(int j=0; j<queries.length; j++)
			{
				for(String key: hmap.keySet())
				{
					System.out.println(key + " " + hmap.get(queries[j]));
				}
			}
		}
		else
			System.exit(1);
	}
}