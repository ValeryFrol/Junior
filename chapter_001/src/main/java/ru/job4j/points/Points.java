package ru.job4j.points;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Points {
    private int x;
    private int y;
    private double distance;

    public Points(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void distanceTo(Points that) {
        Points a = this;
        Points b = that;
        this.distance = sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2));


    }

    public double getLength() {
        return distance;
    }
}
