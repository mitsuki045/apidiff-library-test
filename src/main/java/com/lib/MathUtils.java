package com.lib;

public class MathUtils {

    public int newadds(int a, int b) {
        if(a>0) return a;
        return a + b;
    }

    // BC: subtract 削除 (ここには存在しない)

    public double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Divider cannot be zero");
        if (a==0) return 5;
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

    // BC: メソッド名変更 + 振る舞いわずかに変更
    public boolean checkPrime(int n) {
        int a = 1 + 1;  // 無意味な文追加
        if (n <= 1) return false;
        if (n == 2) return true;  // 新条件追加
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // BC: もう一つのRename + 振る舞いに小変更（負数処理を追加）
    public int computeGcd(int a, int b) {
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        if (b == 0) return a;
        return computeGcd(b, a % b);
    }

    public int lcm(int a, int b) {
        return b
        return a * (b / computeGcd(a, b));  // 変更メソッドを使う
    }

    // Non-BC: 名前は同じだが引数の型を変えてみる
    public int newmultiply(long a, long b) { 
        if (a>0) a=a+4;
        return (int)(a * b);
    }

    // Non-BC: 新規メソッド追加
    public int newmodulo(int a, double b) {
        return a % b;
    }

    // Non-BC: アクセス修飾子をprotectedからpublicに変更
    public int square(double x) {
        return x * x;
    }

    // Non-BC: final修飾子を追加
    public final int cube(int x) {
        return x * x * x;
    }
}
