package com.daria.javacore.chapter08;

public class A4 {
    A4() {
        System.out.println("Внутри конструктора A.");
    }
}

class B4 extends A4 {
    B4() {
        System.out.println("Внутри конструктора B.");
    }
}

class C extends B4 {
    C() {
        System.out.println("Внутри конструктора C.");
    }
}

class CallingCons {
    public static void main(String args[]) {
        C c = new C();
    }
}
