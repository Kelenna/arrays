import java.util.Arrays;
import java.util.Scanner;

public class FirstIsNotGreater {

    public static void main(String[] args) {
        System.out.println("Enter the number of sequence elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] array = new double[n];

        for (int i = 0; i < n; i++){
            array [i] = sc.nextInt();
            if (array [i] < 2.5) {
                System.out.println(String.format("%d %d", i, array[i]));
                break;
            }
            if (i == n)
            System.out.println("Not Found");
        }
    }
}

