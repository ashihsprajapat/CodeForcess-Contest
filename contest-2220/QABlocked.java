import java.util.*;

public class QABlocked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            boolean isPos = true;
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (set.contains(val))
                    isPos = false;
                list.add(val);
                set.add(val);
            }
            if (!isPos) {
                System.out.println(-1);
                continue;
            }
            Collections.sort(list, Collections.reverseOrder());
            for (int e : list) {
                System.out.print(e + " ");
            }
            System.out.println();

        }
    }
}