import java.util.Scanner;

public class Ex2 {

    public int timeToSeconds(int hh, int mm,int ss) {
        return hh*3600 + mm*60 + ss;
    }
    public static void main(String[] args) {
        int hh, mm, ss, ttSeconds;
        Scanner sc = new Scanner(System.in);
        Ex2 ex2 = new Ex2();
        
        System.out.print("""
            ------------------------------------------
            Ex2
            ------------------------------------------
            """);
        System.out.println("Program for converting time to seconds.");
        System.out.print("Please input hours: "); hh = sc.nextInt();
        System.out.print("Please input minutes: "); mm = sc.nextInt();
        System.out.print("Please input seconds: "); ss = sc.nextInt();
        ttSeconds = ex2.timeToSeconds(hh,mm,ss);
        System.out.printf("\nNumber of seconds = %dx3600 + %dx60 + %d = %d\n", hh, mm, ss, ttSeconds);
        System.out.println("------------------------------------------");

    }
}
