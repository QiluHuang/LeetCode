package dHashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * 387. First Unique Character in a String
 */
public class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            int count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
