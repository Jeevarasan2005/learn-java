star.java program
public class star {
    public static void main(String[] args) {
        int n = 5; 

        for (int row = 1; row <= n; row++) {
            
            for (int col = 1; col <= n - row; col++) {
                System.out.print("_");
            }

           
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
