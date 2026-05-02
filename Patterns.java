public class Patterns {
    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3(4);
        pattern4(3);
        
        pattern5(6);
        pattern6(5);
        pattern7();
    }
    static void pattern1()
    {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern3(int n)
    {
        for (int i = 1; i <= n; i++) {
            for(int k = 1; k <=n-i; k++) 
            {
                
                System.out.print(" ");
            }
                for (int j = 1; j <=i; j++) 
                {
                    System.out.print("*");
                }
            
            System.out.println();
        }
        System.out.println();
    }
      static void pattern4(int n)
    {

        for (int i = 1; i <= 2 * n - 1; i++) {

            if (i <= n) {

                for (int k = 1; k <= n - i; k++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

            } else {

                for (int k = 1; k <= i - n; k++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * (2 * n - i) - 1; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }    
    }
    static void pattern5(int n) 
    {
        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= 2 * n; j++) {

                if (j == i || j == 2 * n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern6(int n) {

          for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
        
    }
    static void pattern7() {

        int rows = 5;
         for (int i = 1; i <= rows; i++) {

            // T
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            // A
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            // N
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            // U
            for (int j = 1; j <= 5; j++) {
                if ((j == 1 || j == 5) && i != 5 || (i == 5 && j > 1 && j < 5)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        
    }
}
}

//J: no. of items to placed of ith row 

