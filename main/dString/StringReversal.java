package dString;

public class StringReversal {
    /**
     * @Description Reverse Target Position
     * @Param str: the target string
     *        left: the start index
     *        right: the end index
     * @return a reversed String
     * @Author Luna Huang
     * @Date 10/3/20
     * @Time 8:11 PM
     **/
    /*
    将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反
    转为”abfedcg”
     */
    public static String reverse(String str, int left, int right) {
        char[] arr = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        
        while (left < right) {
            char tmp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = tmp;
        }

//        for (int i = 0; i < str.length(); i++) {
//            builder.append(arr[i]);
//        }
//
//        return builder.toString();
        return new String(arr);
    }

    public static String reverseUsingSB(String str, int startIdx, int endIdx) {
        if (str != null) {
            StringBuilder builder = new StringBuilder(str.length());

            // Part 1
            builder.append(str.substring(0, startIdx));

            // Part 2
            for (int i = endIdx; i >= startIdx; i--) {
                builder.append(str.charAt(i));
            }

            // Part 3
            builder.append((str.substring(endIdx + 1, str.length())));

            return builder.toString();
        }

        return null;
    }
    
    /**
     * @Description Reverse the words in a String
     * @Param 
     * @return 
     * @Author Luna Huang
     * @Date 10/3/20
     * @Time 8:13 PM
     **/
//    public static String reverseWords(String s) {
//        String str = trim(s);
//        StringBuilder builder = new StringBuilder();
//
//        int endIdx = str.length() - 1, startIdx = endIdx;
//        while (startIdx > 0) {
//            startIdx = findStartIdx(str, endIdx);
//            //System.out.println(endIdx);
//            //if (endIdx >= str.length()) break;
//
//            String word = null;
//            if (endIdx == str.length() - 1) {
//                word = str.substring(startIdx + 1, endIdx + 1);
//            } else if (startIdx == 0) {
//                word = str.substring(0, endIdx);
//            } else {
//                word = str.substring(startIdx + 1, endIdx);
//            }
//            builder.append(word);
//            if (startIdx != 0) builder.append(" ");
//            endIdx = startIdx;
//            //System.out.println("Updated StartIdx: " + startIdx);
//        }
//
//        return builder.toString();
//    }
//
//    private String trim(String s) {
//        int len = s.length();
//        int left = 0, right = len - 1;
//
//        while (s.charAt(left) == ' ') {
//            left++;
//        }
//
//        while (s.charAt(right) == ' ') {
//            right--;
//        }
//
//        return s.substring(left, right + 1);
//    }
//
//    private int findStartIdx(String s, int endIdx) {
//        int startIdx = 0;
//        if (s.charAt(endIdx) == ' ') {
//            startIdx = endIdx - 1;
//        } else {
//            startIdx = endIdx;
//        }
//
//        while (s.charAt(startIdx) != ' ' && startIdx > 0) {
//            startIdx--;
//            //System.out.println("find endIdx: " + endIdx);
//        }
//
//        return startIdx;
//    }
}
