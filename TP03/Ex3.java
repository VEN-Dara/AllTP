import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int hh1, mm1, ss1, tss1;
        int hh2, mm2, ss2, tss2;
        int hh, mm, ss;
        double cost;
        Scanner sc = new Scanner(System.in);
        Ex2 ex2 = new Ex2();

        System.out.print("""
            ------------------------------------------
            Ex3
            ------------------------------------------
            """);
        System.out.println("Program for calculating cost of a call.");
        System.out.print("Please input start hours: "); hh1 = sc.nextInt();
        System.out.print("Please input start minutes: "); mm1 = sc.nextInt();
        System.out.print("Please input start seconds: "); ss1 = sc.nextInt();
        System.out.println();
        System.out.print("Please input end hours: "); hh2 = sc.nextInt();
        System.out.print("Please input end minutes: "); mm2 = sc.nextInt();
        System.out.print("Please input end seconds: "); ss2 = sc.nextInt();

        ss1 = ex2.timeToSeconds(hh1, mm1, ss1);
        ss2 = ex2.timeToSeconds(hh2, mm2, ss2);
        ss = ss2 - ss1;
        cost = ss*(0.05/60);
        mm = ss/60;
        hh = mm/60;
        mm = mm%60;
        ss = ss%60;
        
        System.out.printf("\nTotal call duration: %dh %dmn %ds\n",hh,mm,ss);
        System.out.printf("Total cost of this call: %.4f$\n", cost);
        System.out.println("------------------------------------------");

    }
}
