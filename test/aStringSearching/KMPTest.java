package aStringSearching;

import org.junit.Test;

public class KMPTest {
    @Test
    public void generalTest() {
        String str1 = "BBC BCDAB ABCDABCDABDE";
        String str2 = "ABCDABD";

        int[] res = KMP.getNext(str2);
        for (int num : res) {
            System.out.println(num);
        }
    }
}
