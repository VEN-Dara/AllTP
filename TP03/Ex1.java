import java.util.Scanner;

public class Ex1 {
    public void secondsToTime(int ss) {
        int hh, mm;
        mm = ss/60;
        hh = mm/60;
        mm = mm%60;
        ss = ss%60;
        System.out.printf("%02d:%02d:%02d\n", hh, mm, ss );
    }
    public static void main(String[] args) {
        int ss, hh, mm;
        Scanner sc = new Scanner(System.in);
        Ex1 ex1 = new Ex1();
        System.out.print("""
            ------------------------------------------
            Ex1
            ------------------------------------------
            """);
        System.out.print("\nInput the nummber of second: ");
        ss = sc.nextInt();
        
        System.out.print("Time corressponding to " + ss + "s is ");
        ex1.secondsToTime(ss);
        System.out.println("------------------------------------------");
    }
}