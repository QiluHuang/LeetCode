package aBreadthFirstSearch;

import java.util.*;

public class OpenTheLock {
    /**
     * 752. Open the Lock
     * */
    public static int openLock(String[] deadends, String target) {
        Set<String> deadendsSet = new HashSet<>();
        Set<String> visited = new HashSet<>();
        for (String num : deadends) {
            deadendsSet.add(num);
        }

        if (deadendsSet.contains("0000")) return -1;


        Map<String, Integer> stringMap = new HashMap<>();
        stringMap.put("0000", 0);

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("0000");

        while (!queue.isEmpty()) {
            String currNum = queue.poll();

            String nextPlusNum = currNum;
            String nextMinusNum = currNum;



            for (int i = 0; i < 4; i++) {
                nextPlusNum = currNum.substring(0, i) + plusOne(currNum, i) + currNum.substring(i + 1, 4);
                nextMinusNum = currNum.substring(0, i) + minusOne(currNum, i) + currNum.substring(i + 1, 4);

                if (deadendsSet.contains(nextPlusNum) || deadendsSet.contains(nextMinusNum)) {
                    continue;
                }

                int plusCount = stringMap.get(currNum) + 1;
                if (stringMap.containsKey(nextPlusNum)) {
                    plusCount = Math.min(stringMap.get(nextPlusNum), plusCount);
                }
                if (!visited.contains(nextPlusNum)) {
                    stringMap.put(nextPlusNum, plusCount);
                    queue.offer(nextPlusNum);
                    visited.add(nextPlusNum);
                }


                int minusCount = stringMap.get(currNum) + 1;
                if (stringMap.containsKey(nextMinusNum)) {
                    minusCount = Math.min(stringMap.get(nextMinusNum), minusCount);
                }
                if (!visited.contains(nextMinusNum)) {
                    stringMap.put(nextMinusNum, minusCount);
                    queue.offer(nextMinusNum);
                    visited.add(nextMinusNum);
                }

                System.out.println("currNum: " + currNum + " count: " + stringMap.get(currNum)  + " nextPlusNum:" + nextPlusNum +  " nextMinusNum: " + nextMinusNum);


                if (stringMap.containsKey(target)) {
                    return stringMap.get(target);
                }
            }


        }

        return -1;
    }

    private static String plusOne(String str, int i) {
        Integer num = Integer.parseInt(str.substring(i, i + 1));
        if (num == 9) {
            return "0";
        } else {
            return Integer.toString(num + 1);
        }
    }

    private static String minusOne(String str, int i) {
        Integer num = Integer.parseInt(str.substring(i, i + 1));
        if (num == 0)  {
            return "9";
        } else {
            return Integer.toString(num - 1);
        }
    }
}
