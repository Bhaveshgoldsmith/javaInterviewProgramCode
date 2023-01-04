package collectionArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExamples {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Orange");
		ll.add("Green");
		ll.add("Red");

		System.out.println("****Print Directly when primitive data type used****");
		System.out.println(ll);

		// Print using Iterator
		System.out.println("****Print using Iterator****");
		Iterator it = ll.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

		// You can use the for loop to simply print all elements of ArrayList
		System.out.println("****Using for loop****");
		for (int i = 0; i < ll.size(); i++) {

			System.out.println(ll.get(i));
		}

	}

}
