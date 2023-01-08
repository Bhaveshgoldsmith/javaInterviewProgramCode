package StringPrograms;
public class ReverseEachWord {
	public static void main(String[] args) {
		reverseWord("My Name is Bhavesh");
	}
	public static void reverseWord(String str) {
		String staggedStr[] = str.split("\\s");
		String result = "";
		for (int i = 0; i < staggedStr.length; i++) {
			char charArray[] = staggedStr[i].toCharArray();
			for (int j = charArray.length-1; j >= 0; j--) {
				result = result + charArray[j];
			}
			result=result+" ";
		}
		System.out.println(result);
	}
}
