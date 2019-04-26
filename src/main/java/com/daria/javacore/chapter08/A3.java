package com.daria.javacore.chapter08;

public class A3 {
    int i;
}

class B3 extends A3 {
    int i;

    B3(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + i);
    }
}

class UseSuper {
    public static void main(String args[]) {
        B3 subOb = new B3(1, 2);
        subOb.show();
    }
}
