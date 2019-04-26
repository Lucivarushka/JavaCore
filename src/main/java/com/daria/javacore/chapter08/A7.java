package com.daria.javacore.chapter08;

public class A7 {

    void callme() {
        System.out.println("В методе callme класса A");
    }

}

class B7 extends A7 {

    void callme() {
        System.out.println("В методе callme класса B");
    }

}

class C7 extends A7 {

    void callme() {
        System.out.println("В методе callme класса C");
    }

}

class Dispatch {
    public static void main(String args[]) {
        A7 a = new A7();
        B7 b = new B7();
        C7 c = new C7();
        A7 r;
        r = a;
        r.callme();
        r = b;
        r.callme();
        r = c;
        r.callme();
    }
}
