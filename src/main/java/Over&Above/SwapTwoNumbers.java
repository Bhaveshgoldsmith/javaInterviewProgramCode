package JavaPrograms;
import java.util.Scanner;
public class SwapTwoNumbers {
	public static void main(String[] args) {
		int temp;
		 Scanner in = new Scanner(System.in);
		 int x =in.nextInt();
		 int y= in.nextInt();
		 System.out.println("Before Swapping" + x + y);
		 temp=x;
		 x=y;
		 y=temp;
		 System.out.println("After Swapping" + x + y);
	}
}
