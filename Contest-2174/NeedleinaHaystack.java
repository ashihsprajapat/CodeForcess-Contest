import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class NeedleinaHaystack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();
            String t = sc.next();

            HashMap<Character, Integer> hm = new HashMap<>();
            for (char ch : t.toCharArray()) {
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }

            ArrayList<Character> order = new ArrayList<>();
            ArrayList<Character> rem = new ArrayList<>();
            boolean flag = true;

            for (char ch : s.toCharArray()) {
                if (hm.containsKey(ch)) {
                    order.add(ch);
                    if (hm.get(ch) == 1) {
                        hm.remove(ch);
                    } else {
                        hm.put(ch, hm.get(ch) - 1);
                    }
                } else {
                    flag = false;
                    break;
                }
            }

            for (char key : hm.keySet()) {
                int count = hm.get(key);
                while (count-- > 0) {
                    rem.add(key);
                }
            }
            Collections.sort(rem);

            if (!flag) {
                System.out.println("Impossible");
            } else {
                StringBuilder str = new StringBuilder();
                int i = 0, j = 0;
                while (i < order.size() && j < rem.size()) {
                    char o = order.get(i), r = rem.get(j);
                    if (o <= r) {
                        str.append(o);
                        i++;
                    } else {
                        str.append(r);
                        j++;
                    }
                }
                while (i < order.size()) {
                    str.append(order.get(i));
                    i++;
                }
                while (j < rem.size()) {
                    str.append(rem.get(j));
                    j++;
                }

                System.out.println(str.toString());
            }

        }
    }
}