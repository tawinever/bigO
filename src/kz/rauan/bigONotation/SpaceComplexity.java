package kz.rauan.bigONotation;

public class SpaceComplexity {

    static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1 -> 15: " + sum(15));
    }
}
