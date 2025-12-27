
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int ans = 0;
            int awakt = 0;

            for (int i = 0; i < n; i++) {

                if (s.charAt(i) == '1') {
                    awakt = k;
                } else {
                    if (awakt == 0) {
                        ans++;
                    } else {
                        awakt--;
                    }
                }
            }

            System.out.println(ans);

        }
    }
}