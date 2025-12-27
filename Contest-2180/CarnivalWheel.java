import java.util.HashSet;
import java.util.Scanner;

public class CarnivalWheel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = a;
            HashSet<Integer> set = new HashSet<>();
            int c = a;
            while (!set.contains(c)) {
                ans = Math.max(ans, c);
                set.add(a);
                c = (c + b) % l;

            }
            System.out.println(ans);
        }
    }
}