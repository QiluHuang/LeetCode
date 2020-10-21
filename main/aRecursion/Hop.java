package aRecursion;

public class Hop {
    private static boolean status = true;
    private static int target = 0;
    public static int alg(int [] s, int x) {
        //WRITE CODE
        //If your code is more than 10 lines, you don't understand the problem

        //int index = s[x];
        if (status) {
            target = x;
            status = false;
        }

        if (s[x] == target) return 0;

        int count = alg(s, s[x]);
        return count + 1;
    }
}
