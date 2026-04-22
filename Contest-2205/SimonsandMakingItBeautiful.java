
import java.util.*;

public class SimonsandMakingItBeautiful {
    public static void print(int arr[]) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    public static int ugl(int arr[], boolean isFirst) {
        int max = Integer.MIN_VALUE, idx = -1;
        for (int i = 1; i <= arr.length; i++) {
            max = Math.max(max, arr[i - 1]);
            if (max == i) {
                if (isFirst)
                    return i - 1;
                idx = i - 1;
            }
        }
        return idx;
    }

    public static void backtracking(int arr[]) {
        // bc
        int idx = ugl(arr, true);
        int idy = ugl(arr, false);
        if (idx == -1 || idx == -1)
            return;
        int temp = arr[idx];
        arr[idx] = arr[idy];
        arr[idy] = temp;

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
            int max[] = new int[n];
            Arrays.fill(max, Integer.MIN_VALUE);
            max[0] = arr[0];
            backtracking(arr);
            print(arr);
        }
    }
}