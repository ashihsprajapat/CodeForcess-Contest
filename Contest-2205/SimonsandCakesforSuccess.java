
import java.util.Scanner;

public class SimonsandCakesforSuccess {

    public static long helper(long n) {
        long k = 1;

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                k *= i; // take distinct prime
                while (n % i == 0) {
                    n /= i; // remove all powers
                }
            }
        }

        // if something left, it's prime
        if (n > 1) {
            k *= n;
        }

        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(helper(n));
        }
    }
}
