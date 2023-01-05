package array;
public class MultiDimensionArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Traditional way to creating array in Multi Dimension Array
		System.out.println("*************** Traditional way ***************");
		int a[][] = new int[2][3];
		a[0][0] = 11;
		a[0][1] = 12;
		a[0][2] = 13;
		a[1][0] = 21;
		a[1][1] = 22;
		a[1][2] = 23;
		System.out.println("Value of 2 row and 1st column is: " + a[1][0]);
		// New way to creating array in Multi Dimension Array
		System.out.println();
		System.out.println("*************** Latest way ***************");
		int b[][] = { { 80, 81, 82 }, { 90, 91, 92 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
