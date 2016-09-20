package org.anzo.figures;


public class Square implements Figures {
    private final String TYPE = "Square";

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return TYPE + " " + " Area: " + area() + " " + " Perimeter " + perimeter();
    }

    @Override
    public boolean equals(Object obj) {
        Square s = (Square) obj;

        if (this.TYPE.equals(s.TYPE) && this.perimeter() == s.perimeter()) {
            return true;
        }
        return false;
    }
}
