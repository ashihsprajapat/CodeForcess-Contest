import java.util.Scanner;

public class DivisiblePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 1; i <= n; i++) {
                arr[i - 1] = i;
            }
            backtracking(arr, 0);
            print(arr);
        }
    }

    public static void backtracking(int arr[], int idx) {
        /// bc
        if (idx == arr.length)
            return;

        for (int i = idx; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) % i == 0) {
                backtracking(arr, idx + 1);
            }
        }
    }

    public static void print(int arr[]) {
        for (int e : arr)
            System.out.println(e + " ");
    }
}