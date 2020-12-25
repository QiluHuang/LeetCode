package dHeap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


/**
 * 347. Top K Frequent Elements
 * */
public class TopKFrequentElements {
    private Map<Integer, Node> map = new HashMap<>();

    class Node {
        private int val;
        private int count;

        public Node(int num, int count) {
            this.val = num;
            this.count = count;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Node> minHeap = new PriorityQueue<>(
            new Comparator<Node>() {
                @Override
                public int compare(Node n1, Node n2) {
                    if (n1.count < n2.count) return -1;
                    else if (n1.count == n2.count) return 0;
                    else return 1;
                }
            }
        );

        for (int num : nums) {
            int currCount = 0;
            if (map.containsKey(num)) {
                currCount = map.get(num).count;
                currCount++;
            } else {
                currCount = 1;
            }

            Node currNode = new Node(num, currCount);
            map.put(num, currNode);
        }

        for (Node currNode : map.values()) {
            if (minHeap.size() < k) {
                minHeap.add(currNode);
            } else {
                if (minHeap.peek().count < currNode.count) {
                    minHeap.remove();
                    minHeap.add(currNode);
                }
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = minHeap.peek().val;
            minHeap.remove();
        }

        return res;
    }
}


/*
1,1,1,2,2,3

num  count
1.    3
2.    2  <
3.    1

1) traverse the array and get the num of value

2) a fixed size minHeap
   a) size <  k  => insert num
      size >= k  => compare frequecy of num to be inserted with the min in heap
                    > insert num


*/
