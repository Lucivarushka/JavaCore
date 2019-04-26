package com.daria.javacore.chapter09;

interface A1 {
    void meth1();
    void meth2();
}

interface B1 extends A1 {
    void meth3();
}

class MyClass implements B1 {
    public void meth1() {
        System.out.println("Реализация meth1().");
    }

    public void meth2() {
        System.out.println("Реализация meth2().");
    }

    public void meth3() {
        System.out.println("Реализация meth3().");
    }
}
class IFExtend {
    public static void main(String arg[]) {
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
