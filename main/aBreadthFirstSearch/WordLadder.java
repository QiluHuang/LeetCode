package aBreadthFirstSearch;

import java.util.*;

public class WordLadder {
    /** 127. Word Ladder */
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int len = beginWord.length();

        // Dictionary for looking up related words
        Map<String, List<String>> allComboDict = new HashMap<>();
        Iterator<String> itr = wordList.iterator();
        while (itr.hasNext()) {
            String word = itr.next();
            for (int i = 0; i < len; i++) {
                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, len);
                List<String> transformations = allComboDict.getOrDefault(newWord, new ArrayList<String>());
                transformations.add(word);
                allComboDict.put(newWord, transformations);
            }
        }

        // BFS
        // Queue
        Queue<StringInfo> queue = new LinkedList<>();
        StringInfo beginInfo = new StringInfo(beginWord,1);
        queue.add(beginInfo);

        // Visited Dictionary
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        while (!queue.isEmpty()) {
            StringInfo wordInfo = queue.remove();
            String word = wordInfo.word;
            int level = wordInfo.level;

            for (int i = 0; i < len; i++) {
                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, len);
                for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<String>())) {
                    if (adjacentWord.equals(endWord)) {
                        return level + 1;
                    }
                    if (!visited.contains(adjacentWord)) {
                        visited.add(adjacentWord);
                        StringInfo newWordInfo = new StringInfo(adjacentWord, level + 1);
                        queue.add(newWordInfo);
                    }
                }
            }
        }

        return 0;
    }
}

class StringInfo {
    String word;
    int level;

    StringInfo(String word, int level) {
        this.word = word;
        this.level = level;
    }
}
