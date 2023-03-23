import java.util.Scanner;

public class TasksRunner {

    public void Menu() {
        System.out.println("""
            -------- Menu ---------
            1. Seconds to Time
            2. Time to Seconds
            3. Calling Cost
            4. Riels to Dollar
            5. Traveling Duration
            0. Exit""");
    }
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        TasksRunner tr = new TasksRunner();

        do {
            tr.Menu();
            System.out.print("Choose an option: ");
            option = sc.nextInt();
            switch(option) {
                case 1:
                    Ex1.main(args);
                    break;
                case 2:
                    Ex2.main(args);
                    break;
                case 3:
                    Ex3.main(args);
                    break;
                case 4:
                    Ex4.main(args);
                    break;
                case 5:
                    Ex5.main(args);
                    break;
                case 0:
                    System.out.println("Thanks for using our programs !\n");
                    break;
                default :
                    System.out.println("Option is not available !!");
                    break;
            }        
        }
        while(option != 0);
    }
    
}
