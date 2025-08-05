package com.lib;

public class MathUtils {

    public int add(int a, int b) {
        return a + b;
    }

    // BC: subtract メソッド 削除 (ここには存在しない)

    public double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Divider cannot be zero");
        return a / b;
    }

    public long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative number");
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // BC: メソッド名変更 + 無意味な文追加
    public boolean checkPrime(int n) {
        int a = 1 + 1;  // 意味ない文
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    // Non-BC: 新規メソッド追加
    public int modulo(int a, int b) {
        return a % b;
    }

    // Non-BC: アクセス修飾子をprotectedからpublicに変更
    public int square(int x) {
        return x * x;
    }

    // Non-BC: final修飾子を追加
    public final int cube(int x) {
        return x * x * x;
    }

}
