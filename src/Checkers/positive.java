package Checkers;
import static Checkers.onlyNumbers.*;
public class positive {
    public static int getPositiveInteger(){
        int positve = -3;
        while(positve<0){
            System.out.println("Enter a positive integer");
            positve= getInt();
        }
        return positve;
    }
    public static double getPositiveDouble(){
        double positve = -3.7;
        while(positve<0){
            System.out.println("Enter a positive double");
            positve= getDouble();
        }
        return positve;
    }
}
