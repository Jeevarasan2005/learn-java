import java.util.Scanner;

public class chartolow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            char c = a[i];
                      if (c >= 'A' && c <= 'Z') {
                a[i] = (char)(c + 32);
            }
        }
        System.out.println("Lowercase string: " + new String(a));
    }
}
