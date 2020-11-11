package aRecursion;

public class HopTest {
    public static void main(String[] args) {
        int[] nums = {5,1,0,4,2,3};
        int res = Hop.alg(nums,1);
        System.out.println(res); // 0
    }
}
/*
3  4
0  4
1  0
2  4
3  4
4  4
5  4





*/