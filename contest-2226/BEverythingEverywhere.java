import java.util.Scanner;

public class BEverythingEverywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int min = arr[i];
                int max = arr[i];
                int g = arr[i];

                for (int j = i; j < n; j++) {
                    min = Math.min(min, arr[j]);
                    max = Math.max(max, arr[j]);
                    g = gcd(g, arr[j]);

                    if (max - min == g)
                        ans++;

                    if (g == 1 && max - min > 1)
                        break;
                }
            }
            System.out.println(ans);
        }
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;

    }
}
