package TASK2;

import Checkers.onlyNumbers;

import java.util.Scanner;

public class Line {
    //ax + by + c = 0
    private double a;
    private double b;
    private double c;

    public Line(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Line getLine(){
        Scanner input=new Scanner(System.in);
        System.out.println("\nInput a: ");
        double a = onlyNumbers.getDouble();
        System.out.println("Input b: ");
        double b = onlyNumbers.getDouble();
        System.out.println("Input b: ");
        double c = onlyNumbers.getDouble();

        return new Line(a, b, c);
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public boolean PointBelongToLine(double x, double y) {
        return a * x + b * y + c == 0;
    }
    public Point intersectionOfLines(double a2, double b2, double c2) {    //методом крамера
        double determinant = a * b2 - a2 * b;
        if (determinant == 0) {
            return null;
        } else {
            double x = (b * c2 - b2 * c ) / determinant;
            double y = (a2 * c - a * c2 ) / determinant;
            return new Point(x, y);
        }
    }

    public String toString() {
        String s=" ";
        if(a%1==0 && b%1==0 && c%1==0){
            if(b>=0 && c>=0) {
                s = (int) a + "x +" + (int) b + "y +" + (int) c + " = 0;";
            }
            else if (b<0 && c<0){
                s = (int) a + "x " + (int) b + "y " + (int) c + " = 0;";
            }
            else if (b<0 && c>0){
                s = (int) a + "x " + (int) b + "y +" + (int) c + " = 0;";
            }
            else if (b>0 && c<0){
                s = (int) a + "x +" + (int) b + "y " + (int) c + " = 0;";
            }

        }
        else{
            if(b>=0 && c>=0) {
                s =  a + "x +" +  b + "y +" +  c + " = 0;";
            }
            else if (b<0 && c<0){
                s =  a + "x " + b + "y " +  c + " = 0;";
            }
            else if (b<0 && c>0){
                s =  a + "x " +  b + "y +" +  c + " = 0;";
            }
            else if (b>0 && c<0){
                s =  a + "x +" +  b + "y " +  c + " = 0;";
            }
        }
        return s;
    }
}

