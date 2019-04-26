package com.daria.javacore.chapter06;

public class Box4 {
    double width;
    double height;
    double depth;

    Box4() {
        System.out.println("Конструирование объекта Box4");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo6 {
    public static void main(String args[]) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();
        double vol;
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}

