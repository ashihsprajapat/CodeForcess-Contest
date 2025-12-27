import java.util.*;

public class XORfactorization {

    public static void backtracking(int n, int k, int curr,
            List<Integer> list, List<Integer> max, int m[],
            int currSum) {

        // base condition
        if (list.size() > k)
            return;

        if (list.size() == k) {
            if (currSum > m[0]) {
                m[0] = currSum;
                max.clear();
                max.addAll(list);
            }
            return;
        }

        for (int i = curr + 1; i < n && i <= k; i++) {
            list.add(i);
            backtracking(n, k, i, list, max, m, currSum ^ i);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            List<Integer> list = new ArrayList<>();
            List<Integer> max = new ArrayList<>();
            int m[] = { 0 };

            backtracking(n, k, 0, list, max, m, 0);

            for (int a : max)
                System.out.print(a + " ");
            System.out.println();
        }
    }
}
