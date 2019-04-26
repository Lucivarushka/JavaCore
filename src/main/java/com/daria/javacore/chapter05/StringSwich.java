package com.daria.javacore.chapter05;

public class StringSwich {
    public static void main(String[] args) {
        String str = "два";
        switch (str) {
            case "один":
                System.out.println("oдин");
                break;
            case "два":
                System.out.println("двa");
                break;
            case "три":
                System.out.println("тpи");
                break;
            default:
                System.out.println("не совпало)");
                break;
        }
    }
}
