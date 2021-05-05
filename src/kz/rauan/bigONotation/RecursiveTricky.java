package kz.rauan.bigONotation;

public class RecursiveTricky {

    // Task 1
    int fu(int n) {
        if (n <= 1) return 1;
        return fu(n - 1) + fu(n - 1);
    }



    // Task 2

    static void permutation(String str) {
        permutation(str, "");
    }

    static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i= 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        permutation("abc");
    }

}
