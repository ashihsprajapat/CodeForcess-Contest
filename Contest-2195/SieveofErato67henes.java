
import java.util.Scanner;

public class SieveofErato67henes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean has67 = false;
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val == 67)
                    has67 = true;
            }

            System.out.println(has67 ? "Yes" : "No");
        }
    }

}