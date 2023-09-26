package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;

import streams.Employee;

public class mytest {
	public static void main(String[] args) {
		mytest t= new mytest();
		//System.out.println(t.isPalindrome.test("amama"));
		//t.findSecondLargestNum();
		t.sortEmployees();
	}
	Predicate<String> isPalindrome = (String str)-> {
		StringBuilder sb =  new StringBuilder(str);
		String revString = sb.reverse().toString();
		return str.equals(revString);
	};
	public void findSecondLargestNum() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(0);
		list.add(1);
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());
	}
	public void checkStringRotation(String str1, String str2) {
		if(str1.length()!=str2.length())
		{
			System.out.println("not rotation of each other");
		}
		else {
			
		}
	}
	public void sortEmployees() {
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(1);
		intlist.add(6);
		intlist.add(2);
		intlist.add(4);
		Collections.sort(intlist, Collections.reverseOrder());
		for(int i=0; i<intlist.size(); i++) {
			System.out.println(intlist.get(i));
		}
	}	

}
