
import java.util.*;

public class ParkourDesign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            if (x >= 2 * y && (x - 2 * y) % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}