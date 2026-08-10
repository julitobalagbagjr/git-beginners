import java.util.Scanner;

public class Task8 {

    static int sum(int... numbers) {
        int total = 0;

        for (int num : numbers) {
            int cumulative = 0;

            for (int i = 1; i <= num; i++) {
                cumulative += i;
            }

            System.out.println(num + " = " + cumulative);
            total += num;
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of values: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int total = sum(numbers);

        System.out.println("Sum of all parameters: " + total);

        sc.close();
    }
}