package string_programs;
public class DuplicateCharacters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name is Bhavesh";
		char c[] = str.toCharArray();
		System.out.print("Duplicate characters are: ");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (c[i] == c[j]) {
					System.out.print(c[j] + " ");
					break;
				}
			}
		}
	}
}
