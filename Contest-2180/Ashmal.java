
import java.util.Scanner;

public class Ashmal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            StringBuilder str = new StringBuilder();
            for (String s : arr) {
                String curr = str.toString();
                String phale = s + curr;
                String bad = curr + s;
                if (phale.compareTo(bad) < 0) {
                    str.insert(0, s);
                } else
                    str.append(s);
            }
            System.out.println(str.toString());

        }
    }
}