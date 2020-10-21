package aRecursion;

public class HanoiTower {
    public static void movePlate(int nums, char A, char B, char C) {
        if (nums > 0) {
            movePlate(nums - 1, A, C, B); // A上面所有盘子移到B上，借助了C
            System.out.println(A + " -> " + C);  // A上剩的最后一个移到C上
            movePlate(nums - 1,B, A, C);  // B上面所有盘子移到C上，借助了A
        }
    }

    public static void movePate2(int nums, char A, char B, char C) {
        if (nums == 1) {
            System.out.println(A + " -> " + C);
        } else {
            movePate2(nums - 1, A, C, B);
            System.out.println(A + " -> " + C);
            movePate2(nums - 1, B, A, C);
        }
    }
}
