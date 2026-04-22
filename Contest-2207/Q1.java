import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char arr[] = s.toCharArray();

            int max = helper(arr, true);
            int min = helper(arr, false);
            System.out.println(min + " " + max);

        }
    }

    public static int helper(char arr[], boolean is1) {
        int c = 0, n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] == '1' && arr[i + 1] == '1') {
                if (is1 && arr[i] == '0') {
                    arr[i] = '1';
                    c++;
                } else if (!is1 && arr[i] == '1') {
                    arr[i] = '0';
                    c++;
                }
            }
        }
        if (c > 0)
            return helper(arr, is1);

        return count(arr);
    }

    public static int count(char arr[]) {
        int c = 0;
        for (char ch : arr) {
            if (ch == '1')
                c++;
        }
        return c;
    }
}