package Task1;

import java.util.Scanner;
import Checkers.*;
public class Bankomat {
    private int id;
    private int balance;
    private int minWithdrawal;
    private int maxWithdrawal;
    private int dailyLimit;

    private static int totalBalance;
    private static int totalWithdrawals;
    static Scanner input=new Scanner(System.in);

    public Bankomat(int id, int balance, int minWithdrawal, int maxWithdrawal, int dailyLimit) {
        this.id = id;
        this.balance = balance;
        this.minWithdrawal = minWithdrawal;
        this.maxWithdrawal = maxWithdrawal;
        this.dailyLimit = dailyLimit;
        totalBalance += balance;
    }


    public void loadMoney(int amountOfMoney) {
        balance += amountOfMoney;
        totalBalance += amountOfMoney;
    }

    public boolean withdrawMoney(int amountOfMoney) {
         if (amountOfMoney > minWithdrawal && amountOfMoney < maxWithdrawal && amountOfMoney < balance && amountOfMoney < dailyLimit) {
            balance -= amountOfMoney;
            totalBalance -= amountOfMoney;
            totalWithdrawals += amountOfMoney;
            return true;
        }
         else return false;
    }
    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public int getMinWithdrawal() {
        return minWithdrawal;
    }

    public int getMaxWithdrawal() {
        return maxWithdrawal;
    }

    public int getDailyLimit() {
        return dailyLimit;
    }

    public static int getTotalBalance() {
        System.out.print("\nTotal balance of bankomats= ");
        return  totalBalance;
    }

    public static int getTotalWithdrawals() {
        System.out.print("\nTotal withdrawals of bankomats= ");
        return totalWithdrawals;
    }

    public static Bankomat getBankomat(){
        System.out.println("\nEnter id of bankomat:");
        int id= positive.getPositiveInteger();
        System.out.println("Enter balance");
        int balance = positive.getPositiveInteger();
        System.out.println("Enter minimum withdrawal");
        int minWithdrawal = positive.getPositiveInteger();
        System.out.println("Enter miximum withdrawal");
        int maxWithdrawal = positive.getPositiveInteger();
        System.out.println("Enter daily limit");
        int dailyLimit = positive.getPositiveInteger();
        return new Bankomat(id ,balance , minWithdrawal ,maxWithdrawal , dailyLimit);
    }


    @Override
    public String toString() {
        String s;
        s="\nBankomat #" + id + "\n  balance= " + balance + "\n  minimal withdrawal= " + minWithdrawal
                + "\n  maximum withdrawal= " + maxWithdrawal + "\n  daily limit= " + dailyLimit;
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        boolean b = false;
        if ( obj instanceof Bankomat ) {
            Bankomat obj1 = (Bankomat) obj;
            if ( minWithdrawal==obj1.getMinWithdrawal() && maxWithdrawal==obj1.maxWithdrawal&& dailyLimit==obj1.getDailyLimit())
                b = true;
            }
        return b;
    }
}











