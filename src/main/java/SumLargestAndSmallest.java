import java.util.Scanner;

public class SumLargestAndSmallest {

    public static void main(String[] args) {

        System.out.println("Enter the number of sequence elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > largest)
            largest = array[i];
        else if (array[i] < smallest)
            smallest = array[i];
        }
        System.out.println(largest + smallest);
    }
}
