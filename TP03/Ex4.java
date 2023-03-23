import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
            ------------------------------------------
            Ex4
            ------------------------------------------
            """);
        System.out.print("""
            Program for convert money in Reils to Dollars:
            Conversion rate is: 1 USD = 4000 RIELS
            """);
        System.out.print("Please input money in Riels: ");
        int reils = sc.nextInt();
        double dollars = reils/4000.00;
        System.out.printf("%d Reils = %.2f USD\n",reils, dollars);
        System.out.println("------------------------------------------");
    }
}
