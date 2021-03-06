package com.daria.javacore.chapter06;

public class Box5 {
    double width;
    double height;
    double depth;

    Box5(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String args[]) {
        Box5 mybox1 = new Box5(10, 20, 15);
        Box5 mybox2 = new Box5(3, 6, 9);
        double vol;
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
