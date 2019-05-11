import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticMeanOfPositive {

    public static void main(String[] args) {

        System.out.println("Enter the number of sequence elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] array = new double[n];
        double[] array_positive = new double[n];
        int n_2 = array_positive.length;

        if (n > 100 || n < 0)
            System.out.println("0 < n ≤ 100");
        else {
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextDouble();
                if (array[i] > 0 && Math.abs(array[i]) < 100) {
                    array_positive[i] = array[i];
                }
            }
            double sum = 0;
            for (double value : array_positive) {
                sum += value;
                if (value == 0.0)
                    n_2--;
            }
            double mean = sum / n_2;
            if (n_2 == 0) {
                System.out.println("Not Found");
            }
            else {
                System.out.println(Arrays.toString(array_positive) + mean); // для контроля второго массива
                System.out.println(String.format("%.3g%n", mean)); // что требовалось в условии задачи
            }
        }
    }
}
