package collectionArrayList;

import java.util.ArrayList;

public class ArrayListPrint {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(10);
		arr.add(30);
		arr.add(20);

		// You can use the for loop to simply print all elements of ArrayList
		for (int i = 0; i < arr.size(); i++) {

			System.out.println(arr.get(i));
		}

		// The println command can be used directly in the case of ArrayLists made using
		// primitive data types.
		System.out.println(arr);

	}

}
