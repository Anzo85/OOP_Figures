package org.anzo.figures;


public class Main {
    public static void main(String[] args) {

        Figures[] set = new Figures[]{new Square(5), new Rectangle(4, 8), new Triangle(8, 12)};
        Main m1 = new Main();
        System.out.println(" Result is : " + m1.arrayResult(set));
        m1.PrintFigures(set);

    }

    public double arrayResult(Figures[] set) {

        double result = 0.0;
        for (Figures fugura : set) {

            result += fugura.area() + fugura.perimeter();
        }
        return result;
    }

    public void PrintFigures(Figures[] set) {
        System.out.println("######################################");
        System.out.println("  Printout of Figures : ");
        for (Figures exampele : set) {
            System.out.println(exampele);
        }
    }
}
