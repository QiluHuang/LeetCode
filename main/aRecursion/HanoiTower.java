package aRecursion;

public class HanoiTower {
    public static void movePlate(int nums, char A, char B, char C) {
        if (nums > 0) {
            movePlate(nums - 1, A, C, B); // A�������������Ƶ�B�ϣ�������C
            System.out.println(A + " -> " + C);  // A��ʣ�����һ���Ƶ�C��
            movePlate(nums - 1,B, A, C);  // B�������������Ƶ�C�ϣ�������A
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
