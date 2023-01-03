package collectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StoreUserDefinedClassObjects {

	public static void main(String[] args) {

		// Creating Employee class objects
		Employee emp1 = new Employee("Bhavesh", 200000, "QA");
		Employee emp2 = new Employee("Ghanshyam", 300000, "Dev");
		Employee emp3 = new Employee("Ghanshyam", 400000, "BA");

		// Created user defined class object ArrayList
		ArrayList<Employee> arr = new ArrayList<Employee>();

		// adding user defined class object to ArrayList
		arr.add(emp1);
		arr.add(emp2);
		arr.add(emp3);

		// Created iterator to traverse the values
		Iterator<Employee> it = arr.iterator();

		// To print all the values in arraylist
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.empName);
			System.out.println(emp.empSalary);
			System.out.println(emp.dept);

		}
	}

}
