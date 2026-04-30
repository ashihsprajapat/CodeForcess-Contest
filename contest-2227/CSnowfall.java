
import java.util.*;

public class CSnowfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> d = new ArrayList<>();
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                arr[i] = val;
                if (val % 2 == 0 && val % 3 == 0)
                    a.add(val);
                else if (val % 2 == 0)
                    b.add(val);
                else if (val % 3 == 0)
                    c.add(val);
                else
                    d.add(val);
            }

            for (int e : b) {
                System.out.print(e + " ");
            }

            for (int e : d) {
                System.out.print(e + " ");
            }

            for (int e : c)
                System.out.print(e + " ");

            for (int e : a) {
                System.out.print(e + " ");
            }
            System.out.println();

        }
    }

}