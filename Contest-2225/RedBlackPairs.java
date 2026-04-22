import java.util.Scanner;

public class RedBlackPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String row1 = sc.next();
            String row2 = sc.next();

            int ans = 0;
            for (int i = 0; i < n; i++) {

                // vertical cost
                int vertical = (row1.charAt(i) == row2.charAt(i)) ? 0 : 1;

                // horizontal possible
                if (i < n - 1) {
                    int h1 = (row1.charAt(i) == row1.charAt(i + 1)) ? 0 : 1;
                    int h2 = (row2.charAt(i) == row2.charAt(i + 1)) ? 0 : 1;

                    if (h1 + h2 < vertical) {
                        ans += h1 + h2;
                        i++; // skip next column
                        continue;
                    }
                }

                ans += vertical;
            }

            System.out.println(ans);
        }
    }

}
