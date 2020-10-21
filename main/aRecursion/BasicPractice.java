package aRecursion;

public class BasicPractice {
    // ��ӡ����
    public static void print(int n) {
        if (n > 2) {
            print(n - 1);
        }
        System.out.println("n = " + n);
    }

    // �׳�
    public static int factorial(int n) {
        if (n == 1) return 1;
        return factorial(n - 1) * n;
    }

    public static void main(String[] args) {
        // print(5);
        System.out.println(factorial(5));
    }
}
