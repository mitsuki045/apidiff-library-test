package com.client;
import com.lib.MathUtils;

public class ClientApp {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();

        System.out.println("Add: " + math.add(5, 3));
        System.out.println("Subtract: " + math.subtract(5, 3));  // ← 削除されるBC対象
        System.out.println("Multiply: " + math.multiply(5, 3));  // ← 削除された
        System.out.println("Divide: " + math.divide(10, 2));
        System.out.println("Factorial: " + math.factorial(5));
        System.out.println("Is Prime: " + math.isPrime(7));      // ← 名前変更でBC対象
        System.out.println("GCD: " + math.gcd(48, 18));
        System.out.println("LCM: " + math.lcm(12, 18));
        System.out.println("Square: " + math.square(4));
        System.out.println("Cube: " + math.cube(3));
    }
}
