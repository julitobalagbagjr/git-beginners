import java.util.Scanner;

public class Task7 {

    static double addition(double num1, double num2) {
        return num1 + num2;
    }

    static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Addition: " + addition(num1, num2));
        System.out.println("Subtraction: " + subtraction(num1, num2));
        System.out.println("Multiplication: " + multiplication(num1, num2));
        System.out.println("Division: " + division(num1, num2));
       

        sc.close();
    }
}