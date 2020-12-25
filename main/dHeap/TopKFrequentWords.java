package dHeap;

import java.util.*;

/**
 * 692. Top K Frequent Words
 * */
public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        // 1) get the occurence of each word
        Map<String, Integer> map = new HashMap<>();
        getOccurence(words, map);

        // 2) construct a fixed size minHeap
        PriorityQueue<String> heap = new PriorityQueue<>(
                (str1, str2) -> {
                    int count1 = map.get(str1);
                    int count2 = map.get(str2);
                    if (count1 != count2) {
                        return count1 - count2;
                    } else {
                        return str2.compareTo(str1);
                    }
                }
        );
        constructHeap(map, heap, k);


        // 3) get result
        List<String> list = new ArrayList<>();
        while (!heap.isEmpty()) {
            list.add(0, heap.poll());
        }

        return list;

    }

    private void getOccurence(String[] words, Map<String, Integer> map) {
        for (String word : words) {
            int count = map.getOrDefault(word, 0) + 1;
            map.put(word, count);
        }
    }

    private void constructHeap(Map<String, Integer> map, PriorityQueue<String> heap, int k) {
        for (String word : map.keySet()) {
            heap.offer(word);
            if (heap.size() > k) heap.poll();
        }
    }
}


/*
1) traverse the words array => get the num of occurence of each word => Map<String, Integer>
2) construct a fixed size minHeap => PriorityQueue<String>
3) List<String> => get PriorityQueue<String>


*/

