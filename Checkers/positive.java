package Checkers;
import static Checkers.onlyNumbers.*;
public class positive {
    public static int getPositiveInteger(){
        int positve = -3;
        while(positve<0){
            positve= getInput();
            System.out.println("Enter a positive integer");
        }
        return positve;
    }
}
