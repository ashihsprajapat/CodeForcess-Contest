
import java.util.Scanner;

public class WishingCards {

    public static void backtracking(int k, int a[], int i, int curr, int ans[], int max) {
        // bc
        if (i == a.length) {
            ans[0] = Math.max(ans[0], curr);
            return;
        }

        if (a[i] > 0) {
            backtracking(k >= a[i] ? k - a[i] : 0, a, i + 1, k >= a[i] ? curr + a[i] : curr + k, ans,
                    Math.max(max, a[i]));
        }
        backtracking(k, a, i + 1, curr + max, ans, max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();

            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int ans[] = { 0 };
            backtracking(k, a, 0, 0, ans, 0);
            System.out.println(ans[0]);
        }
    }
}
