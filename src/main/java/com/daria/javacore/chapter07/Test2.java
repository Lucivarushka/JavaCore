package com.daria.javacore.chapter07;

public class Test2 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

class CallByValue {
    public static void main(String args[]) {
        Test2 ob = new Test2();
        int a = 15, b = 20;
        System.out.println("a и b перед вызовом: " +
                a + " " + b);
        ob.meth(a, b);
        System.out.println("a и b после вызова: " +
                a + " " + b);
    }
}
