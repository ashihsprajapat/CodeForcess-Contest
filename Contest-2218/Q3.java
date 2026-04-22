import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> res = new ArrayList<>();

            int left = 1;
            int right = 3 * n;

            for (int i = 0; i < n; i++) {
                res.add(right - 1); // median (important)
                res.add(left); // small
                res.add(right); // large

                left++;
                right -= 2;
            }

            for (int x : res) {
                System.out.print(x + " ");
            }
            System.out.println();

        }
    }
}
