import java.util.Scanner;
import java.util.Arrays;

public class insertarr {
    public static void main(String[] args) {
        Scanner js = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = js.nextInt();

        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = js.nextInt();
        }

        
