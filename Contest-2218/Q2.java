import java.util.*;
import java.util.List;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 7; i++)
                list.add(sc.nextInt());
            Collections.sort(list);
            int sumne = 0, sump = list.get(6);
            for (int i = 0; i < 6; i++) {
                sumne += list.get(i);
            }
            sumne *= -1;
            System.out.println(sumne + sump);
        }
    }
}
