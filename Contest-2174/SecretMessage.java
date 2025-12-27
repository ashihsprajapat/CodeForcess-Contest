
import java.util.ArrayList;
import java.util.Scanner;

public class SecretMessage {
    public static void dfs(ArrayList<int[]> graph[], int curr, boolean visited[], int ans[], int edC, int currW) {
        // bc
        if (edC > graph.length - 1)
            return;
        if (visited[curr]) {
            if (edC == graph.length - 1) {
                ans[0] = Math.min(ans[0], currW);
            }
            return;
        }

        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            int ne[] = graph[curr].get(i);
            int v = ne[0], w = ne[1];
            if (!visited[v]) {
                dfs(graph, v, visited, ans, edC + 1, currW + w);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();

            ArrayList<int[]> graph[] = new ArrayList[n + 1];
            for (int i = 0; i <= n; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt(), v = sc.nextInt(), w = sc.nextInt();
                graph[v].add(new int[] { u, w });
                graph[u].add(new int[] { v, w });
            }
            boolean visited[] = new boolean[n];
            int ans[] = { Integer.MAX_VALUE };
            for (int i = 1; i <= n; i++) {
                dfs(graph, i, new boolean[n], ans, 0, 0);
            }
            System.out.println(ans[0] == Integer.MAX_VALUE ? -1 : ans[0]);
        }
    }
}
