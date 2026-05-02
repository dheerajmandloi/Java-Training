public class Patterns1 {
    public static void main(String [] args) {
      int ch = 65; // ASCII 'A'

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {

                // Conditions for printing characters
                if ((i == 1 && j == 5) ||                 // A
                    (i == 2 && (j == 1 || j == 5 || j == 9)) || // C B D
                    (i == 3 && j == 9) ||                 // E
                    (i == 4 && (j == 1 || j == 5 || j == 9)) || // F G H
                    (i == 5 && j == 9)) {                 // I
                    
                    System.out.print((char)(ch++) + " ");
                } else {
                    System.out.print("  "); // spaces
                }
            }
            System.out.println();
        }
    }
}

//Home work 
//Holo rectangle 
//Holo diamond

