package string_programs;
import java.util.HashMap;
import java.util.Map;
public class MaximumOccurringCharacterInString {
	public static void main(String[] args) {
		CharOccurence("testtt");
	}
	public static void CharOccurence(String Str) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char carr[] = Str.toCharArray();
		int max = 1;
		char ans='a';
		for ( char c : carr) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
				if (charMap.get(c) > max) {
					max = charMap.get(c);
					ans = c;
				}			
			} 
			else {
				charMap.put(c, 1);
			}
		}
		System.out.println(Str + ": " + charMap);
		 System.out.println("Maximum occurring character is "+ans);
	}
}