import java.util.Scanner;

public class DExceptionalSegments {
    public static void main(String arges[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long c = 0;
            for (long i = 1; i <= x; i++) {
                long xor = 0;
                for (long j = i; j <= n; j++) {
                    xor ^= j;
                    if (j >= x && xor == 0)
                        c++;
                }
            }
            System.out.println(c);
        }
    }
}