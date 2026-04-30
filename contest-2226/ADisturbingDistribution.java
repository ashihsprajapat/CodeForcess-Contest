import java.util.*;

public class ADisturbingDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long MOD = 676767677;

            long ans = 0;
            long ans2 = 1;

            for (int i = 0; i < n; i++) {
                ans = (ans + arr[i]) % MOD;
                ans2 = (ans2 * arr[i]) % MOD;
            }
            System.out.println(ans);
        }
    }
}