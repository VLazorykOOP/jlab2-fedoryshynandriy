package Checkers;

import java.util.Scanner;

public class onlyNumbers {
    static Scanner input=new Scanner(System.in);
    public static int getInput(){
        while (!input.hasNextInt()){
            System.out.println("Enter an integer");
            input.next();
        }
        int a = input.nextInt();
        return a;
    }
}
