public class Palindrome2 {
	public static String CheckPalindrome(String str) {
		String A = str;
		// Scanner sc = new Scanner(System.in);
		// String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		StringBuilder secondHalf = new StringBuilder();
		// get module of the word's length
		int half = A.length() % 2 == 0 ? A.length() / 2 : (A.length() - 1) / 2;
		// System.out.println(half);
		String firstHalf = A.substring(0, half);
		// System.out.println(firstHalf);
		secondHalf.append(A.substring(A.length() - half, A.length()));
		// System.out.println(secondHalf);
		// ig it is not 0, get the substring (length -1) / 2 , reverse and compare
		secondHalf.reverse();
		// System.out.println(secondHalf);
		// System.out.println(firstHalf.compareTo(secondHalf.toString()) == 0 ? "Yes" :
		// "No");
		return firstHalf.compareTo(secondHalf.toString()) == 0 ? "Yes" : "No";
	}
}
