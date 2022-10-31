public class Palindrome {

	public static String breakPalindrome(String palindromeStr) {
		// Write your code here
		// convert string into array of digits
		// a ascii = 97
		// try to change any digit starting from 0 index
		// digit - 1 if it is more than 97
		// if possible than change and convert back to the string and return
		// if not possible, than return IMPOSSIBLE

		final int aLetter = 97;
		final int zLetter = 122;
		final int len = palindromeStr.length();
		boolean isChanged = false;
		String result = "";

		char[] chArr = new char[len];
		int[] intArr = new int[len];

		for (int i = 0; i < len; i++) {
			chArr[i] = palindromeStr.charAt(i);
		}

		for (int i = 0; i < len; i++) {
			intArr[i] = (int) chArr[i];
		}

		for (int i = 0; i < len; i++) {
			if (intArr[i] > aLetter) {
				intArr[i] = intArr[i] - 1;
				isChanged = true;
				break;
			}
		}

		if (isChanged) {
			for (int i = 0; i < len; i++) {
				chArr[i] = (char) intArr[i];
			}
		}

		result = new String(chArr);

		return palindromeStr.equals(result) ? "IMPOSSIBLE" : result;
	}
}
