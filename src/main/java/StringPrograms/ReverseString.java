package StringPrograms;
public class ReverseString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Madamt";
		String a = " ";
		System.out.println("Original String");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println("");
		//for reverse string
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i) + " ");
		}
	}
}
