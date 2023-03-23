public class Main {
    public static void main(String[] args) {
        System.out.print("Hello, world!");
        System.out.println("Hello, world!");
        System.out.printf("\n %25s", "Line break.");

        String cp = "Hello";
        boolean cp1 = cp == "Hello" ;
        if(cp1) {
            System.out.println("\nWork");
        }

        System.out.println("\\n                Line break.\n"
        + "\\t                Tabulation.\n"
        + "\\\'              Single Quote.\n"
        +"\\\"              Double Quote.\n"
        +"\\\\                  \\   Sign.\n"
        +"\\\\\\\\                 \\\\ Sign.\n"
        +"//              Line Comment.\n"
        +"/* ... */      Block Comment.\n"
        +"\"\"\"                        \n"
        +"                  Text Block.\n"
        +"\"\"\" ");

        System.out.println( """
            Hello
            My name is វ៉េន​ ​ដារ៉ា.
            I am 18 years old.
                """);
        
        //Ternery operater
        int year = 18;               //if             //else
        String result = (year<18) ? "Cann't vote" : "can vote";
        System.out.println(result);

    }
}
