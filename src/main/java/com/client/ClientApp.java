package com.client;

import com.lib.MathUtils;

public class ClientApp {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();

        System.out.println("add(2,3): " + math.add(2, 3));
        
        // subtractは新バージョンで消えているのでここで呼ぶとエラーになる
        System.out.println("subtract(5,2): " + math.subtract(5, 2));

        System.out.println("divide(10, 2): " + math.divide(10, 2));
        System.out.println("factorial(5): " + math.factorial(5));
        System.out.println("isPrime(7): " + math.isPrime(7));
        System.out.println("gcd(12, 18): " + math.gcd(12, 18));
        System.out.println("lcm(12, 18): " + math.lcm(12, 18));
        System.out.println("square(4): " + math.square(4));
        System.out.println("cube(3): " + math.cube(3));
        System.out.println("modulo(10, 3): " + math.modulo(10, 3));  // 新バージョンで追加されたので呼べない

    }
}
