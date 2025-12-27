import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            int n = sc.nextInt(); // ✅ read n
            String s = sc.next();
            String t = sc.next();

            HashMap<Character, Integer> maps = new HashMap<>();
            HashMap<Character, Integer> mapt = new HashMap<>();

            for (char ch : s.toCharArray()) {
                maps.put(ch, maps.getOrDefault(ch, 0) + 1);
            }
            for (char ch : t.toCharArray()) {
                mapt.put(ch, mapt.getOrDefault(ch, 0) + 1);
            }

            boolean same = true;
            for (char ch : maps.keySet()) {
                if (!mapt.containsKey(ch) || !mapt.get(ch).equals(maps.get(ch))) {
                    same = false;
                    break;
                }
            }

            if (same && maps.size() == mapt.size())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
