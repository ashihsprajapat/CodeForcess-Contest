import java.util.Scanner;

public class BPartyMonster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int co = 0, cc = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '(')
                    co++;
                else
                    cc++;
            }
            System.out.println(co == cc ? "Yes" : "No");
        }
    }
}
