import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        System.out.print("""
                ------------------------------------------
                1
                ------------------------------------------
                """);
        System.out.print("Input your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");

        // 2
        System.out.print("""
                ------------------------------------------
                2
                ------------------------------------------
                """);
        float width;
        float height;

        System.out.println("Promgram for calculating perimeter and surface of a rectangle.");
        System.out.print("Please input width (in meter): ");
        width = sc.nextFloat();
        System.out.print("Please input height (in meter): ");
        height = sc.nextFloat();

        float perimeter = (width + height)*2;
        float surface = width*height;

        System.out.printf("Perimeter = (%.2f + %.2f) x 2 = %.2fm\n", width, height, perimeter);
        System.out.printf("Surface = %.2f x %.2f = %.2f m^2\n", width, height, surface);

        // 3
        System.out.print("""
            ------------------------------------------
            3
            ------------------------------------------
            """);
        System.out.println("Program for calculating equating 1/x = 1/y + 1/z");
        System.out.print("Please input y: ");
        float y = sc.nextFloat();
        System.out.print("Please input z: ");
        float  z= sc.nextFloat();
        float x = (z*y)/(z+y);
        System.out.println("Result x = " + x);

        // 4
        System.out.print("""
            ------------------------------------------
            4
            ------------------------------------------
            """);
        System.out.println("Program for counting the number of hundreds.");
        System.out.print("Please input a positive number: ");
        int number = sc.nextInt();
        System.out.println("\nThere are " + number/100 + " hundreds in number " + number + ".");

        // 5
        System.out.print("""
            ------------------------------------------
            5
            ------------------------------------------
            """);
        System.out.println("Program for guessing your luckiness.");
        System.out.print("Please input a positive number: ");
        int lucknumber = sc.nextInt();
        System.out.printf("\nI got %s. I am luckier.\n", lucknumber + 1);
        System.out.println("------------------------------------------");
    }
}
