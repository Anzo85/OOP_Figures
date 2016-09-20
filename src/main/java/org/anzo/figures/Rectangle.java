package org.anzo.figures;


public class Rectangle implements Figures {
    private final String TYPE = "Rectangle";

    private int sideOne;
    private int sideTwo;

    public Rectangle(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public int getSideOne() {
        return sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public double area() {
        return sideOne * sideTwo;
    }

    public double perimeter() {
        return (sideOne + sideTwo) * 2;
    }

    @Override
    public String toString() {
        return TYPE + " " + " Area: " + area() + " " + " Perimeter " + perimeter();

    }

    @Override
    public boolean equals(Object obj) {
        Rectangle r = (Rectangle) obj;

        if (this.TYPE.equals(r.TYPE) && this.perimeter() == r.perimeter()) {
            return true;
        }
        return false;
    }
}
