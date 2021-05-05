package kz.rauan.bigONotation;

public class SpaceComplexity2 {
    static int pairSumSequence(int n) {
        int sum = 0;
        for (int i= 0; i < n; i++) {
            sum+= pairSum(i, i + 1);
        }
        return sum;
    }

    static int pairSum(int a, int b) {
        return a + b;
    }
}
