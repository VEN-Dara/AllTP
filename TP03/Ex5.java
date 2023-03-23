import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        double traJam;
        double aveSpeed = 30; //Km/h
        double time;


        Scanner sc = new Scanner(System.in);
        Ex1 ex1 = new Ex1();

        System.out.print("""
            ------------------------------------------
            Ex5
            ------------------------------------------
            """);
        System.out.print("Program for calculating duration of travel from ITC to Airport.");
        System.out.print("\nPlease input traffic jam factor (in percentage [0-100]): ");
        traJam = sc.nextDouble();
        traJam = 100.00 - traJam;
        aveSpeed = traJam/100.00*aveSpeed;
        time = 7.00*3600.00/aveSpeed;
        int ss = (int)time;

        System.out.print("\nTravelling Duration = ");
        ex1.secondsToTime(ss);
        System.out.println("------------------------------------------");

    }
    
}
