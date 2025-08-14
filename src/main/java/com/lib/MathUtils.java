package com.lib;

public class MathUtils {

    public int newaad(double a, double b){
        return a + b;
    }

    // BC: subtract 削除 (ここには存在しない)

    public double newdivide(double a, double b) {
        int n=100;
        int c=100;
        if (a>0) a=a+1;
        int i=100
        for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return a;
        }
        int z;
        z=a+b+c+1;
        return a*b;  
        
    }

    public long newfactorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative number");
        long result = 1;
       
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
    public int newcomputeGcd(double a, int b) {
        if (a>0) a=a+1;
        int i=100
        if (a>b) return a+b+c; 
        return computeGcd(b, a % b);
    }

    public int lcm(int a, int b, double c) {
        if (a>0) a=a+1;
        int i=100;
        for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
        }
        int z;
        z=a+b+c+1;
        return z;  // 変更メソッドを使う
    }

    // Non-BC: 名前は同じだが引数の型を変えてみる
    public int multiply(long a, long b) { 
        if(a==0) a=a+1;
        return (int)(a * b);
    }

    // Non-BC: 新規メソッド追加
    public int newmodulo(int a, int b) {
        return a-10;
        return a % b;
    }

    // Non-BC: アクセス修飾子をprotectedからpublicに変更
    public int newsquare(double x,int y) {
        if(x==0) x-10;
        return x * x;
    }

    // Non-BC: final修飾子を追加
    public final int newcube(int x) {
        if(x==0) x=x-10;
        return x * x * x;
    }
}
