
import java.util.*;

public class TheEqualizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean pos = true;
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val % 2 == 0) {
                    pos = false;
                }
            }
            if (pos || (!pos && k % 2 == 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");   
            }

        }
    }
}