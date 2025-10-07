import java.util.Scanner;

public class todarry {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = kbd.nextInt();

        System.out.print("Enter number of columns: ");
        int col = kbd.nextInt();
        int[][] a = new int[row][col];
        System.out.println("Enter elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = kbd.nextInt();
            }
        }

        if (col > 3) {
            System.out.println("Element at a[0][3]: " + a[0][3]);
        } else {
            System.out.println("Column 4 doesn't exist in row 0.");
        }
        System.out.println("Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); 
        }

        kbd.close();
    }
}
