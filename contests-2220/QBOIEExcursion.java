import java.util.HashSet;
import java.util.Scanner;

public class QBOIEExcursion {

    static boolean ans = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long m = sc.nextLong();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();

            HashSet<Long> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                long bad = (m - ((arr[i] + i + 1) % m)) % m;
                set.add(bad);
            }
            if (set.size() < m) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
