import Task1.Bankomat;
import TASK2.Line;
import TASK2.Point;
import Task3.Drib;
import Checkers.*;
import java.util.Scanner;

public class Main {

    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Java Lab 2 ");
        int task=2;
        switch(task) {
            case 1: {
                System.out.println("Створити клас Bankomat. " +
                        "\nВ класі повинні міститися поля для зберігання ідентифікаційного номера банкомату, " +
                        "\nінформації про поточну суму грошей, що є в банкоматі, мінімальної та максимальної сумах," +
                        "\nякі можна зняти клієнту за один день. Реалізувати метод ініціалізації банкомата, " +
                        "\nметод завантаження купюр в банкомат та метод зняття певної суми грошей. " +
                        "\nМетод зняття повинне виконувати перевірну на коректність суми, що знімається\n");

                Scanner input=new Scanner(System.in);
                Bankomat bankomat1 = Bankomat.getBankomat();//1, 1000, 20, 500, 5000
                System.out.println(bankomat1);

                System.out.println("\nEnter amount of money to load");
                int amountOfMoney=positive.getPositiveInteger();
                bankomat1.loadMoney(amountOfMoney); //500
                System.out.println("\nAfter load money:" + bankomat1);


                boolean success = false; //250
                while(!success){
                    System.out.println("\nEnter amount of money to withdraw");
                    amountOfMoney=positive.getPositiveInteger();
                    success = bankomat1.withdrawMoney(amountOfMoney); //250
                    System.out.println("\nCan you withdraw? " + success+ "=> enter less money");
                }
                if (success) {
                    System.out.println("\nAfter withdraw:" + bankomat1);
                }


                Bankomat bankomat2 = Bankomat.getBankomat();//2, 500, 20, 500, 5000
                System.out.println(bankomat2);


                System.out.println(Bankomat.getTotalBalance());
                System.out.println(Bankomat.getTotalWithdrawals());


                System.out.println("\nEnter bankomats to check wheter they are equals\n");
                System.out.println("OBJECT");
                Bankomat obj = Bankomat.getBankomat();
                System.out.println("Id= "+ obj.getId()+ " Balance= "+ obj.getBalance()+ " Mim withdraw= " + obj.getMinWithdrawal() + " Max withdraw =" + obj.getMaxWithdrawal() +" Daily limit= "+ obj.getDailyLimit());

                System.out.println("OBJECT1");
                Bankomat obj1 = Bankomat.getBankomat();
                System.out.println("Id= "+ obj.getId()+ " Balance= "+ obj1.getBalance()+ " Mim withdraw= " + obj1.getMinWithdrawal() + " Max withdraw =" + obj1.getMaxWithdrawal() +" Daily limit= "+ obj1.getDailyLimit() );

                if (obj.equals(obj1))
                {
                    System.out.println("\nObject equals object1 by min withdrawal, max withdrawal, daily limit");
                    System.out.println("obj1: "+ obj.toString());
                }
                input.close();
                break;
            }
            case 2:{
                System.out.println("Клас «пряма на координатній площині»:\n" +
                        "-пряма задається трьома числами (a,b,c) у рівнянні ax + by + c = 0;\n" +
                        "-існує метод для визначення, чи належить точка (x,y) прямій;\n" +
                        "-існує метод для визначення координат (x,y) точки перетину з іншою прямою.\n");

                System.out.println("Enter line1:");
                Line line1 = Line.getLine();
                System.out.println("\nYour line: " + line1);

                System.out.println("\nEnter point to check whether it belongs to line\n");
                Point point = Point.getPoint();
                System.out.println("Your point:" +point);

                boolean bel = line1.PointBelongToLine(point.getX(), point.getY());
                String belong = "";
                if(bel) {
                    belong= " belong ";
                }
                else {
                    belong = " doesn't belong ";
                }
                System.out.println("\nPoint "+point +belong+" to line "+ line1);

                System.out.println("\nEnter second line to check their intersectin\n");
                Line line2=Line.getLine();

                Point intersectionPoint = line1.intersectionOfLines(line2.getA(), line2.getB(), line2.getC());
                if (intersectionPoint != null) {
                    System.out.println("\nPoint of intersection: (" + intersectionPoint.getX() + ", " + intersectionPoint.getX() + " )");
                } else {
                    System.out.println("\nThe lines don't intersect.");
                }
                break;
            }
            case 3:{
                System.out.println("Створити клас Drib, у якому реалізувати додавання, віднімання множення, " +
                        "\nділення і скорочення простих дробів.Результат завжди повинен бути нескоротним. " +
                        "\nНа вхід програма отримує 4 цілих числа (чисельник і знаменник першого і другого дробів).\n");
                Drib drib1 = new Drib(8, 16);
                Drib drib2 = new Drib(3, 12);
                Drib drib3 = new Drib(1, 4);

                System.out.println("\nOperations on numbers:");

                System.out.println("\nOperation '+'");
                Drib sum = drib1.add(drib2).add(drib3);
                System.out.println(drib1 + " + " + drib2 + " + " + drib3 + " = " + sum);

                System.out.println("Operation '-'");
                Drib difference = drib1.subtract(drib2);
                System.out.println(drib1 + " - " + drib2 + " = " + difference);

                System.out.println("Operation '*'");
                Drib product = drib1.multiply(drib2);
                System.out.println(drib1 + " * " + drib2 + " = " + product);

                System.out.println("Operation '/'");
                Drib quotient = drib1.divide(drib2);
                System.out.println(drib1 + " / " + drib2 + " = " + quotient);
            }
        }

    }
}
