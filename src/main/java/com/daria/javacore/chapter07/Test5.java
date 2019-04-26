package com.daria.javacore.chapter07;

public class Test5 {
    int a;
    public int b;
    private int c;

    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

class AccessTest {
    public static void main(String args[]) {
        Test5 ob = new Test5();
        ob.a = 10;
        ob.b = 20;

// Этот оператор неверен и может вызвать ошибку
// ob.c = 100; // Ошибка!
// Доступ к объекту c должен осуществляться посредством методов его класса

        ob.setc(100);
        System.out.println("a, b, и c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
