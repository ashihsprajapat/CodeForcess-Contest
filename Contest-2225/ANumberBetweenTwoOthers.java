
import java.util.*;

public class ANumberBetweenTwoOthers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            boolean find = false;
            for (long i = 2 * x; i < y; i += x) {
                if (i % x == 0 && y % i != 0) {
                    find = true;
                    break;
                }

            }
            System.out.println(find ? "Yes" : "No");
        }
    }
}