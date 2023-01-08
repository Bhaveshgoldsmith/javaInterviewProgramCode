package StringPrograms;
import java.util.HashMap;
import java.util.Map;
public class CharacterCount {
	public static void main(String[] args) {
		countOccurence("test");
	}
	public static void countOccurence(String str) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char ch[] = str.toCharArray();
		for (char c : ch) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		System.out.println(str + ": " + charMap);
	}
}
