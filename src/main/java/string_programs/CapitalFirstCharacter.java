package string_programs;

public class CapitalFirstCharacter {

	public static void main(String[] args) {

		String str = "bhavesh";

		capitalFirstCharacter(str);

	}

	public static void capitalFirstCharacter(String str) {
		String capitalized = str.substring(0, 1).toUpperCase() + str.substring(1);

		System.out.println("Original String: " + str);
		System.out.println("Capitalized String: " + capitalized);

	}

}
