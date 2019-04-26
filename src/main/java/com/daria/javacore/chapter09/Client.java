package com.daria.javacore.chapter09;

class Client implements Callback {
    public void callback(int p) {
        System.out.println("Метод callback, вызванный со значением " + p);
    }
    void nonIfaceMeth() {
        System.out.println("Классы, которые реализуют интерфейсы" +
                "могут определять также и другие члены.");
    }
}

class TestIface {
    public static void main(String args[]) {
        Callback c = new Client();
        c.callback(42);
    }
}