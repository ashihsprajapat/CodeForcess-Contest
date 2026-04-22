
import java.util.Scanner;

public class Heapify1 {
    public static boolean check(int a[]) {
        // swaping
        int n = a.length;
        int LG = 20; // enough for n ≤ 2e5

        for (int t = 0; t < LG; t++) {
            for (int i = 0; i * 2 + 1 < n; i++) {
                if (a[i] > a[i * 2 + 1]) {
                    int temp = a[i];
                    a[i] = a[i * 2 + 1];
                    a[i * 2 + 1] = temp;
                }
            }
        }

        // check
        for (int i = 1; i < n; i++) {
            if (a[i - 1] > a[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(check(arr) ? "YES" : "NO");
        }
    }
}