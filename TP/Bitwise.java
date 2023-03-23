package TP;
public class Bitwise {
    public static void main(String[] args) {
        int a = 0b00001100;
        int b = 0b01111010;
        int c = a&b;
        System.out.println(Integer.toString(c,2));      // Convert c to binary
        System.out.println(c);              // Show as normal number decemal
        c = a|b;
        System.out.println(Integer.toString(c,2));  
        c = a^b;
        System.out.println(Integer.toString(c,2));  
        c = a+1;
        System.out.println(Integer.toString(c,2));  
        
        //int d = a>b?a:b;
        int d;
        if (a>b) d=a;
        else d=b;
        System.out.printf("a=%d, b=%d; d=%d", a, b, d);
        String s = b>d?"Greater":(b>d)?":Less":"Equal";
        System.out.println(s);

    }
    
}
