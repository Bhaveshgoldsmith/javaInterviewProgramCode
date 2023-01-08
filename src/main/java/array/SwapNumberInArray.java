package array;
public class SwapNumberInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1,21,5,36,6
		int a[] = { 1, 21, 5, 36, 6 };
		int temp;
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (a[i] > a[j]) {
					temp = a[i];// 1
					a[i] = a[j];// 21
					a[j] = temp;// 1
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
	}
}
