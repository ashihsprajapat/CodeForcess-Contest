
import java.util.Scanner;

public class NikosTacticalCards {

    public static void backTracking(int n, int a[], int b[], int i, int curr, int ans[]) {
        // bc
        if (i == n) {
            ans[0] = Math.max(ans[0], curr);
            return;
        }

        backTracking(n, a, b, i + 1, curr - a[i], ans);
        backTracking(n, a, b, i + 1, b[i] - curr, ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            int ans[] = { 0 };
            backTracking(n, a, b, 0, 0, ans);
            System.out.println(ans[0]);
        }
    }
}
