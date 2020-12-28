package dString;

import java.util.*;

public class Anagram {
    /** 49. Group Anagrams */
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }


    /** 242. Valid Anagram */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] table = new int[256];

        for (int i = 0; i < s.length();  i++) {
            table[s.charAt(i) - 'a']++;
            table[t.charAt(i) - 'a']--;
        }

        for (int num : table) {
            if (num != 0) return false;
        }

        return true;
    }

}
