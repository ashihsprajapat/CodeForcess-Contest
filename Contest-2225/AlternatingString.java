import java.util.Scanner;

public class AlternatingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int c = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1))
                    c++;
            }
            System.out.println(c > 2 ? "No" : "Yes");
        }
    }
}
