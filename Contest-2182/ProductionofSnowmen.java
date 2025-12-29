import java.util.Scanner;

public class ProductionofSnowmen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            for (int i = 0; i < n; i++)
                b[i] = sc.nextInt();
            for (int i = 0; i < n; i++)
                c[i] = sc.nextInt();

            long ans = 0;

            for (int d1 = 0; d1 < n; d1++) {
                for (int d2 = 0; d2 < n; d2++) {

                    boolean ok = true;
                    for (int i = 0; i < n; i++) {
                        int A = a[i];
                        int B = b[(i + d1) % n];
                        int C = c[(i + d2) % n];

                        if (!(A < B && B < C)) {
                            ok = false;
                            break;
                        }
                    }

                    if (ok)
                        ans += n; // ⭐ FIX
                }
            }

            out.append(ans).append('\n');
        }

        System.out.print(out.toString());
    }
}
