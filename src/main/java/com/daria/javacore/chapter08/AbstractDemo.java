package com.daria.javacore.chapter08;

abstract class A8 {
    abstract void callme();

    void callmetoo() {
        System.out.println("Это конкретный метод.");
    }
}

class B8 extends A8 {
    void callme() {
        System.out.println("Реализация метода callme класса B.");
    }
}

class AbstractDemo {
    public static void main(String args[]) {
        B8 b = new B8();
        b.callme();
        b.callmetoo();
    }
}
