package javaprog16;

import java.math.BigInteger;
import java.util.Scanner;

public class SumOfTwoBinaryNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to accept input from the user
        Scanner scanner = new Scanner(System.in);

        // Accept two binary numbers as input
        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.nextLine();

        // Convert the binary strings to integers
        int number1 = Integer.parseInt(binary1, 2);
        int number2 = Integer.parseInt(binary2, 2);

        int sum = number1 + number2;

        // Convert the sum back to binary and print the result
        System.out.println("Sum of " + binary1 + " and " + binary2 + " is: " + Integer.toBinaryString(sum));
        scanner.close();
    }
    }