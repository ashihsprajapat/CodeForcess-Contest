
import java.util.*;

public class DPalindromex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n * 2];
            for (int i = 0; i < n * 2; i++) {
                int val = sc.nextInt();
                arr[i] = val;

            }
            int ans = 0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    int max = helper(arr, i, j);
                    if (max > ans) {
                        ans = max;
                    }
                }
            }
            System.out.println(ans);

        }
    }

    public static int helper(int arr[], int l, int r) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n / 2; i++)
            set.add(i);

        while (l <= r) {
            if (arr[l] != arr[r])
                return -1;
            set.remove(arr[l]);
            l++;
            r--;
        }
        for (int i = 0; i < n / 2; i++) {
            if (set.contains(i))
                return i;
        }
        return n / 2;

    }
}
