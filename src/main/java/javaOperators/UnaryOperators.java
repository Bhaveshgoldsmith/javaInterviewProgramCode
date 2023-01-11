package javaOperators;

public class UnaryOperators {

	public static void main(String[] args) {

		int c = 1;
		// Assign the value of c to d variable first then increment the value of c so
		// value of c would be 2 and value of d would be 1
		int d = c++;

		System.out.println("Value of c is :" + c);
		System.out.println("Value of d is :" + d);

		int a = 1;
		// First of all increment the value of "a" then assign it to the "b" so b value
		// would be 2 and a value would be also 2
		int b = ++a;

		System.out.println("Value of a is :" + a);
		System.out.println("Value of b is :" + b);

	}

}
