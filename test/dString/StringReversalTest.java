package dString;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringReversalTest {
    @Test
    public void reverseTest() {
        String str = "abcdefg";
        String res = Reversal.reverseUsingSB(str, 2,5);
        assertEquals("abfedcg", res);
    }

//    @Test
//    public void reverseWordsTest() {
//        String str = " the sky is blue ";
//        String res = StringReversal.reverseWords(str);
//        assertEquals("blue is sky the", res);
//    }
}
