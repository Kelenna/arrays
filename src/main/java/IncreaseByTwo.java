import java.util.Arrays;
import java.util.Scanner;

public class IncreaseByTwo {

    public static void main(String[] args) {

        System.out.println("Enter the number of sequence elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array [i] = sc.nextInt();
            if (array [i] > 0) {
                array [i] = array [i] + 2;
            }
        }
        System.out.println(Arrays.toString(array));


    }
}
