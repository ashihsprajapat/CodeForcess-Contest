import java.util.*;

public class QEColoringaRedBlackTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String st = sc.next();
            st = "1" + st;
            char arr[] = st.toCharArray();
            List<Integer> graph[] = new ArrayList[n + 1];
            for (int i = 0; i <= n; i++)
                graph[i] = new ArrayList<>();
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < n - 1; i++) {
                int u = sc.nextInt(), v = sc.nextInt();
                graph[u].add(v);
                graph[v].add(u);
                if (arr[u] == '1' && arr[v] == '0')
                    q.add(v);
                if (arr[u] == '0' && arr[v] == '1')
                    q.add(u);
            }
            double ans = 0;
            while (!q.isEmpty()) {
                int curr = q.remove();
                for (int i = 0; i < graph[curr].size(); i++) {
                    int ne = graph[curr].get(i);
                    if (arr[ne] == '1') {
                        ans++;
                        arr[curr] = '1';
                        break;
                    }
                }
                for (int i = 0; i < graph[curr].size(); i++) {
                    int ne = graph[curr].get(i);
                    if (arr[ne] == '0') {
                        q.add(ne);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}