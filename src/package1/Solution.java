package package1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter no of players: ");
		int n = sc.nextInt();
		Player[] playerarray = new Player[n];
		Checker checker = new Checker();
		System.out.println("Please name and score for each player: ");
		
		for(int i=0; i<n; i++)
		{
			playerarray[i]= new Player(sc.next(), sc.nextInt());
		}
		sc.close();
		Arrays.sort(playerarray, checker);
		for(int i=0; i<playerarray.length; i++)
		{
			System.out.println(playerarray[i].name + ", " + playerarray[i].score);
		}
	}

}
