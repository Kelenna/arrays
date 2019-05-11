import java.util.Arrays;
import java.util.Scanner;

public class ShiftEelementsRight {

    public static void main(String[] args) {

        System.out.println("Enter the number of sequence elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        int[] shifted = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            shifted[i+1] = array[i];
        }
        shifted[0] = array[n-1];
        System.out.println(Arrays.toString(shifted));
    }
}

