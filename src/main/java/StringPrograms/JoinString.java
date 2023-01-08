package StringPrograms;
public class JoinString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "a", "b", "c" };
		String joinedString = String.join("", str);
		System.out.println(joinedString);
		String joinedString1 = String.join(";", str);
		System.out.println(joinedString1);
		System.out.println(joinStringbyStringBuilder("", "T","E","S","T"));
	}
	public static String joinStringbyStringBuilder(String seperator, String... values) {
		StringBuilder sb = new StringBuilder();
		int end = 0;
		for (String s : values) {
			if (s != null) {
				sb.append(s);
				end = sb.length();
				sb.append(seperator);
			}
		}
		return sb.substring(0, end);
	}
}
