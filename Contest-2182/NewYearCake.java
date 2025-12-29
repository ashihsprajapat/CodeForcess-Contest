
import java.util.Scanner;

public class NewYearCake {
    public static int backtracking(int a, int b, int ley, int c, boolean isina) {
        // bc

        if (isina) {
            if (b >= ley)
                return backtracking(a, b - ley, ley * 2, c + 1, false);

        } else {
            if (a >= ley)
                return backtracking(a - ley, b, ley * 2, c + 1, true);
        }
        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = backtracking(a - 1, b, 2, 1, true);
            ans = Math.max(ans, backtracking(a, b - 1, 2, 1, false));
            System.out.println(ans);
        }
    }
}
