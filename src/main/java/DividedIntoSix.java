import java.util.Scanner;

public class DividedIntoSix {

    public static void main(String[] args) {
        System.out.println("Enter the number of sequence elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];

        int sum = 0;
        int count = 0;

        for (int i : array) {
            if (i > 0 && i % 6 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("Sum " + sum);
        System.out.println("Number " + count);
    }
}
