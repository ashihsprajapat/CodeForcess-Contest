import java.util.Scanner;

public class NewYearString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int ans = Integer.MAX_VALUE;
            boolean isFind = false;
            for (int i = 0; i <= n - 4; i++) {
                String substr = s.substring(i, i + 4);
                if (substr.equals("2025"))
                    isFind = true;
                int c = 0;
                String com = "2026";
                for (int j = 0; j < substr.length(); j++) {
                    if (substr.charAt(j) != com.charAt(j))
                        c++;
                }
                ans = Math.min(ans, c);
            }
            if (!isFind)
                ans = 0;
            System.out.println(ans);
        }
    }
}