
import java.util.*;

public class EItAllWentSideways {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = 0;

            for (int i = n - 1; i >= 0; i--) {
                int c = 0;
                int curr = arr[i] - 1;
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] > curr) {
                        c += arr[j] - curr;
                    }
                }
                ans = Math.max(ans, c);
                c = 0;
                curr = arr[i];
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] > curr) {
                        c += arr[j] - curr;
                    }
                }
                ans = Math.max(ans, c);
            }
            System.out.println(ans);
        }
    }
}