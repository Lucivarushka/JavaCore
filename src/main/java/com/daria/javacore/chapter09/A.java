package com.daria.javacore.chapter09;

public class A {
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

class NestedIFDemo {
    public static void main(String args[]) {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10))
            System.out.println("10 не является отрицательным");
        if (nif.isNotNegative(-12))
            System.out.println("это не будет отображаться");
    }
}
