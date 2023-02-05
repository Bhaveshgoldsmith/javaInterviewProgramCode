package string_programs;
public class MinMaxWordFromString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name is a Bhavesh";
		String[] arr = str.split(" ");
		int i = 0;
		int maxlength, minlength;
		maxlength = Integer.MIN_VALUE;
		minlength = Integer.MAX_VALUE;
		String largest, smallest;
		largest = smallest = "";
		for (i = 0; i < arr.length; i++) {
			if (arr[i].length() < minlength) {
				smallest = arr[i];
				minlength = arr[i].length();
			}
			if (arr[i].length() > maxlength) {
				largest = arr[i];
				maxlength = arr[i].length();
			}
		}
		System.out.println("The largest and smallest word is \"" + largest + "\" and \"" + smallest + "\"");
	}
}
