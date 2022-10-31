import java.util.*;

public class HashMapCompare {
    public static HashMap<Character, Integer> makeHashMap(String str) {
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        for (Character ch : str.toLowerCase().toCharArray()) {
            if (!letters.containsKey(ch)) {
                letters.put(ch, 1);
            } else {
                letters.computeIfPresent(ch, (k, v) -> v + 1);
            }
        }

        return letters;
    }
}