import java.util.Arrays;
import java.util.Scanner;

public class TwiceTheMinimum {

    public static void main(String[] args) {

        System.out.println("Enter the number of sequence elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] array = new double[n];

        if (n > 100 || n < 0)
            System.out.println("0 < n ≤ 100");
        else {
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextDouble();
            }
        }
        double min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(String.format("%.3g%n", min * 2));
    }
}
