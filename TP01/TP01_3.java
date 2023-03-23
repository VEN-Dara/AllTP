public class TP01_3 {
    public static void main(String[] args) {

        System.out.println("--------------------------------------");
        System.out.println("A.");
        System.out.println("--------------------------------------");
        for(int i=0; i<6; i++) {
            for(int j=0; j<25; j++) {
                if(i==0 || i==5) {
                    System.out.print("*");
                }
                else {
                    if(j==0 || j==24) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        //B.
        System.out.println("--------------------------------------");
        System.out.println("B.");
        System.out.println("--------------------------------------");

        for(int i=0; i<5; i++) {
            for(int j=0; j<9; j++) {
                if(j < 4-i) {
                    System.out.print(" ");
                }
                else if(j <= 4+i) {
                    System.out.print("*");
                }
                else {
                    break;
                }

            }
            System.out.println();
        }
    
        //C.
        System.out.println("--------------------------------------");
        System.out.println("C.");
        System.out.println("--------------------------------------");
        
        for(int i=0; i<5; i++) {
            for(int j=0; j<(2*i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //D.
        System.out.println("--------------------------------------");
        System.out.println("D.");
        System.out.println("--------------------------------------");
        
        for(int i=0; i<5; i++) {
            for(int j=9; j>0; j--) {
                if(j>(2*i+1)) {
                    System.out.print(" ");
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        //E.
        System.out.println("--------------------------------------");
        System.out.println("E.");
        System.out.println("--------------------------------------");
        
        for(int i=0; i<5; i++) {
            for(int j=9; j>0; j--) {
                if(j>(2*i+1) || j>(9-2*i)) {
                    System.out.print(" ");
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        
        //F.
        System.out.println("--------------------------------------");
        System.out.println("F.");
        System.out.println("--------------------------------------");
        
        for(int i=0; i<5; i++) {
            for(int j=0; j<9; j++) {
                if(j<4-i || j<i) {
                    System.out.print(" ");
                }
                else if(j <= 4+i && j<=8-i) {
                    System.out.print("*");
                }
                else {
                    break;
                }
            }
            System.out.println();
        }

        //G.
        System.out.println("--------------------------------------");
        System.out.println("G.");
        System.out.println("--------------------------------------");
        
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(j<i && j<4-i) {
                    System.out.print(" ");
                }
                else if(j<5-i || j<i+1) {
                    System.out.print("*");
                }
                else {
                    break;
                }

            }
            System.out.println();
        }

        //H.
        System.out.println("--------------------------------------");
        System.out.println("H.");
        System.out.println("--------------------------------------");
        int w = 41;          //Weight
        int h = (w+1)/2;    //Height
        int spaceOut = 0;
        int spaceIn = 0;
        // spaceOut = (w-1)/2 - 2i
        // spaceIN = T(w-2)  ... 1st: 4i-1

        for(int i=0; i<h; i++) {
            if(i <= (h-1)/2) {
                spaceOut = (w-1)/2 - 2*i;
                spaceIn = 4*i-1;
            }
            else {
                spaceOut += 2;
                spaceIn -= 4;
            }
            for(int j=0; j<w; j++) {
                if (j==spaceOut || j==spaceIn+spaceOut+1) {     //Print * when j reach to the place that space stoped
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
