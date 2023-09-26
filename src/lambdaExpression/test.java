package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import streams.Employee;

public class test {

	public static void main(String[] args) {
		test t = new test();
		t.sortEmployee();
	}
	public void sortNumbers() {
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(1);
		intlist.add(6);
		intlist.add(2);
		intlist.add(4);
		Collections.sort(intlist, (i1, i2) -> {
			if(i1<i2)
				return 1;
			else if (i1>i2)
				return -1;
			else
				return 0;
		});
		
		for(int i=0; i<intlist.size(); i++) {
			System.out.println(intlist.get(i));
		}
	}
	public void sortEmployee() {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("shree", "123456", 20000));
		emplist.add(new Employee("mohini", "111222", 40000));
		emplist.add(new Employee("Pooja", "333444", 60000));
		
		Collections.sort(emplist, (e1, e2) -> {
			e1.name.compareTo(e2.name);
				return 1;
		});
		
	}
}
