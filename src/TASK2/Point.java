package TASK2;

import Checkers.onlyNumbers;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point getPoint(){
        System.out.print("Input x: ");
        double x = onlyNumbers.getDouble();
        System.out.print("Input y: ");
        double y = onlyNumbers.getDouble();
        return new Point(x, y);
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        String s;
        s= "( " +x+" ," +y+" )";
        return s;
    }

}
