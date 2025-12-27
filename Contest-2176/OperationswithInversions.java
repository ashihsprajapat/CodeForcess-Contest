import java.util.Scanner;

public class OperationswithInversions {

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
            boolean isRem[] = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (isRem[i])
                    continue;
                for (int j = i + 1; j < n; j++) {
                    if (isRem[j])
                        continue;
                    if (arr[i] > arr[j]) {
                        ans++;
                        isRem[j] = true;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}