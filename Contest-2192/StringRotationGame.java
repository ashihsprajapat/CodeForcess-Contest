import java.util.*;

public class StringRotationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int ans = 0;
            char pre = '@';
            boolean one = false;
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (i == 0) {
                    ans++;
                    pre = ch;
                    continue;
                }

                if (pre != ch) {
                    ans++;

                } else if (!one) {
                    ans++;
                    one = true;
                }
                pre = ch;
            }
            if (one && s.length() > 1 && s.charAt(0) == s.charAt(s.length() - 1))
                ans--;
            System.out.println(ans);
        }
    }
}