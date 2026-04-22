
import java.util.Scanner;

public class DiceRollSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0, p = -1, k = 0;

            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                int c = Math.min(val, 7 - val);
                if (c == p)
                    k++;
                else {
                    ans += k / 2;
                    k = 1;
                    p = c;
                }
            }
            ans += k / 2;
            System.out.println(ans);
        }
    }
}
