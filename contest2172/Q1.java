import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (arr[2] - arr[0] >= 10) {
            System.out.println("check again");
        } else {
            System.out.println("final " + arr[1]);
        }
    }
}