package TP04;

import java.util.Scanner;

public class Ex4 {
    public double amount;
    public Ex4(double amount) {
        this.amount = amount;
    }
    public double reilsToUsd() {
        double usd;
        usd = amount/4000.00;
        return usd;
    }
    public double bahtsToReils() {
        double riels;
        riels= amount/30.00*4000.00; 
        return riels;
    }
    public double usdToReils() {
        double riels;
        riels = 4000.00*amount;
        return riels;
    }
    public double usdToBaht() {
        double baht;
        baht = 30.00*amount;
        return baht;
    }
    public void menu() {
        System.out.print("""
            Welcome to program Money Exchanges!
            1. Riels to Dollar
            2. Riels to Thai Baht
            3. Dollar to Riels
            4. Dollar to Thai Baht
            5. Thai Baht to Riels
            6. Exit
                """);
    }
    public void moneyExchanges(int option) {
        double currency,amount;
        Scanner sc = new Scanner(System.in);
        Ex4 ex4;
        switch(option) {
            case 1:
                System.out.print("Input money in RIELS: ");
                amount = sc.nextDouble();
                ex4 = new Ex4(amount);
                currency = ex4.reilsToUsd();
                System.err.printf("\n%.0f REILS = %.2f USD\n", amount, currency);
                break;
            case 2:
                System.out.print("Input money in RIELS: ");
                amount = sc.nextDouble();
                ex4 = new Ex4(amount);
                currency = ex4.reilsToUsd();
                ex4 = new Ex4(currency);
                currency = ex4.usdToBaht();
                System.err.printf("\n%.0f REILS = %.2f BAHTs\n", amount, currency);
                break;
            case 3:
                System.out.print("Input money in USD: ");
                amount = sc.nextDouble();
                ex4 = new Ex4(amount);
                currency = ex4.usdToReils();
                System.err.printf("\n%.2f USD = %.0f REILS\n", amount, currency);
                break;
            case 4:
                System.out.print("Input money in USD: ");
                amount = sc.nextDouble();
                ex4 = new Ex4(amount);
                currency = ex4.usdToBaht();
                System.err.printf("\n%.2f USD = %.2f BAHTS\n", amount, currency);
                break;
            case 5:
                System.out.print("Input money in BAHTS: ");
                amount = sc.nextDouble();
                ex4 = new Ex4(amount);
                currency = ex4.bahtsToReils();
                System.err.printf("\n%.0f BAHTS = %.0f RIELS\n", amount, currency);
                break;
            default :
                System.out.println("Thanks for using our programs!");
        }
    }
    public static void main(String[] args) {
        int option;
        Ex4 ex4 = new Ex4(0);
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                --------------------------------------------------
                Ex4
                --------------------------------------------------
                """);
        ex4.menu();
        System.out.print("Choose an option: ");
        option = sc.nextInt();
        ex4.moneyExchanges(option);
        System.out.println("--------------------------------------------------");

    }
}
