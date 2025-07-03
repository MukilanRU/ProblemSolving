package day1;

public class CountVowels {
	public static int countVowelsMethod(String stringValue) {
		int count = 0;
		String str = stringValue.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String stringValue = "One Piece is Real";
		System.out.println(
				"The Count of vowles in the string : " + stringValue + " is " + countVowelsMethod(stringValue));
	}
}
