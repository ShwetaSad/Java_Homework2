package javaprog13;

import java.util.Scanner;

public class AvgOf3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        printmessage(num1, num2, num3);
        scanner.close();
    }


public static void printmessage(int num1,int num2,int num3){
int Avg = ((num1+num2+num3)/3);
    System.out.println("Average of 3 numbers is "+Avg);


    }

}
