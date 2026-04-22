import java.util.*;

public class GamewithaFraction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            boolean alic = true;
            boolean bobWind = false;
            while (p > 0 && q > 1) {
                if (alic) {
                    if (p < q)
                        p--;
                    else
                        q--;

                }

                else {
                    if (p > q)
                        p--;
                    else
                        q--;
                }

                if ((float) p / q == (float) 2 / 3) {
                    bobWind = true;
                    break;
                }

                alic = !alic;

            }
            System.out.println(bobWind ? "Bob" : "Alice");
        }
    }
}