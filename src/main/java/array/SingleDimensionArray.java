package array;
public class SingleDimensionArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Traditional way to creating array in single dimension
		int a[] = new int[5];
		a[0] = 11;
		a[1] = 12;
		a[2] = 13;
		a[3] = 14;
		a[4] = 15;
		System.out.println("*************** Traditional way ***************");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Value on index " + i + " is " + a[i]);
		}
		// New way to creating array in single dimension
		System.out.println();
		System.out.println("*************** Latest way ***************");
		int b[] = { 21, 22, 23, 24, 25 };
		for (int i = 0; i < b.length; i++) {
			System.out.println("Value on index " + i + " is " + b[i]);
		}
	}
}
