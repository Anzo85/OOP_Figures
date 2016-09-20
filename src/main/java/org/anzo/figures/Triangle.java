package org.anzo.figures;


public class Triangle implements Figures {
    private final String TYPE = "Triangle";

    private double sideOne;
    private double sideTwo;
    private double sideThree = Math.sqrt(sideOne * sideOne + sideTwo * sideTwo);

    public Triangle(double sideOne, double sideTwo) {

        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public double area() {

        return (sideOne * sideTwo) * 0.5;
    }

    public double perimeter() {
        return sideOne + sideTwo + sideThree;
    }

    @Override
    public String toString() {
        return TYPE + " " + " Area: " + area() + " " + " Perimeter " + perimeter();
    }

    @Override
    public boolean equals(Object obj) {
        Triangle t = (Triangle) obj;

        if (this.TYPE.equals(t.TYPE) && this.perimeter() == t.perimeter()) {
            return true;
        }
        return false;
    }

}
