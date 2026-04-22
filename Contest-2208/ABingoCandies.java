import java.util.*;

public class ABingoCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> hm = new HashMap<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int color = sc.nextInt();
                    hm.put(color, hm.getOrDefault(color, 0) + 1);
                }
            }

            System.out.println(isValid(hm, n) ? "YES" : "NO");
        }
    }

    public static boolean isValid(HashMap<Integer, Integer> hm, int n) {
        for (int freq : hm.values()) {
            if (freq > n) {
                return false;
            }
        }
        return true;
    }
}