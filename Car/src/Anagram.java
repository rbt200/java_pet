import java.util.*;

public class Anagram {
	public static String CheckIfAnagram(String str1, String str2) {

		// // String str1 = "anagram";
		// // String str2 = "margana";
		HashMap<Character, Integer> letters1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> letters2 = new HashMap<Character, Integer>();
		// Scanner scanner = new Scanner(System.in);
		// String str1 = scanner.nextLine();
		// String str2 = scanner.nextLine();
		letters1 = HashMapCompare.makeHashMap(str1);
		letters2 = HashMapCompare.makeHashMap(str2);
		// System.out.println(letters1.equals(letters2) ? "Anagrams" : "Not Anagrams");
		return letters1.equals(letters2) ? "Anagrams" : "Not Anagrams";
	}
}
