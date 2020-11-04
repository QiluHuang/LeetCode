package aBinarySearch;

public class Problem2 {
    public static void main(String[] args) {
        int[] a = {12,7,13,4,11,6};
        int k = F(a, 0, 6);
        System.out.println(k);

        String res = Integer.toString(232);
        System.out.println(res);
    }

    public static int F(int[] a, int i, int n) {
        if (n <= 0) return 0;
        else if (a[i]%2 ==0) {
            int sum = (a[i] + F(a, i+ 1, n-1));
            System.out.println("i " + i + " n " + n + " a[i] "+ a[i] + " F()" + sum);
            return sum;
        } else  {
            int sum = (a[i] - F(a, i+ 1, n - 1));
            System.out.println("i " + i + " n " + n + " a[i] " +a[i] + " F()" + sum);
            return sum;
        }
    }
}
