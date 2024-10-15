package javaprog17;

import java.util.Scanner;

public class NumberToBinary {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to convert to binary");
        int value = scan.nextInt();

        System.out.println(Integer.toBinaryString(value));

    }
}
