import java.util.Arrays;
import java.util.Scanner;

public class NegativeElements {

    public static void main(String[] args) {

        System.out.println("Enter the number of sequence elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] array = new double[n];
        int cnt = array.length;
        double sum = 0;

        if (n > 100 || n < 0)
            System.out.println("0 < n ≤ 100");
        else {
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextDouble();
                if (array[i] >= 0) {
                    array[i] = 0;
                    cnt--;
                }
            }
            for (int i = 0; i < n; i++) {
                sum += array[i];
            }
            System.out.println(Arrays.toString(array));
            System.out.println(cnt);
            System.out.println(String.format("%.3g%n", sum));
        }
    }
}

