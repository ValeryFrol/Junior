package ru.job4j.points;

public class Main {

    public static void main(String[] args) {
        Points a = new Points(1, 1);
        Points b = new Points(4, 5);
        a.distanceTo(b);
        System.out.println(a.getLength());
    }
}
