import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int[] numbers = new int[3];

        System.out.println("Enter 3 numbers:");

        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        if (numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
            System.out.println("All numbers are equal.");
        } else {
            System.out.println("The largest number is: " + largest);
        }

        scanner.close();
    }
}