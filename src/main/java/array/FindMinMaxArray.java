package array;
public class FindMinMaxArray {
	public static void main(String[] args) {
		int num[] = { 13, 6, 15, 4, 18, 9 };
		int min = num[0];
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			} else if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("The minimum array element is " + min);
		System.out.println("The maximum array element is " + max);
	}
}
